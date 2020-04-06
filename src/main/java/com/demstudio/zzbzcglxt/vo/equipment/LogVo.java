package com.demstudio.zzbzcglxt.vo.equipment;

import com.demstudio.zzbzcglxt.domain.Log;

import java.util.Date;

public class LogVo extends Log {

  private String userName;

  public LogVo() {
    super();
  }

  public LogVo(String logId, String logEquipment, String logUser, Date logTime, Integer logStatus, String logTarget, Date logOperationDate, String logNote, String userName) {
    super(logId, logEquipment, logUser, logTime, logStatus, logTarget, logOperationDate, logNote);
    this.userName = userName;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
}
