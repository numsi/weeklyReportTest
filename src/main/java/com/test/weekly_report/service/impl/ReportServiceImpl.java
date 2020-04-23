package com.test.weekly_report.service.impl;


import com.test.weekly_report.dao.ReportDao;
import com.test.weekly_report.entity.Report;
import com.test.weekly_report.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("reportService")
public class ReportServiceImpl implements ReportService {
	@Autowired
	private ReportDao dao;
	



	public int insertOne(Report report) {

		return this.dao.insertReport(report);
	}

	public List<Report> getAll() {

		return this.dao.selectReport();
	}


	public List<Report> getAllByAuthorID(String authorID) {
		return this.dao.selectReportByAuthorID(authorID);
	}

	public List<Report> getAllByTutorID(String tutorId) {
		return this.dao.selectReportByTutorID(tutorId);
	}

	public Report getOne(int reportID) {
		return this.dao.selectReportByID(reportID);
	}

	public int deleteOne(int reportID) {
		return this.dao.deleteReport(reportID);
	}

	public int updateOne(Report report) {
		return this.dao.updateReport(report);
	}
}
