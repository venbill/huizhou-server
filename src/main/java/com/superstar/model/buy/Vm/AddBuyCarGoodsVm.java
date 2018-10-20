package com.superstar.model.buy.Vm;

/**
 * @Author: BillYu
 * @Description:购物车添加商品
 * @Date: Created in 上午1:21 2018/10/19.
 */
public class AddBuyCarGoodsVm {


    private long goodsId;
    private int num;
    private String selectAttributeValues;




    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getSelectAttributeValues() {
        return selectAttributeValues;
    }

    public void setSelectAttributeValues(String selectAttributeValues) {
        this.selectAttributeValues = selectAttributeValues;
    }
}

