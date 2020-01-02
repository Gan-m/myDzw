package com.accp.pojo;

public class Store {
    private String storeid;

    private String storenames;

    private String clicity;

    private String storeaddress;

    public String getStoreid() {
        return storeid;
    }

    public void setStoreid(String storeid) {
        this.storeid = storeid == null ? null : storeid.trim();
    }

    public String getStorenames() {
        return storenames;
    }

    public void setStorenames(String storenames) {
        this.storenames = storenames == null ? null : storenames.trim();
    }

    public String getClicity() {
        return clicity;
    }

    public void setClicity(String clicity) {
        this.clicity = clicity == null ? null : clicity.trim();
    }

    public String getStoreaddress() {
        return storeaddress;
    }

    public void setStoreaddress(String storeaddress) {
        this.storeaddress = storeaddress == null ? null : storeaddress.trim();
    }
}