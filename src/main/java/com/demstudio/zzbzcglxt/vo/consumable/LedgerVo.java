package com.demstudio.zzbzcglxt.vo.consumable;

import com.demstudio.zzbzcglxt.domain.Ledger;

import java.util.Date;

public class LedgerVo extends Ledger {

    private String consumableName;

    private String userName;

    public LedgerVo() {
        super();
    }

    public LedgerVo(String ledgerId, String ledgerConsumable, Integer ledgerCount, String ledgerPerson, String ledgerUnit, Date ledgerTime, String ledgerUser, Integer ledgerType, String consumableName, String userName) {
        super(ledgerId, ledgerConsumable, ledgerCount, ledgerPerson, ledgerUnit, ledgerTime, ledgerUser, ledgerType);
        this.consumableName = consumableName;
        this.userName = userName;
    }

    public String getConsumableName() {
        return consumableName;
    }

    public void setConsumableName(String consumableName) {
        this.consumableName = consumableName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
