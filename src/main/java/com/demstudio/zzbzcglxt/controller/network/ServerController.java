package com.demstudio.zzbzcglxt.controller.network;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/network/server")
public class ServerController {

    @GetMapping("/index")
    public String index() {
        return "network/server";
    }
}
