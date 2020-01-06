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

	@Override
	public String toString() {
		return "Stars [starsid=" + starsid + ", starsname=" + starsname + ", starsprices=" + starsprices + "]";
	}

	public Stars(Integer starsid, String starsname, Float starsprices) {
		super();
		this.starsid = starsid;
		this.starsname = starsname;
		this.starsprices = starsprices;
	}

	public Stars() {
		super();
	}
    
    
}