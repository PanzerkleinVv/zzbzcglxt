package com.demstudio.zzbzcglxt.domain;

public class Consumable {
    private String consumableId;

    private String consumableName;

    private Integer consumableCount;

    private String consumableUnit;

    private String packageId;

    public Consumable(String consumableId, String consumableName, Integer consumableCount, String consumableUnit, String packageId) {
        this.consumableId = consumableId;
        this.consumableName = consumableName;
        this.consumableCount = consumableCount;
        this.consumableUnit = consumableUnit;
        this.packageId = packageId;
    }

    public Consumable() {
        super();
    }

    public String getConsumableId() {
        return consumableId;
    }

    public void setConsumableId(String consumableId) {
        this.consumableId = consumableId == null ? null : consumableId.trim();
    }

    public String getConsumableName() {
        return consumableName;
    }

    public void setConsumableName(String consumableName) {
        this.consumableName = consumableName == null ? null : consumableName.trim();
    }

    public Integer getConsumableCount() {
        return consumableCount;
    }

    public void setConsumableCount(Integer consumableCount) {
        this.consumableCount = consumableCount;
    }

    public String getConsumableUnit() {
        return consumableUnit;
    }

    public void setConsumableUnit(String consumableUnit) {
        this.consumableUnit = consumableUnit == null ? null : consumableUnit.trim();
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId == null ? null : packageId.trim();
    }
}