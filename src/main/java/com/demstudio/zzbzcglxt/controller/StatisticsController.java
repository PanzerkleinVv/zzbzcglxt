package com.demstudio.zzbzcglxt.controller;

import com.demstudio.zzbzcglxt.service.StatisticsService;
import com.demstudio.zzbzcglxt.vo.VueResult;
import com.demstudio.zzbzcglxt.vo.statistics.LedgerPeriod;
import com.demstudio.zzbzcglxt.vo.statistics.LogPeriod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/statistics")
@RestController
public class StatisticsController {

  @Resource
  private StatisticsService statisticsService;

  @GetMapping("/equipment")
  public VueResult equipment() {
    return new VueResult(200, statisticsService.equipment());
  }

  @GetMapping("/logPeriod")
  public List<LogPeriod> logPeriod() {
    return statisticsService.logByPeriod();
  }

  @GetMapping("/log")
  public VueResult log(Integer logYear, Integer logMonth) {
    return new VueResult(200, statisticsService.log(logYear, logMonth));
  }

  @GetMapping("/consumable")
  public VueResult consumable() {
    return new VueResult(200, statisticsService.consumable());
  }

  @GetMapping("/ledgerPeriod")
  public List<LedgerPeriod> ledgerPeriod() {
    return statisticsService.ledgerByPeriod();
  }

  @GetMapping("/ledger")
  public VueResult ledger(Integer logYear, Integer logMonth) {
    return new VueResult(200, statisticsService.ledger(logYear, logMonth));
  }
}
