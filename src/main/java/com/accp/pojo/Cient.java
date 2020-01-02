package com.accp.pojo;

import java.util.Date;

public class Cient {
    private String clientno;

    private Integer mid;

    private String artisanid;

    private String clientname;

    private String cphone;

    private String caddress;

    private Date cbrind;

    private String khsf;

    private String city;

    private String county;

    private String khbz;

    public String getClientno() {
        return clientno;
    }

    public void setClientno(String clientno) {
        this.clientno = clientno == null ? null : clientno.trim();
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getArtisanid() {
        return artisanid;
    }

    public void setArtisanid(String artisanid) {
        this.artisanid = artisanid == null ? null : artisanid.trim();
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname == null ? null : clientname.trim();
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone == null ? null : cphone.trim();
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress == null ? null : caddress.trim();
    }

    public Date getCbrind() {
        return cbrind;
    }

    public void setCbrind(Date cbrind) {
        this.cbrind = cbrind;
    }

    public String getKhsf() {
        return khsf;
    }

    public void setKhsf(String khsf) {
        this.khsf = khsf == null ? null : khsf.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getKhbz() {
        return khbz;
    }

    public void setKhbz(String khbz) {
        this.khbz = khbz == null ? null : khbz.trim();
    }
}