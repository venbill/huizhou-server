package com.superstar.model.goods.Vm;

import com.superstar.model.goods.GoodsBigType;
import com.superstar.model.goods.GoodsSmallType;

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
