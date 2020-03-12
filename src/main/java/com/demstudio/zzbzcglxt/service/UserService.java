package com.demstudio.zzbzcglxt.service;

import com.demstudio.zzbzcglxt.domain.User;
import com.demstudio.zzbzcglxt.utils.PageRequest;
import com.demstudio.zzbzcglxt.utils.PageResult;

public interface UserService {

    /**
     * @param userName userName
     * @return User
     */
    User getUserByUserName(String userName);

    /**
     * @param pageRequest pageRequest
     * @return PageResult
     */
    PageResult findPage(PageRequest pageRequest);

    /**
     * @param user user
     * @return boolean
     */
    boolean createUser(User user);

    /**
     * @param user user
     * @return boolean
     */
    boolean changePsw(User user);

}
