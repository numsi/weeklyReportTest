package com.test.weekly_report.entity;

public class Stu {
	int student_uid;//学生UID
	String student_id;//学生账号
	String student_password;//学生密码
	String student_name;//学生姓名
	String student_tutorid;//学生导师ID
	String student_email;//学生Email
	String student_phone;//学生手机
	public int getStudent_uid() {
		return student_uid;
	}
	public void setStudent_uid(int student_uid) {
		this.student_uid = student_uid;
	}

	public String getStudent_password() {
		return student_password;
	}
	public void setStudent_password(String student_password) {
		this.student_password = student_password;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_email() {
		return student_email;
	}
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	public String getStudent_phone() {
		return student_phone;
	}
	public void setStudent_phone(String student_phone) {
		this.student_phone = student_phone;
	}
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getStudent_tutorid() {
		return student_tutorid;
	}
	public void setStudent_tutorid(String student_tutorid) {
		this.student_tutorid = student_tutorid;
	}
	@Override
	public String toString() {
		return "Stu [student_uid=" + student_uid + ", student_id=" + student_id + ", student_password="
				+ student_password + ", student_name=" + student_name + ", student_tutorid=" + student_tutorid
				+ ", student_email=" + student_email + ", student_phone=" + student_phone + "]";
	}
	

}
