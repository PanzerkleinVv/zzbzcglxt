package com.demstudio.zzbzcglxt.service.consumable;

import com.demstudio.zzbzcglxt.domain.Consumable;
import com.demstudio.zzbzcglxt.domain.ConsumableExample;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;
import com.demstudio.zzbzcglxt.vo.consumable.ConsumableVo;

import java.util.List;

public interface ConsumableService {
    PageResult searchPage(PageRequest pageRequest, ConsumableExample example);

    boolean edit(Consumable consumable);

    List<Consumable> list();

    boolean change(Consumable consumable);

    Consumable selectByPackageId(String consumableId);
}
