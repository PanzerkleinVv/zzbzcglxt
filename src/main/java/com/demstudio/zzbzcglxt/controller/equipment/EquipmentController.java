package com.demstudio.zzbzcglxt.controller.equipment;

import com.demstudio.zzbzcglxt.domain.Equipment;
import com.demstudio.zzbzcglxt.service.equipment.EquipmentService;
import com.demstudio.zzbzcglxt.vo.Message;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;
import com.demstudio.zzbzcglxt.vo.equipment.EquipmentVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/equipment")
public class EquipmentController {

  @Resource
  private EquipmentService equipmentService;

  @GetMapping("/search")
  public PageResult search(PageRequest pageRequest, Equipment equipment) {
    return equipmentService.searchPage(pageRequest, equipment.toExample());
  }

  @GetMapping("/info")
  public Equipment info(String equipmentId) {
    return equipmentService.info(equipmentId);
  }

  @GetMapping("/admin")
  public EquipmentVo admin(String equipmentId) {
    return equipmentService.admin(equipmentId);
  }

  @PostMapping("/edit")
  public Message edit(Equipment equipment) {
    if (equipmentService.edit(equipment)) {
      return new Message(true, "保存成功");
    } else {
      return new Message(false, "保存失败");
    }
  }

  @GetMapping("/checkEquipmentName")
  public Boolean checkEquipmentName(Equipment equipment) {
    return equipmentService.checkEquipmentName(equipment);
  }

}
