package com.superstar.model.shop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsCommentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIdIsNull() {
            addCriterion("goods_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIdIsNotNull() {
            addCriterion("goods_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIdEqualTo(Long value) {
            addCriterion("goods_detail_id =", value, "goodsDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIdNotEqualTo(Long value) {
            addCriterion("goods_detail_id <>", value, "goodsDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIdGreaterThan(Long value) {
            addCriterion("goods_detail_id >", value, "goodsDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_detail_id >=", value, "goodsDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIdLessThan(Long value) {
            addCriterion("goods_detail_id <", value, "goodsDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_detail_id <=", value, "goodsDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIdIn(List<Long> values) {
            addCriterion("goods_detail_id in", values, "goodsDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIdNotIn(List<Long> values) {
            addCriterion("goods_detail_id not in", values, "goodsDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIdBetween(Long value1, Long value2) {
            addCriterion("goods_detail_id between", value1, value2, "goodsDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_detail_id not between", value1, value2, "goodsDetailId");
            return (Criteria) this;
        }

        public Criteria andAttributesValuesContentIsNull() {
            addCriterion("attributes_values_content is null");
            return (Criteria) this;
        }

        public Criteria andAttributesValuesContentIsNotNull() {
            addCriterion("attributes_values_content is not null");
            return (Criteria) this;
        }

        public Criteria andAttributesValuesContentEqualTo(String value) {
            addCriterion("attributes_values_content =", value, "attributesValuesContent");
            return (Criteria) this;
        }

        public Criteria andAttributesValuesContentNotEqualTo(String value) {
            addCriterion("attributes_values_content <>", value, "attributesValuesContent");
            return (Criteria) this;
        }

        public Criteria andAttributesValuesContentGreaterThan(String value) {
            addCriterion("attributes_values_content >", value, "attributesValuesContent");
            return (Criteria) this;
        }

        public Criteria andAttributesValuesContentGreaterThanOrEqualTo(String value) {
            addCriterion("attributes_values_content >=", value, "attributesValuesContent");
            return (Criteria) this;
        }

        public Criteria andAttributesValuesContentLessThan(String value) {
            addCriterion("attributes_values_content <", value, "attributesValuesContent");
            return (Criteria) this;
        }

        public Criteria andAttributesValuesContentLessThanOrEqualTo(String value) {
            addCriterion("attributes_values_content <=", value, "attributesValuesContent");
            return (Criteria) this;
        }

        public Criteria andAttributesValuesContentLike(String value) {
            addCriterion("attributes_values_content like", value, "attributesValuesContent");
            return (Criteria) this;
        }

        public Criteria andAttributesValuesContentNotLike(String value) {
            addCriterion("attributes_values_content not like", value, "attributesValuesContent");
            return (Criteria) this;
        }

        public Criteria andAttributesValuesContentIn(List<String> values) {
            addCriterion("attributes_values_content in", values, "attributesValuesContent");
            return (Criteria) this;
        }

        public Criteria andAttributesValuesContentNotIn(List<String> values) {
            addCriterion("attributes_values_content not in", values, "attributesValuesContent");
            return (Criteria) this;
        }

        public Criteria andAttributesValuesContentBetween(String value1, String value2) {
            addCriterion("attributes_values_content between", value1, value2, "attributesValuesContent");
            return (Criteria) this;
        }

        public Criteria andAttributesValuesContentNotBetween(String value1, String value2) {
            addCriterion("attributes_values_content not between", value1, value2, "attributesValuesContent");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Long value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Long value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Long value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Long value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Long> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Long> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Long value1, Long value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentPicturesIsNull() {
            addCriterion("comment_pictures is null");
            return (Criteria) this;
        }

        public Criteria andCommentPicturesIsNotNull() {
            addCriterion("comment_pictures is not null");
            return (Criteria) this;
        }

        public Criteria andCommentPicturesEqualTo(String value) {
            addCriterion("comment_pictures =", value, "commentPictures");
            return (Criteria) this;
        }

        public Criteria andCommentPicturesNotEqualTo(String value) {
            addCriterion("comment_pictures <>", value, "commentPictures");
            return (Criteria) this;
        }

        public Criteria andCommentPicturesGreaterThan(String value) {
            addCriterion("comment_pictures >", value, "commentPictures");
            return (Criteria) this;
        }

        public Criteria andCommentPicturesGreaterThanOrEqualTo(String value) {
            addCriterion("comment_pictures >=", value, "commentPictures");
            return (Criteria) this;
        }

        public Criteria andCommentPicturesLessThan(String value) {
            addCriterion("comment_pictures <", value, "commentPictures");
            return (Criteria) this;
        }

        public Criteria andCommentPicturesLessThanOrEqualTo(String value) {
            addCriterion("comment_pictures <=", value, "commentPictures");
            return (Criteria) this;
        }

        public Criteria andCommentPicturesLike(String value) {
            addCriterion("comment_pictures like", value, "commentPictures");
            return (Criteria) this;
        }

        public Criteria andCommentPicturesNotLike(String value) {
            addCriterion("comment_pictures not like", value, "commentPictures");
            return (Criteria) this;
        }

        public Criteria andCommentPicturesIn(List<String> values) {
            addCriterion("comment_pictures in", values, "commentPictures");
            return (Criteria) this;
        }

        public Criteria andCommentPicturesNotIn(List<String> values) {
            addCriterion("comment_pictures not in", values, "commentPictures");
            return (Criteria) this;
        }

        public Criteria andCommentPicturesBetween(String value1, String value2) {
            addCriterion("comment_pictures between", value1, value2, "commentPictures");
            return (Criteria) this;
        }

        public Criteria andCommentPicturesNotBetween(String value1, String value2) {
            addCriterion("comment_pictures not between", value1, value2, "commentPictures");
            return (Criteria) this;
        }

        public Criteria andReplyIsNull() {
            addCriterion("reply is null");
            return (Criteria) this;
        }

        public Criteria andReplyIsNotNull() {
            addCriterion("reply is not null");
            return (Criteria) this;
        }

        public Criteria andReplyEqualTo(String value) {
            addCriterion("reply =", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotEqualTo(String value) {
            addCriterion("reply <>", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyGreaterThan(String value) {
            addCriterion("reply >", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyGreaterThanOrEqualTo(String value) {
            addCriterion("reply >=", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyLessThan(String value) {
            addCriterion("reply <", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyLessThanOrEqualTo(String value) {
            addCriterion("reply <=", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyLike(String value) {
            addCriterion("reply like", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotLike(String value) {
            addCriterion("reply not like", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyIn(List<String> values) {
            addCriterion("reply in", values, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotIn(List<String> values) {
            addCriterion("reply not in", values, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyBetween(String value1, String value2) {
            addCriterion("reply between", value1, value2, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotBetween(String value1, String value2) {
            addCriterion("reply not between", value1, value2, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyPicturesIsNull() {
            addCriterion("reply_pictures is null");
            return (Criteria) this;
        }

        public Criteria andReplyPicturesIsNotNull() {
            addCriterion("reply_pictures is not null");
            return (Criteria) this;
        }

        public Criteria andReplyPicturesEqualTo(String value) {
            addCriterion("reply_pictures =", value, "replyPictures");
            return (Criteria) this;
        }

        public Criteria andReplyPicturesNotEqualTo(String value) {
            addCriterion("reply_pictures <>", value, "replyPictures");
            return (Criteria) this;
        }

        public Criteria andReplyPicturesGreaterThan(String value) {
            addCriterion("reply_pictures >", value, "replyPictures");
            return (Criteria) this;
        }

        public Criteria andReplyPicturesGreaterThanOrEqualTo(String value) {
            addCriterion("reply_pictures >=", value, "replyPictures");
            return (Criteria) this;
        }

        public Criteria andReplyPicturesLessThan(String value) {
            addCriterion("reply_pictures <", value, "replyPictures");
            return (Criteria) this;
        }

        public Criteria andReplyPicturesLessThanOrEqualTo(String value) {
            addCriterion("reply_pictures <=", value, "replyPictures");
            return (Criteria) this;
        }

        public Criteria andReplyPicturesLike(String value) {
            addCriterion("reply_pictures like", value, "replyPictures");
            return (Criteria) this;
        }

        public Criteria andReplyPicturesNotLike(String value) {
            addCriterion("reply_pictures not like", value, "replyPictures");
            return (Criteria) this;
        }

        public Criteria andReplyPicturesIn(List<String> values) {
            addCriterion("reply_pictures in", values, "replyPictures");
            return (Criteria) this;
        }

        public Criteria andReplyPicturesNotIn(List<String> values) {
            addCriterion("reply_pictures not in", values, "replyPictures");
            return (Criteria) this;
        }

        public Criteria andReplyPicturesBetween(String value1, String value2) {
            addCriterion("reply_pictures between", value1, value2, "replyPictures");
            return (Criteria) this;
        }

        public Criteria andReplyPicturesNotBetween(String value1, String value2) {
            addCriterion("reply_pictures not between", value1, value2, "replyPictures");
            return (Criteria) this;
        }

        public Criteria andReplyUserIsNull() {
            addCriterion("reply_user is null");
            return (Criteria) this;
        }

        public Criteria andReplyUserIsNotNull() {
            addCriterion("reply_user is not null");
            return (Criteria) this;
        }

        public Criteria andReplyUserEqualTo(Long value) {
            addCriterion("reply_user =", value, "replyUser");
            return (Criteria) this;
        }

        public Criteria andReplyUserNotEqualTo(Long value) {
            addCriterion("reply_user <>", value, "replyUser");
            return (Criteria) this;
        }

        public Criteria andReplyUserGreaterThan(Long value) {
            addCriterion("reply_user >", value, "replyUser");
            return (Criteria) this;
        }

        public Criteria andReplyUserGreaterThanOrEqualTo(Long value) {
            addCriterion("reply_user >=", value, "replyUser");
            return (Criteria) this;
        }

        public Criteria andReplyUserLessThan(Long value) {
            addCriterion("reply_user <", value, "replyUser");
            return (Criteria) this;
        }

        public Criteria andReplyUserLessThanOrEqualTo(Long value) {
            addCriterion("reply_user <=", value, "replyUser");
            return (Criteria) this;
        }

        public Criteria andReplyUserIn(List<Long> values) {
            addCriterion("reply_user in", values, "replyUser");
            return (Criteria) this;
        }

        public Criteria andReplyUserNotIn(List<Long> values) {
            addCriterion("reply_user not in", values, "replyUser");
            return (Criteria) this;
        }

        public Criteria andReplyUserBetween(Long value1, Long value2) {
            addCriterion("reply_user between", value1, value2, "replyUser");
            return (Criteria) this;
        }

        public Criteria andReplyUserNotBetween(Long value1, Long value2) {
            addCriterion("reply_user not between", value1, value2, "replyUser");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNull() {
            addCriterion("reply_time is null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNotNull() {
            addCriterion("reply_time is not null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeEqualTo(Date value) {
            addCriterion("reply_time =", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotEqualTo(Date value) {
            addCriterion("reply_time <>", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThan(Date value) {
            addCriterion("reply_time >", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reply_time >=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThan(Date value) {
            addCriterion("reply_time <", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("reply_time <=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIn(List<Date> values) {
            addCriterion("reply_time in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotIn(List<Date> values) {
            addCriterion("reply_time not in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeBetween(Date value1, Date value2) {
            addCriterion("reply_time between", value1, value2, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("reply_time not between", value1, value2, "replyTime");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Double value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Double value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Double value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Double value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Double value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Double> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Double> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Double value1, Double value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Double value1, Double value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}