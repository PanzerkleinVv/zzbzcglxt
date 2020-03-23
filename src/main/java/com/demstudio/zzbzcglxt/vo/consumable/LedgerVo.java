package com.demstudio.zzbzcglxt.vo.consumable;

import com.demstudio.zzbzcglxt.domain.Ledger;

import java.util.Date;

public class LedgerVo extends Ledger {

    private String consumableName;

    private String consumableUnit;

    private String userName;

    public LedgerVo() {
        super();
    }

    public LedgerVo(String ledgerId, String ledgerConsumable, Integer ledgerCount, String ledgerPerson, String ledgerUnit, Date ledgerTime, String ledgerUser, Integer ledgerType, String consumableName, String consumableUnit, String userName) {
        super(ledgerId, ledgerConsumable, ledgerCount, ledgerPerson, ledgerUnit, ledgerTime, ledgerUser, ledgerType);
        this.consumableName = consumableName;
        this.consumableUnit = consumableUnit;
        this.userName = userName;
    }

    public String getConsumableName() {
        return consumableName;
    }

    public void setConsumableName(String consumableName) {
        this.consumableName = consumableName;
    }

    public String getConsumableUnit() {
        return consumableUnit;
    }

    public void setConsumableUnit(String consumableUnit) {
        this.consumableUnit = consumableUnit;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
