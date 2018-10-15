package com.superstar.model.shop;

public class GoodsAttributeKey {
    private Long id;

    private Long goodsId;

    private String keyName;

    private Boolean enableSelect;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName == null ? null : keyName.trim();
    }

    public Boolean getEnableSelect() {
        return enableSelect;
    }

    public void setEnableSelect(Boolean enableSelect) {
        this.enableSelect = enableSelect;
    }
}