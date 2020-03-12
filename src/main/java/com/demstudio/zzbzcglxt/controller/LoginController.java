package com.demstudio.zzbzcglxt.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login() {
        return "login";
    }


    @PostMapping("/login")
    public String login(String userName, String userPsw, Model model) {

        UsernamePasswordToken token = new UsernamePasswordToken(userName, userPsw);
        Subject currentUser = SecurityUtils.getSubject();

        try {
            //主体提交登录请求到SecurityManager
            currentUser.login(token);
        } catch (IncorrectCredentialsException ice) {
            model.addAttribute("msg", "密码不正确");
        } catch (UnknownAccountException uae) {
            model.addAttribute("msg", "账号不存在");
        }
        if (currentUser.isAuthenticated()) {
            return "redirect:/index";
        } else {
            token.clear();
            return "login";
        }
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session, Model model) {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        model.addAttribute("msg", "安全退出！");
        return "login";
    }

}
