package com.superstar.service.shop;

import com.superstar.model.shop.GoodsAttribute;
import com.superstar.model.shop.GoodsPrice;
import com.superstar.model.shop.Vm.SelectAttributeDetail;

import java.util.List;
import java.util.jar.Attributes;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午6:08 2018/10/13.
 */
public interface GoodsAttributeService {

    /**
     * 获取商品不可选属性列表
     * @param goodsId
     * @return
     */
    List<GoodsAttribute> getGoodsAttributeList(long goodsId);


    /**
     * 获取可选属性详情,属性key values
     * @param goodsId
     * @return
     */
    List<SelectAttributeDetail> getGoodsSelectAttributeDetailList(long goodsId);

    /**
     * 获取可选属性列表方案
     * @param goodsId
     * @return
     */
    List<GoodsPrice> getGoodsPriceList(long goodsId);


    /**
     * 查询选择属性的文字内容
     * @param goodSelectAttributesValues
     * @return
     */
    String getGoodsSelectAttributeValueContent(String goodSelectAttributesValues);
}
