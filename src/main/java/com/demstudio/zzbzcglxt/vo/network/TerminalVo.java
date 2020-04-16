package com.demstudio.zzbzcglxt.vo.network;

import com.demstudio.zzbzcglxt.domain.Terminal;

public class TerminalVo extends Terminal {

  private String typeName;

  private String typeValue;

  private String systemValue;

  private String roomName;

  public TerminalVo() {
    super();
  }

  public TerminalVo(String terminalId, String terminalName, Integer ip0, Integer ip1, Integer ip2, Integer ip3, String terminalDesc, String terminalSystem, String terminalOwner, String terminalSegment, String terminalRoom, String terminalSecrecy, String terminalSwitch, String terminalType, String typeName, String typeValue, String systemValue, String roomName) {
    super(terminalId, terminalName, ip0, ip1, ip2, ip3, terminalDesc, terminalSystem, terminalOwner, terminalSegment, terminalRoom, terminalSecrecy, terminalSwitch, terminalType);
    this.typeName = typeName;
    this.typeValue = typeValue;
    this.systemValue = systemValue;
    this.roomName = roomName;
  }

  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public String getTypeValue() {
    return typeValue;
  }

  public void setTypeValue(String typeValue) {
    this.typeValue = typeValue;
  }

  public String getSystemValue() {
    return systemValue;
  }

  public void setSystemValue(String systemValue) {
    this.systemValue = systemValue;
  }

  public String getRoomName() {
    return roomName;
  }

  public void setRoomName(String roomName) {
    this.roomName = roomName;
  }
}
