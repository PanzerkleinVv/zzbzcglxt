package com.demstudio.zzbzcglxt.biz.impl;

import com.demstudio.zzbzcglxt.biz.ConsumableBiz;
import com.demstudio.zzbzcglxt.domain.Consumable;
import com.demstudio.zzbzcglxt.domain.ConsumableExample;
import com.demstudio.zzbzcglxt.domain.Ledger;
import com.demstudio.zzbzcglxt.domain.LedgerExample;
import com.demstudio.zzbzcglxt.service.consumable.ConsumableService;
import com.demstudio.zzbzcglxt.service.consumable.LedgerService;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ConsumableBizImpl implements ConsumableBiz {

    @Resource
    private ConsumableService consumableService;

    @Resource
    private LedgerService ledgerService;

    @Override
    public PageResult consumablePage(PageRequest pageRequest, ConsumableExample example) {
        return consumableService.searchPage(pageRequest, example);
    }

    @Override
    public boolean setConsumable(Consumable consumable) {
        return consumableService.edit(consumable);
    }

    @Override
    public List<Consumable> list() {
        return consumableService.list();
    }

    @Override
    public PageResult ledgerPage(PageRequest pageRequest, LedgerExample example) {
        return ledgerService.searchPage(pageRequest, example);
    }

    @Override
    public boolean newLedger(Ledger ledger, Integer subCount) {
        Consumable consumable = new Consumable();
        consumable.setConsumableId(ledger.getLedgerConsumable());
        switch (ledger.getLedgerType()) {
            case 0:
            case 1:
                consumable.setConsumableCount(ledger.getLedgerCount());
                if (consumableService.change(consumable)) {
                    return ledgerService.edit(ledger);
                }
                return false;
            case 2:
                consumable.setConsumableCount(-ledger.getLedgerCount());
                if (consumableService.change(consumable)) {
                    return ledgerService.edit(ledger);
                }
                return false;
            case 3:
                consumable.setConsumableCount(-ledger.getLedgerCount());
                if (consumableService.change(consumable)) {
                    Consumable subConsumable = consumableService.selectByPackageId(consumable.getConsumableId());
                    subConsumable.setConsumableCount(subCount * ledger.getLedgerCount());
                    if (ledgerService.edit(ledger) && consumableService.change(subConsumable)) {
                        ledger.setLedgerConsumable(subConsumable.getConsumableId());
                        ledger.setLedgerCount(subCount * ledger.getLedgerCount());
                        ledger.setLedgerType(0);
                        return ledgerService.edit(ledger);
                    }
                }
                return false;
        }
        return false;
    }
}
