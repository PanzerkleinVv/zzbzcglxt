package com.demstudio.zzbzcglxt.controller;

import com.demstudio.zzbzcglxt.service.StatisticsService;
import com.demstudio.zzbzcglxt.vo.layUI.LayUI;
import com.demstudio.zzbzcglxt.vo.statistics.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/statistics")
@Controller
public class StatisticsController {

    @Resource
    private StatisticsService statisticsService;

    @GetMapping("/index")
    public String index() {
        return "statistics";
    }

    @GetMapping("/equipment")
    @ResponseBody
    public LayUI<List<EquipmentStatistics>> equipment() {
        LayUI<List<EquipmentStatistics>> layUI = new LayUI<>();
        layUI.setCode(0);
        List<EquipmentStatistics> statistics = statisticsService.equipment();
        layUI.setCount(statistics.size());
        layUI.setData(statistics);
        return layUI;
    }

    @GetMapping("/logPeriod")
    @ResponseBody
    public List<LogPeriod> logPeriod() {
        return statisticsService.logByPeriod();
    }

    @GetMapping("/log")
    @ResponseBody
    public LayUI<List<LogStatistics>> log(Integer logYear, Integer logMonth) {
        LayUI<List<LogStatistics>> layUI = new LayUI<>();
        layUI.setCode(0);
        List<LogStatistics> statistics = statisticsService.log(logYear, logMonth);
        layUI.setCount(statistics.size());
        layUI.setData(statistics);
        return layUI;
    }

    @GetMapping("/consumable")
    @ResponseBody
    public LayUI<List<ConsumableStatistics>> consumable() {
        LayUI<List<ConsumableStatistics>> layUI = new LayUI<>();
        layUI.setCode(0);
        List<ConsumableStatistics> statistics = statisticsService.consumable();
        layUI.setCount(statistics.size());
        layUI.setData(statistics);
        return layUI;
    }

    @GetMapping("/ledgerPeriod")
    @ResponseBody
    public List<LedgerPeriod> ledgerPeriod() {
        return statisticsService.ledgerByPeriod();
    }

    @GetMapping("/ledger")
    @ResponseBody
    public LayUI<List<LedgerStatistics>> ledger(Integer logYear, Integer logMonth) {
        LayUI<List<LedgerStatistics>> layUI = new LayUI<>();
        layUI.setCode(0);
        List<LedgerStatistics> statistics = statisticsService.ledger(logYear, logMonth);
        layUI.setCount(statistics.size());
        layUI.setData(statistics);
        return layUI;
    }
}
