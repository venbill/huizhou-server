package com.superstar.model.buy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BuyCarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuyCarExample() {
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

        public Criteria andGoodsAttributesValuesIsNull() {
            addCriterion("goods_attributes_values is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributesValuesIsNotNull() {
            addCriterion("goods_attributes_values is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributesValuesEqualTo(String value) {
            addCriterion("goods_attributes_values =", value, "goodsAttributesValues");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributesValuesNotEqualTo(String value) {
            addCriterion("goods_attributes_values <>", value, "goodsAttributesValues");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributesValuesGreaterThan(String value) {
            addCriterion("goods_attributes_values >", value, "goodsAttributesValues");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributesValuesGreaterThanOrEqualTo(String value) {
            addCriterion("goods_attributes_values >=", value, "goodsAttributesValues");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributesValuesLessThan(String value) {
            addCriterion("goods_attributes_values <", value, "goodsAttributesValues");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributesValuesLessThanOrEqualTo(String value) {
            addCriterion("goods_attributes_values <=", value, "goodsAttributesValues");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributesValuesLike(String value) {
            addCriterion("goods_attributes_values like", value, "goodsAttributesValues");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributesValuesNotLike(String value) {
            addCriterion("goods_attributes_values not like", value, "goodsAttributesValues");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributesValuesIn(List<String> values) {
            addCriterion("goods_attributes_values in", values, "goodsAttributesValues");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributesValuesNotIn(List<String> values) {
            addCriterion("goods_attributes_values not in", values, "goodsAttributesValues");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributesValuesBetween(String value1, String value2) {
            addCriterion("goods_attributes_values between", value1, value2, "goodsAttributesValues");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributesValuesNotBetween(String value1, String value2) {
            addCriterion("goods_attributes_values not between", value1, value2, "goodsAttributesValues");
            return (Criteria) this;
        }

        public Criteria andAddPriceIsNull() {
            addCriterion("add_price is null");
            return (Criteria) this;
        }

        public Criteria andAddPriceIsNotNull() {
            addCriterion("add_price is not null");
            return (Criteria) this;
        }

        public Criteria andAddPriceEqualTo(Double value) {
            addCriterion("add_price =", value, "addPrice");
            return (Criteria) this;
        }

        public Criteria andAddPriceNotEqualTo(Double value) {
            addCriterion("add_price <>", value, "addPrice");
            return (Criteria) this;
        }

        public Criteria andAddPriceGreaterThan(Double value) {
            addCriterion("add_price >", value, "addPrice");
            return (Criteria) this;
        }

        public Criteria andAddPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("add_price >=", value, "addPrice");
            return (Criteria) this;
        }

        public Criteria andAddPriceLessThan(Double value) {
            addCriterion("add_price <", value, "addPrice");
            return (Criteria) this;
        }

        public Criteria andAddPriceLessThanOrEqualTo(Double value) {
            addCriterion("add_price <=", value, "addPrice");
            return (Criteria) this;
        }

        public Criteria andAddPriceIn(List<Double> values) {
            addCriterion("add_price in", values, "addPrice");
            return (Criteria) this;
        }

        public Criteria andAddPriceNotIn(List<Double> values) {
            addCriterion("add_price not in", values, "addPrice");
            return (Criteria) this;
        }

        public Criteria andAddPriceBetween(Double value1, Double value2) {
            addCriterion("add_price between", value1, value2, "addPrice");
            return (Criteria) this;
        }

        public Criteria andAddPriceNotBetween(Double value1, Double value2) {
            addCriterion("add_price not between", value1, value2, "addPrice");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddNoIsNull() {
            addCriterion("add_no is null");
            return (Criteria) this;
        }

        public Criteria andAddNoIsNotNull() {
            addCriterion("add_no is not null");
            return (Criteria) this;
        }

        public Criteria andAddNoEqualTo(Integer value) {
            addCriterion("add_no =", value, "addNo");
            return (Criteria) this;
        }

        public Criteria andAddNoNotEqualTo(Integer value) {
            addCriterion("add_no <>", value, "addNo");
            return (Criteria) this;
        }

        public Criteria andAddNoGreaterThan(Integer value) {
            addCriterion("add_no >", value, "addNo");
            return (Criteria) this;
        }

        public Criteria andAddNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_no >=", value, "addNo");
            return (Criteria) this;
        }

        public Criteria andAddNoLessThan(Integer value) {
            addCriterion("add_no <", value, "addNo");
            return (Criteria) this;
        }

        public Criteria andAddNoLessThanOrEqualTo(Integer value) {
            addCriterion("add_no <=", value, "addNo");
            return (Criteria) this;
        }

        public Criteria andAddNoIn(List<Integer> values) {
            addCriterion("add_no in", values, "addNo");
            return (Criteria) this;
        }

        public Criteria andAddNoNotIn(List<Integer> values) {
            addCriterion("add_no not in", values, "addNo");
            return (Criteria) this;
        }

        public Criteria andAddNoBetween(Integer value1, Integer value2) {
            addCriterion("add_no between", value1, value2, "addNo");
            return (Criteria) this;
        }

        public Criteria andAddNoNotBetween(Integer value1, Integer value2) {
            addCriterion("add_no not between", value1, value2, "addNo");
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