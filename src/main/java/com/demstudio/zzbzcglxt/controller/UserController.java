package com.demstudio.zzbzcglxt.controller;

import com.demstudio.zzbzcglxt.domain.User;
import com.demstudio.zzbzcglxt.service.UserService;
import com.demstudio.zzbzcglxt.vo.Message;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {

  @Resource
  private UserService userService;

  @GetMapping("/list")
  public PageResult list(PageRequest pageQuery) {
    return userService.findPage(pageQuery);
  }

  @GetMapping("/reset")
  public Message reset(String userId) {
    User user = new User();
    user.setUserId(userId);
    user.setUserPsw(DigestUtils.sha256Hex("1234567890"));
    if (userService.changePsw(user)) {
      return new Message(true, "重置密码成功");
    } else {
      return new Message(false, "重置密码失败");
    }
  }

  @PostMapping("/create")
  public Message create(User user) {
    user.setUserId(DigestUtils.sha1Hex(UUID.randomUUID().toString()));
    user.setUserPsw(DigestUtils.sha256Hex("1234567890"));
    if (userService.createUser(user)) {
      return new Message(true, "新增用户成功");
    } else {
      return new Message(false, "新增用户失败");
    }
  }

  @GetMapping("/checkUserName")
  public Boolean checkUserName(String userName) {
    return userService.getUserByUserName(userName) == null;
  }

  @PostMapping("/changePsw")
  public Message changePsw(String userPsw) {
    final User me = (User) SecurityUtils.getSubject().getPrincipal();
    User user = new User();
    user.setUserId(me.getUserId());
    user.setUserPsw(userPsw);
    if (userService.changePsw(user)) {
      return new Message(true, "重置密码成功");
    } else {
      return new Message(false, "重置密码失败");
    }
  }
}
