package com.demstudio.zzbzcglxt.biz.impl;

import com.demstudio.zzbzcglxt.biz.EquipmentBiz;
import com.demstudio.zzbzcglxt.domain.Equipment;
import com.demstudio.zzbzcglxt.domain.Log;
import com.demstudio.zzbzcglxt.service.equipment.EquipmentService;
import com.demstudio.zzbzcglxt.service.equipment.LogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EquipmentBizImpl implements EquipmentBiz {

    @Resource
    private EquipmentService equipmentService;

    @Resource
    private LogService logService;

    @Override
    public boolean delete(String equipmentId) {
        logService.deleteByLogEquipment(equipmentId);
        return equipmentService.delete(equipmentId);
    }

    @Override
    public boolean save(Log log) {
        if (logService.addLog(log)) {
            Equipment equipment = equipmentService.info(log.getLogEquipment());
            if (log.getLogStatus() == 0) {
                equipment.setEquipmentStatus(1);
                return equipmentService.edit(equipment);
            } else if (log.getLogStatus() == 1) {
                equipment.setEquipmentStatus(2);
                return equipmentService.edit(equipment);
            } else if (log.getLogStatus() == 2) {
                equipment.setEquipmentStatus(3);
                return equipmentService.edit(equipment);
            } else if (log.getLogStatus() == 4) {
                if (equipment.getEquipmentStatus() == null || "".equals(equipment.getEquipmentStatus())) {
                    equipment.setEquipmentStatus(2);
                    return equipmentService.edit(equipment);
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
