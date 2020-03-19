package com.demstudio.zzbzcglxt.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LedgerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LedgerExample() {
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

        public Criteria andLedgerIdIsNull() {
            addCriterion("LEDGER_ID is null");
            return (Criteria) this;
        }

        public Criteria andLedgerIdIsNotNull() {
            addCriterion("LEDGER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLedgerIdEqualTo(String value) {
            addCriterion("LEDGER_ID =", value, "ledgerId");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNotEqualTo(String value) {
            addCriterion("LEDGER_ID <>", value, "ledgerId");
            return (Criteria) this;
        }

        public Criteria andLedgerIdGreaterThan(String value) {
            addCriterion("LEDGER_ID >", value, "ledgerId");
            return (Criteria) this;
        }

        public Criteria andLedgerIdGreaterThanOrEqualTo(String value) {
            addCriterion("LEDGER_ID >=", value, "ledgerId");
            return (Criteria) this;
        }

        public Criteria andLedgerIdLessThan(String value) {
            addCriterion("LEDGER_ID <", value, "ledgerId");
            return (Criteria) this;
        }

        public Criteria andLedgerIdLessThanOrEqualTo(String value) {
            addCriterion("LEDGER_ID <=", value, "ledgerId");
            return (Criteria) this;
        }

        public Criteria andLedgerIdLike(String value) {
            addCriterion("LEDGER_ID like", value, "ledgerId");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNotLike(String value) {
            addCriterion("LEDGER_ID not like", value, "ledgerId");
            return (Criteria) this;
        }

        public Criteria andLedgerIdIn(List<String> values) {
            addCriterion("LEDGER_ID in", values, "ledgerId");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNotIn(List<String> values) {
            addCriterion("LEDGER_ID not in", values, "ledgerId");
            return (Criteria) this;
        }

        public Criteria andLedgerIdBetween(String value1, String value2) {
            addCriterion("LEDGER_ID between", value1, value2, "ledgerId");
            return (Criteria) this;
        }

        public Criteria andLedgerIdNotBetween(String value1, String value2) {
            addCriterion("LEDGER_ID not between", value1, value2, "ledgerId");
            return (Criteria) this;
        }

        public Criteria andLedgerConsumableIsNull() {
            addCriterion("LEDGER_CONSUMABLE is null");
            return (Criteria) this;
        }

        public Criteria andLedgerConsumableIsNotNull() {
            addCriterion("LEDGER_CONSUMABLE is not null");
            return (Criteria) this;
        }

        public Criteria andLedgerConsumableEqualTo(String value) {
            addCriterion("LEDGER_CONSUMABLE =", value, "ledgerConsumable");
            return (Criteria) this;
        }

        public Criteria andLedgerConsumableNotEqualTo(String value) {
            addCriterion("LEDGER_CONSUMABLE <>", value, "ledgerConsumable");
            return (Criteria) this;
        }

        public Criteria andLedgerConsumableGreaterThan(String value) {
            addCriterion("LEDGER_CONSUMABLE >", value, "ledgerConsumable");
            return (Criteria) this;
        }

        public Criteria andLedgerConsumableGreaterThanOrEqualTo(String value) {
            addCriterion("LEDGER_CONSUMABLE >=", value, "ledgerConsumable");
            return (Criteria) this;
        }

        public Criteria andLedgerConsumableLessThan(String value) {
            addCriterion("LEDGER_CONSUMABLE <", value, "ledgerConsumable");
            return (Criteria) this;
        }

        public Criteria andLedgerConsumableLessThanOrEqualTo(String value) {
            addCriterion("LEDGER_CONSUMABLE <=", value, "ledgerConsumable");
            return (Criteria) this;
        }

        public Criteria andLedgerConsumableLike(String value) {
            addCriterion("LEDGER_CONSUMABLE like", value, "ledgerConsumable");
            return (Criteria) this;
        }

        public Criteria andLedgerConsumableNotLike(String value) {
            addCriterion("LEDGER_CONSUMABLE not like", value, "ledgerConsumable");
            return (Criteria) this;
        }

        public Criteria andLedgerConsumableIn(List<String> values) {
            addCriterion("LEDGER_CONSUMABLE in", values, "ledgerConsumable");
            return (Criteria) this;
        }

        public Criteria andLedgerConsumableNotIn(List<String> values) {
            addCriterion("LEDGER_CONSUMABLE not in", values, "ledgerConsumable");
            return (Criteria) this;
        }

        public Criteria andLedgerConsumableBetween(String value1, String value2) {
            addCriterion("LEDGER_CONSUMABLE between", value1, value2, "ledgerConsumable");
            return (Criteria) this;
        }

        public Criteria andLedgerConsumableNotBetween(String value1, String value2) {
            addCriterion("LEDGER_CONSUMABLE not between", value1, value2, "ledgerConsumable");
            return (Criteria) this;
        }

        public Criteria andLedgerCountIsNull() {
            addCriterion("LEDGER_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andLedgerCountIsNotNull() {
            addCriterion("LEDGER_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLedgerCountEqualTo(Integer value) {
            addCriterion("LEDGER_COUNT =", value, "ledgerCount");
            return (Criteria) this;
        }

        public Criteria andLedgerCountNotEqualTo(Integer value) {
            addCriterion("LEDGER_COUNT <>", value, "ledgerCount");
            return (Criteria) this;
        }

        public Criteria andLedgerCountGreaterThan(Integer value) {
            addCriterion("LEDGER_COUNT >", value, "ledgerCount");
            return (Criteria) this;
        }

        public Criteria andLedgerCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("LEDGER_COUNT >=", value, "ledgerCount");
            return (Criteria) this;
        }

        public Criteria andLedgerCountLessThan(Integer value) {
            addCriterion("LEDGER_COUNT <", value, "ledgerCount");
            return (Criteria) this;
        }

        public Criteria andLedgerCountLessThanOrEqualTo(Integer value) {
            addCriterion("LEDGER_COUNT <=", value, "ledgerCount");
            return (Criteria) this;
        }

        public Criteria andLedgerCountIn(List<Integer> values) {
            addCriterion("LEDGER_COUNT in", values, "ledgerCount");
            return (Criteria) this;
        }

        public Criteria andLedgerCountNotIn(List<Integer> values) {
            addCriterion("LEDGER_COUNT not in", values, "ledgerCount");
            return (Criteria) this;
        }

        public Criteria andLedgerCountBetween(Integer value1, Integer value2) {
            addCriterion("LEDGER_COUNT between", value1, value2, "ledgerCount");
            return (Criteria) this;
        }

        public Criteria andLedgerCountNotBetween(Integer value1, Integer value2) {
            addCriterion("LEDGER_COUNT not between", value1, value2, "ledgerCount");
            return (Criteria) this;
        }

        public Criteria andLedgerPersonIsNull() {
            addCriterion("LEDGER_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andLedgerPersonIsNotNull() {
            addCriterion("LEDGER_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andLedgerPersonEqualTo(String value) {
            addCriterion("LEDGER_PERSON =", value, "ledgerPerson");
            return (Criteria) this;
        }

        public Criteria andLedgerPersonNotEqualTo(String value) {
            addCriterion("LEDGER_PERSON <>", value, "ledgerPerson");
            return (Criteria) this;
        }

        public Criteria andLedgerPersonGreaterThan(String value) {
            addCriterion("LEDGER_PERSON >", value, "ledgerPerson");
            return (Criteria) this;
        }

        public Criteria andLedgerPersonGreaterThanOrEqualTo(String value) {
            addCriterion("LEDGER_PERSON >=", value, "ledgerPerson");
            return (Criteria) this;
        }

        public Criteria andLedgerPersonLessThan(String value) {
            addCriterion("LEDGER_PERSON <", value, "ledgerPerson");
            return (Criteria) this;
        }

        public Criteria andLedgerPersonLessThanOrEqualTo(String value) {
            addCriterion("LEDGER_PERSON <=", value, "ledgerPerson");
            return (Criteria) this;
        }

        public Criteria andLedgerPersonLike(String value) {
            addCriterion("LEDGER_PERSON like", value, "ledgerPerson");
            return (Criteria) this;
        }

        public Criteria andLedgerPersonNotLike(String value) {
            addCriterion("LEDGER_PERSON not like", value, "ledgerPerson");
            return (Criteria) this;
        }

        public Criteria andLedgerPersonIn(List<String> values) {
            addCriterion("LEDGER_PERSON in", values, "ledgerPerson");
            return (Criteria) this;
        }

        public Criteria andLedgerPersonNotIn(List<String> values) {
            addCriterion("LEDGER_PERSON not in", values, "ledgerPerson");
            return (Criteria) this;
        }

        public Criteria andLedgerPersonBetween(String value1, String value2) {
            addCriterion("LEDGER_PERSON between", value1, value2, "ledgerPerson");
            return (Criteria) this;
        }

        public Criteria andLedgerPersonNotBetween(String value1, String value2) {
            addCriterion("LEDGER_PERSON not between", value1, value2, "ledgerPerson");
            return (Criteria) this;
        }

        public Criteria andLedgerUnitIsNull() {
            addCriterion("LEDGER_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andLedgerUnitIsNotNull() {
            addCriterion("LEDGER_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andLedgerUnitEqualTo(String value) {
            addCriterion("LEDGER_UNIT =", value, "ledgerUnit");
            return (Criteria) this;
        }

        public Criteria andLedgerUnitNotEqualTo(String value) {
            addCriterion("LEDGER_UNIT <>", value, "ledgerUnit");
            return (Criteria) this;
        }

        public Criteria andLedgerUnitGreaterThan(String value) {
            addCriterion("LEDGER_UNIT >", value, "ledgerUnit");
            return (Criteria) this;
        }

        public Criteria andLedgerUnitGreaterThanOrEqualTo(String value) {
            addCriterion("LEDGER_UNIT >=", value, "ledgerUnit");
            return (Criteria) this;
        }

        public Criteria andLedgerUnitLessThan(String value) {
            addCriterion("LEDGER_UNIT <", value, "ledgerUnit");
            return (Criteria) this;
        }

        public Criteria andLedgerUnitLessThanOrEqualTo(String value) {
            addCriterion("LEDGER_UNIT <=", value, "ledgerUnit");
            return (Criteria) this;
        }

        public Criteria andLedgerUnitLike(String value) {
            addCriterion("LEDGER_UNIT like", value, "ledgerUnit");
            return (Criteria) this;
        }

        public Criteria andLedgerUnitNotLike(String value) {
            addCriterion("LEDGER_UNIT not like", value, "ledgerUnit");
            return (Criteria) this;
        }

        public Criteria andLedgerUnitIn(List<String> values) {
            addCriterion("LEDGER_UNIT in", values, "ledgerUnit");
            return (Criteria) this;
        }

        public Criteria andLedgerUnitNotIn(List<String> values) {
            addCriterion("LEDGER_UNIT not in", values, "ledgerUnit");
            return (Criteria) this;
        }

        public Criteria andLedgerUnitBetween(String value1, String value2) {
            addCriterion("LEDGER_UNIT between", value1, value2, "ledgerUnit");
            return (Criteria) this;
        }

        public Criteria andLedgerUnitNotBetween(String value1, String value2) {
            addCriterion("LEDGER_UNIT not between", value1, value2, "ledgerUnit");
            return (Criteria) this;
        }

        public Criteria andLedgerTimeIsNull() {
            addCriterion("LEDGER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLedgerTimeIsNotNull() {
            addCriterion("LEDGER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLedgerTimeEqualTo(Date value) {
            addCriterion("LEDGER_TIME =", value, "ledgerTime");
            return (Criteria) this;
        }

        public Criteria andLedgerTimeNotEqualTo(Date value) {
            addCriterion("LEDGER_TIME <>", value, "ledgerTime");
            return (Criteria) this;
        }

        public Criteria andLedgerTimeGreaterThan(Date value) {
            addCriterion("LEDGER_TIME >", value, "ledgerTime");
            return (Criteria) this;
        }

        public Criteria andLedgerTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LEDGER_TIME >=", value, "ledgerTime");
            return (Criteria) this;
        }

        public Criteria andLedgerTimeLessThan(Date value) {
            addCriterion("LEDGER_TIME <", value, "ledgerTime");
            return (Criteria) this;
        }

        public Criteria andLedgerTimeLessThanOrEqualTo(Date value) {
            addCriterion("LEDGER_TIME <=", value, "ledgerTime");
            return (Criteria) this;
        }

        public Criteria andLedgerTimeIn(List<Date> values) {
            addCriterion("LEDGER_TIME in", values, "ledgerTime");
            return (Criteria) this;
        }

        public Criteria andLedgerTimeNotIn(List<Date> values) {
            addCriterion("LEDGER_TIME not in", values, "ledgerTime");
            return (Criteria) this;
        }

        public Criteria andLedgerTimeBetween(Date value1, Date value2) {
            addCriterion("LEDGER_TIME between", value1, value2, "ledgerTime");
            return (Criteria) this;
        }

        public Criteria andLedgerTimeNotBetween(Date value1, Date value2) {
            addCriterion("LEDGER_TIME not between", value1, value2, "ledgerTime");
            return (Criteria) this;
        }

        public Criteria andLedgerUserIsNull() {
            addCriterion("LEDGER_USER is null");
            return (Criteria) this;
        }

        public Criteria andLedgerUserIsNotNull() {
            addCriterion("LEDGER_USER is not null");
            return (Criteria) this;
        }

        public Criteria andLedgerUserEqualTo(String value) {
            addCriterion("LEDGER_USER =", value, "ledgerUser");
            return (Criteria) this;
        }

        public Criteria andLedgerUserNotEqualTo(String value) {
            addCriterion("LEDGER_USER <>", value, "ledgerUser");
            return (Criteria) this;
        }

        public Criteria andLedgerUserGreaterThan(String value) {
            addCriterion("LEDGER_USER >", value, "ledgerUser");
            return (Criteria) this;
        }

        public Criteria andLedgerUserGreaterThanOrEqualTo(String value) {
            addCriterion("LEDGER_USER >=", value, "ledgerUser");
            return (Criteria) this;
        }

        public Criteria andLedgerUserLessThan(String value) {
            addCriterion("LEDGER_USER <", value, "ledgerUser");
            return (Criteria) this;
        }

        public Criteria andLedgerUserLessThanOrEqualTo(String value) {
            addCriterion("LEDGER_USER <=", value, "ledgerUser");
            return (Criteria) this;
        }

        public Criteria andLedgerUserLike(String value) {
            addCriterion("LEDGER_USER like", value, "ledgerUser");
            return (Criteria) this;
        }

        public Criteria andLedgerUserNotLike(String value) {
            addCriterion("LEDGER_USER not like", value, "ledgerUser");
            return (Criteria) this;
        }

        public Criteria andLedgerUserIn(List<String> values) {
            addCriterion("LEDGER_USER in", values, "ledgerUser");
            return (Criteria) this;
        }

        public Criteria andLedgerUserNotIn(List<String> values) {
            addCriterion("LEDGER_USER not in", values, "ledgerUser");
            return (Criteria) this;
        }

        public Criteria andLedgerUserBetween(String value1, String value2) {
            addCriterion("LEDGER_USER between", value1, value2, "ledgerUser");
            return (Criteria) this;
        }

        public Criteria andLedgerUserNotBetween(String value1, String value2) {
            addCriterion("LEDGER_USER not between", value1, value2, "ledgerUser");
            return (Criteria) this;
        }

        public Criteria andLedgerTypeIsNull() {
            addCriterion("LEDGER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLedgerTypeIsNotNull() {
            addCriterion("LEDGER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLedgerTypeEqualTo(Integer value) {
            addCriterion("LEDGER_TYPE =", value, "ledgerType");
            return (Criteria) this;
        }

        public Criteria andLedgerTypeNotEqualTo(Integer value) {
            addCriterion("LEDGER_TYPE <>", value, "ledgerType");
            return (Criteria) this;
        }

        public Criteria andLedgerTypeGreaterThan(Integer value) {
            addCriterion("LEDGER_TYPE >", value, "ledgerType");
            return (Criteria) this;
        }

        public Criteria andLedgerTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("LEDGER_TYPE >=", value, "ledgerType");
            return (Criteria) this;
        }

        public Criteria andLedgerTypeLessThan(Integer value) {
            addCriterion("LEDGER_TYPE <", value, "ledgerType");
            return (Criteria) this;
        }

        public Criteria andLedgerTypeLessThanOrEqualTo(Integer value) {
            addCriterion("LEDGER_TYPE <=", value, "ledgerType");
            return (Criteria) this;
        }

        public Criteria andLedgerTypeIn(List<Integer> values) {
            addCriterion("LEDGER_TYPE in", values, "ledgerType");
            return (Criteria) this;
        }

        public Criteria andLedgerTypeNotIn(List<Integer> values) {
            addCriterion("LEDGER_TYPE not in", values, "ledgerType");
            return (Criteria) this;
        }

        public Criteria andLedgerTypeBetween(Integer value1, Integer value2) {
            addCriterion("LEDGER_TYPE between", value1, value2, "ledgerType");
            return (Criteria) this;
        }

        public Criteria andLedgerTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("LEDGER_TYPE not between", value1, value2, "ledgerType");
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