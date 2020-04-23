package com.test.weekly_report.entity;

public class Tutor {
	int tutor_uid;//导师UID
	String tutor_id;//导师账号
	String tutor_password;//导师密码
	String tutor_name;//导师名
	String tutor_teamname;//导师所属团队名
	String tutor_rank;//导师职称
	String tutor_phone;//导师手机号
	public int getTutor_uid() {
		return tutor_uid;
	}
	public void setTutor_uid(int tutor_uid) {
		this.tutor_uid = tutor_uid;
	}
	public String getTutor_password() {
		return tutor_password;
	}
	public void setTutor_password(String tutor_password) {
		this.tutor_password = tutor_password;
	}
	public String getTutor_name() {
		return tutor_name;
	}
	public void setTutor_name(String tutor_name) {
		this.tutor_name = tutor_name;
	}
	public String getTutor_teamname() {
		return tutor_teamname;
	}
	public void setTutor_teamname(String tutor_teamname) {
		this.tutor_teamname = tutor_teamname;
	}
	public String getTutor_rank() {
		return tutor_rank;
	}
	public void setTutor_rank(String tutor_rank) {
		this.tutor_rank = tutor_rank;
	}
	public String getTutor_phone() {
		return tutor_phone;
	}
	public void setTutor_phone(String tutor_phone) {
		this.tutor_phone = tutor_phone;
	}
	public String getTutor_id() {
		return tutor_id;
	}
	public void setTutor_id(String tutor_id) {
		this.tutor_id = tutor_id;
	}
	@Override
	public String toString() {
		return "Tutor [tutor_uid=" + tutor_uid + ", tutor_id=" + tutor_id + ", tutor_password=" + tutor_password
				+ ", tutor_name=" + tutor_name + ", tutor_teamname=" + tutor_teamname + ", tutor_rank=" + tutor_rank
				+ ", tutor_phone=" + tutor_phone + "]";
	}
	
	

}
