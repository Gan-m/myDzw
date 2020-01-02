package com.accp.pojo;

import java.util.Date;

public class Clientcar {
    private String cno;

    private String clientno;

    private Integer ctsid;

    private String driver;

    private String driverphone;

    private Date driverbirth;

    private Integer clicang;

    private Date purchasetime;

    private Date jctime;

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno == null ? null : cno.trim();
    }

    public String getClientno() {
        return clientno;
    }

    public void setClientno(String clientno) {
        this.clientno = clientno == null ? null : clientno.trim();
    }

    public Integer getCtsid() {
        return ctsid;
    }

    public void setCtsid(Integer ctsid) {
        this.ctsid = ctsid;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver == null ? null : driver.trim();
    }

    public String getDriverphone() {
        return driverphone;
    }

    public void setDriverphone(String driverphone) {
        this.driverphone = driverphone == null ? null : driverphone.trim();
    }

    public Date getDriverbirth() {
        return driverbirth;
    }

    public void setDriverbirth(Date driverbirth) {
        this.driverbirth = driverbirth;
    }

    public Integer getClicang() {
        return clicang;
    }

    public void setClicang(Integer clicang) {
        this.clicang = clicang;
    }

    public Date getPurchasetime() {
        return purchasetime;
    }

    public void setPurchasetime(Date purchasetime) {
        this.purchasetime = purchasetime;
    }

    public Date getJctime() {
        return jctime;
    }

    public void setJctime(Date jctime) {
        this.jctime = jctime;
    }
}