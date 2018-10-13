package com.superstar.security;

import com.superstar.dao.system.UserMapper;
import com.superstar.model.system.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Authenticate a user from the database.
 */
@Component("userDetailsService")
public class DomainUserDetailsService implements UserDetailsService {

    private final Logger log = LoggerFactory.getLogger(DomainUserDetailsService.class);

    @Autowired
    private UserMapper userMapper;


    @Override
    @Transactional
    public UserDetails loadUserByUsername(final String login) {
        //查询数据库,返回用户信息和对应的权限
        Optional<User> userFromDatabase = Optional.ofNullable(userMapper.findOneWithRolesByLogin(login));
        if (!userFromDatabase.isPresent()) {
            throw new UsernameNotFoundException("未找到指定用户:" + login);
        }
        return userFromDatabase.map(
                user -> {
                    //判断用户是否已激活
                    if (!user.getIsEnabled()) {
                        //用户未激活,抛出用户未激活异常
                        throw new UserNotActivatedException("用户 " + login + "不可用");
                    }
                    //获取用户对应的权限
                    List<GrantedAuthority> grantedAuthorities = user.getRoles().stream()
                            .map(authority -> new SimpleGrantedAuthority(authority.getRoleName()))
                            .collect(Collectors.toList());
                    //使用用户名,密码,权限,创建一个UserDetails并返回
                    return new org.springframework.security.core.userdetails.User(login,
                            user.getPassword(),
                            grantedAuthorities);
                }).orElseThrow(
                () -> new UsernameNotFoundException("未找到指定用户:" + login));

    }
}
