package com.demstudio.zzbzcglxt.controller.equipment;

import com.demstudio.zzbzcglxt.domain.Equipment;
import com.demstudio.zzbzcglxt.service.equipment.EquipmentService;
import com.demstudio.zzbzcglxt.vo.EquipmentVo;
import com.demstudio.zzbzcglxt.vo.Message;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/equipment")
public class EquipmentController {

    @Resource
    private EquipmentService equipmentService;

    @GetMapping("/index")
    public String index() {
        return "equipment/equipment";
    }

    @GetMapping("/search")
    @ResponseBody
    public PageResult search(PageRequest pageRequest, Equipment equipment) {
        return equipmentService.searchPage(pageRequest, equipment.toExample());
    }

    @GetMapping("/info")
    @ResponseBody
    public Equipment info(String equipmentId) {
        return equipmentService.info(equipmentId);
    }

    @GetMapping("/admin")
    @ResponseBody
    public EquipmentVo admin(String equipmentId) {
        return equipmentService.admin(equipmentId);
    }

    @PostMapping("/edit")
    @ResponseBody
    public Message edit(Equipment equipment) {
        if (equipmentService.edit(equipment)) {
            return new Message(true, "保存成功");
        } else {
            return new Message(false, "保存失败");
        }
    }

}
