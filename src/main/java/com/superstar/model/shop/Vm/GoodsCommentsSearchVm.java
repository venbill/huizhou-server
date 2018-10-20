package com.superstar.model.shop.Vm;

import com.superstar.model.common.PageVm;

/**
 * @Author: BillYu
 * @Description:商品评论搜索
 * @Date: Created in 下午11:45 2018/10/15.
 */
public class GoodsCommentsSearchVm extends PageVm{
    /**
     * 商品id
     */
    private long goodsId;

    /**
     * 评论类型 0或空 全部    ；1为好评  ； 2中评 ；3差评
     */
    private int commentType;

    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }

    public int getCommentType() {
        return commentType;
    }

    public void setCommentType(int commentType) {
        this.commentType = commentType;
    }
}
