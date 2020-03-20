package com.demstudio.zzbzcglxt.biz;

import com.demstudio.zzbzcglxt.domain.Consumable;
import com.demstudio.zzbzcglxt.domain.ConsumableExample;
import com.demstudio.zzbzcglxt.domain.Ledger;
import com.demstudio.zzbzcglxt.domain.LedgerExample;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;
import com.demstudio.zzbzcglxt.vo.consumable.ConsumableVo;

import java.util.List;

public interface ConsumableBiz {
    PageResult consumablePage(PageRequest pageRequest, ConsumableExample example);

    boolean setConsumable(Consumable consumable);

    List<Consumable> list();

    PageResult ledgerPage(PageRequest pageRequest, LedgerExample example);

    boolean newLedger(Ledger ledger, Integer subCount);
}
