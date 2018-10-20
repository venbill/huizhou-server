package com.superstar.service.shop.impl;

import com.superstar.dao.shop.GoodsAttributeKeyMapper;
import com.superstar.dao.shop.GoodsAttributeMapper;
import com.superstar.dao.shop.GoodsAttributeValueMapper;
import com.superstar.dao.shop.GoodsPriceMapper;
import com.superstar.model.shop.*;
import com.superstar.model.shop.Vm.SelectAttributeDetail;
import com.superstar.service.shop.GoodsAttributeService;
import org.apache.commons.beanutils.PropertyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午6:09 2018/10/13.
 */
@Service
public class GoodsAttributeServiceImpl implements GoodsAttributeService {

    @Autowired
    private GoodsAttributeMapper goodsAttributeMapper;

    @Autowired
    private GoodsAttributeKeyMapper attributeKeyMapper;

    @Autowired
    private GoodsAttributeValueMapper attributeValueMapper;

    @Autowired
    private GoodsPriceMapper goodsPriceMapper;

    private final Logger log = LoggerFactory.getLogger(GoodsAttributeServiceImpl.class);

    @Override
    public List<GoodsAttribute> getGoodsAttributeList(long goodsId) {
        GoodsAttributeExample attributeExample = new GoodsAttributeExample();
        attributeExample.createCriteria().andGoodsIdEqualTo(goodsId);
        return goodsAttributeMapper.selectByExample(attributeExample);
    }


    @Override
    public List<SelectAttributeDetail> getGoodsSelectAttributeDetailList(long goodsId) {
        GoodsAttributeKeyExample keyExample = new GoodsAttributeKeyExample();
        keyExample.createCriteria().andGoodsIdEqualTo(goodsId);
        List<GoodsAttributeKey> goodsAttributeKeys = attributeKeyMapper.selectByExample(keyExample);
        List<SelectAttributeDetail> selectAttributeDetailList = new ArrayList<>();
        for (GoodsAttributeKey attributeKey:goodsAttributeKeys) {
            SelectAttributeDetail attributeDetail= new SelectAttributeDetail();
            try{

                PropertyUtils.copyProperties(attributeDetail,attributeKey);
            }catch (Exception e){
                log.error(e.getMessage());
            }
            GoodsAttributeValueExample valueExample = new GoodsAttributeValueExample();
            valueExample.createCriteria().andKeyIdEqualTo(attributeKey.getId());

            List<GoodsAttributeValue> goodsAttributeValues = attributeValueMapper.selectByExample(valueExample);
            attributeDetail.setAttributeValues(goodsAttributeValues);
            selectAttributeDetailList.add(attributeDetail);
        }

        return selectAttributeDetailList;
    }


    @Override
    public List<GoodsPrice> getGoodsPriceList(long goodsId) {
        GoodsPriceExample goodsPriceExample = new GoodsPriceExample();
        goodsPriceExample.createCriteria().andGoodsIdEqualTo(goodsId);
        return goodsPriceMapper.selectByExample(goodsPriceExample);

    }

    @Override
    public String getGoodsSelectAttributeValueContent(String goodSelectAttributesValues) {
        String [] selectAttributeValueIdList = goodSelectAttributesValues.split(",");
        StringBuffer content = new StringBuffer();
        for (String idStr:selectAttributeValueIdList) {
            content.append((StringUtils.isEmpty(content)?"":" ")+attributeValueMapper.selectByPrimaryKey(Long.decode(idStr)).getValue());
        }
        return content.toString();
    }
}
