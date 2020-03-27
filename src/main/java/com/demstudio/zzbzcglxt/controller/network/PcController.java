package com.demstudio.zzbzcglxt.controller.network;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/network/pc")
public class PcController {

    @GetMapping("/index")
    public String index() {
        return "network/pc";
    }
}
