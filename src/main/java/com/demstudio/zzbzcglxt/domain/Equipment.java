package com.demstudio.zzbzcglxt.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Equipment {
  private String equipmentId;

  private String equipmentName;

  private String equipmentType;

  private String equipmentBrand;

  private String equipmentModel;

  private String equipmentSecrecy;

  private Integer equipmentIp;

  private String equipmentMac;

  private String equipmentSn;

  private Integer equipmentStatus;

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date equipmentRegistrationDate;

  private String equipmentRegistrationReason;

  private String equipmentRegistrationNote;

  private String equipmentNote;

  public Equipment(String equipmentId, String equipmentName, String equipmentType, String equipmentBrand, String equipmentModel, String equipmentSecrecy, Integer equipmentIp, String equipmentMac, String equipmentSn, Integer equipmentStatus, Date equipmentRegistrationDate, String equipmentRegistrationReason, String equipmentRegistrationNote, String equipmentNote) {
    this.equipmentId = equipmentId;
    this.equipmentName = equipmentName;
    this.equipmentType = equipmentType;
    this.equipmentBrand = equipmentBrand;
    this.equipmentModel = equipmentModel;
    this.equipmentSecrecy = equipmentSecrecy;
    this.equipmentIp = equipmentIp;
    this.equipmentMac = equipmentMac;
    this.equipmentSn = equipmentSn;
    this.equipmentStatus = equipmentStatus;
    this.equipmentRegistrationDate = equipmentRegistrationDate;
    this.equipmentRegistrationReason = equipmentRegistrationReason;
    this.equipmentRegistrationNote = equipmentRegistrationNote;
    this.equipmentNote = equipmentNote;
  }

  public Equipment() {
    super();
  }

  public String getEquipmentId() {
    return equipmentId;
  }

  public void setEquipmentId(String equipmentId) {
    this.equipmentId = equipmentId == null ? null : equipmentId.trim();
  }

  public String getEquipmentName() {
    return equipmentName;
  }

  public void setEquipmentName(String equipmentName) {
    this.equipmentName = equipmentName == null ? null : equipmentName.trim();
  }

  public String getEquipmentType() {
    return equipmentType;
  }

  public void setEquipmentType(String equipmentType) {
    this.equipmentType = equipmentType == null ? null : equipmentType.trim();
  }

  public String getEquipmentBrand() {
    return equipmentBrand;
  }

  public void setEquipmentBrand(String equipmentBrand) {
    this.equipmentBrand = equipmentBrand == null ? null : equipmentBrand.trim();
  }

  public String getEquipmentModel() {
    return equipmentModel;
  }

  public void setEquipmentModel(String equipmentModel) {
    this.equipmentModel = equipmentModel == null ? null : equipmentModel.trim();
  }

  public String getEquipmentSecrecy() {
    return equipmentSecrecy;
  }

  public void setEquipmentSecrecy(String equipmentSecrecy) {
    this.equipmentSecrecy = equipmentSecrecy == null ? null : equipmentSecrecy.trim();
  }

  public Integer getEquipmentIp() {
    return equipmentIp;
  }

  public void setEquipmentIp(Integer equipmentIp) {
    this.equipmentIp = equipmentIp;
  }

  public String getEquipmentMac() {
    return equipmentMac;
  }

  public void setEquipmentMac(String equipmentMac) {
    this.equipmentMac = equipmentMac == null ? null : equipmentMac.trim();
  }

  public String getEquipmentSn() {
    return equipmentSn;
  }

  public void setEquipmentSn(String equipmentSn) {
    this.equipmentSn = equipmentSn == null ? null : equipmentSn.trim();
  }

  public Integer getEquipmentStatus() {
    return equipmentStatus;
  }

  public void setEquipmentStatus(Integer equipmentStatus) {
    this.equipmentStatus = equipmentStatus;
  }

  public Date getEquipmentRegistrationDate() {
    return equipmentRegistrationDate;
  }

  public void setEquipmentRegistrationDate(Date equipmentRegistrationDate) {
    this.equipmentRegistrationDate = equipmentRegistrationDate;
  }

  public String getEquipmentRegistrationReason() {
    return equipmentRegistrationReason;
  }

  public void setEquipmentRegistrationReason(String equipmentRegistrationReason) {
    this.equipmentRegistrationReason = equipmentRegistrationReason == null ? null : equipmentRegistrationReason.trim();
  }

  public String getEquipmentRegistrationNote() {
    return equipmentRegistrationNote;
  }

  public void setEquipmentRegistrationNote(String equipmentRegistrationNote) {
    this.equipmentRegistrationNote = equipmentRegistrationNote == null ? null : equipmentRegistrationNote.trim();
  }

  public String getEquipmentNote() {
    return equipmentNote;
  }

  public void setEquipmentNote(String equipmentNote) {
    this.equipmentNote = equipmentNote == null ? null : equipmentNote.trim();
  }

  public EquipmentExample toExample() {
    EquipmentExample example = new EquipmentExample();
    EquipmentExample.Criteria criteria = example.createCriteria();
    if (equipmentName != null && !"".equals(equipmentName)) {
      criteria.andEquipmentNameLike("%" + equipmentName + "%");
    }
    if (equipmentSn != null && !"".equals(equipmentSn)) {
      criteria.andEquipmentSnLike("%" + equipmentSn + "%");
    }
    if (equipmentMac != null && !"".equals(equipmentMac)) {
      criteria.andEquipmentMacLike("%" + equipmentMac + "%");
    }
    if (equipmentType != null && !"".equals(equipmentType)) {
      criteria.andEquipmentTypeEqualTo(equipmentType);
    }
    if (equipmentBrand != null && !"".equals(equipmentBrand)) {
      criteria.andEquipmentBrandEqualTo(equipmentBrand);
    }
    if (equipmentModel != null && !"".equals(equipmentModel)) {
      criteria.andEquipmentModelEqualTo(equipmentModel);
    }
    if (equipmentStatus != null && !(equipmentStatus == 5)) {
      criteria.andEquipmentStatusEqualTo(equipmentStatus);
    }
    example.setOrderByClause("EQUIPMENT_NAME ASC");
    return example;
  }
}
