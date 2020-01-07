package com.accp.vo.q;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class EmpVo {
	
	private String employeeid;

    private Integer propertyid;

    private String storeid;

    private String depnames;

    private Integer stateid;

    private String empname;

    private Integer esex;

    private String emplogenid;

    private String emplogepaw;

    private String education;

    private String graduationschool;

    private String major;

    private String crrdid;

    private String address;

    private String newaddress;

    private String empphone;

    private String emergencyphone;

    private String molphone;

    private String email;

    @JSONField(format="yyyy-MM-dd")
    private Date entrytimes;
    @JSONField(format="yyyy-MM-dd")
    private Date lztimes;
    @JSONField(format="yyyy-MM-dd")
    private Date brithtimes;
	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	public Integer getPropertyid() {
		return propertyid;
	}
	public void setPropertyid(Integer propertyid) {
		this.propertyid = propertyid;
	}
	public String getStoreid() {
		return storeid;
	}
	public void setStoreid(String storeid) {
		this.storeid = storeid;
	}
	public String getDepnames() {
		return depnames;
	}
	public void setDepnames(String depnames) {
		this.depnames = depnames;
	}
	public Integer getStateid() {
		return stateid;
	}
	public void setStateid(Integer stateid) {
		this.stateid = stateid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Integer getEsex() {
		return esex;
	}
	public void setEsex(Integer esex) {
		this.esex = esex;
	}
	public String getEmplogenid() {
		return emplogenid;
	}
	public void setEmplogenid(String emplogenid) {
		this.emplogenid = emplogenid;
	}
	public String getEmplogepaw() {
		return emplogepaw;
	}
	public void setEmplogepaw(String emplogepaw) {
		this.emplogepaw = emplogepaw;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getGraduationschool() {
		return graduationschool;
	}
	public void setGraduationschool(String graduationschool) {
		this.graduationschool = graduationschool;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getCrrdid() {
		return crrdid;
	}
	public void setCrrdid(String crrdid) {
		this.crrdid = crrdid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNewaddress() {
		return newaddress;
	}
	public void setNewaddress(String newaddress) {
		this.newaddress = newaddress;
	}
	public String getEmpphone() {
		return empphone;
	}
	public void setEmpphone(String empphone) {
		this.empphone = empphone;
	}
	public String getEmergencyphone() {
		return emergencyphone;
	}
	public void setEmergencyphone(String emergencyphone) {
		this.emergencyphone = emergencyphone;
	}
	public String getMolphone() {
		return molphone;
	}
	public void setMolphone(String molphone) {
		this.molphone = molphone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getEntrytimes() {
		return entrytimes;
	}
	public void setEntrytimes(Date entrytimes) {
		this.entrytimes = entrytimes;
	}
	public Date getLztimes() {
		return lztimes;
	}
	public void setLztimes(Date lztimes) {
		this.lztimes = lztimes;
	}
	public Date getBrithtimes() {
		return brithtimes;
	}
	public void setBrithtimes(Date brithtimes) {
		this.brithtimes = brithtimes;
	}
	public EmpVo(String employeeid, Integer propertyid, String storeid, String depnames, Integer stateid,
			String empname, Integer esex, String emplogenid, String emplogepaw, String education,
			String graduationschool, String major, String crrdid, String address, String newaddress, String empphone,
			String emergencyphone, String molphone, String email, Date entrytimes, Date lztimes, Date brithtimes) {
		super();
		this.employeeid = employeeid;
		this.propertyid = propertyid;
		this.storeid = storeid;
		this.depnames = depnames;
		this.stateid = stateid;
		this.empname = empname;
		this.esex = esex;
		this.emplogenid = emplogenid;
		this.emplogepaw = emplogepaw;
		this.education = education;
		this.graduationschool = graduationschool;
		this.major = major;
		this.crrdid = crrdid;
		this.address = address;
		this.newaddress = newaddress;
		this.empphone = empphone;
		this.emergencyphone = emergencyphone;
		this.molphone = molphone;
		this.email = email;
		this.entrytimes = entrytimes;
		this.lztimes = lztimes;
		this.brithtimes = brithtimes;
	}
	public EmpVo() {
		super();
	}
	@Override
	public String toString() {
		return "EmpVo [employeeid=" + employeeid + ", propertyid=" + propertyid + ", storeid=" + storeid + ", depnames="
				+ depnames + ", stateid=" + stateid + ", empname=" + empname + ", esex=" + esex + ", emplogenid="
				+ emplogenid + ", emplogepaw=" + emplogepaw + ", education=" + education + ", graduationschool="
				+ graduationschool + ", major=" + major + ", crrdid=" + crrdid + ", address=" + address
				+ ", newaddress=" + newaddress + ", empphone=" + empphone + ", emergencyphone=" + emergencyphone
				+ ", molphone=" + molphone + ", email=" + email + ", entrytimes=" + entrytimes + ", lztimes=" + lztimes
				+ ", brithtimes=" + brithtimes + "]";
	}

    
}
