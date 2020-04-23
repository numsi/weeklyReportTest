package com.test.weekly_report.entity;

import java.util.Arrays;

public class ShowReport {
    int report_id;//报告ID
    String report_name;//报告标题
    String[] report_planDones;//完成的计划
    String report_authorid;//作者ID
    String report_tutorid;//导师ID
    String report_authorName;//作者名
    String report_tutorName;//导师名
    String[] report_contents;//报告内容
    String[] report_difficults;//遇到的困难
    String[] report_nextplans;//下周计划
    String report_comment;//评论
    String report_creattime;//时间
    String report_file;//附件名
    String report_status;//报告状态
    public ShowReport(){
        super();
    }
    public ShowReport(Report report){
        super();
        this.report_authorid=report.getReport_authorid();//作者id
        this.report_comment=report.getReport_comment();//评论
        if(report.getReport_content()!=null) {
            this.report_contents = report.getReport_content().split(report.getSplit());//报告内容
        }
        this.report_creattime=report.getReport_creattime();//创建时间
        this.report_id=report.getReport_id();//报告ID
        this.report_name=report.getReport_name();//报告标题
        if(report.getReport_planDone()!=null) {
            this.report_planDones = report.getReport_planDone().split(report.getSplit());//完成的计划
        }
        this.report_tutorid=report.getReport_tutorid();//导师ID
        if(report.getReport_difficult()!=null) {
            this.report_difficults = report.getReport_difficult().split(report.getSplit());//遇到的困难
        }
        if(report.getReport_nextplan()!=null) {
            this.report_nextplans = report.getReport_nextplan().split(report.getSplit());//下周计划
        }
        this.report_file=report.getReport_file();//附件名称
        this.report_status=report.getReport_status();//报告状态
    }

    public int getReport_id() {
        return report_id;
    }

    public void setReport_id(int report_id) {
        this.report_id = report_id;
    }

    public String getReport_name() {
        return report_name;
    }

    public void setReport_name(String report_name) {
        this.report_name = report_name;
    }

    public String[] getReport_planDones() {
        return report_planDones;
    }

    public void setReport_planDones(String[] report_planDones) {
        this.report_planDones = report_planDones;
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

    public String getReport_authorName() {
        return report_authorName;
    }

    public void setReport_authorName(String report_authorName) {
        this.report_authorName = report_authorName;
    }

    public String getReport_tutorName() {
        return report_tutorName;
    }

    public void setReport_tutorName(String report_tutorName) {
        this.report_tutorName = report_tutorName;
    }

    public String[] getReport_contents() {
        return report_contents;
    }

    public void setReport_contents(String[] report_contents) {
        this.report_contents = report_contents;
    }

    public String[] getReport_difficults() {
        return report_difficults;
    }

    public void setReport_difficults(String[] report_difficults) {
        this.report_difficults = report_difficults;
    }

    public String[] getReport_nextplans() {
        return report_nextplans;
    }

    public void setReport_nextplans(String[] report_nextplans) {
        this.report_nextplans = report_nextplans;
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

    @Override
    public String toString() {
        return "ShowReport{" +
                "report_id=" + report_id +
                ", report_name='" + report_name + '\'' +
                ", report_planDones=" + Arrays.toString(report_planDones) +
                ", report_authorid='" + report_authorid + '\'' +
                ", report_tutorid='" + report_tutorid + '\'' +
                ", report_authorName='" + report_authorName + '\'' +
                ", report_tutorName='" + report_tutorName + '\'' +
                ", report_contents=" + Arrays.toString(report_contents) +
                ", report_difficults=" + Arrays.toString(report_difficults) +
                ", report_nextplans=" + Arrays.toString(report_nextplans) +
                ", report_comment='" + report_comment + '\'' +
                ", report_creattime='" + report_creattime + '\'' +
                ", report_file='" + report_file + '\'' +
                ", report_status='" + report_status + '\'' +
                '}';
    }
}
