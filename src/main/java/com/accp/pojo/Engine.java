package com.accp.pojo;

public class Engine {
    private Integer engineid;

    private String enginename;

    public Integer getEngineid() {
        return engineid;
    }

    public void setEngineid(Integer engineid) {
        this.engineid = engineid;
    }

    public String getEnginename() {
        return enginename;
    }

    public void setEnginename(String enginename) {
        this.enginename = enginename == null ? null : enginename.trim();
    }

	@Override
	public String toString() {
		return "Engine [engineid=" + engineid + ", enginename=" + enginename + "]";
	}

	public Engine(Integer engineid, String enginename) {
		super();
		this.engineid = engineid;
		this.enginename = enginename;
	}

	public Engine() {
		super();
	}
    
}