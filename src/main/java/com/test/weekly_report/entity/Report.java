package com.test.weekly_report.entity;

public class Report {
	int report_id;//报告ID
	String report_name;//报告标题
	String report_planDone;//完成的计划
	String report_authorid;//作者ID
	String report_tutorid;//导师ID
	String report_content;//报告内容
	String report_difficult;//遇到的困难
	String report_nextplan;//下周计划
	String report_comment;//评论
	String report_creattime;//时间
	String report_file;//附件名
	String report_status;//报告状态

	String split="AQaq&456";
	public String getReport_name() {
		return report_name;
	}
	public void setReport_name(String report_name) {
		this.report_name = report_name;
	}


	
	public int getReport_id() {
		return report_id;
	}
	public void setReport_id(int report_id) {
		this.report_id = report_id;
	}
	public String getReport_authorid() {
		return report_authorid;
	}
	public void setReport_authorid(String report_authorid) {
		this.report_authorid = report_authorid;
	}
	public String getReport_tutorid() {
		return report_tutorid;
	}
	public void setReport_tutorid(String report_tutorid) {
		this.report_tutorid = report_tutorid;
	}

	public String getReport_planDone() {
		return report_planDone;
	}

	public void setReport_planDone(String report_planDone) {
		this.report_planDone = report_planDone;
	}

	public String getReport_content() {
		return report_content;
	}

	public void setReport_content(String report_content) {
		this.report_content = report_content;
	}

	public String getReport_difficult() {
		return report_difficult;
	}

	public void setReport_difficult(String report_difficult) {
		this.report_difficult = report_difficult;
	}

	public String getReport_nextplan() {
		return report_nextplan;
	}

	public void setReport_nextplan(String report_nextplan) {
		this.report_nextplan = report_nextplan;
	}

	public String getReport_comment() {
		return report_comment;
	}
	public void setReport_comment(String report_comment) {
		this.report_comment = report_comment;
	}

	public String getReport_creattime() {
		return report_creattime;
	}

	public void setReport_creattime(String report_creattime) {
		this.report_creattime = report_creattime;
	}

	public String getReport_file() {
		return report_file;
	}
	public void setReport_file(String report_file) {
		this.report_file = report_file;
	}
	public String getReport_status() {
		return report_status;
	}
	public void setReport_status(String report_status) {
		this.report_status = report_status;
	}

	public String getSplit() {
		return split;
	}

	public void setSplit(String split) {
		this.split = split;
	}

	@Override
	public String toString() {
		return "Report{" +
				"report_id=" + report_id +
				", report_name='" + report_name + '\'' +
				", report_planDone='" + report_planDone + '\'' +
				", report_authorid='" + report_authorid + '\'' +
				", report_tutorid='" + report_tutorid + '\'' +
				", report_content='" + report_content + '\'' +
				", report_difficult='" + report_difficult + '\'' +
				", report_nextplan='" + report_nextplan + '\'' +
				", report_comment='" + report_comment + '\'' +
				", report_creattime='" + report_creattime + '\'' +
				", report_file='" + report_file + '\'' +
				", report_status='" + report_status + '\'' +
				", split='" + split + '\'' +
				'}';
	}
}
