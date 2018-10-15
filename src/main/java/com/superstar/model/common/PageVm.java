package com.superstar.model.common;


import javax.validation.constraints.PositiveOrZero;

/**
 * @Author: BillYu
 * @Description:分页参数 请求实体校验
 * @Date: Created in 上午9:35 2018/7/10.
 */
public class PageVm {
    @PositiveOrZero
    private int pageNo;

    @PositiveOrZero
    private int pageSize;

    public PageVm() {
    }

    public PageVm(@PositiveOrZero int pageNo, @PositiveOrZero int pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNum) {
        this.pageNo = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
