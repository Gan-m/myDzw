package com.accp.vo.q;

public class ArtisanVo {
	 	private String artisanid;

	 	private String teamname;

	    private String starsname;

	    private Boolean isgroup;

	    private String aname;

	    private Integer asex;

	    private String aphone;

	    private String loginaid;

	    private String loginapaw;

	    private String idcaid;

	    private String araddress;

	    private String craft;

	    private String maintainbrand;

		public ArtisanVo(String artisanid, String teamname, String starsname, Boolean isgroup, String aname,
				Integer asex, String aphone, String loginaid, String loginapaw, String idcaid, String araddress,
				String craft, String maintainbrand) {
			super();
			this.artisanid = artisanid;
			this.teamname = teamname;
			this.starsname = starsname;
			this.isgroup = isgroup;
			this.aname = aname;
			this.asex = asex;
			this.aphone = aphone;
			this.loginaid = loginaid;
			this.loginapaw = loginapaw;
			this.idcaid = idcaid;
			this.araddress = araddress;
			this.craft = craft;
			this.maintainbrand = maintainbrand;
		}

		public ArtisanVo() {
			super();
		}

		public String getArtisanid() {
			return artisanid;
		}

		public void setArtisanid(String artisanid) {
			this.artisanid = artisanid;
		}

		public String getTeamname() {
			return teamname;
		}

		public void setTeamname(String teamname) {
			this.teamname = teamname;
		}

		public String getStarsname() {
			return starsname;
		}

		public void setStarsname(String starsname) {
			this.starsname = starsname;
		}

		public Boolean getIsgroup() {
			return isgroup;
		}

		public void setIsgroup(Boolean isgroup) {
			this.isgroup = isgroup;
		}

		public String getAname() {
			return aname;
		}

		public void setAname(String aname) {
			this.aname = aname;
		}

		public Integer getAsex() {
			return asex;
		}

		public void setAsex(Integer asex) {
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

		public String getMaintainbrand() {
			return maintainbrand;
		}

		public void setMaintainbrand(String maintainbrand) {
			this.maintainbrand = maintainbrand;
		}

		@Override
		public String toString() {
			return "ArtisanVo [artisanid=" + artisanid + ", teamname=" + teamname + ", starsname=" + starsname
					+ ", isgroup=" + isgroup + ", aname=" + aname + ", asex=" + asex + ", aphone=" + aphone
					+ ", loginaid=" + loginaid + ", loginapaw=" + loginapaw + ", idcaid=" + idcaid + ", araddress="
					+ araddress + ", craft=" + craft + ", maintainbrand=" + maintainbrand + "]";
		}
	    
	    
}
