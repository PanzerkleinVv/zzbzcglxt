package com.demstudio.zzbzcglxt.controller.equipment;

import com.demstudio.zzbzcglxt.biz.AsyncEquipmentBiz;
import com.demstudio.zzbzcglxt.biz.EquipmentBiz;
import com.demstudio.zzbzcglxt.domain.Log;
import com.demstudio.zzbzcglxt.domain.User;
import com.demstudio.zzbzcglxt.vo.Message;
import org.apache.shiro.SecurityUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;

@RestController
@RequestMapping("/equipment/log")
public class LogController {

  @Resource
  private EquipmentBiz equipmentBiz;

  @Resource
  private AsyncEquipmentBiz asyncEquipmentBiz;

  @PostMapping("/save")
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
  public Message delete(String equipmentId) {
    if (equipmentBiz.delete(equipmentId)) {
      return new Message(true, "操作成功");
    } else {
      return new Message(false, "操作失败");
    }
  }

  @PostMapping("/multipleSave")
  public Message multipleSave(Log log, String[] multipleLogEquipment) {
    final User me = (User) SecurityUtils.getSubject().getPrincipal();
    log.setLogUser(me.getUserId());
    log.setLogTime(Date.from(Instant.now()));
    if (asyncEquipmentBiz.multipleSave(log, multipleLogEquipment)) {
      return new Message(true, "操作成功");
    } else {
      return new Message(false, "操作失败");
    }
  }
}
