package com.accp.pojo;

public class Department {
    private Integer departmentid;

    private String depnames;

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepnames() {
        return depnames;
    }

    public void setDepnames(String depnames) {
        this.depnames = depnames == null ? null : depnames.trim();
    }
}