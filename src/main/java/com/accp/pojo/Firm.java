package com.accp.pojo;

public class Firm {
    private String firmno;

    private Integer cityid;

    private String firmname;

    private String firmaddress;

    private String url;

    private String gsphone;

    private String lxr;

    private String lxrphone;

    private String scity;

    private String firmsevenst;

    public String getFirmno() {
        return firmno;
    }

    public void setFirmno(String firmno) {
        this.firmno = firmno == null ? null : firmno.trim();
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public String getFirmname() {
        return firmname;
    }

    public void setFirmname(String firmname) {
        this.firmname = firmname == null ? null : firmname.trim();
    }

    public String getFirmaddress() {
        return firmaddress;
    }

    public void setFirmaddress(String firmaddress) {
        this.firmaddress = firmaddress == null ? null : firmaddress.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getGsphone() {
        return gsphone;
    }

    public void setGsphone(String gsphone) {
        this.gsphone = gsphone == null ? null : gsphone.trim();
    }

    public String getLxr() {
        return lxr;
    }

    public void setLxr(String lxr) {
        this.lxr = lxr == null ? null : lxr.trim();
    }

    public String getLxrphone() {
        return lxrphone;
    }

    public void setLxrphone(String lxrphone) {
        this.lxrphone = lxrphone == null ? null : lxrphone.trim();
    }

    public String getScity() {
        return scity;
    }

    public void setScity(String scity) {
        this.scity = scity == null ? null : scity.trim();
    }

    public String getFirmsevenst() {
        return firmsevenst;
    }

    public void setFirmsevenst(String firmsevenst) {
        this.firmsevenst = firmsevenst == null ? null : firmsevenst.trim();
    }
}