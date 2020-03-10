package com.demstudio.zzbzcglxt.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogExample() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(String value) {
            addCriterion("LOG_ID =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(String value) {
            addCriterion("LOG_ID <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(String value) {
            addCriterion("LOG_ID >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_ID >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(String value) {
            addCriterion("LOG_ID <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(String value) {
            addCriterion("LOG_ID <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLike(String value) {
            addCriterion("LOG_ID like", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotLike(String value) {
            addCriterion("LOG_ID not like", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<String> values) {
            addCriterion("LOG_ID in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<String> values) {
            addCriterion("LOG_ID not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(String value1, String value2) {
            addCriterion("LOG_ID between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(String value1, String value2) {
            addCriterion("LOG_ID not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogEquipmentIsNull() {
            addCriterion("LOG_EQUIPMENT is null");
            return (Criteria) this;
        }

        public Criteria andLogEquipmentIsNotNull() {
            addCriterion("LOG_EQUIPMENT is not null");
            return (Criteria) this;
        }

        public Criteria andLogEquipmentEqualTo(String value) {
            addCriterion("LOG_EQUIPMENT =", value, "logEquipment");
            return (Criteria) this;
        }

        public Criteria andLogEquipmentNotEqualTo(String value) {
            addCriterion("LOG_EQUIPMENT <>", value, "logEquipment");
            return (Criteria) this;
        }

        public Criteria andLogEquipmentGreaterThan(String value) {
            addCriterion("LOG_EQUIPMENT >", value, "logEquipment");
            return (Criteria) this;
        }

        public Criteria andLogEquipmentGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_EQUIPMENT >=", value, "logEquipment");
            return (Criteria) this;
        }

        public Criteria andLogEquipmentLessThan(String value) {
            addCriterion("LOG_EQUIPMENT <", value, "logEquipment");
            return (Criteria) this;
        }

        public Criteria andLogEquipmentLessThanOrEqualTo(String value) {
            addCriterion("LOG_EQUIPMENT <=", value, "logEquipment");
            return (Criteria) this;
        }

        public Criteria andLogEquipmentLike(String value) {
            addCriterion("LOG_EQUIPMENT like", value, "logEquipment");
            return (Criteria) this;
        }

        public Criteria andLogEquipmentNotLike(String value) {
            addCriterion("LOG_EQUIPMENT not like", value, "logEquipment");
            return (Criteria) this;
        }

        public Criteria andLogEquipmentIn(List<String> values) {
            addCriterion("LOG_EQUIPMENT in", values, "logEquipment");
            return (Criteria) this;
        }

        public Criteria andLogEquipmentNotIn(List<String> values) {
            addCriterion("LOG_EQUIPMENT not in", values, "logEquipment");
            return (Criteria) this;
        }

        public Criteria andLogEquipmentBetween(String value1, String value2) {
            addCriterion("LOG_EQUIPMENT between", value1, value2, "logEquipment");
            return (Criteria) this;
        }

        public Criteria andLogEquipmentNotBetween(String value1, String value2) {
            addCriterion("LOG_EQUIPMENT not between", value1, value2, "logEquipment");
            return (Criteria) this;
        }

        public Criteria andLogUserIsNull() {
            addCriterion("LOG_USER is null");
            return (Criteria) this;
        }

        public Criteria andLogUserIsNotNull() {
            addCriterion("LOG_USER is not null");
            return (Criteria) this;
        }

        public Criteria andLogUserEqualTo(String value) {
            addCriterion("LOG_USER =", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserNotEqualTo(String value) {
            addCriterion("LOG_USER <>", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserGreaterThan(String value) {
            addCriterion("LOG_USER >", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_USER >=", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserLessThan(String value) {
            addCriterion("LOG_USER <", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserLessThanOrEqualTo(String value) {
            addCriterion("LOG_USER <=", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserLike(String value) {
            addCriterion("LOG_USER like", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserNotLike(String value) {
            addCriterion("LOG_USER not like", value, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserIn(List<String> values) {
            addCriterion("LOG_USER in", values, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserNotIn(List<String> values) {
            addCriterion("LOG_USER not in", values, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserBetween(String value1, String value2) {
            addCriterion("LOG_USER between", value1, value2, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogUserNotBetween(String value1, String value2) {
            addCriterion("LOG_USER not between", value1, value2, "logUser");
            return (Criteria) this;
        }

        public Criteria andLogTimeIsNull() {
            addCriterion("LOG_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLogTimeIsNotNull() {
            addCriterion("LOG_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLogTimeEqualTo(Date value) {
            addCriterion("LOG_TIME =", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotEqualTo(Date value) {
            addCriterion("LOG_TIME <>", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeGreaterThan(Date value) {
            addCriterion("LOG_TIME >", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LOG_TIME >=", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeLessThan(Date value) {
            addCriterion("LOG_TIME <", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeLessThanOrEqualTo(Date value) {
            addCriterion("LOG_TIME <=", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeIn(List<Date> values) {
            addCriterion("LOG_TIME in", values, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotIn(List<Date> values) {
            addCriterion("LOG_TIME not in", values, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeBetween(Date value1, Date value2) {
            addCriterion("LOG_TIME between", value1, value2, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotBetween(Date value1, Date value2) {
            addCriterion("LOG_TIME not between", value1, value2, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogStatusIsNull() {
            addCriterion("LOG_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andLogStatusIsNotNull() {
            addCriterion("LOG_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andLogStatusEqualTo(Integer value) {
            addCriterion("LOG_STATUS =", value, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusNotEqualTo(Integer value) {
            addCriterion("LOG_STATUS <>", value, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusGreaterThan(Integer value) {
            addCriterion("LOG_STATUS >", value, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOG_STATUS >=", value, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusLessThan(Integer value) {
            addCriterion("LOG_STATUS <", value, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusLessThanOrEqualTo(Integer value) {
            addCriterion("LOG_STATUS <=", value, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusIn(List<Integer> values) {
            addCriterion("LOG_STATUS in", values, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusNotIn(List<Integer> values) {
            addCriterion("LOG_STATUS not in", values, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusBetween(Integer value1, Integer value2) {
            addCriterion("LOG_STATUS between", value1, value2, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("LOG_STATUS not between", value1, value2, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogTargetIsNull() {
            addCriterion("LOG_TARGET is null");
            return (Criteria) this;
        }

        public Criteria andLogTargetIsNotNull() {
            addCriterion("LOG_TARGET is not null");
            return (Criteria) this;
        }

        public Criteria andLogTargetEqualTo(String value) {
            addCriterion("LOG_TARGET =", value, "logTarget");
            return (Criteria) this;
        }

        public Criteria andLogTargetNotEqualTo(String value) {
            addCriterion("LOG_TARGET <>", value, "logTarget");
            return (Criteria) this;
        }

        public Criteria andLogTargetGreaterThan(String value) {
            addCriterion("LOG_TARGET >", value, "logTarget");
            return (Criteria) this;
        }

        public Criteria andLogTargetGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_TARGET >=", value, "logTarget");
            return (Criteria) this;
        }

        public Criteria andLogTargetLessThan(String value) {
            addCriterion("LOG_TARGET <", value, "logTarget");
            return (Criteria) this;
        }

        public Criteria andLogTargetLessThanOrEqualTo(String value) {
            addCriterion("LOG_TARGET <=", value, "logTarget");
            return (Criteria) this;
        }

        public Criteria andLogTargetLike(String value) {
            addCriterion("LOG_TARGET like", value, "logTarget");
            return (Criteria) this;
        }

        public Criteria andLogTargetNotLike(String value) {
            addCriterion("LOG_TARGET not like", value, "logTarget");
            return (Criteria) this;
        }

        public Criteria andLogTargetIn(List<String> values) {
            addCriterion("LOG_TARGET in", values, "logTarget");
            return (Criteria) this;
        }

        public Criteria andLogTargetNotIn(List<String> values) {
            addCriterion("LOG_TARGET not in", values, "logTarget");
            return (Criteria) this;
        }

        public Criteria andLogTargetBetween(String value1, String value2) {
            addCriterion("LOG_TARGET between", value1, value2, "logTarget");
            return (Criteria) this;
        }

        public Criteria andLogTargetNotBetween(String value1, String value2) {
            addCriterion("LOG_TARGET not between", value1, value2, "logTarget");
            return (Criteria) this;
        }

        public Criteria andLogOperationDateIsNull() {
            addCriterion("LOG_OPERATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLogOperationDateIsNotNull() {
            addCriterion("LOG_OPERATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLogOperationDateEqualTo(Date value) {
            addCriterion("LOG_OPERATION_DATE =", value, "logOperationDate");
            return (Criteria) this;
        }

        public Criteria andLogOperationDateNotEqualTo(Date value) {
            addCriterion("LOG_OPERATION_DATE <>", value, "logOperationDate");
            return (Criteria) this;
        }

        public Criteria andLogOperationDateGreaterThan(Date value) {
            addCriterion("LOG_OPERATION_DATE >", value, "logOperationDate");
            return (Criteria) this;
        }

        public Criteria andLogOperationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LOG_OPERATION_DATE >=", value, "logOperationDate");
            return (Criteria) this;
        }

        public Criteria andLogOperationDateLessThan(Date value) {
            addCriterion("LOG_OPERATION_DATE <", value, "logOperationDate");
            return (Criteria) this;
        }

        public Criteria andLogOperationDateLessThanOrEqualTo(Date value) {
            addCriterion("LOG_OPERATION_DATE <=", value, "logOperationDate");
            return (Criteria) this;
        }

        public Criteria andLogOperationDateIn(List<Date> values) {
            addCriterion("LOG_OPERATION_DATE in", values, "logOperationDate");
            return (Criteria) this;
        }

        public Criteria andLogOperationDateNotIn(List<Date> values) {
            addCriterion("LOG_OPERATION_DATE not in", values, "logOperationDate");
            return (Criteria) this;
        }

        public Criteria andLogOperationDateBetween(Date value1, Date value2) {
            addCriterion("LOG_OPERATION_DATE between", value1, value2, "logOperationDate");
            return (Criteria) this;
        }

        public Criteria andLogOperationDateNotBetween(Date value1, Date value2) {
            addCriterion("LOG_OPERATION_DATE not between", value1, value2, "logOperationDate");
            return (Criteria) this;
        }

        public Criteria andLogNoteIsNull() {
            addCriterion("LOG_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andLogNoteIsNotNull() {
            addCriterion("LOG_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andLogNoteEqualTo(String value) {
            addCriterion("LOG_NOTE =", value, "logNote");
            return (Criteria) this;
        }

        public Criteria andLogNoteNotEqualTo(String value) {
            addCriterion("LOG_NOTE <>", value, "logNote");
            return (Criteria) this;
        }

        public Criteria andLogNoteGreaterThan(String value) {
            addCriterion("LOG_NOTE >", value, "logNote");
            return (Criteria) this;
        }

        public Criteria andLogNoteGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_NOTE >=", value, "logNote");
            return (Criteria) this;
        }

        public Criteria andLogNoteLessThan(String value) {
            addCriterion("LOG_NOTE <", value, "logNote");
            return (Criteria) this;
        }

        public Criteria andLogNoteLessThanOrEqualTo(String value) {
            addCriterion("LOG_NOTE <=", value, "logNote");
            return (Criteria) this;
        }

        public Criteria andLogNoteLike(String value) {
            addCriterion("LOG_NOTE like", value, "logNote");
            return (Criteria) this;
        }

        public Criteria andLogNoteNotLike(String value) {
            addCriterion("LOG_NOTE not like", value, "logNote");
            return (Criteria) this;
        }

        public Criteria andLogNoteIn(List<String> values) {
            addCriterion("LOG_NOTE in", values, "logNote");
            return (Criteria) this;
        }

        public Criteria andLogNoteNotIn(List<String> values) {
            addCriterion("LOG_NOTE not in", values, "logNote");
            return (Criteria) this;
        }

        public Criteria andLogNoteBetween(String value1, String value2) {
            addCriterion("LOG_NOTE between", value1, value2, "logNote");
            return (Criteria) this;
        }

        public Criteria andLogNoteNotBetween(String value1, String value2) {
            addCriterion("LOG_NOTE not between", value1, value2, "logNote");
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