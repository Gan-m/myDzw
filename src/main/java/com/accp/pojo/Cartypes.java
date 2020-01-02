package com.accp.pojo;

public class Cartypes {
    private Integer ctsid;

    private String ctsnames;

    private String cartypeszm;

    public Integer getCtsid() {
        return ctsid;
    }

    public void setCtsid(Integer ctsid) {
        this.ctsid = ctsid;
    }

    public String getCtsnames() {
        return ctsnames;
    }

    public void setCtsnames(String ctsnames) {
        this.ctsnames = ctsnames == null ? null : ctsnames.trim();
    }

    public String getCartypeszm() {
        return cartypeszm;
    }

    public void setCartypeszm(String cartypeszm) {
        this.cartypeszm = cartypeszm == null ? null : cartypeszm.trim();
    }
}