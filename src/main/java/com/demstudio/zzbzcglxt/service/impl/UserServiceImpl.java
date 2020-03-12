package com.demstudio.zzbzcglxt.service.impl;

import com.demstudio.zzbzcglxt.domain.User;
import com.demstudio.zzbzcglxt.domain.UserExample;
import com.demstudio.zzbzcglxt.repository.UserMapper;
import com.demstudio.zzbzcglxt.service.UserService;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;
import com.demstudio.zzbzcglxt.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
        if (users != null && users.size() != 0) {
            return users.get(0);
        } else {
            return null;
        }
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return PageUtils.getPageResult(pageRequest, getPageInfo(pageRequest));
    }

    /**
     * 调用分页插件完成分页
     *
     * @param pageRequest pageRequest
     * @return PageInfo<User>
     */
    private PageInfo<User> getPageInfo(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<User> users = userMapper.selectPage();
        return new PageInfo<User>(users);
    }

    @Override
    public boolean createUser(User user) {
        return 1 == userMapper.insertSelective(user);
    }

    @Override
    public boolean changePsw(User user) {
        return 1 == userMapper.updateByPrimaryKeySelective(user);
    }
}
