package com.accp.pojo;
/**
 * 外勤车辆的实体
 * @author Administrator
 *
 */
public class Workcars {
    private Integer wid;

    private Integer teamid;

    private String caid;

    private String carbrand;

    private String cartype;

    private Integer clic;
    
    private String teamname;


	@Override
	public String toString() {
		return "Workcars [wid=" + wid + ", teamid=" + teamid + ", caid=" + caid + ", carbrand=" + carbrand
				+ ", cartype=" + cartype + ", clic=" + clic + ", teamname=" + teamname + "]";
	}

	public Workcars() {
		super();
	}

	public Workcars(Integer wid, Integer teamid, String caid, String carbrand, String cartype, Integer clic,
			String teamname) {
		super();
		this.wid = wid;
		this.teamid = teamid;
		this.caid = caid;
		this.carbrand = carbrand;
		this.cartype = cartype;
		this.clic = clic;
		this.teamname = teamname;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public String getCaid() {
        return caid;
    }

    public void setCaid(String caid) {
        this.caid = caid == null ? null : caid.trim();
    }

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand == null ? null : carbrand.trim();
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }

    public Integer getClic() {
        return clic;
    }

    public void setClic(Integer clic) {
        this.clic = clic;
    }

	

}