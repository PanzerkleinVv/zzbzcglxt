package com.demstudio.zzbzcglxt.service.equipment;

import com.demstudio.zzbzcglxt.domain.Log;

public interface LogService {

  void deleteByLogEquipment(String logEquipment);

  boolean addLog(Log log);
}
