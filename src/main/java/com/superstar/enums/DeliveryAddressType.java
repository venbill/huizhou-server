package com.superstar.enums;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午9:35 2018/10/18.
 */
public enum DeliveryAddressType {

    Home(1,"家"),
    Company(2,"公司"),
    School(3,"学校");



    private int key;

    private String value;

    DeliveryAddressType(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
