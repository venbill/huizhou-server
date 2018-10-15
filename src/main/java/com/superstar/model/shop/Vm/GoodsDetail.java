package com.superstar.model.shop.Vm;

import com.superstar.model.shop.Goods;
import com.superstar.model.shop.GoodsAttribute;
import com.superstar.model.shop.GoodsAttributeValue;
import com.superstar.model.shop.GoodsPrice;

import java.util.List;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午5:48 2018/10/13.
 */
public class GoodsDetail {

    private long id;
    private String goodsName;

    private List<String> pictures;

    private String desc;

    private String bigTypeName;

    private int bigTypeId;

    private String smallTypeName;

    private int smallTypeId;

    private int storeNo;

    private int saleNo;


    private List<GoodsAttribute> goodsAttributeList;


    private List<SelectAttributeDetail> selectAttributeDetailList;

    private List<GoodsPrice> enableSelectGroupList;

    private int shopId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public List<String> getPictures() {
        return pictures;
    }

    public void setPictures(List<String> pictures) {
        this.pictures = pictures;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getBigTypeName() {
        return bigTypeName;
    }

    public void setBigTypeName(String bigTypeName) {
        this.bigTypeName = bigTypeName;
    }

    public int getBigTypeId() {
        return bigTypeId;
    }

    public void setBigTypeId(int bigTypeId) {
        this.bigTypeId = bigTypeId;
    }

    public String getSmallTypeName() {
        return smallTypeName;
    }

    public void setSmallTypeName(String smallTypeName) {
        this.smallTypeName = smallTypeName;
    }

    public int getSmallTypeId() {
        return smallTypeId;
    }

    public void setSmallTypeId(int smallTypeId) {
        this.smallTypeId = smallTypeId;
    }

    public int getStoreNo() {
        return storeNo;
    }

    public void setStoreNo(int storeNo) {
        this.storeNo = storeNo;
    }

    public int getSaleNo() {
        return saleNo;
    }

    public void setSaleNo(int saleNo) {
        this.saleNo = saleNo;
    }

    public List<GoodsAttribute> getGoodsAttributeList() {
        return goodsAttributeList;
    }

    public void setGoodsAttributeList(List<GoodsAttribute> goodsAttributeList) {
        this.goodsAttributeList = goodsAttributeList;
    }

    public List<SelectAttributeDetail> getSelectAttributeDetailList() {
        return selectAttributeDetailList;
    }

    public void setSelectAttributeDetailList(List<SelectAttributeDetail> selectAttributeDetailList) {
        this.selectAttributeDetailList = selectAttributeDetailList;
    }

    public List<GoodsPrice> getEnableSelectGroupList() {
        return enableSelectGroupList;
    }

    public void setEnableSelectGroupList(List<GoodsPrice> enableSelectGroupList) {
        this.enableSelectGroupList = enableSelectGroupList;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }





}

