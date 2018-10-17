package com.superstar.service.system.impl;

import com.google.common.base.Strings;
import com.superstar.config.Constants;
import com.superstar.dao.system.UserMapper;
import com.superstar.dao.system.UserRoleMapper;
import com.superstar.enums.RoleType;
import com.superstar.enums.RtCode;
import com.superstar.model.common.RtData;
import com.superstar.model.system.User;
import com.superstar.model.system.UserExample;
import com.superstar.model.system.UserRole;
import com.superstar.model.system.vm.RegisterVm;
import com.superstar.model.system.vm.UpdatePasswordVm;
import com.superstar.security.SecurityUtils;
import com.superstar.security.jwt.TokenProvider;
import com.superstar.service.system.AccountService;
import com.superstar.util.ResponseBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午9:26 2018/8/21.
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private TokenProvider tokenProvider;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRoleMapper userRoleMapper;


    private final Logger log = LoggerFactory.getLogger(AccountServiceImpl.class);


    @Override
    public RtData login(String loginName, String password, boolean rememberMe) {
        User user = userMapper.findOneWithRolesByLogin(loginName);
        String nameOrPasswordError = "用户名或密码错误";
        //用户名验证
        if (user == null) {
            return ResponseBuilder.fail(nameOrPasswordError);
        } else {
            //是否可用
            if (!user.getIsEnabled() || user.getIsDeleted()) {
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
                u.setToken("Bearer " + jwtToken.toString());

                userMapper.updateByPrimaryKeySelective(u);

                u.setUsername(user.getUsername());
                u.setPhone(user.getPhone());
                u.setRoles(user.getRoles());
                return ResponseBuilder.success(u);
            } catch (AuthenticationException ae) {
                log.error("登录日志>>登录id为" + userId + "的用户登录失败");
                return ResponseBuilder.fail(nameOrPasswordError);
            }

        }

//        return null;
    }


    @Override
    public RtData getCurrentUser() {

        User user = userMapper.findOneWithRolesByUserId(SecurityUtils.getCurrentUserId());
        if (user != null) {
            User u = new User();
            u.setUserId(user.getUserId());
            u.setUsername(user.getUsername());
            u.setPhone(user.getPhone());
            u.setRoles(user.getRoles());
            return ResponseBuilder.success(u);
        } else {
            return ResponseBuilder.build(RtCode.NOT_AUTHORIZATION);

        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public RtData register(RegisterVm registerVm) {


        //手机号
        if (!Pattern.matches(Constants.PHONE_REGEX, registerVm.getPhone())) {
            return ResponseBuilder.fail("手机号格式不正确");
        }

        UserExample userExample = new UserExample();
        userExample.createCriteria().andPhoneEqualTo(registerVm.getPhone()).andIsDeletedEqualTo(false);
        if (userMapper.selectByExample(userExample).size() > 0) {
            return ResponseBuilder.fail("手机号已被注册");
        }
        //验证码
        if (StringUtils.isEmpty(registerVm.getCode()) || registerVm.getCode().length() != 4) {
            return ResponseBuilder.fail("验证码不正确");
        }


        //昵称
        if (StringUtils.isEmpty(registerVm.getNick()) || registerVm.getNick().length() > 6) {
            return ResponseBuilder.fail("昵称必须为1-6位");
        }


        //密码
        if (StringUtils.isEmpty(registerVm.getPassword()) || registerVm.getPassword().length() > 10 || registerVm.getPassword().length() < 6) {
            return ResponseBuilder.fail("密码位数为6-10位");
        }


        //校验验证码
        Object codeObj = redisTemplate.opsForValue().get(Constants.MSG_CODE_PREFIX.toString() + registerVm.getPhone());
        String code = codeObj==null?null:(String) codeObj;
        if (code == null || !code.equals(registerVm.getCode())) {
            return ResponseBuilder.fail("验证码不正确");
        } else {
            redisTemplate.delete(Constants.MSG_CODE_PREFIX.toString() + registerVm.getPhone());
        }


        //保存用户
        User user = new User();
        user.setPhone(registerVm.getPhone());
        user.setNick(registerVm.getNick());
        user.setPassword(passwordEncoder.encode(registerVm.getPassword()));
        user.setPicture(Constants.PICTURE);
        user.setCreateTime(new Date());
        userMapper.insertSelective(user);


        //保存角色
        UserRole userRole = new UserRole();
        userRole.setUserId(user.getUserId());
        userRole.setRoleId(RoleType.ROLE_CUSTOMER.getRoleId());
        userRoleMapper.insertSelective(userRole);


        return ResponseBuilder.success("注册成功");
    }


    @Override
    public RtData updatePassword(UpdatePasswordVm updatePasswordVm) {
        User user = userMapper.selectByPrimaryKey(SecurityUtils.getCurrentUserId());
        if (user == null) {
            return ResponseBuilder.fail("用户授权信息认证失败");
        }
        //密码
        if (StringUtils.isEmpty(updatePasswordVm.getPassword()) || updatePasswordVm.getPassword().length() > 10 || updatePasswordVm.getPassword().length() < 6) {
            return ResponseBuilder.fail("新密码位数为6-10位");
        }

        if (updatePasswordVm.getPassword().equals(updatePasswordVm.getOldPassword())) {
            return ResponseBuilder.fail("新密码不能和原密码相同");
        }
        if (passwordEncoder.matches(updatePasswordVm.getOldPassword(), user.getPassword())) {
           //旧密码验证成功
            User updateUser = new User();
            updateUser.setUserId(user.getUserId());
            updateUser.setPassword(passwordEncoder.encode(updatePasswordVm.getPassword()));
            updateUser.setUpdateTime(new Date());
            updateUser.setUpdateUser(user.getUserId());
            userMapper.updateByPrimaryKeySelective(updateUser);
            return ResponseBuilder.success("密码修改成功");
        } else {
            return ResponseBuilder.fail("原密码输入错误");

        }


    }


    @Override
    public RtData resetPassword(RegisterVm registerVm) {


        //手机号
        if (!Pattern.matches(Constants.PHONE_REGEX, registerVm.getPhone())) {
            return ResponseBuilder.fail("手机号格式不正确");
        }


        //验证码
        if (StringUtils.isEmpty(registerVm.getCode()) || registerVm.getCode().length() != 4) {
            return ResponseBuilder.fail("验证码不正确");
        }





        //密码
        if (StringUtils.isEmpty(registerVm.getPassword()) || registerVm.getPassword().length() > 10 || registerVm.getPassword().length() < 6) {
            return ResponseBuilder.fail("密码位数为6-10位");
        }


        //校验验证码
        String code = (String) redisTemplate.opsForValue().get(Constants.MSG_CODE_PREFIX + registerVm.getPhone());
        if (code == null || !code.equals(registerVm.getCode())) {
            return ResponseBuilder.fail("验证码不正确");
        } else {
            redisTemplate.delete(Constants.MSG_CODE_PREFIX + registerVm.getPhone());
        }


        UserExample userExample = new UserExample();
        userExample.createCriteria().andPhoneEqualTo(registerVm.getPhone()).andIsDeletedEqualTo(false);
        List<User> users= userMapper.selectByExample(userExample);
        if (users==null|| users.size()==0){
            return  ResponseBuilder.fail("手机号不存在，请先注册");
        }
        User user = users.get(0);

        User updateUser = new User();
        updateUser.setUserId(user.getUserId());
        updateUser.setPassword(passwordEncoder.encode(registerVm.getPassword()));
        updateUser.setUpdateTime(new Date());
        updateUser.setUpdateUser(user.getUserId());
        userMapper.updateByPrimaryKeySelective(updateUser);
        return ResponseBuilder.success("密码重置成功");

    }
}
