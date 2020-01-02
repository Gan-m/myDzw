package com.accp.pojo;

public class Wxstate {
    private Integer wxstateid;

    private String wxstatename;

    public Integer getWxstateid() {
        return wxstateid;
    }

    public void setWxstateid(Integer wxstateid) {
        this.wxstateid = wxstateid;
    }

    public String getWxstatename() {
        return wxstatename;
    }

    public void setWxstatename(String wxstatename) {
        this.wxstatename = wxstatename == null ? null : wxstatename.trim();
    }
}