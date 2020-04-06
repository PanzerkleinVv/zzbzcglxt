package com.demstudio.zzbzcglxt.vo.statistics;

public class LedgerStatistics {

  private String consumableName;

  private String consumableUnit;

  private Integer check;

  private Integer buy;

  private Integer receive;

  private Integer split;

  private Integer net;

  public LedgerStatistics() {
  }

  public LedgerStatistics(String consumableName, String consumableUnit, Integer check, Integer buy, Integer receive, Integer split, Integer net) {
    this.consumableName = consumableName;
    this.consumableUnit = consumableUnit;
    this.check = check;
    this.buy = buy;
    this.receive = receive;
    this.split = split;
    this.net = net;
  }

  public String getConsumableName() {
    return consumableName;
  }

  public void setConsumableName(String consumableName) {
    this.consumableName = consumableName;
  }

  public String getConsumableUnit() {
    return consumableUnit;
  }

  public void setConsumableUnit(String consumableUnit) {
    this.consumableUnit = consumableUnit;
  }

  public Integer getCheck() {
    return check;
  }

  public void setCheck(Integer check) {
    this.check = check;
  }

  public Integer getBuy() {
    return buy;
  }

  public void setBuy(Integer buy) {
    this.buy = buy;
  }

  public Integer getReceive() {
    return receive;
  }

  public void setReceive(Integer receive) {
    this.receive = receive;
  }

  public Integer getSplit() {
    return split;
  }

  public void setSplit(Integer split) {
    this.split = split;
  }

  public Integer getNet() {
    return net;
  }

  public void setNet(Integer net) {
    this.net = net;
  }
}
