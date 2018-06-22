package com.os.domain;

import java.util.ArrayList;
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

        public Criteria andShopAddressIsNull() {
            addCriterion("shop_address is null");
            return (Criteria) this;
        }

        public Criteria andShopAddressIsNotNull() {
            addCriterion("shop_address is not null");
            return (Criteria) this;
        }

        public Criteria andShopAddressEqualTo(String value) {
            addCriterion("shop_address =", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotEqualTo(String value) {
            addCriterion("shop_address <>", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressGreaterThan(String value) {
            addCriterion("shop_address >", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressGreaterThanOrEqualTo(String value) {
            addCriterion("shop_address >=", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLessThan(String value) {
            addCriterion("shop_address <", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLessThanOrEqualTo(String value) {
            addCriterion("shop_address <=", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLike(String value) {
            addCriterion("shop_address like", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotLike(String value) {
            addCriterion("shop_address not like", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressIn(List<String> values) {
            addCriterion("shop_address in", values, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotIn(List<String> values) {
            addCriterion("shop_address not in", values, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressBetween(String value1, String value2) {
            addCriterion("shop_address between", value1, value2, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotBetween(String value1, String value2) {
            addCriterion("shop_address not between", value1, value2, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopActivityIsNull() {
            addCriterion("shop_activity is null");
            return (Criteria) this;
        }

        public Criteria andShopActivityIsNotNull() {
            addCriterion("shop_activity is not null");
            return (Criteria) this;
        }

        public Criteria andShopActivityEqualTo(String value) {
            addCriterion("shop_activity =", value, "shopActivity");
            return (Criteria) this;
        }

        public Criteria andShopActivityNotEqualTo(String value) {
            addCriterion("shop_activity <>", value, "shopActivity");
            return (Criteria) this;
        }

        public Criteria andShopActivityGreaterThan(String value) {
            addCriterion("shop_activity >", value, "shopActivity");
            return (Criteria) this;
        }

        public Criteria andShopActivityGreaterThanOrEqualTo(String value) {
            addCriterion("shop_activity >=", value, "shopActivity");
            return (Criteria) this;
        }

        public Criteria andShopActivityLessThan(String value) {
            addCriterion("shop_activity <", value, "shopActivity");
            return (Criteria) this;
        }

        public Criteria andShopActivityLessThanOrEqualTo(String value) {
            addCriterion("shop_activity <=", value, "shopActivity");
            return (Criteria) this;
        }

        public Criteria andShopActivityLike(String value) {
            addCriterion("shop_activity like", value, "shopActivity");
            return (Criteria) this;
        }

        public Criteria andShopActivityNotLike(String value) {
            addCriterion("shop_activity not like", value, "shopActivity");
            return (Criteria) this;
        }

        public Criteria andShopActivityIn(List<String> values) {
            addCriterion("shop_activity in", values, "shopActivity");
            return (Criteria) this;
        }

        public Criteria andShopActivityNotIn(List<String> values) {
            addCriterion("shop_activity not in", values, "shopActivity");
            return (Criteria) this;
        }

        public Criteria andShopActivityBetween(String value1, String value2) {
            addCriterion("shop_activity between", value1, value2, "shopActivity");
            return (Criteria) this;
        }

        public Criteria andShopActivityNotBetween(String value1, String value2) {
            addCriterion("shop_activity not between", value1, value2, "shopActivity");
            return (Criteria) this;
        }

        public Criteria andShopLogonIsNull() {
            addCriterion("shop_logon is null");
            return (Criteria) this;
        }

        public Criteria andShopLogonIsNotNull() {
            addCriterion("shop_logon is not null");
            return (Criteria) this;
        }

        public Criteria andShopLogonEqualTo(String value) {
            addCriterion("shop_logon =", value, "shopLogon");
            return (Criteria) this;
        }

        public Criteria andShopLogonNotEqualTo(String value) {
            addCriterion("shop_logon <>", value, "shopLogon");
            return (Criteria) this;
        }

        public Criteria andShopLogonGreaterThan(String value) {
            addCriterion("shop_logon >", value, "shopLogon");
            return (Criteria) this;
        }

        public Criteria andShopLogonGreaterThanOrEqualTo(String value) {
            addCriterion("shop_logon >=", value, "shopLogon");
            return (Criteria) this;
        }

        public Criteria andShopLogonLessThan(String value) {
            addCriterion("shop_logon <", value, "shopLogon");
            return (Criteria) this;
        }

        public Criteria andShopLogonLessThanOrEqualTo(String value) {
            addCriterion("shop_logon <=", value, "shopLogon");
            return (Criteria) this;
        }

        public Criteria andShopLogonLike(String value) {
            addCriterion("shop_logon like", value, "shopLogon");
            return (Criteria) this;
        }

        public Criteria andShopLogonNotLike(String value) {
            addCriterion("shop_logon not like", value, "shopLogon");
            return (Criteria) this;
        }

        public Criteria andShopLogonIn(List<String> values) {
            addCriterion("shop_logon in", values, "shopLogon");
            return (Criteria) this;
        }

        public Criteria andShopLogonNotIn(List<String> values) {
            addCriterion("shop_logon not in", values, "shopLogon");
            return (Criteria) this;
        }

        public Criteria andShopLogonBetween(String value1, String value2) {
            addCriterion("shop_logon between", value1, value2, "shopLogon");
            return (Criteria) this;
        }

        public Criteria andShopLogonNotBetween(String value1, String value2) {
            addCriterion("shop_logon not between", value1, value2, "shopLogon");
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

        public Criteria andShopTransfercostIsNull() {
            addCriterion("shop_transferCost is null");
            return (Criteria) this;
        }

        public Criteria andShopTransfercostIsNotNull() {
            addCriterion("shop_transferCost is not null");
            return (Criteria) this;
        }

        public Criteria andShopTransfercostEqualTo(Double value) {
            addCriterion("shop_transferCost =", value, "shopTransfercost");
            return (Criteria) this;
        }

        public Criteria andShopTransfercostNotEqualTo(Double value) {
            addCriterion("shop_transferCost <>", value, "shopTransfercost");
            return (Criteria) this;
        }

        public Criteria andShopTransfercostGreaterThan(Double value) {
            addCriterion("shop_transferCost >", value, "shopTransfercost");
            return (Criteria) this;
        }

        public Criteria andShopTransfercostGreaterThanOrEqualTo(Double value) {
            addCriterion("shop_transferCost >=", value, "shopTransfercost");
            return (Criteria) this;
        }

        public Criteria andShopTransfercostLessThan(Double value) {
            addCriterion("shop_transferCost <", value, "shopTransfercost");
            return (Criteria) this;
        }

        public Criteria andShopTransfercostLessThanOrEqualTo(Double value) {
            addCriterion("shop_transferCost <=", value, "shopTransfercost");
            return (Criteria) this;
        }

        public Criteria andShopTransfercostIn(List<Double> values) {
            addCriterion("shop_transferCost in", values, "shopTransfercost");
            return (Criteria) this;
        }

        public Criteria andShopTransfercostNotIn(List<Double> values) {
            addCriterion("shop_transferCost not in", values, "shopTransfercost");
            return (Criteria) this;
        }

        public Criteria andShopTransfercostBetween(Double value1, Double value2) {
            addCriterion("shop_transferCost between", value1, value2, "shopTransfercost");
            return (Criteria) this;
        }

        public Criteria andShopTransfercostNotBetween(Double value1, Double value2) {
            addCriterion("shop_transferCost not between", value1, value2, "shopTransfercost");
            return (Criteria) this;
        }

        public Criteria andShopBegincostIsNull() {
            addCriterion("shop_beginCost is null");
            return (Criteria) this;
        }

        public Criteria andShopBegincostIsNotNull() {
            addCriterion("shop_beginCost is not null");
            return (Criteria) this;
        }

        public Criteria andShopBegincostEqualTo(Double value) {
            addCriterion("shop_beginCost =", value, "shopBegincost");
            return (Criteria) this;
        }

        public Criteria andShopBegincostNotEqualTo(Double value) {
            addCriterion("shop_beginCost <>", value, "shopBegincost");
            return (Criteria) this;
        }

        public Criteria andShopBegincostGreaterThan(Double value) {
            addCriterion("shop_beginCost >", value, "shopBegincost");
            return (Criteria) this;
        }

        public Criteria andShopBegincostGreaterThanOrEqualTo(Double value) {
            addCriterion("shop_beginCost >=", value, "shopBegincost");
            return (Criteria) this;
        }

        public Criteria andShopBegincostLessThan(Double value) {
            addCriterion("shop_beginCost <", value, "shopBegincost");
            return (Criteria) this;
        }

        public Criteria andShopBegincostLessThanOrEqualTo(Double value) {
            addCriterion("shop_beginCost <=", value, "shopBegincost");
            return (Criteria) this;
        }

        public Criteria andShopBegincostIn(List<Double> values) {
            addCriterion("shop_beginCost in", values, "shopBegincost");
            return (Criteria) this;
        }

        public Criteria andShopBegincostNotIn(List<Double> values) {
            addCriterion("shop_beginCost not in", values, "shopBegincost");
            return (Criteria) this;
        }

        public Criteria andShopBegincostBetween(Double value1, Double value2) {
            addCriterion("shop_beginCost between", value1, value2, "shopBegincost");
            return (Criteria) this;
        }

        public Criteria andShopBegincostNotBetween(Double value1, Double value2) {
            addCriterion("shop_beginCost not between", value1, value2, "shopBegincost");
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