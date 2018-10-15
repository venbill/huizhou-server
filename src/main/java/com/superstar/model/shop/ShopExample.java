package com.superstar.model.shop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
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

        public Criteria andHeaderPictureIsNull() {
            addCriterion("header_picture is null");
            return (Criteria) this;
        }

        public Criteria andHeaderPictureIsNotNull() {
            addCriterion("header_picture is not null");
            return (Criteria) this;
        }

        public Criteria andHeaderPictureEqualTo(String value) {
            addCriterion("header_picture =", value, "headerPicture");
            return (Criteria) this;
        }

        public Criteria andHeaderPictureNotEqualTo(String value) {
            addCriterion("header_picture <>", value, "headerPicture");
            return (Criteria) this;
        }

        public Criteria andHeaderPictureGreaterThan(String value) {
            addCriterion("header_picture >", value, "headerPicture");
            return (Criteria) this;
        }

        public Criteria andHeaderPictureGreaterThanOrEqualTo(String value) {
            addCriterion("header_picture >=", value, "headerPicture");
            return (Criteria) this;
        }

        public Criteria andHeaderPictureLessThan(String value) {
            addCriterion("header_picture <", value, "headerPicture");
            return (Criteria) this;
        }

        public Criteria andHeaderPictureLessThanOrEqualTo(String value) {
            addCriterion("header_picture <=", value, "headerPicture");
            return (Criteria) this;
        }

        public Criteria andHeaderPictureLike(String value) {
            addCriterion("header_picture like", value, "headerPicture");
            return (Criteria) this;
        }

        public Criteria andHeaderPictureNotLike(String value) {
            addCriterion("header_picture not like", value, "headerPicture");
            return (Criteria) this;
        }

        public Criteria andHeaderPictureIn(List<String> values) {
            addCriterion("header_picture in", values, "headerPicture");
            return (Criteria) this;
        }

        public Criteria andHeaderPictureNotIn(List<String> values) {
            addCriterion("header_picture not in", values, "headerPicture");
            return (Criteria) this;
        }

        public Criteria andHeaderPictureBetween(String value1, String value2) {
            addCriterion("header_picture between", value1, value2, "headerPicture");
            return (Criteria) this;
        }

        public Criteria andHeaderPictureNotBetween(String value1, String value2) {
            addCriterion("header_picture not between", value1, value2, "headerPicture");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(Long value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(Long value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(Long value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(Long value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(Long value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<Long> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<Long> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(Long value1, Long value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(Long value1, Long value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(Long value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(Long value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(Long value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(Long value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(Long value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<Long> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<Long> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(Long value1, Long value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(Long value1, Long value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressXIsNull() {
            addCriterion("address_x is null");
            return (Criteria) this;
        }

        public Criteria andAddressXIsNotNull() {
            addCriterion("address_x is not null");
            return (Criteria) this;
        }

        public Criteria andAddressXEqualTo(Double value) {
            addCriterion("address_x =", value, "addressX");
            return (Criteria) this;
        }

        public Criteria andAddressXNotEqualTo(Double value) {
            addCriterion("address_x <>", value, "addressX");
            return (Criteria) this;
        }

        public Criteria andAddressXGreaterThan(Double value) {
            addCriterion("address_x >", value, "addressX");
            return (Criteria) this;
        }

        public Criteria andAddressXGreaterThanOrEqualTo(Double value) {
            addCriterion("address_x >=", value, "addressX");
            return (Criteria) this;
        }

        public Criteria andAddressXLessThan(Double value) {
            addCriterion("address_x <", value, "addressX");
            return (Criteria) this;
        }

        public Criteria andAddressXLessThanOrEqualTo(Double value) {
            addCriterion("address_x <=", value, "addressX");
            return (Criteria) this;
        }

        public Criteria andAddressXIn(List<Double> values) {
            addCriterion("address_x in", values, "addressX");
            return (Criteria) this;
        }

        public Criteria andAddressXNotIn(List<Double> values) {
            addCriterion("address_x not in", values, "addressX");
            return (Criteria) this;
        }

        public Criteria andAddressXBetween(Double value1, Double value2) {
            addCriterion("address_x between", value1, value2, "addressX");
            return (Criteria) this;
        }

        public Criteria andAddressXNotBetween(Double value1, Double value2) {
            addCriterion("address_x not between", value1, value2, "addressX");
            return (Criteria) this;
        }

        public Criteria andAddressYIsNull() {
            addCriterion("address_y is null");
            return (Criteria) this;
        }

        public Criteria andAddressYIsNotNull() {
            addCriterion("address_y is not null");
            return (Criteria) this;
        }

        public Criteria andAddressYEqualTo(Double value) {
            addCriterion("address_y =", value, "addressY");
            return (Criteria) this;
        }

        public Criteria andAddressYNotEqualTo(Double value) {
            addCriterion("address_y <>", value, "addressY");
            return (Criteria) this;
        }

        public Criteria andAddressYGreaterThan(Double value) {
            addCriterion("address_y >", value, "addressY");
            return (Criteria) this;
        }

        public Criteria andAddressYGreaterThanOrEqualTo(Double value) {
            addCriterion("address_y >=", value, "addressY");
            return (Criteria) this;
        }

        public Criteria andAddressYLessThan(Double value) {
            addCriterion("address_y <", value, "addressY");
            return (Criteria) this;
        }

        public Criteria andAddressYLessThanOrEqualTo(Double value) {
            addCriterion("address_y <=", value, "addressY");
            return (Criteria) this;
        }

        public Criteria andAddressYIn(List<Double> values) {
            addCriterion("address_y in", values, "addressY");
            return (Criteria) this;
        }

        public Criteria andAddressYNotIn(List<Double> values) {
            addCriterion("address_y not in", values, "addressY");
            return (Criteria) this;
        }

        public Criteria andAddressYBetween(Double value1, Double value2) {
            addCriterion("address_y between", value1, value2, "addressY");
            return (Criteria) this;
        }

        public Criteria andAddressYNotBetween(Double value1, Double value2) {
            addCriterion("address_y not between", value1, value2, "addressY");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(Integer value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(Integer value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(Integer value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(Integer value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<Integer> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<Integer> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(Integer value1, Integer value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(Integer value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(Integer value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(Integer value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(Integer value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(Integer value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<Integer> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<Integer> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(Integer value1, Integer value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(Integer value1, Integer value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCountyIsNull() {
            addCriterion("county is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("county is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(Integer value) {
            addCriterion("county =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(Integer value) {
            addCriterion("county <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(Integer value) {
            addCriterion("county >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(Integer value) {
            addCriterion("county >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(Integer value) {
            addCriterion("county <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(Integer value) {
            addCriterion("county <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<Integer> values) {
            addCriterion("county in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<Integer> values) {
            addCriterion("county not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(Integer value1, Integer value2) {
            addCriterion("county between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(Integer value1, Integer value2) {
            addCriterion("county not between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNull() {
            addCriterion("province_name is null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNotNull() {
            addCriterion("province_name is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameEqualTo(String value) {
            addCriterion("province_name =", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotEqualTo(String value) {
            addCriterion("province_name <>", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThan(String value) {
            addCriterion("province_name >", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("province_name >=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThan(String value) {
            addCriterion("province_name <", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("province_name <=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLike(String value) {
            addCriterion("province_name like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotLike(String value) {
            addCriterion("province_name not like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIn(List<String> values) {
            addCriterion("province_name in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotIn(List<String> values) {
            addCriterion("province_name not in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameBetween(String value1, String value2) {
            addCriterion("province_name between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotBetween(String value1, String value2) {
            addCriterion("province_name not between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCountyNameIsNull() {
            addCriterion("county_name is null");
            return (Criteria) this;
        }

        public Criteria andCountyNameIsNotNull() {
            addCriterion("county_name is not null");
            return (Criteria) this;
        }

        public Criteria andCountyNameEqualTo(String value) {
            addCriterion("county_name =", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameNotEqualTo(String value) {
            addCriterion("county_name <>", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameGreaterThan(String value) {
            addCriterion("county_name >", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameGreaterThanOrEqualTo(String value) {
            addCriterion("county_name >=", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameLessThan(String value) {
            addCriterion("county_name <", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameLessThanOrEqualTo(String value) {
            addCriterion("county_name <=", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameLike(String value) {
            addCriterion("county_name like", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameNotLike(String value) {
            addCriterion("county_name not like", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameIn(List<String> values) {
            addCriterion("county_name in", values, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameNotIn(List<String> values) {
            addCriterion("county_name not in", values, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameBetween(String value1, String value2) {
            addCriterion("county_name between", value1, value2, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameNotBetween(String value1, String value2) {
            addCriterion("county_name not between", value1, value2, "countyName");
            return (Criteria) this;
        }

        public Criteria andBigTypesIsNull() {
            addCriterion("big_types is null");
            return (Criteria) this;
        }

        public Criteria andBigTypesIsNotNull() {
            addCriterion("big_types is not null");
            return (Criteria) this;
        }

        public Criteria andBigTypesEqualTo(String value) {
            addCriterion("big_types =", value, "bigTypes");
            return (Criteria) this;
        }

        public Criteria andBigTypesNotEqualTo(String value) {
            addCriterion("big_types <>", value, "bigTypes");
            return (Criteria) this;
        }

        public Criteria andBigTypesGreaterThan(String value) {
            addCriterion("big_types >", value, "bigTypes");
            return (Criteria) this;
        }

        public Criteria andBigTypesGreaterThanOrEqualTo(String value) {
            addCriterion("big_types >=", value, "bigTypes");
            return (Criteria) this;
        }

        public Criteria andBigTypesLessThan(String value) {
            addCriterion("big_types <", value, "bigTypes");
            return (Criteria) this;
        }

        public Criteria andBigTypesLessThanOrEqualTo(String value) {
            addCriterion("big_types <=", value, "bigTypes");
            return (Criteria) this;
        }

        public Criteria andBigTypesLike(String value) {
            addCriterion("big_types like", value, "bigTypes");
            return (Criteria) this;
        }

        public Criteria andBigTypesNotLike(String value) {
            addCriterion("big_types not like", value, "bigTypes");
            return (Criteria) this;
        }

        public Criteria andBigTypesIn(List<String> values) {
            addCriterion("big_types in", values, "bigTypes");
            return (Criteria) this;
        }

        public Criteria andBigTypesNotIn(List<String> values) {
            addCriterion("big_types not in", values, "bigTypes");
            return (Criteria) this;
        }

        public Criteria andBigTypesBetween(String value1, String value2) {
            addCriterion("big_types between", value1, value2, "bigTypes");
            return (Criteria) this;
        }

        public Criteria andBigTypesNotBetween(String value1, String value2) {
            addCriterion("big_types not between", value1, value2, "bigTypes");
            return (Criteria) this;
        }

        public Criteria andSmallTypesIsNull() {
            addCriterion("small_types is null");
            return (Criteria) this;
        }

        public Criteria andSmallTypesIsNotNull() {
            addCriterion("small_types is not null");
            return (Criteria) this;
        }

        public Criteria andSmallTypesEqualTo(String value) {
            addCriterion("small_types =", value, "smallTypes");
            return (Criteria) this;
        }

        public Criteria andSmallTypesNotEqualTo(String value) {
            addCriterion("small_types <>", value, "smallTypes");
            return (Criteria) this;
        }

        public Criteria andSmallTypesGreaterThan(String value) {
            addCriterion("small_types >", value, "smallTypes");
            return (Criteria) this;
        }

        public Criteria andSmallTypesGreaterThanOrEqualTo(String value) {
            addCriterion("small_types >=", value, "smallTypes");
            return (Criteria) this;
        }

        public Criteria andSmallTypesLessThan(String value) {
            addCriterion("small_types <", value, "smallTypes");
            return (Criteria) this;
        }

        public Criteria andSmallTypesLessThanOrEqualTo(String value) {
            addCriterion("small_types <=", value, "smallTypes");
            return (Criteria) this;
        }

        public Criteria andSmallTypesLike(String value) {
            addCriterion("small_types like", value, "smallTypes");
            return (Criteria) this;
        }

        public Criteria andSmallTypesNotLike(String value) {
            addCriterion("small_types not like", value, "smallTypes");
            return (Criteria) this;
        }

        public Criteria andSmallTypesIn(List<String> values) {
            addCriterion("small_types in", values, "smallTypes");
            return (Criteria) this;
        }

        public Criteria andSmallTypesNotIn(List<String> values) {
            addCriterion("small_types not in", values, "smallTypes");
            return (Criteria) this;
        }

        public Criteria andSmallTypesBetween(String value1, String value2) {
            addCriterion("small_types between", value1, value2, "smallTypes");
            return (Criteria) this;
        }

        public Criteria andSmallTypesNotBetween(String value1, String value2) {
            addCriterion("small_types not between", value1, value2, "smallTypes");
            return (Criteria) this;
        }

        public Criteria andOpenHomestayIsNull() {
            addCriterion("open_homestay is null");
            return (Criteria) this;
        }

        public Criteria andOpenHomestayIsNotNull() {
            addCriterion("open_homestay is not null");
            return (Criteria) this;
        }

        public Criteria andOpenHomestayEqualTo(Boolean value) {
            addCriterion("open_homestay =", value, "openHomestay");
            return (Criteria) this;
        }

        public Criteria andOpenHomestayNotEqualTo(Boolean value) {
            addCriterion("open_homestay <>", value, "openHomestay");
            return (Criteria) this;
        }

        public Criteria andOpenHomestayGreaterThan(Boolean value) {
            addCriterion("open_homestay >", value, "openHomestay");
            return (Criteria) this;
        }

        public Criteria andOpenHomestayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("open_homestay >=", value, "openHomestay");
            return (Criteria) this;
        }

        public Criteria andOpenHomestayLessThan(Boolean value) {
            addCriterion("open_homestay <", value, "openHomestay");
            return (Criteria) this;
        }

        public Criteria andOpenHomestayLessThanOrEqualTo(Boolean value) {
            addCriterion("open_homestay <=", value, "openHomestay");
            return (Criteria) this;
        }

        public Criteria andOpenHomestayIn(List<Boolean> values) {
            addCriterion("open_homestay in", values, "openHomestay");
            return (Criteria) this;
        }

        public Criteria andOpenHomestayNotIn(List<Boolean> values) {
            addCriterion("open_homestay not in", values, "openHomestay");
            return (Criteria) this;
        }

        public Criteria andOpenHomestayBetween(Boolean value1, Boolean value2) {
            addCriterion("open_homestay between", value1, value2, "openHomestay");
            return (Criteria) this;
        }

        public Criteria andOpenHomestayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("open_homestay not between", value1, value2, "openHomestay");
            return (Criteria) this;
        }

        public Criteria andOpenBuyIsNull() {
            addCriterion("open_buy is null");
            return (Criteria) this;
        }

        public Criteria andOpenBuyIsNotNull() {
            addCriterion("open_buy is not null");
            return (Criteria) this;
        }

        public Criteria andOpenBuyEqualTo(Boolean value) {
            addCriterion("open_buy =", value, "openBuy");
            return (Criteria) this;
        }

        public Criteria andOpenBuyNotEqualTo(Boolean value) {
            addCriterion("open_buy <>", value, "openBuy");
            return (Criteria) this;
        }

        public Criteria andOpenBuyGreaterThan(Boolean value) {
            addCriterion("open_buy >", value, "openBuy");
            return (Criteria) this;
        }

        public Criteria andOpenBuyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("open_buy >=", value, "openBuy");
            return (Criteria) this;
        }

        public Criteria andOpenBuyLessThan(Boolean value) {
            addCriterion("open_buy <", value, "openBuy");
            return (Criteria) this;
        }

        public Criteria andOpenBuyLessThanOrEqualTo(Boolean value) {
            addCriterion("open_buy <=", value, "openBuy");
            return (Criteria) this;
        }

        public Criteria andOpenBuyIn(List<Boolean> values) {
            addCriterion("open_buy in", values, "openBuy");
            return (Criteria) this;
        }

        public Criteria andOpenBuyNotIn(List<Boolean> values) {
            addCriterion("open_buy not in", values, "openBuy");
            return (Criteria) this;
        }

        public Criteria andOpenBuyBetween(Boolean value1, Boolean value2) {
            addCriterion("open_buy between", value1, value2, "openBuy");
            return (Criteria) this;
        }

        public Criteria andOpenBuyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("open_buy not between", value1, value2, "openBuy");
            return (Criteria) this;
        }

        public Criteria andServiceTimeIsNull() {
            addCriterion("service_time is null");
            return (Criteria) this;
        }

        public Criteria andServiceTimeIsNotNull() {
            addCriterion("service_time is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTimeEqualTo(String value) {
            addCriterion("service_time =", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotEqualTo(String value) {
            addCriterion("service_time <>", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeGreaterThan(String value) {
            addCriterion("service_time >", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeGreaterThanOrEqualTo(String value) {
            addCriterion("service_time >=", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeLessThan(String value) {
            addCriterion("service_time <", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeLessThanOrEqualTo(String value) {
            addCriterion("service_time <=", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeLike(String value) {
            addCriterion("service_time like", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotLike(String value) {
            addCriterion("service_time not like", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeIn(List<String> values) {
            addCriterion("service_time in", values, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotIn(List<String> values) {
            addCriterion("service_time not in", values, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeBetween(String value1, String value2) {
            addCriterion("service_time between", value1, value2, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotBetween(String value1, String value2) {
            addCriterion("service_time not between", value1, value2, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTelIsNull() {
            addCriterion("service_tel is null");
            return (Criteria) this;
        }

        public Criteria andServiceTelIsNotNull() {
            addCriterion("service_tel is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTelEqualTo(String value) {
            addCriterion("service_tel =", value, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelNotEqualTo(String value) {
            addCriterion("service_tel <>", value, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelGreaterThan(String value) {
            addCriterion("service_tel >", value, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelGreaterThanOrEqualTo(String value) {
            addCriterion("service_tel >=", value, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelLessThan(String value) {
            addCriterion("service_tel <", value, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelLessThanOrEqualTo(String value) {
            addCriterion("service_tel <=", value, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelLike(String value) {
            addCriterion("service_tel like", value, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelNotLike(String value) {
            addCriterion("service_tel not like", value, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelIn(List<String> values) {
            addCriterion("service_tel in", values, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelNotIn(List<String> values) {
            addCriterion("service_tel not in", values, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelBetween(String value1, String value2) {
            addCriterion("service_tel between", value1, value2, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andServiceTelNotBetween(String value1, String value2) {
            addCriterion("service_tel not between", value1, value2, "serviceTel");
            return (Criteria) this;
        }

        public Criteria andShopKeeperIsNull() {
            addCriterion("shop_keeper is null");
            return (Criteria) this;
        }

        public Criteria andShopKeeperIsNotNull() {
            addCriterion("shop_keeper is not null");
            return (Criteria) this;
        }

        public Criteria andShopKeeperEqualTo(Long value) {
            addCriterion("shop_keeper =", value, "shopKeeper");
            return (Criteria) this;
        }

        public Criteria andShopKeeperNotEqualTo(Long value) {
            addCriterion("shop_keeper <>", value, "shopKeeper");
            return (Criteria) this;
        }

        public Criteria andShopKeeperGreaterThan(Long value) {
            addCriterion("shop_keeper >", value, "shopKeeper");
            return (Criteria) this;
        }

        public Criteria andShopKeeperGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_keeper >=", value, "shopKeeper");
            return (Criteria) this;
        }

        public Criteria andShopKeeperLessThan(Long value) {
            addCriterion("shop_keeper <", value, "shopKeeper");
            return (Criteria) this;
        }

        public Criteria andShopKeeperLessThanOrEqualTo(Long value) {
            addCriterion("shop_keeper <=", value, "shopKeeper");
            return (Criteria) this;
        }

        public Criteria andShopKeeperIn(List<Long> values) {
            addCriterion("shop_keeper in", values, "shopKeeper");
            return (Criteria) this;
        }

        public Criteria andShopKeeperNotIn(List<Long> values) {
            addCriterion("shop_keeper not in", values, "shopKeeper");
            return (Criteria) this;
        }

        public Criteria andShopKeeperBetween(Long value1, Long value2) {
            addCriterion("shop_keeper between", value1, value2, "shopKeeper");
            return (Criteria) this;
        }

        public Criteria andShopKeeperNotBetween(Long value1, Long value2) {
            addCriterion("shop_keeper not between", value1, value2, "shopKeeper");
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