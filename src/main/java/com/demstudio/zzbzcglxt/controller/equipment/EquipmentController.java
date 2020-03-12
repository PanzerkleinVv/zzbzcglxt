package com.demstudio.zzbzcglxt.controller.equipment;

import com.demstudio.zzbzcglxt.service.equipment.EquipmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
