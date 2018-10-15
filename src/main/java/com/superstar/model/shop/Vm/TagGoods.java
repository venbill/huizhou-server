package com.superstar.model.shop.Vm;

import java.util.List;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午4:00 2018/10/13.
 */
public class TagGoods {

    private int tagId;

    private String tagName;

    private List<GoodsShortInfo> goods;


    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public List<GoodsShortInfo> getGoods() {
        return goods;
    }

    public void setGoods(List<GoodsShortInfo> goods) {
        this.goods = goods;
    }
}
