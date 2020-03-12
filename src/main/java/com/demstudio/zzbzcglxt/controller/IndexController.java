package com.demstudio.zzbzcglxt.controller;

import com.demstudio.zzbzcglxt.domain.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = "/index")
    public String index(Model model) {
        User me = (User) SecurityUtils.getSubject().getPrincipal();
        model.addAttribute("userName", me.getUserName());
        return "index";
    }

}
