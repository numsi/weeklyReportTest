package com.test.weekly_report.entity;

public class Team {
	int team_uid;//团队uid
	String team_id;//团队账号
	String team_password;//团队密码
	String team_name;//团队名
	public int getTeam_uid() {
		return team_uid;
	}
	public void setTeam_uid(int team_uid) {
		this.team_uid = team_uid;
	}
	public String getTeam_password() {
		return team_password;
	}
	public void setTeam_password(String team_password) {
		this.team_password = team_password;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	public String getTeam_id() {
		return team_id;
	}
	public void setTeam_id(String team_id) {
		this.team_id = team_id;
	}
	@Override
	public String toString() {
		return "Team [team_uid=" + team_uid + ", team_id=" + team_id + ", team_password=" + team_password
				+ ", team_name=" + team_name + "]";
	}
	
	

}
