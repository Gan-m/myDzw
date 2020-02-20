package com.accp.pojo;

public class Team {
    private Integer teamid;

    private String teamname;

    private Integer fteamid;

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname == null ? null : teamname.trim();
    }

    public Integer getFteamid() {
        return fteamid;
    }

    public void setFteamid(Integer fteamid) {
        this.fteamid = fteamid;
    }

	@Override
	public String toString() {
		return "Team [teamid=" + teamid + ", teamname=" + teamname + ", fteamid=" + fteamid + "]";
	}
    
}