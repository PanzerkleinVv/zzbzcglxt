package com.demstudio.zzbzcglxt.biz;

import com.demstudio.zzbzcglxt.domain.Log;

import java.util.concurrent.CountDownLatch;

public interface EquipmentBiz {

  boolean delete(String equipmentId);

  boolean save(Log log);

  void saveAsync(Log log, CountDownLatch countDownLatch) throws Exception;
}
