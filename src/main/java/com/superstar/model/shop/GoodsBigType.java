package com.superstar.model.shop;

public class GoodsBigType {
    private Integer id;

    private String bigTypeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBigTypeName() {
        return bigTypeName;
    }

    public void setBigTypeName(String bigTypeName) {
        this.bigTypeName = bigTypeName == null ? null : bigTypeName.trim();
    }
}