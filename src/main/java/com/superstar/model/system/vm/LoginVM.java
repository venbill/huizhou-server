package com.superstar.model.system.vm;

/**
 * Created by yuwb on 2017/9/6.
 */

import com.superstar.config.Constants;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class LoginVM {

    @ApiModelProperty("登录名称")
    @Pattern(regexp = Constants.LOGIN_REGEX)
    @NotNull
    @Size(min = 1, max = 50)
    private String loginName;


    @ApiModelProperty("md5加密后的密码")
    @NotNull
    @Size(min = 1, max = 100)
    private String password;

    @ApiModelProperty("是否记住密码一周")
    private Boolean rememberMe;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(Boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    @Override
    public String toString() {
        return "LoginVM{" +
                "loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", rememberMe=" + rememberMe +
                '}';
    }
}
