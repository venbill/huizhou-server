package com.superstar.controller.system;

import com.superstar.dao.system.UserMapper;
import com.superstar.model.common.RtData;
import com.superstar.model.system.vm.LoginVM;
import com.superstar.security.SecurityUtils;
import com.superstar.service.system.AccountService;
import com.superstar.util.ResponseBuilder;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
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
