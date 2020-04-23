package com.test.weekly_report.service.impl;


import com.test.weekly_report.dao.StuDao;
import com.test.weekly_report.entity.Stu;
import com.test.weekly_report.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("stuService")
public class StuServiceImpl implements StuService {
	
	@Autowired
	   private StuDao dao;

	public List<Stu> getAll() {

	    return this.dao.selectAll();
	}

	public List<Stu> getStuByTutor(String tutorID) {

		return this.dao.selectStuByTutorid(tutorID);
	}

	public Stu getStuByID(String stuID) {

		return this.dao.selectStuByid(stuID);
	}

	public int insertStu(Stu stu) {

		return this.dao.insertStu(stu);
	}

	public int deleteStu(String stuID) {

		return this.dao.deleteStu(stuID);
	}

	public int updateStu(Stu stu) {

		return this.dao.updateStu(stu);
	}
}
