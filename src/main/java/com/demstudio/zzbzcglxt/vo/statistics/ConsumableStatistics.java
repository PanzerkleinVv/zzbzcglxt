package com.demstudio.zzbzcglxt.vo.statistics;

public class ConsumableStatistics {

    private String consumableName;

    private Integer consumableCount;

    private String consumableUnit;

    public ConsumableStatistics() {
    }

    public ConsumableStatistics(String consumableName, Integer consumableCount, String consumableUnit) {
        this.consumableName = consumableName;
        this.consumableCount = consumableCount;
        this.consumableUnit = consumableUnit;
    }

    public String getConsumableName() {
        return consumableName;
    }

    public void setConsumableName(String consumableName) {
        this.consumableName = consumableName;
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
        this.consumableUnit = consumableUnit;
    }
}
