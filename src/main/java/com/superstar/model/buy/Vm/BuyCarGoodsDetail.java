package com.superstar.model.buy.Vm;

import com.superstar.model.common.PageVm;

/**
 * @Author: BillYu
 * @Description:购物车商品详情
 * @Date: Created in 下午11:57 2018/10/18.
 */
public class BuyCarGoodsDetail {

    /**
     * 购物车商品id
     */
    private long buyCarId;
    /**
     * 商品id
     */
    private long goodsId;
    /**
     * 店铺名称
     */
    private String shopName;
    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品图片
     */
    private String picture;
    /**
     * 是否需要选择属性
     */
    private boolean enableSelectAttribute;

    /**
     * 商品可选属性
     */
    private String goodsAttributesValues;
    /**
     * 上屏选择属性文字内容
     */
    private String goodsAttributesValuesContent;
    /**
     * 商品单价
     */
    private double price;
    /**
     * 购买数量
     */
    private int buyNo;

    /**
     * 是否有效
     */
    private boolean valid;

    /**
     * 失效理由
     */
    private String invalidReason;


    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsAttributesValues() {
        return goodsAttributesValues;
    }

    public void setGoodsAttributesValues(String goodsAttributesValues) {
        this.goodsAttributesValues = goodsAttributesValues;
    }

    public String getGoodsAttributesValuesContent() {
        return goodsAttributesValuesContent;
    }

    public void setGoodsAttributesValuesContent(String goodsAttributesValuesContent) {
        this.goodsAttributesValuesContent = goodsAttributesValuesContent;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBuyNo() {
        return buyNo;
    }

    public void setBuyNo(int buyNo) {
        this.buyNo = buyNo;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getInvalidReason() {
        return invalidReason;
    }

    public void setInvalidReason(String invalidReason) {
        this.invalidReason = invalidReason;
    }


    public boolean isEnableSelectAttribute() {
        return enableSelectAttribute;
    }

    public void setEnableSelectAttribute(boolean enableSelectAttribute) {
        this.enableSelectAttribute = enableSelectAttribute;
    }


    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }


    public long getBuyCarId() {
        return buyCarId;
    }

    public void setBuyCarId(long buyCarId) {
        this.buyCarId = buyCarId;
    }
}
