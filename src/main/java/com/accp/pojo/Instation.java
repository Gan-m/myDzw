package com.accp.pojo;

import java.util.Date;

public class Instation {
    private Integer insid;

    private Integer wxstateid;

    private String artisanid;

    private Integer ctsid;

    private String instation;

    private String jsyuan;

    private Date joininstimes;

    private Date predictcompletetime;

    private Date predicttime;

    private Float budgetmoney;

    private String insevent;

    private Boolean iszn;

    private Boolean ifjs;

    public Integer getInsid() {
        return insid;
    }

    public void setInsid(Integer insid) {
        this.insid = insid;
    }

    public Integer getWxstateid() {
        return wxstateid;
    }

    public void setWxstateid(Integer wxstateid) {
        this.wxstateid = wxstateid;
    }

    public String getArtisanid() {
        return artisanid;
    }

    public void setArtisanid(String artisanid) {
        this.artisanid = artisanid == null ? null : artisanid.trim();
    }

    public Integer getCtsid() {
        return ctsid;
    }

    public void setCtsid(Integer ctsid) {
        this.ctsid = ctsid;
    }

    public String getInstation() {
        return instation;
    }

    public void setInstation(String instation) {
        this.instation = instation == null ? null : instation.trim();
    }

    public String getJsyuan() {
        return jsyuan;
    }

    public void setJsyuan(String jsyuan) {
        this.jsyuan = jsyuan == null ? null : jsyuan.trim();
    }

    public Date getJoininstimes() {
        return joininstimes;
    }

    public void setJoininstimes(Date joininstimes) {
        this.joininstimes = joininstimes;
    }

    public Date getPredictcompletetime() {
        return predictcompletetime;
    }

    public void setPredictcompletetime(Date predictcompletetime) {
        this.predictcompletetime = predictcompletetime;
    }

    public Date getPredicttime() {
        return predicttime;
    }

    public void setPredicttime(Date predicttime) {
        this.predicttime = predicttime;
    }

    public Float getBudgetmoney() {
        return budgetmoney;
    }

    public void setBudgetmoney(Float budgetmoney) {
        this.budgetmoney = budgetmoney;
    }

    public String getInsevent() {
        return insevent;
    }

    public void setInsevent(String insevent) {
        this.insevent = insevent == null ? null : insevent.trim();
    }

    public Boolean getIszn() {
        return iszn;
    }

    public void setIszn(Boolean iszn) {
        this.iszn = iszn;
    }

    public Boolean getIfjs() {
        return ifjs;
    }

    public void setIfjs(Boolean ifjs) {
        this.ifjs = ifjs;
    }
}