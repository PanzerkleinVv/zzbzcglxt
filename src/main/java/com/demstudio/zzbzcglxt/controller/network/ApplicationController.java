package com.demstudio.zzbzcglxt.controller.network;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/network/application")
public class ApplicationController {

    @GetMapping("/index")
    public String index() {
        return "network/application";
    }
}
