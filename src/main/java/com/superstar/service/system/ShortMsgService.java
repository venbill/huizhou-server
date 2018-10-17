package com.superstar.service.system;

import com.superstar.model.common.RtData;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午8:57 2018/10/16.
 */
public interface ShortMsgService {

    /**
     * 发送短信验证码
     * @param phone
     * @return
     */
    RtData sendCodeMsg(String phone);






}
