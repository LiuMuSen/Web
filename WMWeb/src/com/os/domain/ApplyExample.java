package com.os.domain;

import java.util.ArrayList;
import java.util.List;

public class ApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplyExample() {
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

        public Criteria andApplyIdIsNull() {
            addCriterion("apply_Id is null");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNotNull() {
            addCriterion("apply_Id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyIdEqualTo(Integer value) {
            addCriterion("apply_Id =", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotEqualTo(Integer value) {
            addCriterion("apply_Id <>", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThan(Integer value) {
            addCriterion("apply_Id >", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_Id >=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThan(Integer value) {
            addCriterion("apply_Id <", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("apply_Id <=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdIn(List<Integer> values) {
            addCriterion("apply_Id in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotIn(List<Integer> values) {
            addCriterion("apply_Id not in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdBetween(Integer value1, Integer value2) {
            addCriterion("apply_Id between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_Id not between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyRealnameIsNull() {
            addCriterion("apply_realName is null");
            return (Criteria) this;
        }

        public Criteria andApplyRealnameIsNotNull() {
            addCriterion("apply_realName is not null");
            return (Criteria) this;
        }

        public Criteria andApplyRealnameEqualTo(String value) {
            addCriterion("apply_realName =", value, "applyRealname");
            return (Criteria) this;
        }

        public Criteria andApplyRealnameNotEqualTo(String value) {
            addCriterion("apply_realName <>", value, "applyRealname");
            return (Criteria) this;
        }

        public Criteria andApplyRealnameGreaterThan(String value) {
            addCriterion("apply_realName >", value, "applyRealname");
            return (Criteria) this;
        }

        public Criteria andApplyRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("apply_realName >=", value, "applyRealname");
            return (Criteria) this;
        }

        public Criteria andApplyRealnameLessThan(String value) {
            addCriterion("apply_realName <", value, "applyRealname");
            return (Criteria) this;
        }

        public Criteria andApplyRealnameLessThanOrEqualTo(String value) {
            addCriterion("apply_realName <=", value, "applyRealname");
            return (Criteria) this;
        }

        public Criteria andApplyRealnameLike(String value) {
            addCriterion("apply_realName like", value, "applyRealname");
            return (Criteria) this;
        }

        public Criteria andApplyRealnameNotLike(String value) {
            addCriterion("apply_realName not like", value, "applyRealname");
            return (Criteria) this;
        }

        public Criteria andApplyRealnameIn(List<String> values) {
            addCriterion("apply_realName in", values, "applyRealname");
            return (Criteria) this;
        }

        public Criteria andApplyRealnameNotIn(List<String> values) {
            addCriterion("apply_realName not in", values, "applyRealname");
            return (Criteria) this;
        }

        public Criteria andApplyRealnameBetween(String value1, String value2) {
            addCriterion("apply_realName between", value1, value2, "applyRealname");
            return (Criteria) this;
        }

        public Criteria andApplyRealnameNotBetween(String value1, String value2) {
            addCriterion("apply_realName not between", value1, value2, "applyRealname");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_Id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_Id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_Id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_Id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_Id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_Id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_Id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_Id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_Id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_Id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_Id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_Id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andApplyPhoneIsNull() {
            addCriterion("apply_phone is null");
            return (Criteria) this;
        }

        public Criteria andApplyPhoneIsNotNull() {
            addCriterion("apply_phone is not null");
            return (Criteria) this;
        }

        public Criteria andApplyPhoneEqualTo(String value) {
            addCriterion("apply_phone =", value, "applyPhone");
            return (Criteria) this;
        }

        public Criteria andApplyPhoneNotEqualTo(String value) {
            addCriterion("apply_phone <>", value, "applyPhone");
            return (Criteria) this;
        }

        public Criteria andApplyPhoneGreaterThan(String value) {
            addCriterion("apply_phone >", value, "applyPhone");
            return (Criteria) this;
        }

        public Criteria andApplyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("apply_phone >=", value, "applyPhone");
            return (Criteria) this;
        }

        public Criteria andApplyPhoneLessThan(String value) {
            addCriterion("apply_phone <", value, "applyPhone");
            return (Criteria) this;
        }

        public Criteria andApplyPhoneLessThanOrEqualTo(String value) {
            addCriterion("apply_phone <=", value, "applyPhone");
            return (Criteria) this;
        }

        public Criteria andApplyPhoneLike(String value) {
            addCriterion("apply_phone like", value, "applyPhone");
            return (Criteria) this;
        }

        public Criteria andApplyPhoneNotLike(String value) {
            addCriterion("apply_phone not like", value, "applyPhone");
            return (Criteria) this;
        }

        public Criteria andApplyPhoneIn(List<String> values) {
            addCriterion("apply_phone in", values, "applyPhone");
            return (Criteria) this;
        }

        public Criteria andApplyPhoneNotIn(List<String> values) {
            addCriterion("apply_phone not in", values, "applyPhone");
            return (Criteria) this;
        }

        public Criteria andApplyPhoneBetween(String value1, String value2) {
            addCriterion("apply_phone between", value1, value2, "applyPhone");
            return (Criteria) this;
        }

        public Criteria andApplyPhoneNotBetween(String value1, String value2) {
            addCriterion("apply_phone not between", value1, value2, "applyPhone");
            return (Criteria) this;
        }

        public Criteria andApplyShopnameIsNull() {
            addCriterion("apply_shopName is null");
            return (Criteria) this;
        }

        public Criteria andApplyShopnameIsNotNull() {
            addCriterion("apply_shopName is not null");
            return (Criteria) this;
        }

        public Criteria andApplyShopnameEqualTo(String value) {
            addCriterion("apply_shopName =", value, "applyShopname");
            return (Criteria) this;
        }

        public Criteria andApplyShopnameNotEqualTo(String value) {
            addCriterion("apply_shopName <>", value, "applyShopname");
            return (Criteria) this;
        }

        public Criteria andApplyShopnameGreaterThan(String value) {
            addCriterion("apply_shopName >", value, "applyShopname");
            return (Criteria) this;
        }

        public Criteria andApplyShopnameGreaterThanOrEqualTo(String value) {
            addCriterion("apply_shopName >=", value, "applyShopname");
            return (Criteria) this;
        }

        public Criteria andApplyShopnameLessThan(String value) {
            addCriterion("apply_shopName <", value, "applyShopname");
            return (Criteria) this;
        }

        public Criteria andApplyShopnameLessThanOrEqualTo(String value) {
            addCriterion("apply_shopName <=", value, "applyShopname");
            return (Criteria) this;
        }

        public Criteria andApplyShopnameLike(String value) {
            addCriterion("apply_shopName like", value, "applyShopname");
            return (Criteria) this;
        }

        public Criteria andApplyShopnameNotLike(String value) {
            addCriterion("apply_shopName not like", value, "applyShopname");
            return (Criteria) this;
        }

        public Criteria andApplyShopnameIn(List<String> values) {
            addCriterion("apply_shopName in", values, "applyShopname");
            return (Criteria) this;
        }

        public Criteria andApplyShopnameNotIn(List<String> values) {
            addCriterion("apply_shopName not in", values, "applyShopname");
            return (Criteria) this;
        }

        public Criteria andApplyShopnameBetween(String value1, String value2) {
            addCriterion("apply_shopName between", value1, value2, "applyShopname");
            return (Criteria) this;
        }

        public Criteria andApplyShopnameNotBetween(String value1, String value2) {
            addCriterion("apply_shopName not between", value1, value2, "applyShopname");
            return (Criteria) this;
        }

        public Criteria andApplyShopaddressIsNull() {
            addCriterion("apply_shopAddress is null");
            return (Criteria) this;
        }

        public Criteria andApplyShopaddressIsNotNull() {
            addCriterion("apply_shopAddress is not null");
            return (Criteria) this;
        }

        public Criteria andApplyShopaddressEqualTo(String value) {
            addCriterion("apply_shopAddress =", value, "applyShopaddress");
            return (Criteria) this;
        }

        public Criteria andApplyShopaddressNotEqualTo(String value) {
            addCriterion("apply_shopAddress <>", value, "applyShopaddress");
            return (Criteria) this;
        }

        public Criteria andApplyShopaddressGreaterThan(String value) {
            addCriterion("apply_shopAddress >", value, "applyShopaddress");
            return (Criteria) this;
        }

        public Criteria andApplyShopaddressGreaterThanOrEqualTo(String value) {
            addCriterion("apply_shopAddress >=", value, "applyShopaddress");
            return (Criteria) this;
        }

        public Criteria andApplyShopaddressLessThan(String value) {
            addCriterion("apply_shopAddress <", value, "applyShopaddress");
            return (Criteria) this;
        }

        public Criteria andApplyShopaddressLessThanOrEqualTo(String value) {
            addCriterion("apply_shopAddress <=", value, "applyShopaddress");
            return (Criteria) this;
        }

        public Criteria andApplyShopaddressLike(String value) {
            addCriterion("apply_shopAddress like", value, "applyShopaddress");
            return (Criteria) this;
        }

        public Criteria andApplyShopaddressNotLike(String value) {
            addCriterion("apply_shopAddress not like", value, "applyShopaddress");
            return (Criteria) this;
        }

        public Criteria andApplyShopaddressIn(List<String> values) {
            addCriterion("apply_shopAddress in", values, "applyShopaddress");
            return (Criteria) this;
        }

        public Criteria andApplyShopaddressNotIn(List<String> values) {
            addCriterion("apply_shopAddress not in", values, "applyShopaddress");
            return (Criteria) this;
        }

        public Criteria andApplyShopaddressBetween(String value1, String value2) {
            addCriterion("apply_shopAddress between", value1, value2, "applyShopaddress");
            return (Criteria) this;
        }

        public Criteria andApplyShopaddressNotBetween(String value1, String value2) {
            addCriterion("apply_shopAddress not between", value1, value2, "applyShopaddress");
            return (Criteria) this;
        }

        public Criteria andApplyShopdescriptionIsNull() {
            addCriterion("apply_shopdescription is null");
            return (Criteria) this;
        }

        public Criteria andApplyShopdescriptionIsNotNull() {
            addCriterion("apply_shopdescription is not null");
            return (Criteria) this;
        }

        public Criteria andApplyShopdescriptionEqualTo(String value) {
            addCriterion("apply_shopdescription =", value, "applyShopdescription");
            return (Criteria) this;
        }

        public Criteria andApplyShopdescriptionNotEqualTo(String value) {
            addCriterion("apply_shopdescription <>", value, "applyShopdescription");
            return (Criteria) this;
        }

        public Criteria andApplyShopdescriptionGreaterThan(String value) {
            addCriterion("apply_shopdescription >", value, "applyShopdescription");
            return (Criteria) this;
        }

        public Criteria andApplyShopdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("apply_shopdescription >=", value, "applyShopdescription");
            return (Criteria) this;
        }

        public Criteria andApplyShopdescriptionLessThan(String value) {
            addCriterion("apply_shopdescription <", value, "applyShopdescription");
            return (Criteria) this;
        }

        public Criteria andApplyShopdescriptionLessThanOrEqualTo(String value) {
            addCriterion("apply_shopdescription <=", value, "applyShopdescription");
            return (Criteria) this;
        }

        public Criteria andApplyShopdescriptionLike(String value) {
            addCriterion("apply_shopdescription like", value, "applyShopdescription");
            return (Criteria) this;
        }

        public Criteria andApplyShopdescriptionNotLike(String value) {
            addCriterion("apply_shopdescription not like", value, "applyShopdescription");
            return (Criteria) this;
        }

        public Criteria andApplyShopdescriptionIn(List<String> values) {
            addCriterion("apply_shopdescription in", values, "applyShopdescription");
            return (Criteria) this;
        }

        public Criteria andApplyShopdescriptionNotIn(List<String> values) {
            addCriterion("apply_shopdescription not in", values, "applyShopdescription");
            return (Criteria) this;
        }

        public Criteria andApplyShopdescriptionBetween(String value1, String value2) {
            addCriterion("apply_shopdescription between", value1, value2, "applyShopdescription");
            return (Criteria) this;
        }

        public Criteria andApplyShopdescriptionNotBetween(String value1, String value2) {
            addCriterion("apply_shopdescription not between", value1, value2, "applyShopdescription");
            return (Criteria) this;
        }

        public Criteria andApplyIdcardIsNull() {
            addCriterion("apply_IDcard is null");
            return (Criteria) this;
        }

        public Criteria andApplyIdcardIsNotNull() {
            addCriterion("apply_IDcard is not null");
            return (Criteria) this;
        }

        public Criteria andApplyIdcardEqualTo(String value) {
            addCriterion("apply_IDcard =", value, "applyIdcard");
            return (Criteria) this;
        }

        public Criteria andApplyIdcardNotEqualTo(String value) {
            addCriterion("apply_IDcard <>", value, "applyIdcard");
            return (Criteria) this;
        }

        public Criteria andApplyIdcardGreaterThan(String value) {
            addCriterion("apply_IDcard >", value, "applyIdcard");
            return (Criteria) this;
        }

        public Criteria andApplyIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("apply_IDcard >=", value, "applyIdcard");
            return (Criteria) this;
        }

        public Criteria andApplyIdcardLessThan(String value) {
            addCriterion("apply_IDcard <", value, "applyIdcard");
            return (Criteria) this;
        }

        public Criteria andApplyIdcardLessThanOrEqualTo(String value) {
            addCriterion("apply_IDcard <=", value, "applyIdcard");
            return (Criteria) this;
        }

        public Criteria andApplyIdcardLike(String value) {
            addCriterion("apply_IDcard like", value, "applyIdcard");
            return (Criteria) this;
        }

        public Criteria andApplyIdcardNotLike(String value) {
            addCriterion("apply_IDcard not like", value, "applyIdcard");
            return (Criteria) this;
        }

        public Criteria andApplyIdcardIn(List<String> values) {
            addCriterion("apply_IDcard in", values, "applyIdcard");
            return (Criteria) this;
        }

        public Criteria andApplyIdcardNotIn(List<String> values) {
            addCriterion("apply_IDcard not in", values, "applyIdcard");
            return (Criteria) this;
        }

        public Criteria andApplyIdcardBetween(String value1, String value2) {
            addCriterion("apply_IDcard between", value1, value2, "applyIdcard");
            return (Criteria) this;
        }

        public Criteria andApplyIdcardNotBetween(String value1, String value2) {
            addCriterion("apply_IDcard not between", value1, value2, "applyIdcard");
            return (Criteria) this;
        }

        public Criteria andIdcardphotopicIsNull() {
            addCriterion("IDCardphotopic is null");
            return (Criteria) this;
        }

        public Criteria andIdcardphotopicIsNotNull() {
            addCriterion("IDCardphotopic is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardphotopicEqualTo(String value) {
            addCriterion("IDCardphotopic =", value, "idcardphotopic");
            return (Criteria) this;
        }

        public Criteria andIdcardphotopicNotEqualTo(String value) {
            addCriterion("IDCardphotopic <>", value, "idcardphotopic");
            return (Criteria) this;
        }

        public Criteria andIdcardphotopicGreaterThan(String value) {
            addCriterion("IDCardphotopic >", value, "idcardphotopic");
            return (Criteria) this;
        }

        public Criteria andIdcardphotopicGreaterThanOrEqualTo(String value) {
            addCriterion("IDCardphotopic >=", value, "idcardphotopic");
            return (Criteria) this;
        }

        public Criteria andIdcardphotopicLessThan(String value) {
            addCriterion("IDCardphotopic <", value, "idcardphotopic");
            return (Criteria) this;
        }

        public Criteria andIdcardphotopicLessThanOrEqualTo(String value) {
            addCriterion("IDCardphotopic <=", value, "idcardphotopic");
            return (Criteria) this;
        }

        public Criteria andIdcardphotopicLike(String value) {
            addCriterion("IDCardphotopic like", value, "idcardphotopic");
            return (Criteria) this;
        }

        public Criteria andIdcardphotopicNotLike(String value) {
            addCriterion("IDCardphotopic not like", value, "idcardphotopic");
            return (Criteria) this;
        }

        public Criteria andIdcardphotopicIn(List<String> values) {
            addCriterion("IDCardphotopic in", values, "idcardphotopic");
            return (Criteria) this;
        }

        public Criteria andIdcardphotopicNotIn(List<String> values) {
            addCriterion("IDCardphotopic not in", values, "idcardphotopic");
            return (Criteria) this;
        }

        public Criteria andIdcardphotopicBetween(String value1, String value2) {
            addCriterion("IDCardphotopic between", value1, value2, "idcardphotopic");
            return (Criteria) this;
        }

        public Criteria andIdcardphotopicNotBetween(String value1, String value2) {
            addCriterion("IDCardphotopic not between", value1, value2, "idcardphotopic");
            return (Criteria) this;
        }

        public Criteria andBusinesspicIsNull() {
            addCriterion("businesspic is null");
            return (Criteria) this;
        }

        public Criteria andBusinesspicIsNotNull() {
            addCriterion("businesspic is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesspicEqualTo(String value) {
            addCriterion("businesspic =", value, "businesspic");
            return (Criteria) this;
        }

        public Criteria andBusinesspicNotEqualTo(String value) {
            addCriterion("businesspic <>", value, "businesspic");
            return (Criteria) this;
        }

        public Criteria andBusinesspicGreaterThan(String value) {
            addCriterion("businesspic >", value, "businesspic");
            return (Criteria) this;
        }

        public Criteria andBusinesspicGreaterThanOrEqualTo(String value) {
            addCriterion("businesspic >=", value, "businesspic");
            return (Criteria) this;
        }

        public Criteria andBusinesspicLessThan(String value) {
            addCriterion("businesspic <", value, "businesspic");
            return (Criteria) this;
        }

        public Criteria andBusinesspicLessThanOrEqualTo(String value) {
            addCriterion("businesspic <=", value, "businesspic");
            return (Criteria) this;
        }

        public Criteria andBusinesspicLike(String value) {
            addCriterion("businesspic like", value, "businesspic");
            return (Criteria) this;
        }

        public Criteria andBusinesspicNotLike(String value) {
            addCriterion("businesspic not like", value, "businesspic");
            return (Criteria) this;
        }

        public Criteria andBusinesspicIn(List<String> values) {
            addCriterion("businesspic in", values, "businesspic");
            return (Criteria) this;
        }

        public Criteria andBusinesspicNotIn(List<String> values) {
            addCriterion("businesspic not in", values, "businesspic");
            return (Criteria) this;
        }

        public Criteria andBusinesspicBetween(String value1, String value2) {
            addCriterion("businesspic between", value1, value2, "businesspic");
            return (Criteria) this;
        }

        public Criteria andBusinesspicNotBetween(String value1, String value2) {
            addCriterion("businesspic not between", value1, value2, "businesspic");
            return (Criteria) this;
        }

        public Criteria andSanitarypicIsNull() {
            addCriterion("sanitaryPic is null");
            return (Criteria) this;
        }

        public Criteria andSanitarypicIsNotNull() {
            addCriterion("sanitaryPic is not null");
            return (Criteria) this;
        }

        public Criteria andSanitarypicEqualTo(String value) {
            addCriterion("sanitaryPic =", value, "sanitarypic");
            return (Criteria) this;
        }

        public Criteria andSanitarypicNotEqualTo(String value) {
            addCriterion("sanitaryPic <>", value, "sanitarypic");
            return (Criteria) this;
        }

        public Criteria andSanitarypicGreaterThan(String value) {
            addCriterion("sanitaryPic >", value, "sanitarypic");
            return (Criteria) this;
        }

        public Criteria andSanitarypicGreaterThanOrEqualTo(String value) {
            addCriterion("sanitaryPic >=", value, "sanitarypic");
            return (Criteria) this;
        }

        public Criteria andSanitarypicLessThan(String value) {
            addCriterion("sanitaryPic <", value, "sanitarypic");
            return (Criteria) this;
        }

        public Criteria andSanitarypicLessThanOrEqualTo(String value) {
            addCriterion("sanitaryPic <=", value, "sanitarypic");
            return (Criteria) this;
        }

        public Criteria andSanitarypicLike(String value) {
            addCriterion("sanitaryPic like", value, "sanitarypic");
            return (Criteria) this;
        }

        public Criteria andSanitarypicNotLike(String value) {
            addCriterion("sanitaryPic not like", value, "sanitarypic");
            return (Criteria) this;
        }

        public Criteria andSanitarypicIn(List<String> values) {
            addCriterion("sanitaryPic in", values, "sanitarypic");
            return (Criteria) this;
        }

        public Criteria andSanitarypicNotIn(List<String> values) {
            addCriterion("sanitaryPic not in", values, "sanitarypic");
            return (Criteria) this;
        }

        public Criteria andSanitarypicBetween(String value1, String value2) {
            addCriterion("sanitaryPic between", value1, value2, "sanitarypic");
            return (Criteria) this;
        }

        public Criteria andSanitarypicNotBetween(String value1, String value2) {
            addCriterion("sanitaryPic not between", value1, value2, "sanitarypic");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_Id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_Id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_Id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_Id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_Id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_Id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_Id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_Id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_Id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_Id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_Id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_Id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andApplyStatusIsNull() {
            addCriterion("apply_status is null");
            return (Criteria) this;
        }

        public Criteria andApplyStatusIsNotNull() {
            addCriterion("apply_status is not null");
            return (Criteria) this;
        }

        public Criteria andApplyStatusEqualTo(Integer value) {
            addCriterion("apply_status =", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusNotEqualTo(Integer value) {
            addCriterion("apply_status <>", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusGreaterThan(Integer value) {
            addCriterion("apply_status >", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_status >=", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusLessThan(Integer value) {
            addCriterion("apply_status <", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("apply_status <=", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusIn(List<Integer> values) {
            addCriterion("apply_status in", values, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusNotIn(List<Integer> values) {
            addCriterion("apply_status not in", values, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusBetween(Integer value1, Integer value2) {
            addCriterion("apply_status between", value1, value2, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_status not between", value1, value2, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_Id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_Id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_Id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_Id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_Id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_Id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_Id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_Id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_Id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_Id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_Id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_Id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andApplyShoplogonIsNull() {
            addCriterion("apply_shopLogon is null");
            return (Criteria) this;
        }

        public Criteria andApplyShoplogonIsNotNull() {
            addCriterion("apply_shopLogon is not null");
            return (Criteria) this;
        }

        public Criteria andApplyShoplogonEqualTo(String value) {
            addCriterion("apply_shopLogon =", value, "applyShoplogon");
            return (Criteria) this;
        }

        public Criteria andApplyShoplogonNotEqualTo(String value) {
            addCriterion("apply_shopLogon <>", value, "applyShoplogon");
            return (Criteria) this;
        }

        public Criteria andApplyShoplogonGreaterThan(String value) {
            addCriterion("apply_shopLogon >", value, "applyShoplogon");
            return (Criteria) this;
        }

        public Criteria andApplyShoplogonGreaterThanOrEqualTo(String value) {
            addCriterion("apply_shopLogon >=", value, "applyShoplogon");
            return (Criteria) this;
        }

        public Criteria andApplyShoplogonLessThan(String value) {
            addCriterion("apply_shopLogon <", value, "applyShoplogon");
            return (Criteria) this;
        }

        public Criteria andApplyShoplogonLessThanOrEqualTo(String value) {
            addCriterion("apply_shopLogon <=", value, "applyShoplogon");
            return (Criteria) this;
        }

        public Criteria andApplyShoplogonLike(String value) {
            addCriterion("apply_shopLogon like", value, "applyShoplogon");
            return (Criteria) this;
        }

        public Criteria andApplyShoplogonNotLike(String value) {
            addCriterion("apply_shopLogon not like", value, "applyShoplogon");
            return (Criteria) this;
        }

        public Criteria andApplyShoplogonIn(List<String> values) {
            addCriterion("apply_shopLogon in", values, "applyShoplogon");
            return (Criteria) this;
        }

        public Criteria andApplyShoplogonNotIn(List<String> values) {
            addCriterion("apply_shopLogon not in", values, "applyShoplogon");
            return (Criteria) this;
        }

        public Criteria andApplyShoplogonBetween(String value1, String value2) {
            addCriterion("apply_shopLogon between", value1, value2, "applyShoplogon");
            return (Criteria) this;
        }

        public Criteria andApplyShoplogonNotBetween(String value1, String value2) {
            addCriterion("apply_shopLogon not between", value1, value2, "applyShoplogon");
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