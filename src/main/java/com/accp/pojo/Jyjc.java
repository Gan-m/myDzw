package com.accp.pojo;

import java.util.Date;

public class Jyjc {
    private Integer jyid;

    private Integer teamid;

    private Integer insid;

    private Integer nilc;

    private Date pgtime;

    private Date gototime;

    private String gotoaddress;

    private Date dotime;

    private String doaddress;

    private Date overtime;

    public Integer getJyid() {
        return jyid;
    }

    public void setJyid(Integer jyid) {
        this.jyid = jyid;
    }

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public Integer getInsid() {
        return insid;
    }

    public void setInsid(Integer insid) {
        this.insid = insid;
    }

    public Integer getNilc() {
        return nilc;
    }

    public void setNilc(Integer nilc) {
        this.nilc = nilc;
    }

    public Date getPgtime() {
        return pgtime;
    }

    public void setPgtime(Date pgtime) {
        this.pgtime = pgtime;
    }

    public Date getGototime() {
        return gototime;
    }

    public void setGototime(Date gototime) {
        this.gototime = gototime;
    }

    public String getGotoaddress() {
        return gotoaddress;
    }

    public void setGotoaddress(String gotoaddress) {
        this.gotoaddress = gotoaddress == null ? null : gotoaddress.trim();
    }

    public Date getDotime() {
        return dotime;
    }

    public void setDotime(Date dotime) {
        this.dotime = dotime;
    }

    public String getDoaddress() {
        return doaddress;
    }

    public void setDoaddress(String doaddress) {
        this.doaddress = doaddress == null ? null : doaddress.trim();
    }

    public Date getOvertime() {
        return overtime;
    }

    public void setOvertime(Date overtime) {
        this.overtime = overtime;
    }
}