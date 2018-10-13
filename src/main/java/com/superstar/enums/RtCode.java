package com.superstar.enums;

/**
 * @Author: BillYu
 * @Description: 错误代码及信息
 * @Date: Created in 下午2:44 2018/7/6.
 */

public enum RtCode {


    SUCCESS(200, "请求成功"),

    ILLEGAL_REQUEST(400, "非法请求"),

    NOT_AUTHORIZATION(401, "未授权"),

    NOT_SUCCESS(402, "请求失败"),

    ILLEGAL_PARAM(403, "参数异常"),

    FALL_BACK(405, "断路返回"),

    SERVER_ERROR(500, "服务器异常");


    private int code;

    private String msg;

    RtCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
