package com.accp.pojo;

public class Department {
    private Integer departmentid;

    private String depnames;
    
    private String depfaid;

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

	public String getDepfaid() {
		return depfaid;
	}

	public void setDepfaid(String depfaid) {
		this.depfaid = depfaid;
	}

	@Override
	public String toString() {
		return "Department [departmentid=" + departmentid + ", depnames=" + depnames + ", depfaid=" + depfaid + "]";
	}
    
}