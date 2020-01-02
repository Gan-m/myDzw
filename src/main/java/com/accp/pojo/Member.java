package com.accp.pojo;

public class Member {
    private Integer mid;

    private String membername;

    private Float baifb;

    private Float memberjfcount;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername == null ? null : membername.trim();
    }

    public Float getBaifb() {
        return baifb;
    }

    public void setBaifb(Float baifb) {
        this.baifb = baifb;
    }

    public Float getMemberjfcount() {
        return memberjfcount;
    }

    public void setMemberjfcount(Float memberjfcount) {
        this.memberjfcount = memberjfcount;
    }
}