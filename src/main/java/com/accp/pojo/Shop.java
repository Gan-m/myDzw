package com.accp.pojo;

public class Shop {
    private String shopid;

    private String firmno;

    private Integer stateid;

    private String storeid;

    private Integer unitid;

    private Integer gid;

    private String shopname;

    private String sbrand;

    private Integer weight;

    private String pictrueurl;

    private Float stockprice;

    private Float bjmoney;

    private Float hymoney;

    private Float vipmoney;

    private Float rxyprice;

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public String getFirmno() {
        return firmno;
    }

    public void setFirmno(String firmno) {
        this.firmno = firmno == null ? null : firmno.trim();
    }

    public Integer getStateid() {
        return stateid;
    }

    public void setStateid(Integer stateid) {
        this.stateid = stateid;
    }

    public String getStoreid() {
        return storeid;
    }

    public void setStoreid(String storeid) {
        this.storeid = storeid == null ? null : storeid.trim();
    }

    public Integer getUnitid() {
        return unitid;
    }

    public void setUnitid(Integer unitid) {
        this.unitid = unitid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public String getSbrand() {
        return sbrand;
    }

    public void setSbrand(String sbrand) {
        this.sbrand = sbrand == null ? null : sbrand.trim();
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getPictrueurl() {
        return pictrueurl;
    }

    public void setPictrueurl(String pictrueurl) {
        this.pictrueurl = pictrueurl == null ? null : pictrueurl.trim();
    }

    public Float getStockprice() {
        return stockprice;
    }

    public void setStockprice(Float stockprice) {
        this.stockprice = stockprice;
    }

    public Float getBjmoney() {
        return bjmoney;
    }

    public void setBjmoney(Float bjmoney) {
        this.bjmoney = bjmoney;
    }

    public Float getHymoney() {
        return hymoney;
    }

    public void setHymoney(Float hymoney) {
        this.hymoney = hymoney;
    }

    public Float getVipmoney() {
        return vipmoney;
    }

    public void setVipmoney(Float vipmoney) {
        this.vipmoney = vipmoney;
    }

    public Float getRxyprice() {
        return rxyprice;
    }

    public void setRxyprice(Float rxyprice) {
        this.rxyprice = rxyprice;
    }
}