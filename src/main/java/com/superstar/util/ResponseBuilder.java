package com.superstar.util;


import com.superstar.enums.RtCode;
import com.superstar.model.common.RtData;

/**
 * @Author: BillYu
 * @Description:返回实体工具类
 * @Date: Created in 下午2:29 2018/4/28.
 */
public abstract class ResponseBuilder {

    private ResponseBuilder() {
    }

    public static RtData success() {
        return build(RtCode.SUCCESS);
    }


    public static RtData success(Object data) {
        return build(RtCode.SUCCESS,data);
    }

    public static RtData fail() {
        return build(RtCode.NOT_SUCCESS);
    }

    public static RtData fail(String msg) {
        return build(RtCode.NOT_SUCCESS.getCode(),msg);
    }

    public static RtData build(RtCode RtCode) {
        return build(RtCode.getCode(), RtCode.getMsg(), null);
    }
    public static RtData build(RtCode RtCode,Object data) {
        return build(RtCode.getCode(), RtCode.getMsg(), data);
    }


    public static RtData build(int code, String msg) {
        return build(code, msg, null);
    }

    public static RtData build(int code, String msg, Object data) {
        RtData resp = new RtData();
        resp.setCode(code);
        resp.setMsg(msg);
        resp.setData(data);
        return resp;
    }
}
