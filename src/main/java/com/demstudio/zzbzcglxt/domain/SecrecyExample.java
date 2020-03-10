package com.demstudio.zzbzcglxt.domain;

import java.util.ArrayList;
import java.util.List;

public class SecrecyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SecrecyExample() {
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

        public Criteria andSecrecyIdIsNull() {
            addCriterion("SECRECY_ID is null");
            return (Criteria) this;
        }

        public Criteria andSecrecyIdIsNotNull() {
            addCriterion("SECRECY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSecrecyIdEqualTo(String value) {
            addCriterion("SECRECY_ID =", value, "secrecyId");
            return (Criteria) this;
        }

        public Criteria andSecrecyIdNotEqualTo(String value) {
            addCriterion("SECRECY_ID <>", value, "secrecyId");
            return (Criteria) this;
        }

        public Criteria andSecrecyIdGreaterThan(String value) {
            addCriterion("SECRECY_ID >", value, "secrecyId");
            return (Criteria) this;
        }

        public Criteria andSecrecyIdGreaterThanOrEqualTo(String value) {
            addCriterion("SECRECY_ID >=", value, "secrecyId");
            return (Criteria) this;
        }

        public Criteria andSecrecyIdLessThan(String value) {
            addCriterion("SECRECY_ID <", value, "secrecyId");
            return (Criteria) this;
        }

        public Criteria andSecrecyIdLessThanOrEqualTo(String value) {
            addCriterion("SECRECY_ID <=", value, "secrecyId");
            return (Criteria) this;
        }

        public Criteria andSecrecyIdLike(String value) {
            addCriterion("SECRECY_ID like", value, "secrecyId");
            return (Criteria) this;
        }

        public Criteria andSecrecyIdNotLike(String value) {
            addCriterion("SECRECY_ID not like", value, "secrecyId");
            return (Criteria) this;
        }

        public Criteria andSecrecyIdIn(List<String> values) {
            addCriterion("SECRECY_ID in", values, "secrecyId");
            return (Criteria) this;
        }

        public Criteria andSecrecyIdNotIn(List<String> values) {
            addCriterion("SECRECY_ID not in", values, "secrecyId");
            return (Criteria) this;
        }

        public Criteria andSecrecyIdBetween(String value1, String value2) {
            addCriterion("SECRECY_ID between", value1, value2, "secrecyId");
            return (Criteria) this;
        }

        public Criteria andSecrecyIdNotBetween(String value1, String value2) {
            addCriterion("SECRECY_ID not between", value1, value2, "secrecyId");
            return (Criteria) this;
        }

        public Criteria andSecrecyNameIsNull() {
            addCriterion("SECRECY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSecrecyNameIsNotNull() {
            addCriterion("SECRECY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSecrecyNameEqualTo(String value) {
            addCriterion("SECRECY_NAME =", value, "secrecyName");
            return (Criteria) this;
        }

        public Criteria andSecrecyNameNotEqualTo(String value) {
            addCriterion("SECRECY_NAME <>", value, "secrecyName");
            return (Criteria) this;
        }

        public Criteria andSecrecyNameGreaterThan(String value) {
            addCriterion("SECRECY_NAME >", value, "secrecyName");
            return (Criteria) this;
        }

        public Criteria andSecrecyNameGreaterThanOrEqualTo(String value) {
            addCriterion("SECRECY_NAME >=", value, "secrecyName");
            return (Criteria) this;
        }

        public Criteria andSecrecyNameLessThan(String value) {
            addCriterion("SECRECY_NAME <", value, "secrecyName");
            return (Criteria) this;
        }

        public Criteria andSecrecyNameLessThanOrEqualTo(String value) {
            addCriterion("SECRECY_NAME <=", value, "secrecyName");
            return (Criteria) this;
        }

        public Criteria andSecrecyNameLike(String value) {
            addCriterion("SECRECY_NAME like", value, "secrecyName");
            return (Criteria) this;
        }

        public Criteria andSecrecyNameNotLike(String value) {
            addCriterion("SECRECY_NAME not like", value, "secrecyName");
            return (Criteria) this;
        }

        public Criteria andSecrecyNameIn(List<String> values) {
            addCriterion("SECRECY_NAME in", values, "secrecyName");
            return (Criteria) this;
        }

        public Criteria andSecrecyNameNotIn(List<String> values) {
            addCriterion("SECRECY_NAME not in", values, "secrecyName");
            return (Criteria) this;
        }

        public Criteria andSecrecyNameBetween(String value1, String value2) {
            addCriterion("SECRECY_NAME between", value1, value2, "secrecyName");
            return (Criteria) this;
        }

        public Criteria andSecrecyNameNotBetween(String value1, String value2) {
            addCriterion("SECRECY_NAME not between", value1, value2, "secrecyName");
            return (Criteria) this;
        }

        public Criteria andIpMinIsNull() {
            addCriterion("IP_MIN is null");
            return (Criteria) this;
        }

        public Criteria andIpMinIsNotNull() {
            addCriterion("IP_MIN is not null");
            return (Criteria) this;
        }

        public Criteria andIpMinEqualTo(Integer value) {
            addCriterion("IP_MIN =", value, "ipMin");
            return (Criteria) this;
        }

        public Criteria andIpMinNotEqualTo(Integer value) {
            addCriterion("IP_MIN <>", value, "ipMin");
            return (Criteria) this;
        }

        public Criteria andIpMinGreaterThan(Integer value) {
            addCriterion("IP_MIN >", value, "ipMin");
            return (Criteria) this;
        }

        public Criteria andIpMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("IP_MIN >=", value, "ipMin");
            return (Criteria) this;
        }

        public Criteria andIpMinLessThan(Integer value) {
            addCriterion("IP_MIN <", value, "ipMin");
            return (Criteria) this;
        }

        public Criteria andIpMinLessThanOrEqualTo(Integer value) {
            addCriterion("IP_MIN <=", value, "ipMin");
            return (Criteria) this;
        }

        public Criteria andIpMinIn(List<Integer> values) {
            addCriterion("IP_MIN in", values, "ipMin");
            return (Criteria) this;
        }

        public Criteria andIpMinNotIn(List<Integer> values) {
            addCriterion("IP_MIN not in", values, "ipMin");
            return (Criteria) this;
        }

        public Criteria andIpMinBetween(Integer value1, Integer value2) {
            addCriterion("IP_MIN between", value1, value2, "ipMin");
            return (Criteria) this;
        }

        public Criteria andIpMinNotBetween(Integer value1, Integer value2) {
            addCriterion("IP_MIN not between", value1, value2, "ipMin");
            return (Criteria) this;
        }

        public Criteria andIpMaxIsNull() {
            addCriterion("IP_MAX is null");
            return (Criteria) this;
        }

        public Criteria andIpMaxIsNotNull() {
            addCriterion("IP_MAX is not null");
            return (Criteria) this;
        }

        public Criteria andIpMaxEqualTo(Integer value) {
            addCriterion("IP_MAX =", value, "ipMax");
            return (Criteria) this;
        }

        public Criteria andIpMaxNotEqualTo(Integer value) {
            addCriterion("IP_MAX <>", value, "ipMax");
            return (Criteria) this;
        }

        public Criteria andIpMaxGreaterThan(Integer value) {
            addCriterion("IP_MAX >", value, "ipMax");
            return (Criteria) this;
        }

        public Criteria andIpMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("IP_MAX >=", value, "ipMax");
            return (Criteria) this;
        }

        public Criteria andIpMaxLessThan(Integer value) {
            addCriterion("IP_MAX <", value, "ipMax");
            return (Criteria) this;
        }

        public Criteria andIpMaxLessThanOrEqualTo(Integer value) {
            addCriterion("IP_MAX <=", value, "ipMax");
            return (Criteria) this;
        }

        public Criteria andIpMaxIn(List<Integer> values) {
            addCriterion("IP_MAX in", values, "ipMax");
            return (Criteria) this;
        }

        public Criteria andIpMaxNotIn(List<Integer> values) {
            addCriterion("IP_MAX not in", values, "ipMax");
            return (Criteria) this;
        }

        public Criteria andIpMaxBetween(Integer value1, Integer value2) {
            addCriterion("IP_MAX between", value1, value2, "ipMax");
            return (Criteria) this;
        }

        public Criteria andIpMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("IP_MAX not between", value1, value2, "ipMax");
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