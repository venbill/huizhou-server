package com.superstar.service.shop.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.superstar.dao.shop.*;
import com.superstar.model.common.RtData;
import com.superstar.model.shop.Goods;
import com.superstar.model.shop.GoodsActivity;
import com.superstar.model.shop.GoodsExample;
import com.superstar.model.shop.Vm.GoodsDetail;
import com.superstar.model.shop.Vm.GoodsShortInfo;
import com.superstar.model.shop.Vm.SearchVm;
import com.superstar.service.shop.GoodsAttributeService;
import com.superstar.service.shop.GoodsService;
import com.superstar.util.ResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午5:40 2018/10/13.
 */

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsActivityMapper activityMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private GoodsBigTypeMapper bigTypeMapper;
    @Autowired
    private GoodsSmallTypeMapper smallTypeMapper;

    @Autowired
    private GoodsAttributeService  attributeService;






    @Override
    public RtData searchGoods(SearchVm searchVm) {



        GoodsExample goodsExample = new GoodsExample();

        goodsExample.createCriteria();
        if(searchVm.getActivityId()>0){
            GoodsActivity goodsActivity = activityMapper.selectByPrimaryKey(searchVm.getActivityId());
            List<Integer> types = new ArrayList<>();

            List<String> list = Arrays.asList(goodsActivity.getTypes().split(","));
            for (String item: list) {
                types.add(Integer.parseInt(item));
            }

            if(types.size()>0){
                goodsExample.getOredCriteria().get(0).andSmallTypeIn(types);
            }


        }
        if(searchVm.getTagId()>0){
            String tagStr = String.format("%0" + 3 + "d",searchVm.getTagId() );
            goodsExample.getOredCriteria().get(0).andTagsLike("%"+tagStr+"%");

        }
        if(!StringUtils.isEmpty(searchVm.getContent())){
            goodsExample.getOredCriteria().get(0).andGoodsNameLike("%"+searchVm.getContent()+"%");
        }

        if(searchVm.getBigTypeId()>0){
            goodsExample.getOredCriteria().get(0).andBigTypeEqualTo(searchVm.getBigTypeId());


        }
        if(searchVm.getSmallTypeId()>0){
            goodsExample.getOredCriteria().get(0).andSmallTypeEqualTo(searchVm.getSmallTypeId());
        }

        PageHelper.startPage(searchVm.getPageNo(), searchVm.getPageSize());
        Page<Goods> goods = (Page<Goods>) goodsMapper.selectByExample(goodsExample);

        List<GoodsShortInfo> goodsList = new ArrayList<>();
        for (Goods item: goods) {
            GoodsShortInfo goodsShortInfo = GoodsShortInfo.getFromGoods(item);
            goodsList.add(goodsShortInfo);

        }

        RtData rtData = ResponseBuilder.success();
        rtData.setList(goodsList);
        rtData.setTotal(goods.getTotal());
        rtData.setCount(goods.size());

        return rtData;
    }


    @Override
    public RtData getGoodsDetail(long goodsId) {
        Goods goods = goodsMapper.selectByPrimaryKey(goodsId);
        if(goods==null){
            return ResponseBuilder.fail("此商品不存在");
        }
        GoodsDetail goodsDetail = new GoodsDetail();

        goodsDetail.setId(goods.getId());
        goodsDetail.setGoodsName(goods.getGoodsName());
        List<String> pictures = new ArrayList<>();
        pictures.add(goods.getPicture());
        pictures.add(goods.getPicture1());
        pictures.add(goods.getPicture2());
        pictures.add(goods.getPicture3());
        pictures.add(goods.getPicture4());
        goodsDetail.setPictures(pictures);
        goodsDetail.setBigTypeId(goods.getBigType());
        goodsDetail.setBigTypeName(bigTypeMapper.selectByPrimaryKey(goods.getBigType()).getBigTypeName());
        goodsDetail.setSmallTypeId(goods.getSmallType());
        goodsDetail.setSmallTypeName(smallTypeMapper.selectByPrimaryKey(goods.getSmallType()).getSmallTypeName());
        goodsDetail.setSaleNo(goods.getSaleNo());
        goodsDetail.setStoreNo(goods.getStoreNo());
        goodsDetail.setGoodsAttributeList(attributeService.getGoodsAttributeList(goodsId));


        if(goods.getSelectAttribute()){
            //查询可选方案
            goodsDetail.setSelectAttributeDetailList(attributeService.getGoodsSelectAttributeDetailList(goodsId));
            //设置可选组合

            goodsDetail.setEnableSelectGroupList(attributeService.getGoodsPriceList(goodsId));
        }else{
            goodsDetail.setSelectAttributeDetailList(null);
            goodsDetail.setEnableSelectGroupList(null);
        }




        return ResponseBuilder.success(goodsDetail);
    }
}
