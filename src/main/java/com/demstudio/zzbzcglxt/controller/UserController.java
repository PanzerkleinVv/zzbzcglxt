package com.demstudio.zzbzcglxt.controller;

import com.demstudio.zzbzcglxt.domain.User;
import com.demstudio.zzbzcglxt.service.UserService;
import com.demstudio.zzbzcglxt.utils.PageRequest;
import com.demstudio.zzbzcglxt.utils.PageResult;
import com.demstudio.zzbzcglxt.vo.Message;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.UUID;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/index")
    public String index() {
        return "user";
    }

    @GetMapping("/list")
    @ResponseBody
    public PageResult list(@RequestBody PageRequest pageQuery) {
        return userService.findPage(pageQuery);
    }

    @GetMapping("/reset")
    @ResponseBody
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
    @ResponseBody
    public Message create(User user) {
        user.setUserId(DigestUtils.sha1Hex(UUID.randomUUID().toString()));
        user.setUserPsw(DigestUtils.sha256Hex("1234567890"));
        if (userService.createUser(user)) {
            return new Message(true, "新增用户成功");
        } else {
            return new Message(false, "新增用户失败");
        }
    }
}
