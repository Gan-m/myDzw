package com.accp.pojo;

public class Artisan {
    private String artisanid;

    private Integer teamid;

    private Integer starsid;

    private Boolean isgroup;

    private String aname;

    private Integer asex;

    private String aphone;

    private String loginaid;

    private String loginapaw;

    private String idcaid;

    private String araddress;

    private String craft;

    private String maintainbrand;

    public String getArtisanid() {
        return artisanid;
    }

    public void setArtisanid(String artisanid) {
        this.artisanid = artisanid == null ? null : artisanid.trim();
    }

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public Integer getStarsid() {
        return starsid;
    }

    public void setStarsid(Integer starsid) {
        this.starsid = starsid;
    }

    public Boolean getIsgroup() {
        return isgroup;
    }

    public void setIsgroup(Boolean isgroup) {
        this.isgroup = isgroup;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public Integer getAsex() {
        return asex;
    }

    public void setAsex(Integer asex) {
        this.asex = asex;
    }

    public String getAphone() {
        return aphone;
    }

    public void setAphone(String aphone) {
        this.aphone = aphone == null ? null : aphone.trim();
    }

    public String getLoginaid() {
        return loginaid;
    }

    public void setLoginaid(String loginaid) {
        this.loginaid = loginaid == null ? null : loginaid.trim();
    }

    public String getLoginapaw() {
        return loginapaw;
    }

    public void setLoginapaw(String loginapaw) {
        this.loginapaw = loginapaw == null ? null : loginapaw.trim();
    }

    public String getIdcaid() {
        return idcaid;
    }

    public void setIdcaid(String idcaid) {
        this.idcaid = idcaid == null ? null : idcaid.trim();
    }

    public String getAraddress() {
        return araddress;
    }

    public void setAraddress(String araddress) {
        this.araddress = araddress == null ? null : araddress.trim();
    }

    public String getCraft() {
        return craft;
    }

    public void setCraft(String craft) {
        this.craft = craft == null ? null : craft.trim();
    }

    public String getMaintainbrand() {
        return maintainbrand;
    }

    public void setMaintainbrand(String maintainbrand) {
        this.maintainbrand = maintainbrand == null ? null : maintainbrand.trim();
    }
}