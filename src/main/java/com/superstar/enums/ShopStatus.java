package com.superstar.enums;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午11:06 2018/10/16.
 */
public enum ShopStatus {

    OK(1, "正常营业"),
    TO_CHECK(2, "待审核"),
    FROZEN(3, "冻结"),
    DOWN(4, "店铺已下线");


    private int code;
    private String content;

    ShopStatus(int code, String content) {
        this.code = code;
        this.content = content;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
