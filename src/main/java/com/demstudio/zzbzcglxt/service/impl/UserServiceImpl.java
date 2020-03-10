package com.demstudio.zzbzcglxt.service.impl;

import com.demstudio.zzbzcglxt.domain.User;
import com.demstudio.zzbzcglxt.domain.UserExample;
import com.demstudio.zzbzcglxt.repository.UserMapper;
import com.demstudio.zzbzcglxt.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserByUserName(String userName) {
        UserExample example = new UserExample();
        example.createCriteria().andUserNameEqualTo(userName);
        List<User> users = userMapper.selectByExample(example);
        if (users != null) {
            return users.get(0);
        } else {
            return null;
        }
    }
}
