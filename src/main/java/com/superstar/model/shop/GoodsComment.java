package com.superstar.model.shop;

import java.util.Date;

public class GoodsComment {
    private Long id;

    private Long goodsDetailId;

    private String attributesValuesContent;

    private Long goodsId;

    private Date createTime;

    private Long userId;

    private String comment;

    private String commentPictures;

    private String reply;

    private String replyPictures;

    private Long replyUser;

    private Date replyTime;

    private Double score;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoodsDetailId() {
        return goodsDetailId;
    }

    public void setGoodsDetailId(Long goodsDetailId) {
        this.goodsDetailId = goodsDetailId;
    }

    public String getAttributesValuesContent() {
        return attributesValuesContent;
    }

    public void setAttributesValuesContent(String attributesValuesContent) {
        this.attributesValuesContent = attributesValuesContent == null ? null : attributesValuesContent.trim();
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getCommentPictures() {
        return commentPictures;
    }

    public void setCommentPictures(String commentPictures) {
        this.commentPictures = commentPictures == null ? null : commentPictures.trim();
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply == null ? null : reply.trim();
    }

    public String getReplyPictures() {
        return replyPictures;
    }

    public void setReplyPictures(String replyPictures) {
        this.replyPictures = replyPictures == null ? null : replyPictures.trim();
    }

    public Long getReplyUser() {
        return replyUser;
    }

    public void setReplyUser(Long replyUser) {
        this.replyUser = replyUser;
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}