package com.demstudio.zzbzcglxt.domain;

public class Type {
    private String typeId;

    private String typeName;

    private Boolean typeBrand;

    private Boolean typeModel;

    private Boolean typeSecrecy;

    private Boolean typeIp;

    private Boolean typeMac;

    private Boolean typeSn;

    public Type(String typeId, String typeName, Boolean typeBrand, Boolean typeModel, Boolean typeSecrecy, Boolean typeIp, Boolean typeMac, Boolean typeSn) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.typeBrand = typeBrand;
        this.typeModel = typeModel;
        this.typeSecrecy = typeSecrecy;
        this.typeIp = typeIp;
        this.typeMac = typeMac;
        this.typeSn = typeSn;
    }

    public Type (Type type) {
        this.typeId = type.typeId;
        this.typeName = type.typeName;
        this.typeBrand = type.typeBrand;
        this.typeModel = type.typeModel;
        this.typeSecrecy = type.typeSecrecy;
        this.typeIp = type.typeIp;
        this.typeMac = type.typeMac;
        this.typeSn = type.typeSn;
    }

    public Type() {
        super();
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Boolean getTypeBrand() {
        return typeBrand;
    }

    public void setTypeBrand(Boolean typeBrand) {
        this.typeBrand = typeBrand;
    }

    public Boolean getTypeModel() {
        return typeModel;
    }

    public void setTypeModel(Boolean typeModel) {
        this.typeModel = typeModel;
    }

    public Boolean getTypeSecrecy() {
        return typeSecrecy;
    }

    public void setTypeSecrecy(Boolean typeSecrecy) {
        this.typeSecrecy = typeSecrecy;
    }

    public Boolean getTypeIp() {
        return typeIp;
    }

    public void setTypeIp(Boolean typeIp) {
        this.typeIp = typeIp;
    }

    public Boolean getTypeMac() {
        return typeMac;
    }

    public void setTypeMac(Boolean typeMac) {
        this.typeMac = typeMac;
    }

    public Boolean getTypeSn() {
        return typeSn;
    }

    public void setTypeSn(Boolean typeSn) {
        this.typeSn = typeSn;
    }
}