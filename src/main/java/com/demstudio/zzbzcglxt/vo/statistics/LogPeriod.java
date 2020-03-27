package com.demstudio.zzbzcglxt.vo.statistics;

public class LogPeriod {

    private String period;

    private Integer logYear;

    private Integer logMonth;

    public LogPeriod() {
    }

    public LogPeriod(String period, Integer logYear, Integer logMonth) {
        this.period = period;
        this.logYear = logYear;
        this.logMonth = logMonth;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Integer getLogYear() {
        return logYear;
    }

    public void setLogYear(Integer logYear) {
        this.logYear = logYear;
    }

    public Integer getLogMonth() {
        return logMonth;
    }

    public void setLogMonth(Integer logMonth) {
        this.logMonth = logMonth;
    }
}
