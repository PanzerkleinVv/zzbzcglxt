package com.demstudio.zzbzcglxt.vo.statistics;

public class LogStatistics {

    private String typeName;

    private Integer lend;

    private Integer back;

    private Integer repair;

    private Integer abandon;

    private Integer move;

    private Integer give;

    public LogStatistics() {
    }

    public LogStatistics(String typeName, Integer lend, Integer back, Integer repair, Integer abandon, Integer move, Integer give) {
        this.typeName = typeName;
        this.lend = lend;
        this.back = back;
        this.repair = repair;
        this.abandon = abandon;
        this.move = move;
        this.give = give;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getLend() {
        return lend;
    }

    public void setLend(Integer lend) {
        this.lend = lend;
    }

    public Integer getBack() {
        return back;
    }

    public void setBack(Integer back) {
        this.back = back;
    }

    public Integer getRepair() {
        return repair;
    }

    public void setRepair(Integer repair) {
        this.repair = repair;
    }

    public Integer getAbandon() {
        return abandon;
    }

    public void setAbandon(Integer abandon) {
        this.abandon = abandon;
    }

    public Integer getMove() {
        return move;
    }

    public void setMove(Integer move) {
        this.move = move;
    }

    public Integer getGive() {
        return give;
    }

    public void setGive(Integer give) {
        this.give = give;
    }
}
