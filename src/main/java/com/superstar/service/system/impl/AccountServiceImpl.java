package com.superstar.service.system.impl;

import com.google.common.base.Strings;
import com.superstar.dao.system.UserMapper;
import com.superstar.enums.RtCode;
import com.superstar.model.common.RtData;
import com.superstar.model.system.User;
import com.superstar.security.SecurityUtils;
import com.superstar.security.jwt.TokenProvider;
import com.superstar.service.system.AccountService;
import com.superstar.util.ResponseBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午9:26 2018/8/21.
 */
@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private TokenProvider tokenProvider;

    @Autowired
    private  AuthenticationManager authenticationManager;


    private final Logger log = LoggerFactory.getLogger(AccountServiceImpl.class);


    @Override
    public RtData login( String loginName, String password, boolean rememberMe) {
        User user = userMapper.findOneWithRolesByLogin(loginName);
        String nameOrPasswordError = "用户名或密码错误";
        //用户名验证
        if(user ==null){
            return ResponseBuilder.fail(nameOrPasswordError);
        }else{
            //是否可用
            if(!user.getIsEnabled()||user.getIsDeleted()){
                String accountDisabledError = "账户不可用";
                return ResponseBuilder.fail(accountDisabledError);
            }

            String userId = user.getUserId().toString();
            //密码校验
            UsernamePasswordAuthenticationToken authenticationToken =
                    new UsernamePasswordAuthenticationToken(userId, password);
            try {
                //验证当前登录用户的合法性
                Authentication authentication = authenticationManager.authenticate(authenticationToken);
                SecurityContextHolder.getContext().setAuthentication(authentication);


                //查找用户,并将用户信息写入redis

                //生成jwt
                String jwtToken = tokenProvider.createToken(authentication, rememberMe);
                //将token写入redis
                User u = new User();
                u.setUserId(user.getUserId());

            System.out.println("token:==>");
            System.out.println(jwtToken);
                u.setToken("Bearer "+jwtToken.toString());

                userMapper.updateByPrimaryKeySelective(u);

                u.setUsername(user.getUsername());
                u.setPhone(user.getPhone());
                u.setRoles(user.getRoles());
                return ResponseBuilder.success(u);
            } catch (AuthenticationException ae) {
                log.error("登录日志>>登录id为" + userId + "的用户登录失败" );
                return ResponseBuilder.fail(nameOrPasswordError);
            }

        }

//        return null;
    }


    @Override
    public RtData getCurrentUser() {

        User user = userMapper.findOneWithRolesByUserId(SecurityUtils.getCurrentUserId());
        if(user!=null){
            User u = new User();
            u.setUserId(user.getUserId());
            u.setUsername(user.getUsername());
            u.setPhone(user.getPhone());
            u.setRoles(user.getRoles());
            return ResponseBuilder.success(u);
        }else{
            return ResponseBuilder.build(RtCode.NOT_AUTHORIZATION);

        }
    }
}
