package com.demstudio.zzbzcglxt.service.equipment;

import com.demstudio.zzbzcglxt.domain.Equipment;
import com.demstudio.zzbzcglxt.domain.EquipmentExample;
import com.demstudio.zzbzcglxt.vo.equipment.EquipmentVo;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;

public interface EquipmentService {

    PageResult searchPage(PageRequest pageRequest, EquipmentExample example);

    Equipment info(String equipmentId);

    boolean edit(Equipment equipment);

    EquipmentVo admin(String equipmentId);

    boolean delete(String equipmentId);

    Boolean checkEquipmentName(Equipment equipment);
}
