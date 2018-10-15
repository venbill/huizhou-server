package com.superstar.model.shop.Vm;

import com.superstar.model.shop.GoodsAttributeKey;
import com.superstar.model.shop.GoodsAttributeValue;

import java.util.List;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午8:33 2018/10/15.
 */
public class SelectAttributeDetail extends GoodsAttributeKey {
   private List<GoodsAttributeValue> attributeValues;

    public List<GoodsAttributeValue> getAttributeValues() {
        return attributeValues;
    }

    public void setAttributeValues(List<GoodsAttributeValue> attributeValues) {
        this.attributeValues = attributeValues;
    }
}
