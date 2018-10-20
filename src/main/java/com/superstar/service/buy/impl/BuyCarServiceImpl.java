package com.superstar.service.buy.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.superstar.dao.buy.BuyCarMapper;
import com.superstar.dao.shop.GoodsMapper;
import com.superstar.dao.shop.ShopMapper;
import com.superstar.enums.ShopStatus;
import com.superstar.model.buy.BuyCar;
import com.superstar.model.buy.BuyCarExample;
import com.superstar.model.buy.Vm.BuyCarGoodsDetail;
import com.superstar.model.common.RtData;
import com.superstar.model.shop.Goods;
import com.superstar.model.shop.GoodsPrice;
import com.superstar.model.shop.Shop;
import com.superstar.service.buy.BuyCarService;
import com.superstar.service.shop.GoodsAttributeService;
import com.superstar.util.ResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午11:50 2018/10/18.
 */
@Service
public class BuyCarServiceImpl implements BuyCarService {
    @Autowired
    private BuyCarMapper buyCarMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private ShopMapper shopMapper;

    @Autowired
    private GoodsAttributeService goodsAttributeService;


    @Override
    public long getUserBuyCarGoodsNum(long userId) {
        BuyCarExample buyCarExample= new BuyCarExample();
        buyCarExample.createCriteria().andUserIdEqualTo(userId);
        return buyCarMapper.selectByExample(buyCarExample).size();
    }


    @Override
    public RtData getUserBuyCarList(long userId, int pageNo, int pageSize) {

        BuyCarExample buyCarExample = new BuyCarExample();
        buyCarExample.createCriteria().andUserIdEqualTo(userId);
        PageHelper.startPage(pageNo, pageSize);
        Page<BuyCar> buyCars = (Page<BuyCar>) buyCarMapper.selectByExample(buyCarExample);
        List<BuyCarGoodsDetail> goodsDetailList = new ArrayList<>();
        for (BuyCar buyCar:buyCars) {
            BuyCarGoodsDetail detail = new BuyCarGoodsDetail();
            detail.setBuyCarId(buyCar.getId());
            //查询商品
            Goods goods = goodsMapper.selectByPrimaryKey(buyCar.getGoodsId());
            if(goods==null){
                detail.setValid(false);
                detail.setInvalidReason("商品已下架");

                continue;
            }

            detail.setGoodsId(goods.getId());
            detail.setGoodsName(goods.getGoodsName());
            detail.setPicture(goods.getPicture());

            //查询店铺
            Shop shop = shopMapper.selectByPrimaryKey(goods.getShopId());
            if(shop==null||shop.getStatus()!= ShopStatus.OK.getCode()){
                detail.setValid(false);
                detail.setInvalidReason("店铺暂停营业");
                continue;
            }

            detail.setShopName(shop.getShopName());

            if(goods.getSelectAttribute()){
                detail.setEnableSelectAttribute(true);
                //查询可选属性
                List<GoodsPrice> goodsPriceList = goodsAttributeService.getGoodsPriceList(buyCar.getGoodsId());
                for (GoodsPrice goodsPrice:goodsPriceList) {
                    if(goodsPrice.getAttributeValueIds().equals(buyCar.getGoodsAttributesValues())){
                        detail.setGoodsAttributesValues(buyCar.getGoodsAttributesValues());
                        detail.setGoodsAttributesValuesContent(goodsAttributeService.getGoodsSelectAttributeValueContent(buyCar.getGoodsAttributesValues()));
                    }
                }
                if(StringUtils.isEmpty(detail.getGoodsAttributesValues())){
                    detail.setValid(false);
                    detail.setInvalidReason("请重新选择商品属性");
                }

            }else{
                detail.setEnableSelectAttribute(false);
                detail.setPrice(goods.getPrice());
                detail.setBuyNo(buyCar.getAddNo());



            }

             goodsDetailList.add(detail);

        }
        RtData rtData= ResponseBuilder.success();
        rtData.setList(goodsDetailList);
        rtData.setCount(goodsDetailList.size());
        rtData.setTotal(buyCars.size());

        return rtData;
    }


    @Override
    public RtData addGoodsToBuyCar(long userId, long goodsId, int num, String selectAttributeValues) {
        //校验商品库存 校验可选属性
        Goods goods = goodsMapper.selectByPrimaryKey(goodsId);
        if(goods==null){
            return ResponseBuilder.fail("商品不存在");
        }
        if((goods.getSaleNo()+num)>goods.getStoreNo()){
            return ResponseBuilder.fail("商品库存不足");
        }


        BuyCar buyCar= new BuyCar();

        buyCar.setGoodsId(goodsId);

        if(goods.getSelectAttribute()){
            List<GoodsPrice> goodsPriceList =  goodsAttributeService.getGoodsPriceList(goodsId);
            boolean bol = false;

            for (GoodsPrice goodsPrice:goodsPriceList) {
                if(goodsPrice.getAttributeValueIds().equals(selectAttributeValues)){
                    bol = true;

                    buyCar.setGoodsAttributesValues(selectAttributeValues);
                    buyCar.setAddPrice(goodsPrice.getPrice());
                    break;
                }
            }
            if(!bol){
                return ResponseBuilder.fail("请选择正确的商品属性");
            }
        }else{
            buyCar.setAddPrice(goods.getPrice());
        }
        buyCar.setAddTime(new Date());
        buyCar.setAddNo(num);
        buyCar.setUserId(userId);
        if(buyCarMapper.insertSelective(buyCar)>0){

            return ResponseBuilder.success();
        }else {
            return ResponseBuilder.fail("没有添加成功，请重试");
        }
    }

    @Override
    public RtData deleteGoodsFromBuyCar(long userId, long buyCarId) {
        BuyCar buyCar = buyCarMapper.selectByPrimaryKey(buyCarId);
        if((buyCar==null)||(buyCar.getUserId()!=userId)){
            return ResponseBuilder.fail("您的购物车中没有这个商品");
        }
        if(buyCarMapper.deleteByPrimaryKey(buyCarId)>0){

            return ResponseBuilder.success();
        }else {
            return ResponseBuilder.fail("没有删除成功，请重试");
        }
    }

    @Override
    public RtData updateBuyCarGoodsNo(long userId, long buyCarId, int num) {
        BuyCar buyCar = buyCarMapper.selectByPrimaryKey(buyCarId);
        if((buyCar==null)||(buyCar.getUserId()!=userId)){
            return ResponseBuilder.fail("您的购物车中没有这个商品");
        }

        if(num==0){
            return deleteGoodsFromBuyCar(userId,buyCarId);
        }else if(num == buyCar.getAddNo()){
            //商品数量没有改变
            return ResponseBuilder.success();
        }else{

            //查看库存
            Goods goods = goodsMapper.selectByPrimaryKey(buyCar.getGoodsId());
            if((goods.getSaleNo()+num)>goods.getStoreNo()){
                return ResponseBuilder.fail("商品库存不足");
            }
            buyCar.setAddNo(num);
            if(buyCarMapper.updateByPrimaryKeySelective(buyCar)>0){
                return ResponseBuilder.success();
            }else {
                return ResponseBuilder.fail("商品数量修改不成功，请重试");
            }

        }

    }
}
