package com.demstudio.zzbzcglxt.controller;

import com.demstudio.zzbzcglxt.domain.User;
import com.demstudio.zzbzcglxt.enums.Code;
import com.demstudio.zzbzcglxt.vo.VueResult;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

  @CrossOrigin
  @PostMapping("/login")
  public VueResult login(@RequestBody User requestUser) {
    UsernamePasswordToken token = new UsernamePasswordToken(requestUser.getUserName(), requestUser.getUserPsw());
    Subject currentUser = SecurityUtils.getSubject();
    VueResult result = new VueResult(Code.UNKNOWN_EXCEPTION.getValue());
    try {
      //主体提交登录请求到SecurityManager
      currentUser.login(token);
    } catch (IncorrectCredentialsException ice) {
      result.setCode(Code.PASSWORD_INCORRECT.getValue());
    } catch (UnknownAccountException uae) {
      result.setCode(Code.NO_SUCH_ACCOUNT.getValue());
    }
    if (currentUser.isAuthenticated()) {
      return new VueResult(Code.SUCCESS.getValue());
    } else {
      token.clear();
      return result;
    }
  }

  @CrossOrigin
  @GetMapping("/logout")
  public VueResult logout(Model model) {
    Subject subject = SecurityUtils.getSubject();
    subject.logout();
    return new VueResult(Code.SUCCESS.getValue());
  }
}
