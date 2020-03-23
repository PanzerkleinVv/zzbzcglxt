package com.demstudio.zzbzcglxt.vo.consumable;

import com.demstudio.zzbzcglxt.domain.Consumable;

import java.util.List;

public class ConsumableVo extends Consumable {

    private List<Consumable> subConsumable;

    public ConsumableVo() {
        super();
    }

    public ConsumableVo(String consumableId, String consumableName, Integer consumableCount, String consumableUnit, String packageId) {
        super(consumableId, consumableName, consumableCount, consumableUnit, packageId);
    }

    public List<Consumable> getSubConsumable() {
        return subConsumable;
    }

    public void setSubConsumable(List<Consumable> subConsumable) {
        this.subConsumable = subConsumable;
    }
}
