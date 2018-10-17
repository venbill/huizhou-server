package com.superstar.model.system.vm;

/**
 * @Author: BillYu
 * @Description:注册实体类
 * @Date: Created in 下午10:31 2018/10/16.
 */
public class RegisterVm {
    private String phone;

    private String nick;

    private String password;

    private String code;


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
