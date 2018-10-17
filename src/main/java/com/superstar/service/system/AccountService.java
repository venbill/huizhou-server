package com.superstar.service.system;

import com.superstar.model.common.RtData;
import com.superstar.model.system.vm.RegisterVm;
import com.superstar.model.system.vm.UpdatePasswordVm;
import org.springframework.security.authentication.AuthenticationManager;

/**
 * @Author: BillYu
 * @Description: 账户
 * @Date: Created in 下午9:26 2018/8/21.
 */
public interface AccountService {

    /**
     * 登录接口
     * @param loginName
     * @param password
     * @param rememberMe
     * @return
     */
    RtData login(String loginName, String password, boolean rememberMe);

    /**
     * 获取当前用户信息
     * @return
     */
    RtData getCurrentUser();

    /**
     * 手机号注册
     * @param registerVm
     * @return
     */
    RtData register(RegisterVm registerVm);

    /**
     * 修改密码
     * @param updatePasswordVm
     * @return
     */
    RtData updatePassword(UpdatePasswordVm updatePasswordVm);


    /**
     * 重设密码
     * @param registerVm
     * @return
     */
    RtData resetPassword(RegisterVm registerVm);

}
