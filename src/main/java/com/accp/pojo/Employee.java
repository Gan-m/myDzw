package com.accp.pojo;

import java.util.Date;

public class Employee {
    private String employeeid;

    private Integer propertyid;

    private String storeid;

    private Integer departmentid;

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

    private Date entrytimes;

    private Date lztimes;

    private Date brithtimes;

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid == null ? null : employeeid.trim();
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
        this.storeid = storeid == null ? null : storeid.trim();
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
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
        this.empname = empname == null ? null : empname.trim();
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
        this.emplogenid = emplogenid == null ? null : emplogenid.trim();
    }

    public String getEmplogepaw() {
        return emplogepaw;
    }

    public void setEmplogepaw(String emplogepaw) {
        this.emplogepaw = emplogepaw == null ? null : emplogepaw.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getGraduationschool() {
        return graduationschool;
    }

    public void setGraduationschool(String graduationschool) {
        this.graduationschool = graduationschool == null ? null : graduationschool.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getCrrdid() {
        return crrdid;
    }

    public void setCrrdid(String crrdid) {
        this.crrdid = crrdid == null ? null : crrdid.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getNewaddress() {
        return newaddress;
    }

    public void setNewaddress(String newaddress) {
        this.newaddress = newaddress == null ? null : newaddress.trim();
    }

    public String getEmpphone() {
        return empphone;
    }

    public void setEmpphone(String empphone) {
        this.empphone = empphone == null ? null : empphone.trim();
    }

    public String getEmergencyphone() {
        return emergencyphone;
    }

    public void setEmergencyphone(String emergencyphone) {
        this.emergencyphone = emergencyphone == null ? null : emergencyphone.trim();
    }

    public String getMolphone() {
        return molphone;
    }

    public void setMolphone(String molphone) {
        this.molphone = molphone == null ? null : molphone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", propertyid=" + propertyid + ", storeid=" + storeid
				+ ", departmentid=" + departmentid + ", stateid=" + stateid + ", empname=" + empname + ", esex=" + esex
				+ ", emplogenid=" + emplogenid + ", emplogepaw=" + emplogepaw + ", education=" + education
				+ ", graduationschool=" + graduationschool + ", major=" + major + ", crrdid=" + crrdid + ", address="
				+ address + ", newaddress=" + newaddress + ", empphone=" + empphone + ", emergencyphone="
				+ emergencyphone + ", molphone=" + molphone + ", email=" + email + ", entrytimes=" + entrytimes
				+ ", lztimes=" + lztimes + ", brithtimes=" + brithtimes + "]";
	}
    
    
}