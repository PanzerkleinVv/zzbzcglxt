package com.demstudio.zzbzcglxt.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EquipmentExample {
  protected String orderByClause;

  protected boolean distinct;

  protected List<Criteria> oredCriteria;

  public EquipmentExample() {
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

    public Criteria andEquipmentIdIsNull() {
      addCriterion("EQUIPMENT_ID is null");
      return (Criteria) this;
    }

    public Criteria andEquipmentIdIsNotNull() {
      addCriterion("EQUIPMENT_ID is not null");
      return (Criteria) this;
    }

    public Criteria andEquipmentIdEqualTo(String value) {
      addCriterion("EQUIPMENT_ID =", value, "equipmentId");
      return (Criteria) this;
    }

    public Criteria andEquipmentIdNotEqualTo(String value) {
      addCriterion("EQUIPMENT_ID <>", value, "equipmentId");
      return (Criteria) this;
    }

    public Criteria andEquipmentIdGreaterThan(String value) {
      addCriterion("EQUIPMENT_ID >", value, "equipmentId");
      return (Criteria) this;
    }

    public Criteria andEquipmentIdGreaterThanOrEqualTo(String value) {
      addCriterion("EQUIPMENT_ID >=", value, "equipmentId");
      return (Criteria) this;
    }

    public Criteria andEquipmentIdLessThan(String value) {
      addCriterion("EQUIPMENT_ID <", value, "equipmentId");
      return (Criteria) this;
    }

    public Criteria andEquipmentIdLessThanOrEqualTo(String value) {
      addCriterion("EQUIPMENT_ID <=", value, "equipmentId");
      return (Criteria) this;
    }

    public Criteria andEquipmentIdLike(String value) {
      addCriterion("EQUIPMENT_ID like", value, "equipmentId");
      return (Criteria) this;
    }

    public Criteria andEquipmentIdNotLike(String value) {
      addCriterion("EQUIPMENT_ID not like", value, "equipmentId");
      return (Criteria) this;
    }

    public Criteria andEquipmentIdIn(List<String> values) {
      addCriterion("EQUIPMENT_ID in", values, "equipmentId");
      return (Criteria) this;
    }

    public Criteria andEquipmentIdNotIn(List<String> values) {
      addCriterion("EQUIPMENT_ID not in", values, "equipmentId");
      return (Criteria) this;
    }

    public Criteria andEquipmentIdBetween(String value1, String value2) {
      addCriterion("EQUIPMENT_ID between", value1, value2, "equipmentId");
      return (Criteria) this;
    }

    public Criteria andEquipmentIdNotBetween(String value1, String value2) {
      addCriterion("EQUIPMENT_ID not between", value1, value2, "equipmentId");
      return (Criteria) this;
    }

    public Criteria andEquipmentNameIsNull() {
      addCriterion("EQUIPMENT_NAME is null");
      return (Criteria) this;
    }

    public Criteria andEquipmentNameIsNotNull() {
      addCriterion("EQUIPMENT_NAME is not null");
      return (Criteria) this;
    }

    public Criteria andEquipmentNameEqualTo(String value) {
      addCriterion("EQUIPMENT_NAME =", value, "equipmentName");
      return (Criteria) this;
    }

    public Criteria andEquipmentNameNotEqualTo(String value) {
      addCriterion("EQUIPMENT_NAME <>", value, "equipmentName");
      return (Criteria) this;
    }

    public Criteria andEquipmentNameGreaterThan(String value) {
      addCriterion("EQUIPMENT_NAME >", value, "equipmentName");
      return (Criteria) this;
    }

    public Criteria andEquipmentNameGreaterThanOrEqualTo(String value) {
      addCriterion("EQUIPMENT_NAME >=", value, "equipmentName");
      return (Criteria) this;
    }

    public Criteria andEquipmentNameLessThan(String value) {
      addCriterion("EQUIPMENT_NAME <", value, "equipmentName");
      return (Criteria) this;
    }

    public Criteria andEquipmentNameLessThanOrEqualTo(String value) {
      addCriterion("EQUIPMENT_NAME <=", value, "equipmentName");
      return (Criteria) this;
    }

    public Criteria andEquipmentNameLike(String value) {
      addCriterion("EQUIPMENT_NAME like", value, "equipmentName");
      return (Criteria) this;
    }

    public Criteria andEquipmentNameNotLike(String value) {
      addCriterion("EQUIPMENT_NAME not like", value, "equipmentName");
      return (Criteria) this;
    }

    public Criteria andEquipmentNameIn(List<String> values) {
      addCriterion("EQUIPMENT_NAME in", values, "equipmentName");
      return (Criteria) this;
    }

    public Criteria andEquipmentNameNotIn(List<String> values) {
      addCriterion("EQUIPMENT_NAME not in", values, "equipmentName");
      return (Criteria) this;
    }

    public Criteria andEquipmentNameBetween(String value1, String value2) {
      addCriterion("EQUIPMENT_NAME between", value1, value2, "equipmentName");
      return (Criteria) this;
    }

    public Criteria andEquipmentNameNotBetween(String value1, String value2) {
      addCriterion("EQUIPMENT_NAME not between", value1, value2, "equipmentName");
      return (Criteria) this;
    }

    public Criteria andEquipmentTypeIsNull() {
      addCriterion("EQUIPMENT_TYPE is null");
      return (Criteria) this;
    }

    public Criteria andEquipmentTypeIsNotNull() {
      addCriterion("EQUIPMENT_TYPE is not null");
      return (Criteria) this;
    }

    public Criteria andEquipmentTypeEqualTo(String value) {
      addCriterion("EQUIPMENT_TYPE =", value, "equipmentType");
      return (Criteria) this;
    }

    public Criteria andEquipmentTypeNotEqualTo(String value) {
      addCriterion("EQUIPMENT_TYPE <>", value, "equipmentType");
      return (Criteria) this;
    }

    public Criteria andEquipmentTypeGreaterThan(String value) {
      addCriterion("EQUIPMENT_TYPE >", value, "equipmentType");
      return (Criteria) this;
    }

    public Criteria andEquipmentTypeGreaterThanOrEqualTo(String value) {
      addCriterion("EQUIPMENT_TYPE >=", value, "equipmentType");
      return (Criteria) this;
    }

    public Criteria andEquipmentTypeLessThan(String value) {
      addCriterion("EQUIPMENT_TYPE <", value, "equipmentType");
      return (Criteria) this;
    }

    public Criteria andEquipmentTypeLessThanOrEqualTo(String value) {
      addCriterion("EQUIPMENT_TYPE <=", value, "equipmentType");
      return (Criteria) this;
    }

    public Criteria andEquipmentTypeLike(String value) {
      addCriterion("EQUIPMENT_TYPE like", value, "equipmentType");
      return (Criteria) this;
    }

    public Criteria andEquipmentTypeNotLike(String value) {
      addCriterion("EQUIPMENT_TYPE not like", value, "equipmentType");
      return (Criteria) this;
    }

    public Criteria andEquipmentTypeIn(List<String> values) {
      addCriterion("EQUIPMENT_TYPE in", values, "equipmentType");
      return (Criteria) this;
    }

    public Criteria andEquipmentTypeNotIn(List<String> values) {
      addCriterion("EQUIPMENT_TYPE not in", values, "equipmentType");
      return (Criteria) this;
    }

    public Criteria andEquipmentTypeBetween(String value1, String value2) {
      addCriterion("EQUIPMENT_TYPE between", value1, value2, "equipmentType");
      return (Criteria) this;
    }

    public Criteria andEquipmentTypeNotBetween(String value1, String value2) {
      addCriterion("EQUIPMENT_TYPE not between", value1, value2, "equipmentType");
      return (Criteria) this;
    }

    public Criteria andEquipmentBrandIsNull() {
      addCriterion("EQUIPMENT_BRAND is null");
      return (Criteria) this;
    }

    public Criteria andEquipmentBrandIsNotNull() {
      addCriterion("EQUIPMENT_BRAND is not null");
      return (Criteria) this;
    }

    public Criteria andEquipmentBrandEqualTo(String value) {
      addCriterion("EQUIPMENT_BRAND =", value, "equipmentBrand");
      return (Criteria) this;
    }

    public Criteria andEquipmentBrandNotEqualTo(String value) {
      addCriterion("EQUIPMENT_BRAND <>", value, "equipmentBrand");
      return (Criteria) this;
    }

    public Criteria andEquipmentBrandGreaterThan(String value) {
      addCriterion("EQUIPMENT_BRAND >", value, "equipmentBrand");
      return (Criteria) this;
    }

    public Criteria andEquipmentBrandGreaterThanOrEqualTo(String value) {
      addCriterion("EQUIPMENT_BRAND >=", value, "equipmentBrand");
      return (Criteria) this;
    }

    public Criteria andEquipmentBrandLessThan(String value) {
      addCriterion("EQUIPMENT_BRAND <", value, "equipmentBrand");
      return (Criteria) this;
    }

    public Criteria andEquipmentBrandLessThanOrEqualTo(String value) {
      addCriterion("EQUIPMENT_BRAND <=", value, "equipmentBrand");
      return (Criteria) this;
    }

    public Criteria andEquipmentBrandLike(String value) {
      addCriterion("EQUIPMENT_BRAND like", value, "equipmentBrand");
      return (Criteria) this;
    }

    public Criteria andEquipmentBrandNotLike(String value) {
      addCriterion("EQUIPMENT_BRAND not like", value, "equipmentBrand");
      return (Criteria) this;
    }

    public Criteria andEquipmentBrandIn(List<String> values) {
      addCriterion("EQUIPMENT_BRAND in", values, "equipmentBrand");
      return (Criteria) this;
    }

    public Criteria andEquipmentBrandNotIn(List<String> values) {
      addCriterion("EQUIPMENT_BRAND not in", values, "equipmentBrand");
      return (Criteria) this;
    }

    public Criteria andEquipmentBrandBetween(String value1, String value2) {
      addCriterion("EQUIPMENT_BRAND between", value1, value2, "equipmentBrand");
      return (Criteria) this;
    }

    public Criteria andEquipmentBrandNotBetween(String value1, String value2) {
      addCriterion("EQUIPMENT_BRAND not between", value1, value2, "equipmentBrand");
      return (Criteria) this;
    }

    public Criteria andEquipmentModelIsNull() {
      addCriterion("EQUIPMENT_MODEL is null");
      return (Criteria) this;
    }

    public Criteria andEquipmentModelIsNotNull() {
      addCriterion("EQUIPMENT_MODEL is not null");
      return (Criteria) this;
    }

    public Criteria andEquipmentModelEqualTo(String value) {
      addCriterion("EQUIPMENT_MODEL =", value, "equipmentModel");
      return (Criteria) this;
    }

    public Criteria andEquipmentModelNotEqualTo(String value) {
      addCriterion("EQUIPMENT_MODEL <>", value, "equipmentModel");
      return (Criteria) this;
    }

    public Criteria andEquipmentModelGreaterThan(String value) {
      addCriterion("EQUIPMENT_MODEL >", value, "equipmentModel");
      return (Criteria) this;
    }

    public Criteria andEquipmentModelGreaterThanOrEqualTo(String value) {
      addCriterion("EQUIPMENT_MODEL >=", value, "equipmentModel");
      return (Criteria) this;
    }

    public Criteria andEquipmentModelLessThan(String value) {
      addCriterion("EQUIPMENT_MODEL <", value, "equipmentModel");
      return (Criteria) this;
    }

    public Criteria andEquipmentModelLessThanOrEqualTo(String value) {
      addCriterion("EQUIPMENT_MODEL <=", value, "equipmentModel");
      return (Criteria) this;
    }

    public Criteria andEquipmentModelLike(String value) {
      addCriterion("EQUIPMENT_MODEL like", value, "equipmentModel");
      return (Criteria) this;
    }

    public Criteria andEquipmentModelNotLike(String value) {
      addCriterion("EQUIPMENT_MODEL not like", value, "equipmentModel");
      return (Criteria) this;
    }

    public Criteria andEquipmentModelIn(List<String> values) {
      addCriterion("EQUIPMENT_MODEL in", values, "equipmentModel");
      return (Criteria) this;
    }

    public Criteria andEquipmentModelNotIn(List<String> values) {
      addCriterion("EQUIPMENT_MODEL not in", values, "equipmentModel");
      return (Criteria) this;
    }

    public Criteria andEquipmentModelBetween(String value1, String value2) {
      addCriterion("EQUIPMENT_MODEL between", value1, value2, "equipmentModel");
      return (Criteria) this;
    }

    public Criteria andEquipmentModelNotBetween(String value1, String value2) {
      addCriterion("EQUIPMENT_MODEL not between", value1, value2, "equipmentModel");
      return (Criteria) this;
    }

    public Criteria andEquipmentSecrecyIsNull() {
      addCriterion("EQUIPMENT_SECRECY is null");
      return (Criteria) this;
    }

    public Criteria andEquipmentSecrecyIsNotNull() {
      addCriterion("EQUIPMENT_SECRECY is not null");
      return (Criteria) this;
    }

    public Criteria andEquipmentSecrecyEqualTo(String value) {
      addCriterion("EQUIPMENT_SECRECY =", value, "equipmentSecrecy");
      return (Criteria) this;
    }

    public Criteria andEquipmentSecrecyNotEqualTo(String value) {
      addCriterion("EQUIPMENT_SECRECY <>", value, "equipmentSecrecy");
      return (Criteria) this;
    }

    public Criteria andEquipmentSecrecyGreaterThan(String value) {
      addCriterion("EQUIPMENT_SECRECY >", value, "equipmentSecrecy");
      return (Criteria) this;
    }

    public Criteria andEquipmentSecrecyGreaterThanOrEqualTo(String value) {
      addCriterion("EQUIPMENT_SECRECY >=", value, "equipmentSecrecy");
      return (Criteria) this;
    }

    public Criteria andEquipmentSecrecyLessThan(String value) {
      addCriterion("EQUIPMENT_SECRECY <", value, "equipmentSecrecy");
      return (Criteria) this;
    }

    public Criteria andEquipmentSecrecyLessThanOrEqualTo(String value) {
      addCriterion("EQUIPMENT_SECRECY <=", value, "equipmentSecrecy");
      return (Criteria) this;
    }

    public Criteria andEquipmentSecrecyLike(String value) {
      addCriterion("EQUIPMENT_SECRECY like", value, "equipmentSecrecy");
      return (Criteria) this;
    }

    public Criteria andEquipmentSecrecyNotLike(String value) {
      addCriterion("EQUIPMENT_SECRECY not like", value, "equipmentSecrecy");
      return (Criteria) this;
    }

    public Criteria andEquipmentSecrecyIn(List<String> values) {
      addCriterion("EQUIPMENT_SECRECY in", values, "equipmentSecrecy");
      return (Criteria) this;
    }

    public Criteria andEquipmentSecrecyNotIn(List<String> values) {
      addCriterion("EQUIPMENT_SECRECY not in", values, "equipmentSecrecy");
      return (Criteria) this;
    }

    public Criteria andEquipmentSecrecyBetween(String value1, String value2) {
      addCriterion("EQUIPMENT_SECRECY between", value1, value2, "equipmentSecrecy");
      return (Criteria) this;
    }

    public Criteria andEquipmentSecrecyNotBetween(String value1, String value2) {
      addCriterion("EQUIPMENT_SECRECY not between", value1, value2, "equipmentSecrecy");
      return (Criteria) this;
    }

    public Criteria andEquipmentIpIsNull() {
      addCriterion("EQUIPMENT_IP is null");
      return (Criteria) this;
    }

    public Criteria andEquipmentIpIsNotNull() {
      addCriterion("EQUIPMENT_IP is not null");
      return (Criteria) this;
    }

    public Criteria andEquipmentIpEqualTo(String value) {
      addCriterion("EQUIPMENT_IP =", value, "equipmentIp");
      return (Criteria) this;
    }

    public Criteria andEquipmentIpNotEqualTo(String value) {
      addCriterion("EQUIPMENT_IP <>", value, "equipmentIp");
      return (Criteria) this;
    }

    public Criteria andEquipmentIpGreaterThan(String value) {
      addCriterion("EQUIPMENT_IP >", value, "equipmentIp");
      return (Criteria) this;
    }

    public Criteria andEquipmentIpGreaterThanOrEqualTo(String value) {
      addCriterion("EQUIPMENT_IP >=", value, "equipmentIp");
      return (Criteria) this;
    }

    public Criteria andEquipmentIpLessThan(String value) {
      addCriterion("EQUIPMENT_IP <", value, "equipmentIp");
      return (Criteria) this;
    }

    public Criteria andEquipmentIpLessThanOrEqualTo(String value) {
      addCriterion("EQUIPMENT_IP <=", value, "equipmentIp");
      return (Criteria) this;
    }

    public Criteria andEquipmentIpLike(String value) {
      addCriterion("EQUIPMENT_IP like", value, "equipmentIp");
      return (Criteria) this;
    }

    public Criteria andEquipmentIpNotLike(String value) {
      addCriterion("EQUIPMENT_IP not like", value, "equipmentIp");
      return (Criteria) this;
    }

    public Criteria andEquipmentIpIn(List<String> values) {
      addCriterion("EQUIPMENT_IP in", values, "equipmentIp");
      return (Criteria) this;
    }

    public Criteria andEquipmentIpNotIn(List<String> values) {
      addCriterion("EQUIPMENT_IP not in", values, "equipmentIp");
      return (Criteria) this;
    }

    public Criteria andEquipmentIpBetween(String value1, String value2) {
      addCriterion("EQUIPMENT_IP between", value1, value2, "equipmentIp");
      return (Criteria) this;
    }

    public Criteria andEquipmentIpNotBetween(String value1, String value2) {
      addCriterion("EQUIPMENT_IP not between", value1, value2, "equipmentIp");
      return (Criteria) this;
    }

    public Criteria andEquipmentMacIsNull() {
      addCriterion("EQUIPMENT_MAC is null");
      return (Criteria) this;
    }

    public Criteria andEquipmentMacIsNotNull() {
      addCriterion("EQUIPMENT_MAC is not null");
      return (Criteria) this;
    }

    public Criteria andEquipmentMacEqualTo(String value) {
      addCriterion("EQUIPMENT_MAC =", value, "equipmentMac");
      return (Criteria) this;
    }

    public Criteria andEquipmentMacNotEqualTo(String value) {
      addCriterion("EQUIPMENT_MAC <>", value, "equipmentMac");
      return (Criteria) this;
    }

    public Criteria andEquipmentMacGreaterThan(String value) {
      addCriterion("EQUIPMENT_MAC >", value, "equipmentMac");
      return (Criteria) this;
    }

    public Criteria andEquipmentMacGreaterThanOrEqualTo(String value) {
      addCriterion("EQUIPMENT_MAC >=", value, "equipmentMac");
      return (Criteria) this;
    }

    public Criteria andEquipmentMacLessThan(String value) {
      addCriterion("EQUIPMENT_MAC <", value, "equipmentMac");
      return (Criteria) this;
    }

    public Criteria andEquipmentMacLessThanOrEqualTo(String value) {
      addCriterion("EQUIPMENT_MAC <=", value, "equipmentMac");
      return (Criteria) this;
    }

    public Criteria andEquipmentMacLike(String value) {
      addCriterion("EQUIPMENT_MAC like", value, "equipmentMac");
      return (Criteria) this;
    }

    public Criteria andEquipmentMacNotLike(String value) {
      addCriterion("EQUIPMENT_MAC not like", value, "equipmentMac");
      return (Criteria) this;
    }

    public Criteria andEquipmentMacIn(List<String> values) {
      addCriterion("EQUIPMENT_MAC in", values, "equipmentMac");
      return (Criteria) this;
    }

    public Criteria andEquipmentMacNotIn(List<String> values) {
      addCriterion("EQUIPMENT_MAC not in", values, "equipmentMac");
      return (Criteria) this;
    }

    public Criteria andEquipmentMacBetween(String value1, String value2) {
      addCriterion("EQUIPMENT_MAC between", value1, value2, "equipmentMac");
      return (Criteria) this;
    }

    public Criteria andEquipmentMacNotBetween(String value1, String value2) {
      addCriterion("EQUIPMENT_MAC not between", value1, value2, "equipmentMac");
      return (Criteria) this;
    }

    public Criteria andEquipmentSnIsNull() {
      addCriterion("EQUIPMENT_SN is null");
      return (Criteria) this;
    }

    public Criteria andEquipmentSnIsNotNull() {
      addCriterion("EQUIPMENT_SN is not null");
      return (Criteria) this;
    }

    public Criteria andEquipmentSnEqualTo(String value) {
      addCriterion("EQUIPMENT_SN =", value, "equipmentSn");
      return (Criteria) this;
    }

    public Criteria andEquipmentSnNotEqualTo(String value) {
      addCriterion("EQUIPMENT_SN <>", value, "equipmentSn");
      return (Criteria) this;
    }

    public Criteria andEquipmentSnGreaterThan(String value) {
      addCriterion("EQUIPMENT_SN >", value, "equipmentSn");
      return (Criteria) this;
    }

    public Criteria andEquipmentSnGreaterThanOrEqualTo(String value) {
      addCriterion("EQUIPMENT_SN >=", value, "equipmentSn");
      return (Criteria) this;
    }

    public Criteria andEquipmentSnLessThan(String value) {
      addCriterion("EQUIPMENT_SN <", value, "equipmentSn");
      return (Criteria) this;
    }

    public Criteria andEquipmentSnLessThanOrEqualTo(String value) {
      addCriterion("EQUIPMENT_SN <=", value, "equipmentSn");
      return (Criteria) this;
    }

    public Criteria andEquipmentSnLike(String value) {
      addCriterion("EQUIPMENT_SN like", value, "equipmentSn");
      return (Criteria) this;
    }

    public Criteria andEquipmentSnNotLike(String value) {
      addCriterion("EQUIPMENT_SN not like", value, "equipmentSn");
      return (Criteria) this;
    }

    public Criteria andEquipmentSnIn(List<String> values) {
      addCriterion("EQUIPMENT_SN in", values, "equipmentSn");
      return (Criteria) this;
    }

    public Criteria andEquipmentSnNotIn(List<String> values) {
      addCriterion("EQUIPMENT_SN not in", values, "equipmentSn");
      return (Criteria) this;
    }

    public Criteria andEquipmentSnBetween(String value1, String value2) {
      addCriterion("EQUIPMENT_SN between", value1, value2, "equipmentSn");
      return (Criteria) this;
    }

    public Criteria andEquipmentSnNotBetween(String value1, String value2) {
      addCriterion("EQUIPMENT_SN not between", value1, value2, "equipmentSn");
      return (Criteria) this;
    }

    public Criteria andEquipmentStatusIsNull() {
      addCriterion("EQUIPMENT_STATUS is null");
      return (Criteria) this;
    }

    public Criteria andEquipmentStatusIsNotNull() {
      addCriterion("EQUIPMENT_STATUS is not null");
      return (Criteria) this;
    }

    public Criteria andEquipmentStatusEqualTo(Integer value) {
      addCriterion("EQUIPMENT_STATUS =", value, "equipmentStatus");
      return (Criteria) this;
    }

    public Criteria andEquipmentStatusNotEqualTo(Integer value) {
      addCriterion("EQUIPMENT_STATUS <>", value, "equipmentStatus");
      return (Criteria) this;
    }

    public Criteria andEquipmentStatusGreaterThan(Integer value) {
      addCriterion("EQUIPMENT_STATUS >", value, "equipmentStatus");
      return (Criteria) this;
    }

    public Criteria andEquipmentStatusGreaterThanOrEqualTo(Integer value) {
      addCriterion("EQUIPMENT_STATUS >=", value, "equipmentStatus");
      return (Criteria) this;
    }

    public Criteria andEquipmentStatusLessThan(Integer value) {
      addCriterion("EQUIPMENT_STATUS <", value, "equipmentStatus");
      return (Criteria) this;
    }

    public Criteria andEquipmentStatusLessThanOrEqualTo(Integer value) {
      addCriterion("EQUIPMENT_STATUS <=", value, "equipmentStatus");
      return (Criteria) this;
    }

    public Criteria andEquipmentStatusIn(List<Integer> values) {
      addCriterion("EQUIPMENT_STATUS in", values, "equipmentStatus");
      return (Criteria) this;
    }

    public Criteria andEquipmentStatusNotIn(List<Integer> values) {
      addCriterion("EQUIPMENT_STATUS not in", values, "equipmentStatus");
      return (Criteria) this;
    }

    public Criteria andEquipmentStatusBetween(Integer value1, Integer value2) {
      addCriterion("EQUIPMENT_STATUS between", value1, value2, "equipmentStatus");
      return (Criteria) this;
    }

    public Criteria andEquipmentStatusNotBetween(Integer value1, Integer value2) {
      addCriterion("EQUIPMENT_STATUS not between", value1, value2, "equipmentStatus");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationDateIsNull() {
      addCriterion("EQUIPMENT_REGISTRATION_DATE is null");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationDateIsNotNull() {
      addCriterion("EQUIPMENT_REGISTRATION_DATE is not null");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationDateEqualTo(Date value) {
      addCriterion("EQUIPMENT_REGISTRATION_DATE =", value, "equipmentRegistrationDate");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationDateNotEqualTo(Date value) {
      addCriterion("EQUIPMENT_REGISTRATION_DATE <>", value, "equipmentRegistrationDate");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationDateGreaterThan(Date value) {
      addCriterion("EQUIPMENT_REGISTRATION_DATE >", value, "equipmentRegistrationDate");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationDateGreaterThanOrEqualTo(Date value) {
      addCriterion("EQUIPMENT_REGISTRATION_DATE >=", value, "equipmentRegistrationDate");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationDateLessThan(Date value) {
      addCriterion("EQUIPMENT_REGISTRATION_DATE <", value, "equipmentRegistrationDate");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationDateLessThanOrEqualTo(Date value) {
      addCriterion("EQUIPMENT_REGISTRATION_DATE <=", value, "equipmentRegistrationDate");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationDateIn(List<Date> values) {
      addCriterion("EQUIPMENT_REGISTRATION_DATE in", values, "equipmentRegistrationDate");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationDateNotIn(List<Date> values) {
      addCriterion("EQUIPMENT_REGISTRATION_DATE not in", values, "equipmentRegistrationDate");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationDateBetween(Date value1, Date value2) {
      addCriterion("EQUIPMENT_REGISTRATION_DATE between", value1, value2, "equipmentRegistrationDate");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationDateNotBetween(Date value1, Date value2) {
      addCriterion("EQUIPMENT_REGISTRATION_DATE not between", value1, value2, "equipmentRegistrationDate");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationReasonIsNull() {
      addCriterion("EQUIPMENT_REGISTRATION_REASON is null");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationReasonIsNotNull() {
      addCriterion("EQUIPMENT_REGISTRATION_REASON is not null");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationReasonEqualTo(String value) {
      addCriterion("EQUIPMENT_REGISTRATION_REASON =", value, "equipmentRegistrationReason");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationReasonNotEqualTo(String value) {
      addCriterion("EQUIPMENT_REGISTRATION_REASON <>", value, "equipmentRegistrationReason");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationReasonGreaterThan(String value) {
      addCriterion("EQUIPMENT_REGISTRATION_REASON >", value, "equipmentRegistrationReason");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationReasonGreaterThanOrEqualTo(String value) {
      addCriterion("EQUIPMENT_REGISTRATION_REASON >=", value, "equipmentRegistrationReason");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationReasonLessThan(String value) {
      addCriterion("EQUIPMENT_REGISTRATION_REASON <", value, "equipmentRegistrationReason");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationReasonLessThanOrEqualTo(String value) {
      addCriterion("EQUIPMENT_REGISTRATION_REASON <=", value, "equipmentRegistrationReason");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationReasonLike(String value) {
      addCriterion("EQUIPMENT_REGISTRATION_REASON like", value, "equipmentRegistrationReason");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationReasonNotLike(String value) {
      addCriterion("EQUIPMENT_REGISTRATION_REASON not like", value, "equipmentRegistrationReason");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationReasonIn(List<String> values) {
      addCriterion("EQUIPMENT_REGISTRATION_REASON in", values, "equipmentRegistrationReason");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationReasonNotIn(List<String> values) {
      addCriterion("EQUIPMENT_REGISTRATION_REASON not in", values, "equipmentRegistrationReason");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationReasonBetween(String value1, String value2) {
      addCriterion("EQUIPMENT_REGISTRATION_REASON between", value1, value2, "equipmentRegistrationReason");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationReasonNotBetween(String value1, String value2) {
      addCriterion("EQUIPMENT_REGISTRATION_REASON not between", value1, value2, "equipmentRegistrationReason");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationNoteIsNull() {
      addCriterion("EQUIPMENT_REGISTRATION_NOTE is null");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationNoteIsNotNull() {
      addCriterion("EQUIPMENT_REGISTRATION_NOTE is not null");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationNoteEqualTo(String value) {
      addCriterion("EQUIPMENT_REGISTRATION_NOTE =", value, "equipmentRegistrationNote");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationNoteNotEqualTo(String value) {
      addCriterion("EQUIPMENT_REGISTRATION_NOTE <>", value, "equipmentRegistrationNote");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationNoteGreaterThan(String value) {
      addCriterion("EQUIPMENT_REGISTRATION_NOTE >", value, "equipmentRegistrationNote");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationNoteGreaterThanOrEqualTo(String value) {
      addCriterion("EQUIPMENT_REGISTRATION_NOTE >=", value, "equipmentRegistrationNote");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationNoteLessThan(String value) {
      addCriterion("EQUIPMENT_REGISTRATION_NOTE <", value, "equipmentRegistrationNote");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationNoteLessThanOrEqualTo(String value) {
      addCriterion("EQUIPMENT_REGISTRATION_NOTE <=", value, "equipmentRegistrationNote");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationNoteLike(String value) {
      addCriterion("EQUIPMENT_REGISTRATION_NOTE like", value, "equipmentRegistrationNote");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationNoteNotLike(String value) {
      addCriterion("EQUIPMENT_REGISTRATION_NOTE not like", value, "equipmentRegistrationNote");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationNoteIn(List<String> values) {
      addCriterion("EQUIPMENT_REGISTRATION_NOTE in", values, "equipmentRegistrationNote");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationNoteNotIn(List<String> values) {
      addCriterion("EQUIPMENT_REGISTRATION_NOTE not in", values, "equipmentRegistrationNote");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationNoteBetween(String value1, String value2) {
      addCriterion("EQUIPMENT_REGISTRATION_NOTE between", value1, value2, "equipmentRegistrationNote");
      return (Criteria) this;
    }

    public Criteria andEquipmentRegistrationNoteNotBetween(String value1, String value2) {
      addCriterion("EQUIPMENT_REGISTRATION_NOTE not between", value1, value2, "equipmentRegistrationNote");
      return (Criteria) this;
    }

    public Criteria andEquipmentNoteIsNull() {
      addCriterion("EQUIPMENT_NOTE is null");
      return (Criteria) this;
    }

    public Criteria andEquipmentNoteIsNotNull() {
      addCriterion("EQUIPMENT_NOTE is not null");
      return (Criteria) this;
    }

    public Criteria andEquipmentNoteEqualTo(String value) {
      addCriterion("EQUIPMENT_NOTE =", value, "equipmentNote");
      return (Criteria) this;
    }

    public Criteria andEquipmentNoteNotEqualTo(String value) {
      addCriterion("EQUIPMENT_NOTE <>", value, "equipmentNote");
      return (Criteria) this;
    }

    public Criteria andEquipmentNoteGreaterThan(String value) {
      addCriterion("EQUIPMENT_NOTE >", value, "equipmentNote");
      return (Criteria) this;
    }

    public Criteria andEquipmentNoteGreaterThanOrEqualTo(String value) {
      addCriterion("EQUIPMENT_NOTE >=", value, "equipmentNote");
      return (Criteria) this;
    }

    public Criteria andEquipmentNoteLessThan(String value) {
      addCriterion("EQUIPMENT_NOTE <", value, "equipmentNote");
      return (Criteria) this;
    }

    public Criteria andEquipmentNoteLessThanOrEqualTo(String value) {
      addCriterion("EQUIPMENT_NOTE <=", value, "equipmentNote");
      return (Criteria) this;
    }

    public Criteria andEquipmentNoteLike(String value) {
      addCriterion("EQUIPMENT_NOTE like", value, "equipmentNote");
      return (Criteria) this;
    }

    public Criteria andEquipmentNoteNotLike(String value) {
      addCriterion("EQUIPMENT_NOTE not like", value, "equipmentNote");
      return (Criteria) this;
    }

    public Criteria andEquipmentNoteIn(List<String> values) {
      addCriterion("EQUIPMENT_NOTE in", values, "equipmentNote");
      return (Criteria) this;
    }

    public Criteria andEquipmentNoteNotIn(List<String> values) {
      addCriterion("EQUIPMENT_NOTE not in", values, "equipmentNote");
      return (Criteria) this;
    }

    public Criteria andEquipmentNoteBetween(String value1, String value2) {
      addCriterion("EQUIPMENT_NOTE between", value1, value2, "equipmentNote");
      return (Criteria) this;
    }

    public Criteria andEquipmentNoteNotBetween(String value1, String value2) {
      addCriterion("EQUIPMENT_NOTE not between", value1, value2, "equipmentNote");
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
