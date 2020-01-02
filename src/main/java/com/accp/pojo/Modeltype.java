package com.accp.pojo;

public class Modeltype {
    private String cartypeid;

    private Integer engineid;

    private Integer ctsid;

    private String cartypename;

    private Float ckprice;

    public String getCartypeid() {
        return cartypeid;
    }

    public void setCartypeid(String cartypeid) {
        this.cartypeid = cartypeid == null ? null : cartypeid.trim();
    }

    public Integer getEngineid() {
        return engineid;
    }

    public void setEngineid(Integer engineid) {
        this.engineid = engineid;
    }

    public Integer getCtsid() {
        return ctsid;
    }

    public void setCtsid(Integer ctsid) {
        this.ctsid = ctsid;
    }

    public String getCartypename() {
        return cartypename;
    }

    public void setCartypename(String cartypename) {
        this.cartypename = cartypename == null ? null : cartypename.trim();
    }

    public Float getCkprice() {
        return ckprice;
    }

    public void setCkprice(Float ckprice) {
        this.ckprice = ckprice;
    }
}