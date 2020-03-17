package com.demstudio.zzbzcglxt.service.equipment;

import com.demstudio.zzbzcglxt.domain.Log;
import com.demstudio.zzbzcglxt.vo.equipment.LogVo;

import java.util.List;

public interface LogService {

    void deleteByLogEquipment(String logEquipment);

    boolean addLog(Log log);

    List<LogVo> list(String logEquipment);
}
