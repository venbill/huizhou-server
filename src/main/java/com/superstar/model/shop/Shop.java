package com.superstar.model.shop;

import java.util.Date;

public class Shop {
    private Integer id;

    private String shopName;

    private String description;

    private String headerPicture;

    private Byte status;

    private Date createTime;

    private Long createUser;

    private Date updateTime;

    private Long updateUser;

    private String address;

    private Double addressX;

    private Double addressY;

    private Integer province;

    private Integer city;

    private Integer county;

    private String provinceName;

    private String cityName;

    private String countyName;

    private String bigTypes;

    private String smallTypes;

    private Boolean openHomestay;

    private Boolean openBuy;

    private String serviceTime;

    private String serviceTel;

    private Long shopKeeper;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getHeaderPicture() {
        return headerPicture;
    }

    public void setHeaderPicture(String headerPicture) {
        this.headerPicture = headerPicture == null ? null : headerPicture.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Double getAddressX() {
        return addressX;
    }

    public void setAddressX(Double addressX) {
        this.addressX = addressX;
    }

    public Double getAddressY() {
        return addressY;
    }

    public void setAddressY(Double addressY) {
        this.addressY = addressY;
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getCounty() {
        return county;
    }

    public void setCounty(Integer county) {
        this.county = county;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName == null ? null : countyName.trim();
    }

    public String getBigTypes() {
        return bigTypes;
    }

    public void setBigTypes(String bigTypes) {
        this.bigTypes = bigTypes == null ? null : bigTypes.trim();
    }

    public String getSmallTypes() {
        return smallTypes;
    }

    public void setSmallTypes(String smallTypes) {
        this.smallTypes = smallTypes == null ? null : smallTypes.trim();
    }

    public Boolean getOpenHomestay() {
        return openHomestay;
    }

    public void setOpenHomestay(Boolean openHomestay) {
        this.openHomestay = openHomestay;
    }

    public Boolean getOpenBuy() {
        return openBuy;
    }

    public void setOpenBuy(Boolean openBuy) {
        this.openBuy = openBuy;
    }

    public String getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(String serviceTime) {
        this.serviceTime = serviceTime == null ? null : serviceTime.trim();
    }

    public String getServiceTel() {
        return serviceTel;
    }

    public void setServiceTel(String serviceTel) {
        this.serviceTel = serviceTel == null ? null : serviceTel.trim();
    }

    public Long getShopKeeper() {
        return shopKeeper;
    }

    public void setShopKeeper(Long shopKeeper) {
        this.shopKeeper = shopKeeper;
    }
}