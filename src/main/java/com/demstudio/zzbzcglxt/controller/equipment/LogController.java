package com.demstudio.zzbzcglxt.controller.equipment;

import com.demstudio.zzbzcglxt.biz.EquipmentBiz;
import com.demstudio.zzbzcglxt.domain.Log;
import com.demstudio.zzbzcglxt.domain.User;
import com.demstudio.zzbzcglxt.service.equipment.LogService;
import com.demstudio.zzbzcglxt.vo.Message;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.time.Instant;
import java.util.Date;

@Controller
@RequestMapping("/equipment/log")
public class LogController {

    @Resource
    private LogService logService;

    @Resource
    private EquipmentBiz equipmentBiz;

    @PostMapping("/save")
    @ResponseBody
    public Message save(Log log) {
        final User me = (User) SecurityUtils.getSubject().getPrincipal();
        log.setLogUser(me.getUserId());
        log.setLogTime(Date.from(Instant.now()));
        if (equipmentBiz.save(log)) {
            return new Message(true, "操作成功");
        } else {
            return new Message(false, "操作失败");
        }
    }

    @GetMapping("/delete")
    @ResponseBody
    public Message delete(String equipmentId) {
        if (equipmentBiz.delete(equipmentId)) {
            return new Message(true, "操作成功");
        } else {
            return new Message(false, "操作失败");
        }
    }

    @PostMapping("/multipleSave")
    @ResponseBody
    public Message multipleSave(Log log, String[] multipleLogEquipment) {
        final User me = (User) SecurityUtils.getSubject().getPrincipal();
        log.setLogUser(me.getUserId());
        for (int i = 0; i < multipleLogEquipment.length / 2; i++) {
            log.setLogTime(Date.from(Instant.now()));
            log.setLogEquipment(multipleLogEquipment[i]);
            if (!equipmentBiz.save(log)) {
                return new Message(false, "操作失败");
            }
        }
        return new Message(true, "操作成功");
    }
}
