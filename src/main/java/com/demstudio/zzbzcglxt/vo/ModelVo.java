package com.demstudio.zzbzcglxt.vo;

import com.demstudio.zzbzcglxt.domain.Model;

public class ModelVo extends Model {

    private String brandName;

    private String typeName;

    private String brandType;

    private Long equipmentCount;

    public ModelVo() {
    }

    public ModelVo(String modelId, String modelBrand, String modelName, String brandType) {
        super(modelId, modelBrand, modelName);
        this.brandType = brandType;
    }

    public ModelVo(String modelId, String modelBrand, String modelName, String brandName, String typeName, Long equipmentCount) {
        super(modelId, modelBrand, modelName);
        this.brandName = brandName;
        this.typeName = typeName;
        this.equipmentCount = equipmentCount;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getBrandType() {
        return brandType;
    }

    public void setBrandType(String brandType) {
        this.brandType = brandType;
    }

    public Long getEquipmentCount() {
        return equipmentCount;
    }

    public void setEquipmentCount(Long equipmentCount) {
        this.equipmentCount = equipmentCount;
    }
}
