package com.demstudio.zzbzcglxt.service;

import com.demstudio.zzbzcglxt.vo.statistics.*;

import java.util.List;

public interface StatisticsService {

  List<EquipmentStatistics> equipment();

  List<LogStatistics> log(Integer logYear, Integer logMonth);

  List<LogPeriod> logByPeriod();

  List<ConsumableStatistics> consumable();

  List<LedgerPeriod> ledgerByPeriod();

  List<LedgerStatistics> ledger(Integer logYear, Integer logMonth);
}
