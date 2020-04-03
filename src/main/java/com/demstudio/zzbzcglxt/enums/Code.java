package com.demstudio.zzbzcglxt.enums;

public enum Code {

  SUCCESS(200), NO_SUCH_ACCOUNT(499), PASSWORD_INCORRECT(498), UNKNOWN_EXCEPTION(500);

  private int value;

  Code(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }
}
