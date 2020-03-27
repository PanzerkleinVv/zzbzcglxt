package com.demstudio.zzbzcglxt.domain;

import java.util.ArrayList;
import java.util.List;

public class NetworkParameterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NetworkParameterExample() {
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

        public Criteria andNetworkParameterIdIsNull() {
            addCriterion("NETWORK_PARAMETER_ID is null");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterIdIsNotNull() {
            addCriterion("NETWORK_PARAMETER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterIdEqualTo(String value) {
            addCriterion("NETWORK_PARAMETER_ID =", value, "networkParameterId");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterIdNotEqualTo(String value) {
            addCriterion("NETWORK_PARAMETER_ID <>", value, "networkParameterId");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterIdGreaterThan(String value) {
            addCriterion("NETWORK_PARAMETER_ID >", value, "networkParameterId");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterIdGreaterThanOrEqualTo(String value) {
            addCriterion("NETWORK_PARAMETER_ID >=", value, "networkParameterId");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterIdLessThan(String value) {
            addCriterion("NETWORK_PARAMETER_ID <", value, "networkParameterId");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterIdLessThanOrEqualTo(String value) {
            addCriterion("NETWORK_PARAMETER_ID <=", value, "networkParameterId");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterIdLike(String value) {
            addCriterion("NETWORK_PARAMETER_ID like", value, "networkParameterId");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterIdNotLike(String value) {
            addCriterion("NETWORK_PARAMETER_ID not like", value, "networkParameterId");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterIdIn(List<String> values) {
            addCriterion("NETWORK_PARAMETER_ID in", values, "networkParameterId");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterIdNotIn(List<String> values) {
            addCriterion("NETWORK_PARAMETER_ID not in", values, "networkParameterId");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterIdBetween(String value1, String value2) {
            addCriterion("NETWORK_PARAMETER_ID between", value1, value2, "networkParameterId");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterIdNotBetween(String value1, String value2) {
            addCriterion("NETWORK_PARAMETER_ID not between", value1, value2, "networkParameterId");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterNameIsNull() {
            addCriterion("NETWORK_PARAMETER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterNameIsNotNull() {
            addCriterion("NETWORK_PARAMETER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterNameEqualTo(String value) {
            addCriterion("NETWORK_PARAMETER_NAME =", value, "networkParameterName");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterNameNotEqualTo(String value) {
            addCriterion("NETWORK_PARAMETER_NAME <>", value, "networkParameterName");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterNameGreaterThan(String value) {
            addCriterion("NETWORK_PARAMETER_NAME >", value, "networkParameterName");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterNameGreaterThanOrEqualTo(String value) {
            addCriterion("NETWORK_PARAMETER_NAME >=", value, "networkParameterName");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterNameLessThan(String value) {
            addCriterion("NETWORK_PARAMETER_NAME <", value, "networkParameterName");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterNameLessThanOrEqualTo(String value) {
            addCriterion("NETWORK_PARAMETER_NAME <=", value, "networkParameterName");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterNameLike(String value) {
            addCriterion("NETWORK_PARAMETER_NAME like", value, "networkParameterName");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterNameNotLike(String value) {
            addCriterion("NETWORK_PARAMETER_NAME not like", value, "networkParameterName");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterNameIn(List<String> values) {
            addCriterion("NETWORK_PARAMETER_NAME in", values, "networkParameterName");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterNameNotIn(List<String> values) {
            addCriterion("NETWORK_PARAMETER_NAME not in", values, "networkParameterName");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterNameBetween(String value1, String value2) {
            addCriterion("NETWORK_PARAMETER_NAME between", value1, value2, "networkParameterName");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterNameNotBetween(String value1, String value2) {
            addCriterion("NETWORK_PARAMETER_NAME not between", value1, value2, "networkParameterName");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterUseIsNull() {
            addCriterion("NETWORK_PARAMETER_USE is null");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterUseIsNotNull() {
            addCriterion("NETWORK_PARAMETER_USE is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterUseEqualTo(Integer value) {
            addCriterion("NETWORK_PARAMETER_USE =", value, "networkParameterUse");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterUseNotEqualTo(Integer value) {
            addCriterion("NETWORK_PARAMETER_USE <>", value, "networkParameterUse");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterUseGreaterThan(Integer value) {
            addCriterion("NETWORK_PARAMETER_USE >", value, "networkParameterUse");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterUseGreaterThanOrEqualTo(Integer value) {
            addCriterion("NETWORK_PARAMETER_USE >=", value, "networkParameterUse");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterUseLessThan(Integer value) {
            addCriterion("NETWORK_PARAMETER_USE <", value, "networkParameterUse");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterUseLessThanOrEqualTo(Integer value) {
            addCriterion("NETWORK_PARAMETER_USE <=", value, "networkParameterUse");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterUseIn(List<Integer> values) {
            addCriterion("NETWORK_PARAMETER_USE in", values, "networkParameterUse");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterUseNotIn(List<Integer> values) {
            addCriterion("NETWORK_PARAMETER_USE not in", values, "networkParameterUse");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterUseBetween(Integer value1, Integer value2) {
            addCriterion("NETWORK_PARAMETER_USE between", value1, value2, "networkParameterUse");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterUseNotBetween(Integer value1, Integer value2) {
            addCriterion("NETWORK_PARAMETER_USE not between", value1, value2, "networkParameterUse");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterGroupIsNull() {
            addCriterion("NETWORK_PARAMETER_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterGroupIsNotNull() {
            addCriterion("NETWORK_PARAMETER_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterGroupEqualTo(Integer value) {
            addCriterion("NETWORK_PARAMETER_GROUP =", value, "networkParameterGroup");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterGroupNotEqualTo(Integer value) {
            addCriterion("NETWORK_PARAMETER_GROUP <>", value, "networkParameterGroup");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterGroupGreaterThan(Integer value) {
            addCriterion("NETWORK_PARAMETER_GROUP >", value, "networkParameterGroup");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterGroupGreaterThanOrEqualTo(Integer value) {
            addCriterion("NETWORK_PARAMETER_GROUP >=", value, "networkParameterGroup");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterGroupLessThan(Integer value) {
            addCriterion("NETWORK_PARAMETER_GROUP <", value, "networkParameterGroup");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterGroupLessThanOrEqualTo(Integer value) {
            addCriterion("NETWORK_PARAMETER_GROUP <=", value, "networkParameterGroup");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterGroupIn(List<Integer> values) {
            addCriterion("NETWORK_PARAMETER_GROUP in", values, "networkParameterGroup");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterGroupNotIn(List<Integer> values) {
            addCriterion("NETWORK_PARAMETER_GROUP not in", values, "networkParameterGroup");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterGroupBetween(Integer value1, Integer value2) {
            addCriterion("NETWORK_PARAMETER_GROUP between", value1, value2, "networkParameterGroup");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterGroupNotBetween(Integer value1, Integer value2) {
            addCriterion("NETWORK_PARAMETER_GROUP not between", value1, value2, "networkParameterGroup");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterValueIsNull() {
            addCriterion("NETWORK_PARAMETER_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterValueIsNotNull() {
            addCriterion("NETWORK_PARAMETER_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterValueEqualTo(String value) {
            addCriterion("NETWORK_PARAMETER_VALUE =", value, "networkParameterValue");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterValueNotEqualTo(String value) {
            addCriterion("NETWORK_PARAMETER_VALUE <>", value, "networkParameterValue");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterValueGreaterThan(String value) {
            addCriterion("NETWORK_PARAMETER_VALUE >", value, "networkParameterValue");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterValueGreaterThanOrEqualTo(String value) {
            addCriterion("NETWORK_PARAMETER_VALUE >=", value, "networkParameterValue");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterValueLessThan(String value) {
            addCriterion("NETWORK_PARAMETER_VALUE <", value, "networkParameterValue");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterValueLessThanOrEqualTo(String value) {
            addCriterion("NETWORK_PARAMETER_VALUE <=", value, "networkParameterValue");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterValueLike(String value) {
            addCriterion("NETWORK_PARAMETER_VALUE like", value, "networkParameterValue");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterValueNotLike(String value) {
            addCriterion("NETWORK_PARAMETER_VALUE not like", value, "networkParameterValue");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterValueIn(List<String> values) {
            addCriterion("NETWORK_PARAMETER_VALUE in", values, "networkParameterValue");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterValueNotIn(List<String> values) {
            addCriterion("NETWORK_PARAMETER_VALUE not in", values, "networkParameterValue");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterValueBetween(String value1, String value2) {
            addCriterion("NETWORK_PARAMETER_VALUE between", value1, value2, "networkParameterValue");
            return (Criteria) this;
        }

        public Criteria andNetworkParameterValueNotBetween(String value1, String value2) {
            addCriterion("NETWORK_PARAMETER_VALUE not between", value1, value2, "networkParameterValue");
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