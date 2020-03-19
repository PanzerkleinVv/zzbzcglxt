package com.demstudio.zzbzcglxt.domain;

import java.util.Date;

public class Ledger {
    private String ledgerId;

    private String ledgerConsumable;

    private Integer ledgerCount;

    private String ledgerPerson;

    private String ledgerUnit;

    private Date ledgerTime;

    private String ledgerUser;

    private Integer ledgerType;

    public Ledger(String ledgerId, String ledgerConsumable, Integer ledgerCount, String ledgerPerson, String ledgerUnit, Date ledgerTime, String ledgerUser, Integer ledgerType) {
        this.ledgerId = ledgerId;
        this.ledgerConsumable = ledgerConsumable;
        this.ledgerCount = ledgerCount;
        this.ledgerPerson = ledgerPerson;
        this.ledgerUnit = ledgerUnit;
        this.ledgerTime = ledgerTime;
        this.ledgerUser = ledgerUser;
        this.ledgerType = ledgerType;
    }

    public Ledger() {
        super();
    }

    public String getLedgerId() {
        return ledgerId;
    }

    public void setLedgerId(String ledgerId) {
        this.ledgerId = ledgerId == null ? null : ledgerId.trim();
    }

    public String getLedgerConsumable() {
        return ledgerConsumable;
    }

    public void setLedgerConsumable(String ledgerConsumable) {
        this.ledgerConsumable = ledgerConsumable == null ? null : ledgerConsumable.trim();
    }

    public Integer getLedgerCount() {
        return ledgerCount;
    }

    public void setLedgerCount(Integer ledgerCount) {
        this.ledgerCount = ledgerCount;
    }

    public String getLedgerPerson() {
        return ledgerPerson;
    }

    public void setLedgerPerson(String ledgerPerson) {
        this.ledgerPerson = ledgerPerson == null ? null : ledgerPerson.trim();
    }

    public String getLedgerUnit() {
        return ledgerUnit;
    }

    public void setLedgerUnit(String ledgerUnit) {
        this.ledgerUnit = ledgerUnit == null ? null : ledgerUnit.trim();
    }

    public Date getLedgerTime() {
        return ledgerTime;
    }

    public void setLedgerTime(Date ledgerTime) {
        this.ledgerTime = ledgerTime;
    }

    public String getLedgerUser() {
        return ledgerUser;
    }

    public void setLedgerUser(String ledgerUser) {
        this.ledgerUser = ledgerUser == null ? null : ledgerUser.trim();
    }

    public Integer getLedgerType() {
        return ledgerType;
    }

    public void setLedgerType(Integer ledgerType) {
        this.ledgerType = ledgerType;
    }
}