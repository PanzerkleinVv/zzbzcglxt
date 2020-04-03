package com.demstudio.zzbzcglxt.controller.network;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/network/application")
public class ApplicationController {

    @GetMapping("/index")
    public String index() {
        return "network/application";
    }
}
