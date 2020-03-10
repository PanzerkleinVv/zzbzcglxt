package com.demstudio.zzbzcglxt.domain;

public class Brand {
    private String brandId;

    private String brandType;

    private String brandName;

    public Brand(String brandId, String brandType, String brandName) {
        this.brandId = brandId;
        this.brandType = brandType;
        this.brandName = brandName;
    }

    public Brand() {
        super();
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId == null ? null : brandId.trim();
    }

    public String getBrandType() {
        return brandType;
    }

    public void setBrandType(String brandType) {
        this.brandType = brandType == null ? null : brandType.trim();
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }
}