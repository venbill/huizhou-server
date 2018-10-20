package com.superstar.model.shop;



public class GoodsPrice {
    private Long id;

    private Long goodsId;

    private String attributeValueIds;

    private Double price;

    private Integer picture;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getAttributeValueIds() {
        return attributeValueIds;
    }

    public void setAttributeValueIds(String attributeValueIds) {
        this.attributeValueIds = attributeValueIds == null ? null : attributeValueIds.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getPicture() {
        return picture;
    }

    public void setPicture(Integer picture) {
        this.picture = picture;
    }
}