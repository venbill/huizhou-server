package com.superstar.model.system.vm;

/**
 * @Author: BillYu
 * @Description:修改密码
 * @Date: Created in 下午11:34 2018/10/16.
 */
public class UpdatePasswordVm {
    private String password;

    private String oldPassword;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }
}
