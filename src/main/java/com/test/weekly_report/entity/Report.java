package com.test.weekly_report.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 每周报告（整体，包括工作总结、遇到的困难、下周计划）(Report)实体类
 *
 * @author numsi
 * @since 2020-04-21 19:50:37
 */
public class Report implements Serializable {
    private static final long serialVersionUID = -69154524550041770L;
    /**
    * 每周报告编号
    */
    private Integer reportId;
    /**
    * 每周报告标题
    */
    private String reportName;
    /**
    * 每周报告作者
    */
    private String reportAuthorid;
    /**
    * 每周报告作者的导师
    */
    private String reportTutorid;
    /**
    * 每周报告-完成的计划
    */
    private String reportPlandone;
    /**
    * 每周报告-报告的详细内容
    */
    private String reportContent;
    /**
    * 本周工作中遇到的困难
    */
    private String reportDifficult;
    /**
    * 下周计划
    */
    private String reportNextplan;
    /**
    * 导师评论
    */
    private String reportComment;
    /**
    * 每周报告附件
    */
    private String reportFile;
    /**
    * 每周报告创建时间
    */
    private Date reportCreattime;
    
    private String reportStatus;


    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getReportAuthorid() {
        return reportAuthorid;
    }

    public void setReportAuthorid(String reportAuthorid) {
        this.reportAuthorid = reportAuthorid;
    }

    public String getReportTutorid() {
        return reportTutorid;
    }

    public void setReportTutorid(String reportTutorid) {
        this.reportTutorid = reportTutorid;
    }

    public String getReportPlandone() {
        return reportPlandone;
    }

    public void setReportPlandone(String reportPlandone) {
        this.reportPlandone = reportPlandone;
    }

    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public String getReportDifficult() {
        return reportDifficult;
    }

    public void setReportDifficult(String reportDifficult) {
        this.reportDifficult = reportDifficult;
    }

    public String getReportNextplan() {
        return reportNextplan;
    }

    public void setReportNextplan(String reportNextplan) {
        this.reportNextplan = reportNextplan;
    }

    public String getReportComment() {
        return reportComment;
    }

    public void setReportComment(String reportComment) {
        this.reportComment = reportComment;
    }

    public String getReportFile() {
        return reportFile;
    }

    public void setReportFile(String reportFile) {
        this.reportFile = reportFile;
    }

    public Date getReportCreattime() {
        return reportCreattime;
    }

    public void setReportCreattime(Date reportCreattime) {
        this.reportCreattime = reportCreattime;
    }

    public String getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }

}