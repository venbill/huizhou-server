package com.superstar.model.shop.Vm;

import com.superstar.model.common.PageVm;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午5:08 2018/10/13.
 */
public class SearchVm extends PageVm{
    /**
     * 关键词
     */
    String content;
    /**
     * 活动id
     */
    int activityId;
    /**
     * 大分类
     */
    int bigTypeId;
    /**
     * 小分类
     */
    int smallTypeId;
    /**
     * 店铺类型
     */
    int shopType;
    /**
     * 商品标记
     */
    int tagId;
    /**
     * 最低价
     */
    double minPrice;
    /**
     * 最高价格
     */
    double maxPrice;

    /**
     * 店铺id
     */
    int shopId;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public int getBigTypeId() {
        return bigTypeId;
    }

    public void setBigTypeId(int bigTypeId) {
        this.bigTypeId = bigTypeId;
    }

    public int getSmallTypeId() {
        return smallTypeId;
    }

    public void setSmallTypeId(int smallTypeId) {
        this.smallTypeId = smallTypeId;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }


    public int getShopType() {
        return shopType;
    }

    public void setShopType(int shopType) {
        this.shopType = shopType;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }


    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }
}
