package com.accp.pojo;

public class Stars {
    private Integer starsid;

    private String starsname;

    private Float starsprices;

    public Integer getStarsid() {
        return starsid;
    }

    public void setStarsid(Integer starsid) {
        this.starsid = starsid;
    }

    public String getStarsname() {
        return starsname;
    }

    public void setStarsname(String starsname) {
        this.starsname = starsname == null ? null : starsname.trim();
    }

    public Float getStarsprices() {
        return starsprices;
    }

    public void setStarsprices(Float starsprices) {
        this.starsprices = starsprices;
    }
}