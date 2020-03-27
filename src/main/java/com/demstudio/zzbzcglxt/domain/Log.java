package com.demstudio.zzbzcglxt.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Log {
    private String logId;

    private String logEquipment;

    private String logUser;

    private Date logTime;

    private Integer logStatus;

    private String logTarget;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date logOperationDate;

    private String logNote;

    public Log(String logId, String logEquipment, String logUser, Date logTime, Integer logStatus, String logTarget, Date logOperationDate, String logNote) {
        this.logId = logId;
        this.logEquipment = logEquipment;
        this.logUser = logUser;
        this.logTime = logTime;
        this.logStatus = logStatus;
        this.logTarget = logTarget;
        this.logOperationDate = logOperationDate;
        this.logNote = logNote;
    }

    public Log() {
        super();
    }

    public Log(Log log) {
        this.logId = log.getLogId();
        this.logEquipment = log.getLogEquipment();
        this.logUser = log.getLogUser();
        this.logTime = log.getLogTime();
        this.logStatus = log.getLogStatus();
        this.logTarget = log.getLogTarget();
        this.logOperationDate = log.getLogOperationDate();
        this.logNote = log.getLogNote();
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId == null ? null : logId.trim();
    }

    public String getLogEquipment() {
        return logEquipment;
    }

    public void setLogEquipment(String logEquipment) {
        this.logEquipment = logEquipment == null ? null : logEquipment.trim();
    }

    public String getLogUser() {
        return logUser;
    }

    public void setLogUser(String logUser) {
        this.logUser = logUser == null ? null : logUser.trim();
    }

    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }

    public Integer getLogStatus() {
        return logStatus;
    }

    public void setLogStatus(Integer logStatus) {
        this.logStatus = logStatus;
    }

    public String getLogTarget() {
        return logTarget;
    }

    public void setLogTarget(String logTarget) {
        this.logTarget = logTarget == null ? null : logTarget.trim();
    }

    public Date getLogOperationDate() {
        return logOperationDate;
    }

    public void setLogOperationDate(Date logOperationDate) {
        this.logOperationDate = logOperationDate;
    }

    public String getLogNote() {
        return logNote;
    }

    public void setLogNote(String logNote) {
        this.logNote = logNote == null ? null : logNote.trim();
    }
}