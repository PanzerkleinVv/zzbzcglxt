package com.demstudio.zzbzcglxt.domain;

import java.util.ArrayList;
import java.util.List;

public class RegistrationReasonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegistrationReasonExample() {
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

        public Criteria andRegistrationReasonIdIsNull() {
            addCriterion("REGISTRATION_REASON_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonIdIsNotNull() {
            addCriterion("REGISTRATION_REASON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonIdEqualTo(String value) {
            addCriterion("REGISTRATION_REASON_ID =", value, "registrationReasonId");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonIdNotEqualTo(String value) {
            addCriterion("REGISTRATION_REASON_ID <>", value, "registrationReasonId");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonIdGreaterThan(String value) {
            addCriterion("REGISTRATION_REASON_ID >", value, "registrationReasonId");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonIdGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTRATION_REASON_ID >=", value, "registrationReasonId");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonIdLessThan(String value) {
            addCriterion("REGISTRATION_REASON_ID <", value, "registrationReasonId");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonIdLessThanOrEqualTo(String value) {
            addCriterion("REGISTRATION_REASON_ID <=", value, "registrationReasonId");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonIdLike(String value) {
            addCriterion("REGISTRATION_REASON_ID like", value, "registrationReasonId");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonIdNotLike(String value) {
            addCriterion("REGISTRATION_REASON_ID not like", value, "registrationReasonId");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonIdIn(List<String> values) {
            addCriterion("REGISTRATION_REASON_ID in", values, "registrationReasonId");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonIdNotIn(List<String> values) {
            addCriterion("REGISTRATION_REASON_ID not in", values, "registrationReasonId");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonIdBetween(String value1, String value2) {
            addCriterion("REGISTRATION_REASON_ID between", value1, value2, "registrationReasonId");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonIdNotBetween(String value1, String value2) {
            addCriterion("REGISTRATION_REASON_ID not between", value1, value2, "registrationReasonId");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonNameIsNull() {
            addCriterion("REGISTRATION_REASON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonNameIsNotNull() {
            addCriterion("REGISTRATION_REASON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonNameEqualTo(String value) {
            addCriterion("REGISTRATION_REASON_NAME =", value, "registrationReasonName");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonNameNotEqualTo(String value) {
            addCriterion("REGISTRATION_REASON_NAME <>", value, "registrationReasonName");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonNameGreaterThan(String value) {
            addCriterion("REGISTRATION_REASON_NAME >", value, "registrationReasonName");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonNameGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTRATION_REASON_NAME >=", value, "registrationReasonName");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonNameLessThan(String value) {
            addCriterion("REGISTRATION_REASON_NAME <", value, "registrationReasonName");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonNameLessThanOrEqualTo(String value) {
            addCriterion("REGISTRATION_REASON_NAME <=", value, "registrationReasonName");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonNameLike(String value) {
            addCriterion("REGISTRATION_REASON_NAME like", value, "registrationReasonName");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonNameNotLike(String value) {
            addCriterion("REGISTRATION_REASON_NAME not like", value, "registrationReasonName");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonNameIn(List<String> values) {
            addCriterion("REGISTRATION_REASON_NAME in", values, "registrationReasonName");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonNameNotIn(List<String> values) {
            addCriterion("REGISTRATION_REASON_NAME not in", values, "registrationReasonName");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonNameBetween(String value1, String value2) {
            addCriterion("REGISTRATION_REASON_NAME between", value1, value2, "registrationReasonName");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonNameNotBetween(String value1, String value2) {
            addCriterion("REGISTRATION_REASON_NAME not between", value1, value2, "registrationReasonName");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonNoteIsNull() {
            addCriterion("REGISTRATION_REASON_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonNoteIsNotNull() {
            addCriterion("REGISTRATION_REASON_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonNoteEqualTo(Boolean value) {
            addCriterion("REGISTRATION_REASON_NOTE =", value, "registrationReasonNote");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonNoteNotEqualTo(Boolean value) {
            addCriterion("REGISTRATION_REASON_NOTE <>", value, "registrationReasonNote");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonNoteGreaterThan(Boolean value) {
            addCriterion("REGISTRATION_REASON_NOTE >", value, "registrationReasonNote");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonNoteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("REGISTRATION_REASON_NOTE >=", value, "registrationReasonNote");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonNoteLessThan(Boolean value) {
            addCriterion("REGISTRATION_REASON_NOTE <", value, "registrationReasonNote");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonNoteLessThanOrEqualTo(Boolean value) {
            addCriterion("REGISTRATION_REASON_NOTE <=", value, "registrationReasonNote");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonNoteIn(List<Boolean> values) {
            addCriterion("REGISTRATION_REASON_NOTE in", values, "registrationReasonNote");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonNoteNotIn(List<Boolean> values) {
            addCriterion("REGISTRATION_REASON_NOTE not in", values, "registrationReasonNote");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonNoteBetween(Boolean value1, Boolean value2) {
            addCriterion("REGISTRATION_REASON_NOTE between", value1, value2, "registrationReasonNote");
            return (Criteria) this;
        }

        public Criteria andRegistrationReasonNoteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("REGISTRATION_REASON_NOTE not between", value1, value2, "registrationReasonNote");
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