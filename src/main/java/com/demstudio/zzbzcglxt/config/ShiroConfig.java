package com.demstudio.zzbzcglxt.config;

import com.demstudio.zzbzcglxt.security.CustomRealm;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {
    @Bean("shiroFilter")
    public ShiroFilterFactoryBean webFilter() {

        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        //设置securityManager
        shiroFilterFactoryBean.setSecurityManager(securityManager());

        //配置拦截链 使用LinkedHashMap,因为LinkedHashMap是有序的，shiro会根据添加的顺序进行拦截
        // Map<K,V> K指的是拦截的url V值的是该url是否拦截
        Map<String, String> filterChainMap = new LinkedHashMap<String, String>(16);

        //authc:所有url都必须认证通过才可以访问; anon:所有url都都可以匿名访问,先配置anon再配置authc。
        filterChainMap.put("/login", "anon");
        filterChainMap.put("/", "anon");
        //logout是shiro提供的过滤器,这是走自定义的 shiroLogoutFilter 上面有配置
        filterChainMap.put("/logout", "anon");
        //此时访问/user/delete需要delete权限,在自定义Realm中为用户授权。
        //filterChainDefinitionMap.put("/user/delete", "perms[\"user:delete\"]");

        //其他资源都需要认证  authc 表示需要认证才能进行访问 user表示配置记住我或认证通过可以访问的地址
        //如果开启限制同一账号登录,改为 .put("/**", "kickout,user");
        filterChainMap.put("/**", "authc");

        //设置拦截请求后跳转的URL.
        shiroFilterFactoryBean.setLoginUrl("/login");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainMap);
        return shiroFilterFactoryBean;
    }

    @Bean
    public SecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(customRealm());
        return securityManager;
    }

    @Bean
    public CustomRealm customRealm() {
        return new CustomRealm();
    }
}
