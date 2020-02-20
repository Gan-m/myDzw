package com.accp.vo.o;

public class Team_artisan {
	private String artisanid;
	private int teamid;
	private int starsid;
	private int isgroup;
	private String aname;
	private int asex;
	private String aphone;
	private String loginaid;
	private String loginapaw;
	private String idcaid;
	private String araddress;
	private String craft;
	private String maintainBrand;
	private String teamname;
	private int fteamid;
	public String getArtisanid() {
		return artisanid;
	}
	public void setArtisanid(String artisanid) {
		this.artisanid = artisanid;
	}
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public int getStarsid() {
		return starsid;
	}
	public void setStarsid(int starsid) {
		this.starsid = starsid;
	}
	public int getIsgroup() {
		return isgroup;
	}
	public void setIsgroup(int isgroup) {
		this.isgroup = isgroup;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public int getAsex() {
		return asex;
	}
	public void setAsex(int asex) {
		this.asex = asex;
	}
	public String getAphone() {
		return aphone;
	}
	public void setAphone(String aphone) {
		this.aphone = aphone;
	}
	public String getLoginaid() {
		return loginaid;
	}
	public void setLoginaid(String loginaid) {
		this.loginaid = loginaid;
	}
	public String getLoginapaw() {
		return loginapaw;
	}
	public void setLoginapaw(String loginapaw) {
		this.loginapaw = loginapaw;
	}
	public String getIdcaid() {
		return idcaid;
	}
	public void setIdcaid(String idcaid) {
		this.idcaid = idcaid;
	}
	public String getAraddress() {
		return araddress;
	}
	public void setAraddress(String araddress) {
		this.araddress = araddress;
	}
	public String getCraft() {
		return craft;
	}
	public void setCraft(String craft) {
		this.craft = craft;
	}
	public String getMaintainBrand() {
		return maintainBrand;
	}
	public void setMaintainBrand(String maintainBrand) {
		this.maintainBrand = maintainBrand;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public int getFteamid() {
		return fteamid;
	}
	public void setFteamid(int fteamid) {
		this.fteamid = fteamid;
	}
	@Override
	public String toString() {
		return "Team_artisan [artisanid=" + artisanid + ", teamid=" + teamid + ", starsid=" + starsid + ", isgroup="
				+ isgroup + ", aname=" + aname + ", asex=" + asex + ", aphone=" + aphone + ", loginaid=" + loginaid
				+ ", loginapaw=" + loginapaw + ", idcaid=" + idcaid + ", araddress=" + araddress + ", craft=" + craft
				+ ", maintainBrand=" + maintainBrand + ", teamname=" + teamname + ", fteamid=" + fteamid + "]";
	}
	public Team_artisan(String artisanid, int teamid, int starsid, int isgroup, String aname, int asex, String aphone,
			String loginaid, String loginapaw, String idcaid, String araddress, String craft, String maintainBrand,
			String teamname, int fteamid) {
		super();
		this.artisanid = artisanid;
		this.teamid = teamid;
		this.starsid = starsid;
		this.isgroup = isgroup;
		this.aname = aname;
		this.asex = asex;
		this.aphone = aphone;
		this.loginaid = loginaid;
		this.loginapaw = loginapaw;
		this.idcaid = idcaid;
		this.araddress = araddress;
		this.craft = craft;
		this.maintainBrand = maintainBrand;
		this.teamname = teamname;
		this.fteamid = fteamid;
	}
	public Team_artisan() {
		super();
	}
	

}
