package com.accp.vo.q;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class DimVo {
	
	private Integer dimissionid;
	
	private String employeeid;

    private String empname;

    private String depnames;

    @JSONField(format="yyyy-MM-dd")
    private Date dimtimes;

    private String dimreasona;
    
    private String depnamesfa;

	private int esex;

	

	public DimVo(Integer dimissionid, String employeeid, String empname, String depnames, Date dimtimes,
			String dimreasona, String depnamesfa, int esex) {
		super();
		this.dimissionid = dimissionid;
		this.employeeid = employeeid;
		this.empname = empname;
		this.depnames = depnames;
		this.dimtimes = dimtimes;
		this.dimreasona = dimreasona;
		this.depnamesfa = depnamesfa;
		this.esex = esex;
	}

	public DimVo() {
		super();
	}

	public Integer getDimissionid() {
		return dimissionid;
	}

	public void setDimissionid(Integer dimissionid) {
		this.dimissionid = dimissionid;
	}

	public String getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getDepnames() {
		return depnames;
	}

	public void setDepnames(String depnames) {
		this.depnames = depnames;
	}

	public Date getDimtimes() {
		return dimtimes;
	}

	public void setDimtimes(Date dimtimes) {
		this.dimtimes = dimtimes;
	}

	public String getDimreasona() {
		return dimreasona;
	}

	public void setDimreasona(String dimreasona) {
		this.dimreasona = dimreasona;
	}

	public String getDepnamesfa() {
		return depnamesfa;
	}

	public void setDepnamesfa(String depnamesfa) {
		this.depnamesfa = depnamesfa;
	}

	public int getEsex() {
		return esex;
	}

	public void setEsex(int esex) {
		this.esex = esex;
	}

	@Override
	public String toString() {
		return "DimVo [dimissionid=" + dimissionid + ", employeeid=" + employeeid + ", empname=" + empname
				+ ", depnames=" + depnames + ", dimtimes=" + dimtimes + ", dimreasona=" + dimreasona + ", depnamesfa="
				+ depnamesfa + ", esex=" + esex + "]";
	}

	
	
}
