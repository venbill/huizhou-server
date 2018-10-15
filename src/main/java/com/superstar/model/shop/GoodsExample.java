package com.superstar.model.shop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andBigTypeIsNull() {
            addCriterion("big_type is null");
            return (Criteria) this;
        }

        public Criteria andBigTypeIsNotNull() {
            addCriterion("big_type is not null");
            return (Criteria) this;
        }

        public Criteria andBigTypeEqualTo(Integer value) {
            addCriterion("big_type =", value, "bigType");
            return (Criteria) this;
        }

        public Criteria andBigTypeNotEqualTo(Integer value) {
            addCriterion("big_type <>", value, "bigType");
            return (Criteria) this;
        }

        public Criteria andBigTypeGreaterThan(Integer value) {
            addCriterion("big_type >", value, "bigType");
            return (Criteria) this;
        }

        public Criteria andBigTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("big_type >=", value, "bigType");
            return (Criteria) this;
        }

        public Criteria andBigTypeLessThan(Integer value) {
            addCriterion("big_type <", value, "bigType");
            return (Criteria) this;
        }

        public Criteria andBigTypeLessThanOrEqualTo(Integer value) {
            addCriterion("big_type <=", value, "bigType");
            return (Criteria) this;
        }

        public Criteria andBigTypeIn(List<Integer> values) {
            addCriterion("big_type in", values, "bigType");
            return (Criteria) this;
        }

        public Criteria andBigTypeNotIn(List<Integer> values) {
            addCriterion("big_type not in", values, "bigType");
            return (Criteria) this;
        }

        public Criteria andBigTypeBetween(Integer value1, Integer value2) {
            addCriterion("big_type between", value1, value2, "bigType");
            return (Criteria) this;
        }

        public Criteria andBigTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("big_type not between", value1, value2, "bigType");
            return (Criteria) this;
        }

        public Criteria andSmallTypeIsNull() {
            addCriterion("small_type is null");
            return (Criteria) this;
        }

        public Criteria andSmallTypeIsNotNull() {
            addCriterion("small_type is not null");
            return (Criteria) this;
        }

        public Criteria andSmallTypeEqualTo(Integer value) {
            addCriterion("small_type =", value, "smallType");
            return (Criteria) this;
        }

        public Criteria andSmallTypeNotEqualTo(Integer value) {
            addCriterion("small_type <>", value, "smallType");
            return (Criteria) this;
        }

        public Criteria andSmallTypeGreaterThan(Integer value) {
            addCriterion("small_type >", value, "smallType");
            return (Criteria) this;
        }

        public Criteria andSmallTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("small_type >=", value, "smallType");
            return (Criteria) this;
        }

        public Criteria andSmallTypeLessThan(Integer value) {
            addCriterion("small_type <", value, "smallType");
            return (Criteria) this;
        }

        public Criteria andSmallTypeLessThanOrEqualTo(Integer value) {
            addCriterion("small_type <=", value, "smallType");
            return (Criteria) this;
        }

        public Criteria andSmallTypeIn(List<Integer> values) {
            addCriterion("small_type in", values, "smallType");
            return (Criteria) this;
        }

        public Criteria andSmallTypeNotIn(List<Integer> values) {
            addCriterion("small_type not in", values, "smallType");
            return (Criteria) this;
        }

        public Criteria andSmallTypeBetween(Integer value1, Integer value2) {
            addCriterion("small_type between", value1, value2, "smallType");
            return (Criteria) this;
        }

        public Criteria andSmallTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("small_type not between", value1, value2, "smallType");
            return (Criteria) this;
        }

        public Criteria andShopTypeIsNull() {
            addCriterion("shop_type is null");
            return (Criteria) this;
        }

        public Criteria andShopTypeIsNotNull() {
            addCriterion("shop_type is not null");
            return (Criteria) this;
        }

        public Criteria andShopTypeEqualTo(Integer value) {
            addCriterion("shop_type =", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotEqualTo(Integer value) {
            addCriterion("shop_type <>", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeGreaterThan(Integer value) {
            addCriterion("shop_type >", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_type >=", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLessThan(Integer value) {
            addCriterion("shop_type <", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLessThanOrEqualTo(Integer value) {
            addCriterion("shop_type <=", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeIn(List<Integer> values) {
            addCriterion("shop_type in", values, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotIn(List<Integer> values) {
            addCriterion("shop_type not in", values, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeBetween(Integer value1, Integer value2) {
            addCriterion("shop_type between", value1, value2, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_type not between", value1, value2, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPicture1IsNull() {
            addCriterion("picture1 is null");
            return (Criteria) this;
        }

        public Criteria andPicture1IsNotNull() {
            addCriterion("picture1 is not null");
            return (Criteria) this;
        }

        public Criteria andPicture1EqualTo(String value) {
            addCriterion("picture1 =", value, "picture1");
            return (Criteria) this;
        }

        public Criteria andPicture1NotEqualTo(String value) {
            addCriterion("picture1 <>", value, "picture1");
            return (Criteria) this;
        }

        public Criteria andPicture1GreaterThan(String value) {
            addCriterion("picture1 >", value, "picture1");
            return (Criteria) this;
        }

        public Criteria andPicture1GreaterThanOrEqualTo(String value) {
            addCriterion("picture1 >=", value, "picture1");
            return (Criteria) this;
        }

        public Criteria andPicture1LessThan(String value) {
            addCriterion("picture1 <", value, "picture1");
            return (Criteria) this;
        }

        public Criteria andPicture1LessThanOrEqualTo(String value) {
            addCriterion("picture1 <=", value, "picture1");
            return (Criteria) this;
        }

        public Criteria andPicture1Like(String value) {
            addCriterion("picture1 like", value, "picture1");
            return (Criteria) this;
        }

        public Criteria andPicture1NotLike(String value) {
            addCriterion("picture1 not like", value, "picture1");
            return (Criteria) this;
        }

        public Criteria andPicture1In(List<String> values) {
            addCriterion("picture1 in", values, "picture1");
            return (Criteria) this;
        }

        public Criteria andPicture1NotIn(List<String> values) {
            addCriterion("picture1 not in", values, "picture1");
            return (Criteria) this;
        }

        public Criteria andPicture1Between(String value1, String value2) {
            addCriterion("picture1 between", value1, value2, "picture1");
            return (Criteria) this;
        }

        public Criteria andPicture1NotBetween(String value1, String value2) {
            addCriterion("picture1 not between", value1, value2, "picture1");
            return (Criteria) this;
        }

        public Criteria andPicture2IsNull() {
            addCriterion("picture2 is null");
            return (Criteria) this;
        }

        public Criteria andPicture2IsNotNull() {
            addCriterion("picture2 is not null");
            return (Criteria) this;
        }

        public Criteria andPicture2EqualTo(String value) {
            addCriterion("picture2 =", value, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2NotEqualTo(String value) {
            addCriterion("picture2 <>", value, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2GreaterThan(String value) {
            addCriterion("picture2 >", value, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2GreaterThanOrEqualTo(String value) {
            addCriterion("picture2 >=", value, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2LessThan(String value) {
            addCriterion("picture2 <", value, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2LessThanOrEqualTo(String value) {
            addCriterion("picture2 <=", value, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2Like(String value) {
            addCriterion("picture2 like", value, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2NotLike(String value) {
            addCriterion("picture2 not like", value, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2In(List<String> values) {
            addCriterion("picture2 in", values, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2NotIn(List<String> values) {
            addCriterion("picture2 not in", values, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2Between(String value1, String value2) {
            addCriterion("picture2 between", value1, value2, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2NotBetween(String value1, String value2) {
            addCriterion("picture2 not between", value1, value2, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture3IsNull() {
            addCriterion("picture3 is null");
            return (Criteria) this;
        }

        public Criteria andPicture3IsNotNull() {
            addCriterion("picture3 is not null");
            return (Criteria) this;
        }

        public Criteria andPicture3EqualTo(String value) {
            addCriterion("picture3 =", value, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3NotEqualTo(String value) {
            addCriterion("picture3 <>", value, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3GreaterThan(String value) {
            addCriterion("picture3 >", value, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3GreaterThanOrEqualTo(String value) {
            addCriterion("picture3 >=", value, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3LessThan(String value) {
            addCriterion("picture3 <", value, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3LessThanOrEqualTo(String value) {
            addCriterion("picture3 <=", value, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3Like(String value) {
            addCriterion("picture3 like", value, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3NotLike(String value) {
            addCriterion("picture3 not like", value, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3In(List<String> values) {
            addCriterion("picture3 in", values, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3NotIn(List<String> values) {
            addCriterion("picture3 not in", values, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3Between(String value1, String value2) {
            addCriterion("picture3 between", value1, value2, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3NotBetween(String value1, String value2) {
            addCriterion("picture3 not between", value1, value2, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture4IsNull() {
            addCriterion("picture4 is null");
            return (Criteria) this;
        }

        public Criteria andPicture4IsNotNull() {
            addCriterion("picture4 is not null");
            return (Criteria) this;
        }

        public Criteria andPicture4EqualTo(String value) {
            addCriterion("picture4 =", value, "picture4");
            return (Criteria) this;
        }

        public Criteria andPicture4NotEqualTo(String value) {
            addCriterion("picture4 <>", value, "picture4");
            return (Criteria) this;
        }

        public Criteria andPicture4GreaterThan(String value) {
            addCriterion("picture4 >", value, "picture4");
            return (Criteria) this;
        }

        public Criteria andPicture4GreaterThanOrEqualTo(String value) {
            addCriterion("picture4 >=", value, "picture4");
            return (Criteria) this;
        }

        public Criteria andPicture4LessThan(String value) {
            addCriterion("picture4 <", value, "picture4");
            return (Criteria) this;
        }

        public Criteria andPicture4LessThanOrEqualTo(String value) {
            addCriterion("picture4 <=", value, "picture4");
            return (Criteria) this;
        }

        public Criteria andPicture4Like(String value) {
            addCriterion("picture4 like", value, "picture4");
            return (Criteria) this;
        }

        public Criteria andPicture4NotLike(String value) {
            addCriterion("picture4 not like", value, "picture4");
            return (Criteria) this;
        }

        public Criteria andPicture4In(List<String> values) {
            addCriterion("picture4 in", values, "picture4");
            return (Criteria) this;
        }

        public Criteria andPicture4NotIn(List<String> values) {
            addCriterion("picture4 not in", values, "picture4");
            return (Criteria) this;
        }

        public Criteria andPicture4Between(String value1, String value2) {
            addCriterion("picture4 between", value1, value2, "picture4");
            return (Criteria) this;
        }

        public Criteria andPicture4NotBetween(String value1, String value2) {
            addCriterion("picture4 not between", value1, value2, "picture4");
            return (Criteria) this;
        }

        public Criteria andPriceMinIsNull() {
            addCriterion("price_min is null");
            return (Criteria) this;
        }

        public Criteria andPriceMinIsNotNull() {
            addCriterion("price_min is not null");
            return (Criteria) this;
        }

        public Criteria andPriceMinEqualTo(BigDecimal value) {
            addCriterion("price_min =", value, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMinNotEqualTo(BigDecimal value) {
            addCriterion("price_min <>", value, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMinGreaterThan(BigDecimal value) {
            addCriterion("price_min >", value, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price_min >=", value, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMinLessThan(BigDecimal value) {
            addCriterion("price_min <", value, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price_min <=", value, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMinIn(List<BigDecimal> values) {
            addCriterion("price_min in", values, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMinNotIn(List<BigDecimal> values) {
            addCriterion("price_min not in", values, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_min between", value1, value2, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_min not between", value1, value2, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMaxIsNull() {
            addCriterion("price_max is null");
            return (Criteria) this;
        }

        public Criteria andPriceMaxIsNotNull() {
            addCriterion("price_max is not null");
            return (Criteria) this;
        }

        public Criteria andPriceMaxEqualTo(BigDecimal value) {
            addCriterion("price_max =", value, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxNotEqualTo(BigDecimal value) {
            addCriterion("price_max <>", value, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxGreaterThan(BigDecimal value) {
            addCriterion("price_max >", value, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price_max >=", value, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxLessThan(BigDecimal value) {
            addCriterion("price_max <", value, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price_max <=", value, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxIn(List<BigDecimal> values) {
            addCriterion("price_max in", values, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxNotIn(List<BigDecimal> values) {
            addCriterion("price_max not in", values, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_max between", value1, value2, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_max not between", value1, value2, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andHaveExpressIsNull() {
            addCriterion("have_express is null");
            return (Criteria) this;
        }

        public Criteria andHaveExpressIsNotNull() {
            addCriterion("have_express is not null");
            return (Criteria) this;
        }

        public Criteria andHaveExpressEqualTo(Boolean value) {
            addCriterion("have_express =", value, "haveExpress");
            return (Criteria) this;
        }

        public Criteria andHaveExpressNotEqualTo(Boolean value) {
            addCriterion("have_express <>", value, "haveExpress");
            return (Criteria) this;
        }

        public Criteria andHaveExpressGreaterThan(Boolean value) {
            addCriterion("have_express >", value, "haveExpress");
            return (Criteria) this;
        }

        public Criteria andHaveExpressGreaterThanOrEqualTo(Boolean value) {
            addCriterion("have_express >=", value, "haveExpress");
            return (Criteria) this;
        }

        public Criteria andHaveExpressLessThan(Boolean value) {
            addCriterion("have_express <", value, "haveExpress");
            return (Criteria) this;
        }

        public Criteria andHaveExpressLessThanOrEqualTo(Boolean value) {
            addCriterion("have_express <=", value, "haveExpress");
            return (Criteria) this;
        }

        public Criteria andHaveExpressIn(List<Boolean> values) {
            addCriterion("have_express in", values, "haveExpress");
            return (Criteria) this;
        }

        public Criteria andHaveExpressNotIn(List<Boolean> values) {
            addCriterion("have_express not in", values, "haveExpress");
            return (Criteria) this;
        }

        public Criteria andHaveExpressBetween(Boolean value1, Boolean value2) {
            addCriterion("have_express between", value1, value2, "haveExpress");
            return (Criteria) this;
        }

        public Criteria andHaveExpressNotBetween(Boolean value1, Boolean value2) {
            addCriterion("have_express not between", value1, value2, "haveExpress");
            return (Criteria) this;
        }

        public Criteria andExpressFreeIsNull() {
            addCriterion("express_free is null");
            return (Criteria) this;
        }

        public Criteria andExpressFreeIsNotNull() {
            addCriterion("express_free is not null");
            return (Criteria) this;
        }

        public Criteria andExpressFreeEqualTo(Boolean value) {
            addCriterion("express_free =", value, "expressFree");
            return (Criteria) this;
        }

        public Criteria andExpressFreeNotEqualTo(Boolean value) {
            addCriterion("express_free <>", value, "expressFree");
            return (Criteria) this;
        }

        public Criteria andExpressFreeGreaterThan(Boolean value) {
            addCriterion("express_free >", value, "expressFree");
            return (Criteria) this;
        }

        public Criteria andExpressFreeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("express_free >=", value, "expressFree");
            return (Criteria) this;
        }

        public Criteria andExpressFreeLessThan(Boolean value) {
            addCriterion("express_free <", value, "expressFree");
            return (Criteria) this;
        }

        public Criteria andExpressFreeLessThanOrEqualTo(Boolean value) {
            addCriterion("express_free <=", value, "expressFree");
            return (Criteria) this;
        }

        public Criteria andExpressFreeIn(List<Boolean> values) {
            addCriterion("express_free in", values, "expressFree");
            return (Criteria) this;
        }

        public Criteria andExpressFreeNotIn(List<Boolean> values) {
            addCriterion("express_free not in", values, "expressFree");
            return (Criteria) this;
        }

        public Criteria andExpressFreeBetween(Boolean value1, Boolean value2) {
            addCriterion("express_free between", value1, value2, "expressFree");
            return (Criteria) this;
        }

        public Criteria andExpressFreeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("express_free not between", value1, value2, "expressFree");
            return (Criteria) this;
        }

        public Criteria andExpressMoneyIsNull() {
            addCriterion("express_money is null");
            return (Criteria) this;
        }

        public Criteria andExpressMoneyIsNotNull() {
            addCriterion("express_money is not null");
            return (Criteria) this;
        }

        public Criteria andExpressMoneyEqualTo(BigDecimal value) {
            addCriterion("express_money =", value, "expressMoney");
            return (Criteria) this;
        }

        public Criteria andExpressMoneyNotEqualTo(BigDecimal value) {
            addCriterion("express_money <>", value, "expressMoney");
            return (Criteria) this;
        }

        public Criteria andExpressMoneyGreaterThan(BigDecimal value) {
            addCriterion("express_money >", value, "expressMoney");
            return (Criteria) this;
        }

        public Criteria andExpressMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("express_money >=", value, "expressMoney");
            return (Criteria) this;
        }

        public Criteria andExpressMoneyLessThan(BigDecimal value) {
            addCriterion("express_money <", value, "expressMoney");
            return (Criteria) this;
        }

        public Criteria andExpressMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("express_money <=", value, "expressMoney");
            return (Criteria) this;
        }

        public Criteria andExpressMoneyIn(List<BigDecimal> values) {
            addCriterion("express_money in", values, "expressMoney");
            return (Criteria) this;
        }

        public Criteria andExpressMoneyNotIn(List<BigDecimal> values) {
            addCriterion("express_money not in", values, "expressMoney");
            return (Criteria) this;
        }

        public Criteria andExpressMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("express_money between", value1, value2, "expressMoney");
            return (Criteria) this;
        }

        public Criteria andExpressMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("express_money not between", value1, value2, "expressMoney");
            return (Criteria) this;
        }

        public Criteria andSelectAttributeIsNull() {
            addCriterion("select_attribute is null");
            return (Criteria) this;
        }

        public Criteria andSelectAttributeIsNotNull() {
            addCriterion("select_attribute is not null");
            return (Criteria) this;
        }

        public Criteria andSelectAttributeEqualTo(Boolean value) {
            addCriterion("select_attribute =", value, "selectAttribute");
            return (Criteria) this;
        }

        public Criteria andSelectAttributeNotEqualTo(Boolean value) {
            addCriterion("select_attribute <>", value, "selectAttribute");
            return (Criteria) this;
        }

        public Criteria andSelectAttributeGreaterThan(Boolean value) {
            addCriterion("select_attribute >", value, "selectAttribute");
            return (Criteria) this;
        }

        public Criteria andSelectAttributeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("select_attribute >=", value, "selectAttribute");
            return (Criteria) this;
        }

        public Criteria andSelectAttributeLessThan(Boolean value) {
            addCriterion("select_attribute <", value, "selectAttribute");
            return (Criteria) this;
        }

        public Criteria andSelectAttributeLessThanOrEqualTo(Boolean value) {
            addCriterion("select_attribute <=", value, "selectAttribute");
            return (Criteria) this;
        }

        public Criteria andSelectAttributeIn(List<Boolean> values) {
            addCriterion("select_attribute in", values, "selectAttribute");
            return (Criteria) this;
        }

        public Criteria andSelectAttributeNotIn(List<Boolean> values) {
            addCriterion("select_attribute not in", values, "selectAttribute");
            return (Criteria) this;
        }

        public Criteria andSelectAttributeBetween(Boolean value1, Boolean value2) {
            addCriterion("select_attribute between", value1, value2, "selectAttribute");
            return (Criteria) this;
        }

        public Criteria andSelectAttributeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("select_attribute not between", value1, value2, "selectAttribute");
            return (Criteria) this;
        }

        public Criteria andStoreNoIsNull() {
            addCriterion("store_no is null");
            return (Criteria) this;
        }

        public Criteria andStoreNoIsNotNull() {
            addCriterion("store_no is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNoEqualTo(Integer value) {
            addCriterion("store_no =", value, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoNotEqualTo(Integer value) {
            addCriterion("store_no <>", value, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoGreaterThan(Integer value) {
            addCriterion("store_no >", value, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_no >=", value, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoLessThan(Integer value) {
            addCriterion("store_no <", value, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoLessThanOrEqualTo(Integer value) {
            addCriterion("store_no <=", value, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoIn(List<Integer> values) {
            addCriterion("store_no in", values, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoNotIn(List<Integer> values) {
            addCriterion("store_no not in", values, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoBetween(Integer value1, Integer value2) {
            addCriterion("store_no between", value1, value2, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoNotBetween(Integer value1, Integer value2) {
            addCriterion("store_no not between", value1, value2, "storeNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoIsNull() {
            addCriterion("sale_no is null");
            return (Criteria) this;
        }

        public Criteria andSaleNoIsNotNull() {
            addCriterion("sale_no is not null");
            return (Criteria) this;
        }

        public Criteria andSaleNoEqualTo(Integer value) {
            addCriterion("sale_no =", value, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoNotEqualTo(Integer value) {
            addCriterion("sale_no <>", value, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoGreaterThan(Integer value) {
            addCriterion("sale_no >", value, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_no >=", value, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoLessThan(Integer value) {
            addCriterion("sale_no <", value, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoLessThanOrEqualTo(Integer value) {
            addCriterion("sale_no <=", value, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoIn(List<Integer> values) {
            addCriterion("sale_no in", values, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoNotIn(List<Integer> values) {
            addCriterion("sale_no not in", values, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoBetween(Integer value1, Integer value2) {
            addCriterion("sale_no between", value1, value2, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_no not between", value1, value2, "saleNo");
            return (Criteria) this;
        }

        public Criteria andTagsIsNull() {
            addCriterion("tags is null");
            return (Criteria) this;
        }

        public Criteria andTagsIsNotNull() {
            addCriterion("tags is not null");
            return (Criteria) this;
        }

        public Criteria andTagsEqualTo(String value) {
            addCriterion("tags =", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotEqualTo(String value) {
            addCriterion("tags <>", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThan(String value) {
            addCriterion("tags >", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThanOrEqualTo(String value) {
            addCriterion("tags >=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThan(String value) {
            addCriterion("tags <", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThanOrEqualTo(String value) {
            addCriterion("tags <=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLike(String value) {
            addCriterion("tags like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotLike(String value) {
            addCriterion("tags not like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsIn(List<String> values) {
            addCriterion("tags in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotIn(List<String> values) {
            addCriterion("tags not in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsBetween(String value1, String value2) {
            addCriterion("tags between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotBetween(String value1, String value2) {
            addCriterion("tags not between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andCommentNoIsNull() {
            addCriterion("comment_no is null");
            return (Criteria) this;
        }

        public Criteria andCommentNoIsNotNull() {
            addCriterion("comment_no is not null");
            return (Criteria) this;
        }

        public Criteria andCommentNoEqualTo(Long value) {
            addCriterion("comment_no =", value, "commentNo");
            return (Criteria) this;
        }

        public Criteria andCommentNoNotEqualTo(Long value) {
            addCriterion("comment_no <>", value, "commentNo");
            return (Criteria) this;
        }

        public Criteria andCommentNoGreaterThan(Long value) {
            addCriterion("comment_no >", value, "commentNo");
            return (Criteria) this;
        }

        public Criteria andCommentNoGreaterThanOrEqualTo(Long value) {
            addCriterion("comment_no >=", value, "commentNo");
            return (Criteria) this;
        }

        public Criteria andCommentNoLessThan(Long value) {
            addCriterion("comment_no <", value, "commentNo");
            return (Criteria) this;
        }

        public Criteria andCommentNoLessThanOrEqualTo(Long value) {
            addCriterion("comment_no <=", value, "commentNo");
            return (Criteria) this;
        }

        public Criteria andCommentNoIn(List<Long> values) {
            addCriterion("comment_no in", values, "commentNo");
            return (Criteria) this;
        }

        public Criteria andCommentNoNotIn(List<Long> values) {
            addCriterion("comment_no not in", values, "commentNo");
            return (Criteria) this;
        }

        public Criteria andCommentNoBetween(Long value1, Long value2) {
            addCriterion("comment_no between", value1, value2, "commentNo");
            return (Criteria) this;
        }

        public Criteria andCommentNoNotBetween(Long value1, Long value2) {
            addCriterion("comment_no not between", value1, value2, "commentNo");
            return (Criteria) this;
        }

        public Criteria andAverageScoreIsNull() {
            addCriterion("average_score is null");
            return (Criteria) this;
        }

        public Criteria andAverageScoreIsNotNull() {
            addCriterion("average_score is not null");
            return (Criteria) this;
        }

        public Criteria andAverageScoreEqualTo(Double value) {
            addCriterion("average_score =", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreNotEqualTo(Double value) {
            addCriterion("average_score <>", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreGreaterThan(Double value) {
            addCriterion("average_score >", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("average_score >=", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreLessThan(Double value) {
            addCriterion("average_score <", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreLessThanOrEqualTo(Double value) {
            addCriterion("average_score <=", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreIn(List<Double> values) {
            addCriterion("average_score in", values, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreNotIn(List<Double> values) {
            addCriterion("average_score not in", values, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreBetween(Double value1, Double value2) {
            addCriterion("average_score between", value1, value2, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreNotBetween(Double value1, Double value2) {
            addCriterion("average_score not between", value1, value2, "averageScore");
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