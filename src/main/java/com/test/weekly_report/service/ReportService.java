package com.test.weekly_report.service;



import com.test.weekly_report.entity.Report;

import java.util.List;

public interface ReportService {
	public int insertOne(Report report);
	public List<Report> getAll();
	public List<Report> getAllByAuthorID(String authorID);
	public List<Report> getAllByTutorID(String tutorid);
	public Report getOne(int reportID);
	public int deleteOne(int reportID);
	public int updateOne(Report report);

}
