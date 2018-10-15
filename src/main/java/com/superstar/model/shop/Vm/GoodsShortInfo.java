package com.superstar.model.shop.Vm;

import com.superstar.model.shop.Goods;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午4:02 2018/10/13.
 */
public class GoodsShortInfo {

    private long id;

    private String name;

    private String picture;

    private Double minPrice;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }




    public static GoodsShortInfo getFromGoods(Goods goods){
        GoodsShortInfo goodsShortInfo = new GoodsShortInfo();
        goodsShortInfo.setId(goods.getId());
        goodsShortInfo.setName(goods.getGoodsName());
        goodsShortInfo.setMinPrice(goods.getPriceMin().doubleValue());
        goodsShortInfo.setPicture(goods.getPicture());
        return goodsShortInfo;
    }
}
