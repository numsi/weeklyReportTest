package com.test.weekly_report.dao;


import com.test.weekly_report.entity.Report;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReportDao {
	public int insertReport(Report report);
	public List<Report> selectReport();
	public List<Report> selectReportByAuthorID(String authorid);
	public List<Report> selectReportByTutorID(String tutorid);
	public Report selectReportByID(int id);
	public int deleteReport(int id);
	public int updateReport(Report report);
}
