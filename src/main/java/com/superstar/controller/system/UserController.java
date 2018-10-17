package com.superstar.controller.system;

import com.superstar.dao.system.UserMapper;
import com.superstar.model.common.RtData;
import com.superstar.model.system.vm.LoginVM;
import com.superstar.model.system.vm.RegisterVm;
import com.superstar.model.system.vm.UpdatePasswordVm;
import com.superstar.security.SecurityUtils;
import com.superstar.service.system.AccountService;
import com.superstar.service.system.ShortMsgService;
import com.superstar.util.ResponseBuilder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.management.relation.RoleStatus;
import javax.validation.Valid;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午5:07 2018/8/21.
 */
@RequestMapping("/system")
@RestController
@Api(description = "账户操作")
public class UserController {
    @Autowired
    private AccountService accountService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private ShortMsgService shortMsgService;




    @PermitAll
    @PostMapping("/authenticate")
    public RtData login(@Valid @RequestBody LoginVM loginVM){

        return accountService.login(loginVM.getLoginName(),loginVM.getPassword(),loginVM.isRememberMe());
    }

//    @PreAuthorize("hasAnyRole()")
    @PermitAll
    @GetMapping("/getCurrentUser")
    public RtData getCurrentUser(){
        return accountService.getCurrentUser();
    }


    @ApiOperation("获取短信验证码")
    @PermitAll
    @GetMapping("/getCodeMsg/{phone}")
    public RtData getCodeMsg(@PathVariable String phone){
        return shortMsgService.sendCodeMsg(phone);
    }





    @ApiOperation("注册")
    @PermitAll
    @PostMapping("/register")
    public RtData register(RegisterVm registerVm){
        try {

           return accountService.register(registerVm);
        }catch (Exception e){
            return ResponseBuilder.fail("注册失败");
        }
    }


    @ApiOperation("修改密码")
//    @RolesAllowed({"ROLE_ADMIN","ROLE_CUSTOMER","ROLE_SHOPKEEPER","ROLE_SERVICE"})
    @PermitAll
    @PostMapping("/updatePassword")
    public RtData updatePassword(@RequestBody UpdatePasswordVm updatePasswordVm){
        return accountService.updatePassword(updatePasswordVm);
    }




    @ApiOperation("重置密码")
    @PermitAll
    @PostMapping("/restPassword")
    public RtData restPassword(@RequestBody RegisterVm registerVm){
        return accountService.resetPassword(registerVm);
    }












    @PermitAll
    @GetMapping("/p/{password}")
    public String getPassword(@PathVariable String password) {

        return passwordEncoder.encode(password);

    }

    @PermitAll
    @GetMapping("/c")
    public boolean checkPassword(){
        return passwordEncoder.matches("11111", "$2a$10$mWA8CoRr2LiFXsAak.B6muHPoJFzbOZosgp2QEY0k2g7DysVeCIGi");
    }

    /**
     * 权限测试
     */
    @RolesAllowed({"ROLE_ADMIN"})
    @GetMapping("/admin")
    public String testPer(){
        return "ROLE_ADMIN  ";
    }

    @RolesAllowed({"ROLE_CUSTOMER"})
    @GetMapping("/cus")
    public String testPer2(){
        return "   ROLE_CUSTOMER";
    }
    @RolesAllowed({"ROLE_SHOPKEEPER"})
    @GetMapping("/shop")
    public String testPer3(){
        return "   ROLE_SHOPKEEPER";
    }

}
