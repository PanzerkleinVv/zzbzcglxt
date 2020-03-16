package com.demstudio.zzbzcglxt.vo;

import com.demstudio.zzbzcglxt.domain.Brand;

public class BrandVo extends Brand {

    private Long equipmentCount;

    private String typeName;

    public BrandVo(String brandId, String brandType, String brandName, String typeName, Long equipmentCount) {
        super(brandId, brandType, brandName);
        this.equipmentCount = equipmentCount;
        this.typeName = typeName;
    }

    public BrandVo() {
        super();
    }

    public Long getEquipmentCount() {
        return equipmentCount;
    }

    public void setEquipmentCount(Long equipmentCount) {
        this.equipmentCount = equipmentCount;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
