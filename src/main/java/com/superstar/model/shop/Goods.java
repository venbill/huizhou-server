package com.superstar.model.shop;

import java.math.BigDecimal;

public class Goods {
    private Long id;

    private String goodsName;

    private String description;

    private Integer bigType;

    private Integer smallType;

    private Integer shopType;

    private Integer shopId;

    private String picture;

    private String picture1;

    private String picture2;

    private String picture3;

    private String picture4;

    private BigDecimal priceMin;

    private BigDecimal priceMax;

    private BigDecimal price;

    private Boolean haveExpress;

    private Boolean expressFree;

    private BigDecimal expressMoney;

    private Boolean selectAttribute;

    private Integer storeNo;

    private Integer saleNo;

    private String tags;

    private Long commentNo;

    private Double averageScore;

    private String detailPictures;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getBigType() {
        return bigType;
    }

    public void setBigType(Integer bigType) {
        this.bigType = bigType;
    }

    public Integer getSmallType() {
        return smallType;
    }

    public void setSmallType(Integer smallType) {
        this.smallType = smallType;
    }

    public Integer getShopType() {
        return shopType;
    }

    public void setShopType(Integer shopType) {
        this.shopType = shopType;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getPicture1() {
        return picture1;
    }

    public void setPicture1(String picture1) {
        this.picture1 = picture1 == null ? null : picture1.trim();
    }

    public String getPicture2() {
        return picture2;
    }

    public void setPicture2(String picture2) {
        this.picture2 = picture2 == null ? null : picture2.trim();
    }

    public String getPicture3() {
        return picture3;
    }

    public void setPicture3(String picture3) {
        this.picture3 = picture3 == null ? null : picture3.trim();
    }

    public String getPicture4() {
        return picture4;
    }

    public void setPicture4(String picture4) {
        this.picture4 = picture4 == null ? null : picture4.trim();
    }

    public BigDecimal getPriceMin() {
        return priceMin;
    }

    public void setPriceMin(BigDecimal priceMin) {
        this.priceMin = priceMin;
    }

    public BigDecimal getPriceMax() {
        return priceMax;
    }

    public void setPriceMax(BigDecimal priceMax) {
        this.priceMax = priceMax;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getHaveExpress() {
        return haveExpress;
    }

    public void setHaveExpress(Boolean haveExpress) {
        this.haveExpress = haveExpress;
    }

    public Boolean getExpressFree() {
        return expressFree;
    }

    public void setExpressFree(Boolean expressFree) {
        this.expressFree = expressFree;
    }

    public BigDecimal getExpressMoney() {
        return expressMoney;
    }

    public void setExpressMoney(BigDecimal expressMoney) {
        this.expressMoney = expressMoney;
    }

    public Boolean getSelectAttribute() {
        return selectAttribute;
    }

    public void setSelectAttribute(Boolean selectAttribute) {
        this.selectAttribute = selectAttribute;
    }

    public Integer getStoreNo() {
        return storeNo;
    }

    public void setStoreNo(Integer storeNo) {
        this.storeNo = storeNo;
    }

    public Integer getSaleNo() {
        return saleNo;
    }

    public void setSaleNo(Integer saleNo) {
        this.saleNo = saleNo;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public Long getCommentNo() {
        return commentNo;
    }

    public void setCommentNo(Long commentNo) {
        this.commentNo = commentNo;
    }

    public Double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(Double averageScore) {
        this.averageScore = averageScore;
    }

    public String getDetailPictures() {
        return detailPictures;
    }

    public void setDetailPictures(String detailPictures) {
        this.detailPictures = detailPictures == null ? null : detailPictures.trim();
    }
}