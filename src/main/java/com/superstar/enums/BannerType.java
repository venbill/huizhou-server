package com.superstar.enums;

/**
 * @Author: BillYu
 * @Description:轮播图类型
 * @Date: Created in 下午11:27 2018/10/15.
 */
public enum BannerType {

    INDEX(1, "平台首页"),
    HOMESTAY(2, "平台首页"),
    BUY(3, "电商首页轮播图");





    private int key;

    private String vale;

    BannerType(int key, String vale) {
        this.key = key;
        this.vale = vale;
    }
}
