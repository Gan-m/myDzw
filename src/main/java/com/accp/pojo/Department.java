package com.accp.pojo;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private Integer departmentid;

    private String depnames;
    
    private String depfaid;
    
    private List<Fuction> flist =new ArrayList<Fuction>();

    public List<Fuction> getFlist() {
		return flist;
	}

	public void setFlist(List<Fuction> flist) {
		this.flist = flist;
	}

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
    
}