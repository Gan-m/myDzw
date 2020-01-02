package com.accp.pojo;

import java.util.Date;

public class Cashiers {
    private Integer casid;

    private Integer insid;

    private Float cashiersprice;

    private Float shijprice;

    private String paymenttemp;

    private Float jfdk;

    private Date cashierstimes;

    public Integer getCasid() {
        return casid;
    }

    public void setCasid(Integer casid) {
        this.casid = casid;
    }

    public Integer getInsid() {
        return insid;
    }

    public void setInsid(Integer insid) {
        this.insid = insid;
    }

    public Float getCashiersprice() {
        return cashiersprice;
    }

    public void setCashiersprice(Float cashiersprice) {
        this.cashiersprice = cashiersprice;
    }

    public Float getShijprice() {
        return shijprice;
    }

    public void setShijprice(Float shijprice) {
        this.shijprice = shijprice;
    }

    public String getPaymenttemp() {
        return paymenttemp;
    }

    public void setPaymenttemp(String paymenttemp) {
        this.paymenttemp = paymenttemp == null ? null : paymenttemp.trim();
    }

    public Float getJfdk() {
        return jfdk;
    }

    public void setJfdk(Float jfdk) {
        this.jfdk = jfdk;
    }

    public Date getCashierstimes() {
        return cashierstimes;
    }

    public void setCashierstimes(Date cashierstimes) {
        this.cashierstimes = cashierstimes;
    }
}