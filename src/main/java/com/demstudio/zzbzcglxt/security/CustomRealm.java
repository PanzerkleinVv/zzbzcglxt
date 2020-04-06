package com.demstudio.zzbzcglxt.security;

import com.demstudio.zzbzcglxt.domain.User;
import com.demstudio.zzbzcglxt.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;

public class CustomRealm extends AuthorizingRealm {
  @Resource
  UserService userService;

  @Override
  protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
    return null;
  }

  @Override
  protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
    //1.获取用户输入的账号
    String username = (String) token.getPrincipal();
    //2.通过username从数据库中查找到user实体
    User authentication = userService.getUserByUserName(username);
    if (authentication == null) {
      throw new UnknownAccountException();
    } else {
      String psw = new String((char[]) token.getCredentials());
      if (!authentication.getUserPsw().equals(psw)) {
        throw new IncorrectCredentialsException();
      }
    }
    //3.通过SimpleAuthenticationInfo做身份处理
    SimpleAuthenticationInfo simpleAuthenticationInfo =
      new SimpleAuthenticationInfo(authentication, authentication.getUserPsw(), getName());
    //5.返回身份处理对象
    return simpleAuthenticationInfo;
  }
}
