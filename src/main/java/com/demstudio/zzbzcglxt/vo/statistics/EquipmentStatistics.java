package com.demstudio.zzbzcglxt.vo.statistics;

public class EquipmentStatistics {

    private String typeName;

    private Integer abandon;

    private Integer lend;

    private Integer keep;

    private Integer repair;

    private Integer give;

    private Integer unsure;

    private Integer total;

    public EquipmentStatistics() {
    }

    public EquipmentStatistics(String typeName, Integer abandon, Integer lend, Integer keep, Integer repair, Integer give, Integer unsure, Integer total) {
        this.typeName = typeName;
        this.abandon = abandon;
        this.lend = lend;
        this.keep = keep;
        this.repair = repair;
        this.give = give;
        this.unsure = unsure;
        this.total = total;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getAbandon() {
        return abandon;
    }

    public void setAbandon(Integer abandon) {
        this.abandon = abandon;
    }

    public Integer getLend() {
        return lend;
    }

    public void setLend(Integer lend) {
        this.lend = lend;
    }

    public Integer getKeep() {
        return keep;
    }

    public void setKeep(Integer keep) {
        this.keep = keep;
    }

    public Integer getRepair() {
        return repair;
    }

    public void setRepair(Integer repair) {
        this.repair = repair;
    }

    public Integer getGive() {
        return give;
    }

    public void setGive(Integer give) {
        this.give = give;
    }

    public Integer getUnsure() {
        return unsure;
    }

    public void setUnsure(Integer unsure) {
        this.unsure = unsure;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
