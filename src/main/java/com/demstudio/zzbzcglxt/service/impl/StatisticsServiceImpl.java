package com.demstudio.zzbzcglxt.service.impl;

import com.demstudio.zzbzcglxt.repository.StatisticsMapper;
import com.demstudio.zzbzcglxt.service.StatisticsService;
import com.demstudio.zzbzcglxt.vo.statistics.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StatisticsServiceImpl implements StatisticsService {

  @Resource
  private StatisticsMapper statisticsMapper;

  @Override
  public List<EquipmentStatistics> equipment() {
    return statisticsMapper.equipment();
  }

  @Override
  public List<LogStatistics> log(Integer logYear, Integer logMonth) {
    return statisticsMapper.log(logYear, logMonth);
  }

  @Override
  public List<LogPeriod> logByPeriod() {
    return statisticsMapper.logByPeriod();
  }

  @Override
  public List<ConsumableStatistics> consumable() {
    return statisticsMapper.consumable();
  }

  @Override
  public List<LedgerPeriod> ledgerByPeriod() {
    return statisticsMapper.ledgerByPeriod();
  }

  @Override
  public List<LedgerStatistics> ledger(Integer logYear, Integer logMonth) {
    return statisticsMapper.ledger(logYear, logMonth);
  }
}
