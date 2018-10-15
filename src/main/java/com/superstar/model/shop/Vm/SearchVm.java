package com.superstar.model.shop.Vm;

import com.superstar.model.common.PageVm;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午5:08 2018/10/13.
 */
public class SearchVm extends PageVm{
    String content;
    int activityId;
    int bigTypeId;
    int smallTypeId;
    int tagId;

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
}
