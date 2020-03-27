package com.demstudio.zzbzcglxt.domain;

import java.util.ArrayList;
import java.util.List;

public class ApplicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplicationExample() {
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

        public Criteria andApplicationIdIsNull() {
            addCriterion("APPLICATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIsNotNull() {
            addCriterion("APPLICATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationIdEqualTo(String value) {
            addCriterion("APPLICATION_ID =", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotEqualTo(String value) {
            addCriterion("APPLICATION_ID <>", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdGreaterThan(String value) {
            addCriterion("APPLICATION_ID >", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATION_ID >=", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLessThan(String value) {
            addCriterion("APPLICATION_ID <", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLessThanOrEqualTo(String value) {
            addCriterion("APPLICATION_ID <=", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLike(String value) {
            addCriterion("APPLICATION_ID like", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotLike(String value) {
            addCriterion("APPLICATION_ID not like", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIn(List<String> values) {
            addCriterion("APPLICATION_ID in", values, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotIn(List<String> values) {
            addCriterion("APPLICATION_ID not in", values, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdBetween(String value1, String value2) {
            addCriterion("APPLICATION_ID between", value1, value2, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotBetween(String value1, String value2) {
            addCriterion("APPLICATION_ID not between", value1, value2, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationNameIsNull() {
            addCriterion("APPLICATION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andApplicationNameIsNotNull() {
            addCriterion("APPLICATION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationNameEqualTo(String value) {
            addCriterion("APPLICATION_NAME =", value, "applicationName");
            return (Criteria) this;
        }

        public Criteria andApplicationNameNotEqualTo(String value) {
            addCriterion("APPLICATION_NAME <>", value, "applicationName");
            return (Criteria) this;
        }

        public Criteria andApplicationNameGreaterThan(String value) {
            addCriterion("APPLICATION_NAME >", value, "applicationName");
            return (Criteria) this;
        }

        public Criteria andApplicationNameGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATION_NAME >=", value, "applicationName");
            return (Criteria) this;
        }

        public Criteria andApplicationNameLessThan(String value) {
            addCriterion("APPLICATION_NAME <", value, "applicationName");
            return (Criteria) this;
        }

        public Criteria andApplicationNameLessThanOrEqualTo(String value) {
            addCriterion("APPLICATION_NAME <=", value, "applicationName");
            return (Criteria) this;
        }

        public Criteria andApplicationNameLike(String value) {
            addCriterion("APPLICATION_NAME like", value, "applicationName");
            return (Criteria) this;
        }

        public Criteria andApplicationNameNotLike(String value) {
            addCriterion("APPLICATION_NAME not like", value, "applicationName");
            return (Criteria) this;
        }

        public Criteria andApplicationNameIn(List<String> values) {
            addCriterion("APPLICATION_NAME in", values, "applicationName");
            return (Criteria) this;
        }

        public Criteria andApplicationNameNotIn(List<String> values) {
            addCriterion("APPLICATION_NAME not in", values, "applicationName");
            return (Criteria) this;
        }

        public Criteria andApplicationNameBetween(String value1, String value2) {
            addCriterion("APPLICATION_NAME between", value1, value2, "applicationName");
            return (Criteria) this;
        }

        public Criteria andApplicationNameNotBetween(String value1, String value2) {
            addCriterion("APPLICATION_NAME not between", value1, value2, "applicationName");
            return (Criteria) this;
        }

        public Criteria andApplicationServerIsNull() {
            addCriterion("APPLICATION_SERVER is null");
            return (Criteria) this;
        }

        public Criteria andApplicationServerIsNotNull() {
            addCriterion("APPLICATION_SERVER is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationServerEqualTo(String value) {
            addCriterion("APPLICATION_SERVER =", value, "applicationServer");
            return (Criteria) this;
        }

        public Criteria andApplicationServerNotEqualTo(String value) {
            addCriterion("APPLICATION_SERVER <>", value, "applicationServer");
            return (Criteria) this;
        }

        public Criteria andApplicationServerGreaterThan(String value) {
            addCriterion("APPLICATION_SERVER >", value, "applicationServer");
            return (Criteria) this;
        }

        public Criteria andApplicationServerGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATION_SERVER >=", value, "applicationServer");
            return (Criteria) this;
        }

        public Criteria andApplicationServerLessThan(String value) {
            addCriterion("APPLICATION_SERVER <", value, "applicationServer");
            return (Criteria) this;
        }

        public Criteria andApplicationServerLessThanOrEqualTo(String value) {
            addCriterion("APPLICATION_SERVER <=", value, "applicationServer");
            return (Criteria) this;
        }

        public Criteria andApplicationServerLike(String value) {
            addCriterion("APPLICATION_SERVER like", value, "applicationServer");
            return (Criteria) this;
        }

        public Criteria andApplicationServerNotLike(String value) {
            addCriterion("APPLICATION_SERVER not like", value, "applicationServer");
            return (Criteria) this;
        }

        public Criteria andApplicationServerIn(List<String> values) {
            addCriterion("APPLICATION_SERVER in", values, "applicationServer");
            return (Criteria) this;
        }

        public Criteria andApplicationServerNotIn(List<String> values) {
            addCriterion("APPLICATION_SERVER not in", values, "applicationServer");
            return (Criteria) this;
        }

        public Criteria andApplicationServerBetween(String value1, String value2) {
            addCriterion("APPLICATION_SERVER between", value1, value2, "applicationServer");
            return (Criteria) this;
        }

        public Criteria andApplicationServerNotBetween(String value1, String value2) {
            addCriterion("APPLICATION_SERVER not between", value1, value2, "applicationServer");
            return (Criteria) this;
        }

        public Criteria andApplicationGateIsNull() {
            addCriterion("APPLICATION_GATE is null");
            return (Criteria) this;
        }

        public Criteria andApplicationGateIsNotNull() {
            addCriterion("APPLICATION_GATE is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationGateEqualTo(String value) {
            addCriterion("APPLICATION_GATE =", value, "applicationGate");
            return (Criteria) this;
        }

        public Criteria andApplicationGateNotEqualTo(String value) {
            addCriterion("APPLICATION_GATE <>", value, "applicationGate");
            return (Criteria) this;
        }

        public Criteria andApplicationGateGreaterThan(String value) {
            addCriterion("APPLICATION_GATE >", value, "applicationGate");
            return (Criteria) this;
        }

        public Criteria andApplicationGateGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATION_GATE >=", value, "applicationGate");
            return (Criteria) this;
        }

        public Criteria andApplicationGateLessThan(String value) {
            addCriterion("APPLICATION_GATE <", value, "applicationGate");
            return (Criteria) this;
        }

        public Criteria andApplicationGateLessThanOrEqualTo(String value) {
            addCriterion("APPLICATION_GATE <=", value, "applicationGate");
            return (Criteria) this;
        }

        public Criteria andApplicationGateLike(String value) {
            addCriterion("APPLICATION_GATE like", value, "applicationGate");
            return (Criteria) this;
        }

        public Criteria andApplicationGateNotLike(String value) {
            addCriterion("APPLICATION_GATE not like", value, "applicationGate");
            return (Criteria) this;
        }

        public Criteria andApplicationGateIn(List<String> values) {
            addCriterion("APPLICATION_GATE in", values, "applicationGate");
            return (Criteria) this;
        }

        public Criteria andApplicationGateNotIn(List<String> values) {
            addCriterion("APPLICATION_GATE not in", values, "applicationGate");
            return (Criteria) this;
        }

        public Criteria andApplicationGateBetween(String value1, String value2) {
            addCriterion("APPLICATION_GATE between", value1, value2, "applicationGate");
            return (Criteria) this;
        }

        public Criteria andApplicationGateNotBetween(String value1, String value2) {
            addCriterion("APPLICATION_GATE not between", value1, value2, "applicationGate");
            return (Criteria) this;
        }

        public Criteria andApplicationDescIsNull() {
            addCriterion("APPLICATION_DESC is null");
            return (Criteria) this;
        }

        public Criteria andApplicationDescIsNotNull() {
            addCriterion("APPLICATION_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationDescEqualTo(String value) {
            addCriterion("APPLICATION_DESC =", value, "applicationDesc");
            return (Criteria) this;
        }

        public Criteria andApplicationDescNotEqualTo(String value) {
            addCriterion("APPLICATION_DESC <>", value, "applicationDesc");
            return (Criteria) this;
        }

        public Criteria andApplicationDescGreaterThan(String value) {
            addCriterion("APPLICATION_DESC >", value, "applicationDesc");
            return (Criteria) this;
        }

        public Criteria andApplicationDescGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATION_DESC >=", value, "applicationDesc");
            return (Criteria) this;
        }

        public Criteria andApplicationDescLessThan(String value) {
            addCriterion("APPLICATION_DESC <", value, "applicationDesc");
            return (Criteria) this;
        }

        public Criteria andApplicationDescLessThanOrEqualTo(String value) {
            addCriterion("APPLICATION_DESC <=", value, "applicationDesc");
            return (Criteria) this;
        }

        public Criteria andApplicationDescLike(String value) {
            addCriterion("APPLICATION_DESC like", value, "applicationDesc");
            return (Criteria) this;
        }

        public Criteria andApplicationDescNotLike(String value) {
            addCriterion("APPLICATION_DESC not like", value, "applicationDesc");
            return (Criteria) this;
        }

        public Criteria andApplicationDescIn(List<String> values) {
            addCriterion("APPLICATION_DESC in", values, "applicationDesc");
            return (Criteria) this;
        }

        public Criteria andApplicationDescNotIn(List<String> values) {
            addCriterion("APPLICATION_DESC not in", values, "applicationDesc");
            return (Criteria) this;
        }

        public Criteria andApplicationDescBetween(String value1, String value2) {
            addCriterion("APPLICATION_DESC between", value1, value2, "applicationDesc");
            return (Criteria) this;
        }

        public Criteria andApplicationDescNotBetween(String value1, String value2) {
            addCriterion("APPLICATION_DESC not between", value1, value2, "applicationDesc");
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