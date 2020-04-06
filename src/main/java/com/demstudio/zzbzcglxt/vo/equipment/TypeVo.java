package com.demstudio.zzbzcglxt.vo.equipment;

import com.demstudio.zzbzcglxt.domain.Type;

public class TypeVo extends Type {

  private Long equipmentCount;

  public TypeVo() {

  }

  public TypeVo(String typeId, String typeName, Boolean typeBrand, Boolean typeModel, Boolean typeSecrecy, Boolean typeIp, Boolean typeMac, Boolean typeSn, Long equipmentCount) {
    super(typeId, typeName, typeBrand, typeModel, typeSecrecy, typeIp, typeMac, typeSn);
    this.equipmentCount = equipmentCount;
  }

  public TypeVo(Type type) {
    super(type);
  }

  public Long getEquipmentCount() {
    return equipmentCount;
  }

  public void setEquipmentCount(Long equipmentCount) {
    this.equipmentCount = equipmentCount;
  }
}
