package com.demstudio.zzbzcglxt.biz;

import com.demstudio.zzbzcglxt.domain.Consumable;
import com.demstudio.zzbzcglxt.domain.ConsumableExample;
import com.demstudio.zzbzcglxt.domain.Ledger;
import com.demstudio.zzbzcglxt.domain.LedgerExample;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;

import java.util.List;

public interface ConsumableBiz {
    PageResult consumablePage(PageRequest pageRequest, ConsumableExample example);

    Consumable getConsumable(String consumableId);

    boolean setConsumable(Consumable consumable);

    List<Consumable> list();

    PageResult ledgerPage(PageRequest pageRequest, LedgerExample example);

    boolean newLedger(Ledger ledger, Integer subCount);
}
