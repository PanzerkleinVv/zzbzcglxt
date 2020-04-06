package com.demstudio.zzbzcglxt.repository;

import com.demstudio.zzbzcglxt.vo.statistics.*;

import java.util.List;

public interface StatisticsMapper {

  List<EquipmentStatistics> equipment();

  List<LogPeriod> logByPeriod();

  List<LogStatistics> log(Integer logYear, Integer logMonth);

  List<ConsumableStatistics> consumable();

  List<LedgerPeriod> ledgerByPeriod();

  List<LedgerStatistics> ledger(Integer logYear, Integer logMonth);
}
