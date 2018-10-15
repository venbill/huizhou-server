package com.superstar.model.shop.Vm;

import com.superstar.model.common.PageVm;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午11:45 2018/10/15.
 */
public class GoodsCommentsSearchVm extends PageVm{
    private long goodsId;

    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }
}
