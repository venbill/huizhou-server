package com.superstar.model.buy;

import java.util.Date;

public class BuyCar {
    private Long id;

    private Long goodsId;

    private String goodsAttributesValues;

    private Double addPrice;

    private Date addTime;

    private Integer addNo;

    private Long userId;

    private String goodsName;

    private String attributesValuesContent;

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

    public String getGoodsAttributesValues() {
        return goodsAttributesValues;
    }

    public void setGoodsAttributesValues(String goodsAttributesValues) {
        this.goodsAttributesValues = goodsAttributesValues == null ? null : goodsAttributesValues.trim();
    }

    public Double getAddPrice() {
        return addPrice;
    }

    public void setAddPrice(Double addPrice) {
        this.addPrice = addPrice;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getAddNo() {
        return addNo;
    }

    public void setAddNo(Integer addNo) {
        this.addNo = addNo;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getAttributesValuesContent() {
        return attributesValuesContent;
    }

    public void setAttributesValuesContent(String attributesValuesContent) {
        this.attributesValuesContent = attributesValuesContent == null ? null : attributesValuesContent.trim();
    }
}