package com.demstudio.zzbzcglxt.domain;

import java.util.ArrayList;
import java.util.List;

public class TypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TypeExample() {
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

        public Criteria andTypeIdIsNull() {
            addCriterion("TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(String value) {
            addCriterion("TYPE_ID =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(String value) {
            addCriterion("TYPE_ID <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(String value) {
            addCriterion("TYPE_ID >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_ID >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(String value) {
            addCriterion("TYPE_ID <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(String value) {
            addCriterion("TYPE_ID <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLike(String value) {
            addCriterion("TYPE_ID like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotLike(String value) {
            addCriterion("TYPE_ID not like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<String> values) {
            addCriterion("TYPE_ID in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<String> values) {
            addCriterion("TYPE_ID not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(String value1, String value2) {
            addCriterion("TYPE_ID between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(String value1, String value2) {
            addCriterion("TYPE_ID not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNull() {
            addCriterion("TYPE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("TYPE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("TYPE_NAME =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("TYPE_NAME <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("TYPE_NAME >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_NAME >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("TYPE_NAME <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("TYPE_NAME <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("TYPE_NAME like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("TYPE_NAME not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("TYPE_NAME in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("TYPE_NAME not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("TYPE_NAME between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("TYPE_NAME not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeBrandIsNull() {
            addCriterion("TYPE_BRAND is null");
            return (Criteria) this;
        }

        public Criteria andTypeBrandIsNotNull() {
            addCriterion("TYPE_BRAND is not null");
            return (Criteria) this;
        }

        public Criteria andTypeBrandEqualTo(Boolean value) {
            addCriterion("TYPE_BRAND =", value, "typeBrand");
            return (Criteria) this;
        }

        public Criteria andTypeBrandNotEqualTo(Boolean value) {
            addCriterion("TYPE_BRAND <>", value, "typeBrand");
            return (Criteria) this;
        }

        public Criteria andTypeBrandGreaterThan(Boolean value) {
            addCriterion("TYPE_BRAND >", value, "typeBrand");
            return (Criteria) this;
        }

        public Criteria andTypeBrandGreaterThanOrEqualTo(Boolean value) {
            addCriterion("TYPE_BRAND >=", value, "typeBrand");
            return (Criteria) this;
        }

        public Criteria andTypeBrandLessThan(Boolean value) {
            addCriterion("TYPE_BRAND <", value, "typeBrand");
            return (Criteria) this;
        }

        public Criteria andTypeBrandLessThanOrEqualTo(Boolean value) {
            addCriterion("TYPE_BRAND <=", value, "typeBrand");
            return (Criteria) this;
        }

        public Criteria andTypeBrandIn(List<Boolean> values) {
            addCriterion("TYPE_BRAND in", values, "typeBrand");
            return (Criteria) this;
        }

        public Criteria andTypeBrandNotIn(List<Boolean> values) {
            addCriterion("TYPE_BRAND not in", values, "typeBrand");
            return (Criteria) this;
        }

        public Criteria andTypeBrandBetween(Boolean value1, Boolean value2) {
            addCriterion("TYPE_BRAND between", value1, value2, "typeBrand");
            return (Criteria) this;
        }

        public Criteria andTypeBrandNotBetween(Boolean value1, Boolean value2) {
            addCriterion("TYPE_BRAND not between", value1, value2, "typeBrand");
            return (Criteria) this;
        }

        public Criteria andTypeModelIsNull() {
            addCriterion("TYPE_MODEL is null");
            return (Criteria) this;
        }

        public Criteria andTypeModelIsNotNull() {
            addCriterion("TYPE_MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andTypeModelEqualTo(Boolean value) {
            addCriterion("TYPE_MODEL =", value, "typeModel");
            return (Criteria) this;
        }

        public Criteria andTypeModelNotEqualTo(Boolean value) {
            addCriterion("TYPE_MODEL <>", value, "typeModel");
            return (Criteria) this;
        }

        public Criteria andTypeModelGreaterThan(Boolean value) {
            addCriterion("TYPE_MODEL >", value, "typeModel");
            return (Criteria) this;
        }

        public Criteria andTypeModelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("TYPE_MODEL >=", value, "typeModel");
            return (Criteria) this;
        }

        public Criteria andTypeModelLessThan(Boolean value) {
            addCriterion("TYPE_MODEL <", value, "typeModel");
            return (Criteria) this;
        }

        public Criteria andTypeModelLessThanOrEqualTo(Boolean value) {
            addCriterion("TYPE_MODEL <=", value, "typeModel");
            return (Criteria) this;
        }

        public Criteria andTypeModelIn(List<Boolean> values) {
            addCriterion("TYPE_MODEL in", values, "typeModel");
            return (Criteria) this;
        }

        public Criteria andTypeModelNotIn(List<Boolean> values) {
            addCriterion("TYPE_MODEL not in", values, "typeModel");
            return (Criteria) this;
        }

        public Criteria andTypeModelBetween(Boolean value1, Boolean value2) {
            addCriterion("TYPE_MODEL between", value1, value2, "typeModel");
            return (Criteria) this;
        }

        public Criteria andTypeModelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("TYPE_MODEL not between", value1, value2, "typeModel");
            return (Criteria) this;
        }

        public Criteria andTypeSecrecyIsNull() {
            addCriterion("TYPE_SECRECY is null");
            return (Criteria) this;
        }

        public Criteria andTypeSecrecyIsNotNull() {
            addCriterion("TYPE_SECRECY is not null");
            return (Criteria) this;
        }

        public Criteria andTypeSecrecyEqualTo(Boolean value) {
            addCriterion("TYPE_SECRECY =", value, "typeSecrecy");
            return (Criteria) this;
        }

        public Criteria andTypeSecrecyNotEqualTo(Boolean value) {
            addCriterion("TYPE_SECRECY <>", value, "typeSecrecy");
            return (Criteria) this;
        }

        public Criteria andTypeSecrecyGreaterThan(Boolean value) {
            addCriterion("TYPE_SECRECY >", value, "typeSecrecy");
            return (Criteria) this;
        }

        public Criteria andTypeSecrecyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("TYPE_SECRECY >=", value, "typeSecrecy");
            return (Criteria) this;
        }

        public Criteria andTypeSecrecyLessThan(Boolean value) {
            addCriterion("TYPE_SECRECY <", value, "typeSecrecy");
            return (Criteria) this;
        }

        public Criteria andTypeSecrecyLessThanOrEqualTo(Boolean value) {
            addCriterion("TYPE_SECRECY <=", value, "typeSecrecy");
            return (Criteria) this;
        }

        public Criteria andTypeSecrecyIn(List<Boolean> values) {
            addCriterion("TYPE_SECRECY in", values, "typeSecrecy");
            return (Criteria) this;
        }

        public Criteria andTypeSecrecyNotIn(List<Boolean> values) {
            addCriterion("TYPE_SECRECY not in", values, "typeSecrecy");
            return (Criteria) this;
        }

        public Criteria andTypeSecrecyBetween(Boolean value1, Boolean value2) {
            addCriterion("TYPE_SECRECY between", value1, value2, "typeSecrecy");
            return (Criteria) this;
        }

        public Criteria andTypeSecrecyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("TYPE_SECRECY not between", value1, value2, "typeSecrecy");
            return (Criteria) this;
        }

        public Criteria andTypeIpIsNull() {
            addCriterion("TYPE_IP is null");
            return (Criteria) this;
        }

        public Criteria andTypeIpIsNotNull() {
            addCriterion("TYPE_IP is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIpEqualTo(Boolean value) {
            addCriterion("TYPE_IP =", value, "typeIp");
            return (Criteria) this;
        }

        public Criteria andTypeIpNotEqualTo(Boolean value) {
            addCriterion("TYPE_IP <>", value, "typeIp");
            return (Criteria) this;
        }

        public Criteria andTypeIpGreaterThan(Boolean value) {
            addCriterion("TYPE_IP >", value, "typeIp");
            return (Criteria) this;
        }

        public Criteria andTypeIpGreaterThanOrEqualTo(Boolean value) {
            addCriterion("TYPE_IP >=", value, "typeIp");
            return (Criteria) this;
        }

        public Criteria andTypeIpLessThan(Boolean value) {
            addCriterion("TYPE_IP <", value, "typeIp");
            return (Criteria) this;
        }

        public Criteria andTypeIpLessThanOrEqualTo(Boolean value) {
            addCriterion("TYPE_IP <=", value, "typeIp");
            return (Criteria) this;
        }

        public Criteria andTypeIpIn(List<Boolean> values) {
            addCriterion("TYPE_IP in", values, "typeIp");
            return (Criteria) this;
        }

        public Criteria andTypeIpNotIn(List<Boolean> values) {
            addCriterion("TYPE_IP not in", values, "typeIp");
            return (Criteria) this;
        }

        public Criteria andTypeIpBetween(Boolean value1, Boolean value2) {
            addCriterion("TYPE_IP between", value1, value2, "typeIp");
            return (Criteria) this;
        }

        public Criteria andTypeIpNotBetween(Boolean value1, Boolean value2) {
            addCriterion("TYPE_IP not between", value1, value2, "typeIp");
            return (Criteria) this;
        }

        public Criteria andTypeMacIsNull() {
            addCriterion("TYPE_MAC is null");
            return (Criteria) this;
        }

        public Criteria andTypeMacIsNotNull() {
            addCriterion("TYPE_MAC is not null");
            return (Criteria) this;
        }

        public Criteria andTypeMacEqualTo(Boolean value) {
            addCriterion("TYPE_MAC =", value, "typeMac");
            return (Criteria) this;
        }

        public Criteria andTypeMacNotEqualTo(Boolean value) {
            addCriterion("TYPE_MAC <>", value, "typeMac");
            return (Criteria) this;
        }

        public Criteria andTypeMacGreaterThan(Boolean value) {
            addCriterion("TYPE_MAC >", value, "typeMac");
            return (Criteria) this;
        }

        public Criteria andTypeMacGreaterThanOrEqualTo(Boolean value) {
            addCriterion("TYPE_MAC >=", value, "typeMac");
            return (Criteria) this;
        }

        public Criteria andTypeMacLessThan(Boolean value) {
            addCriterion("TYPE_MAC <", value, "typeMac");
            return (Criteria) this;
        }

        public Criteria andTypeMacLessThanOrEqualTo(Boolean value) {
            addCriterion("TYPE_MAC <=", value, "typeMac");
            return (Criteria) this;
        }

        public Criteria andTypeMacIn(List<Boolean> values) {
            addCriterion("TYPE_MAC in", values, "typeMac");
            return (Criteria) this;
        }

        public Criteria andTypeMacNotIn(List<Boolean> values) {
            addCriterion("TYPE_MAC not in", values, "typeMac");
            return (Criteria) this;
        }

        public Criteria andTypeMacBetween(Boolean value1, Boolean value2) {
            addCriterion("TYPE_MAC between", value1, value2, "typeMac");
            return (Criteria) this;
        }

        public Criteria andTypeMacNotBetween(Boolean value1, Boolean value2) {
            addCriterion("TYPE_MAC not between", value1, value2, "typeMac");
            return (Criteria) this;
        }

        public Criteria andTypeSnIsNull() {
            addCriterion("TYPE_SN is null");
            return (Criteria) this;
        }

        public Criteria andTypeSnIsNotNull() {
            addCriterion("TYPE_SN is not null");
            return (Criteria) this;
        }

        public Criteria andTypeSnEqualTo(Boolean value) {
            addCriterion("TYPE_SN =", value, "typeSn");
            return (Criteria) this;
        }

        public Criteria andTypeSnNotEqualTo(Boolean value) {
            addCriterion("TYPE_SN <>", value, "typeSn");
            return (Criteria) this;
        }

        public Criteria andTypeSnGreaterThan(Boolean value) {
            addCriterion("TYPE_SN >", value, "typeSn");
            return (Criteria) this;
        }

        public Criteria andTypeSnGreaterThanOrEqualTo(Boolean value) {
            addCriterion("TYPE_SN >=", value, "typeSn");
            return (Criteria) this;
        }

        public Criteria andTypeSnLessThan(Boolean value) {
            addCriterion("TYPE_SN <", value, "typeSn");
            return (Criteria) this;
        }

        public Criteria andTypeSnLessThanOrEqualTo(Boolean value) {
            addCriterion("TYPE_SN <=", value, "typeSn");
            return (Criteria) this;
        }

        public Criteria andTypeSnIn(List<Boolean> values) {
            addCriterion("TYPE_SN in", values, "typeSn");
            return (Criteria) this;
        }

        public Criteria andTypeSnNotIn(List<Boolean> values) {
            addCriterion("TYPE_SN not in", values, "typeSn");
            return (Criteria) this;
        }

        public Criteria andTypeSnBetween(Boolean value1, Boolean value2) {
            addCriterion("TYPE_SN between", value1, value2, "typeSn");
            return (Criteria) this;
        }

        public Criteria andTypeSnNotBetween(Boolean value1, Boolean value2) {
            addCriterion("TYPE_SN not between", value1, value2, "typeSn");
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