package com.demstudio.zzbzcglxt.service.consumable;

import com.demstudio.zzbzcglxt.domain.Ledger;
import com.demstudio.zzbzcglxt.domain.LedgerExample;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;

public interface LedgerService {
    PageResult searchPage(PageRequest pageRequest, LedgerExample example);

    boolean edit(Ledger ledger);
}
