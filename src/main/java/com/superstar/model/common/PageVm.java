package com.superstar.model.common;


import javax.validation.constraints.PositiveOrZero;

/**
 * @Author: BillYu
 * @Description:分页参数 请求实体校验
 * @Date: Created in 上午9:35 2018/7/10.
 */
public class PageVm {
    @PositiveOrZero
    private int pageNum;

    @PositiveOrZero
    private int pageSize;

    public PageVm() {
    }

    public PageVm(@PositiveOrZero int pageNum, @PositiveOrZero int pageSize) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
