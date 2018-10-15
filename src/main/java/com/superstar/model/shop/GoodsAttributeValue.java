package com.superstar.model.shop;

public class GoodsAttributeValue {
    private Long id;

    private Long keyId;

    private String value;

    private Integer order;

    private Boolean isDefaultSelect;

    private Boolean isEnableSelect;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getKeyId() {
        return keyId;
    }

    public void setKeyId(Long keyId) {
        this.keyId = keyId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Boolean getIsDefaultSelect() {
        return isDefaultSelect;
    }

    public void setIsDefaultSelect(Boolean isDefaultSelect) {
        this.isDefaultSelect = isDefaultSelect;
    }

    public Boolean getIsEnableSelect() {
        return isEnableSelect;
    }

    public void setIsEnableSelect(Boolean isEnableSelect) {
        this.isEnableSelect = isEnableSelect;
    }
}