package com.superstar.model.shop.Vm;

import com.superstar.model.shop.GoodsBigType;
import com.superstar.model.shop.GoodsSmallType;

import java.util.List;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午2:06 2018/10/13.
 */
public class GoodsTypeDetail extends GoodsBigType {


    private List<GoodsSmallType> smallTypes;


    public List<GoodsSmallType> getSmallTypes() {
        return smallTypes;
    }

    public void setSmallTypes(List<GoodsSmallType> smallTypes) {
        this.smallTypes = smallTypes;
    }
}
