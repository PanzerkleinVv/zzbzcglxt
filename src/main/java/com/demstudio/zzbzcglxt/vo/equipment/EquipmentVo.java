package com.demstudio.zzbzcglxt.vo.equipment;

import com.demstudio.zzbzcglxt.domain.Equipment;

import java.util.Date;

public class EquipmentVo extends Equipment {

    private String typeName;

    private String brandName;

    private String modelName;

    private String secrecyName;

    private String registrationReasonName;

    private String logTarget;

    public EquipmentVo() {
        super();
    }

    public EquipmentVo(String equipmentId, String equipmentName, String equipmentType, String equipmentBrand, String equipmentModel, String equipmentSecrecy, Integer equipmentIp, String equipmentMac, String equipmentSn, Integer equipmentStatus, Date equipmentRegistrationDate, String equipmentRegistrationReason, String equipmentRegistrationNote, String equipmentNote, String typeName, String brandName, String modelName, String secrecyName, String registrationReasonName, String logTarget) {
        super(equipmentId, equipmentName, equipmentType, equipmentBrand, equipmentModel, equipmentSecrecy, equipmentIp, equipmentMac, equipmentSn, equipmentStatus, equipmentRegistrationDate, equipmentRegistrationReason, equipmentRegistrationNote, equipmentNote);
        this.typeName = typeName;
        this.brandName = brandName;
        this.modelName = modelName;
        this.secrecyName = secrecyName;
        this.registrationReasonName = registrationReasonName;
        this.logTarget = logTarget;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getSecrecyName() {
        return secrecyName;
    }

    public void setSecrecyName(String secrecyName) {
        this.secrecyName = secrecyName;
    }

    public String getRegistrationReasonName() {
        return registrationReasonName;
    }

    public void setRegistrationReasonName(String registrationReasonName) {
        this.registrationReasonName = registrationReasonName;
    }

    public String getLogTarget() {
        return logTarget;
    }

    public void setLogTarget(String logTarget) {
        this.logTarget = logTarget;
    }
}
