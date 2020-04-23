package com.test.weekly_report.service;



import com.test.weekly_report.entity.Stu;

import java.util.List;

public interface StuService {
	public List<Stu> getAll();
	public List<Stu> getStuByTutor(String tutorID);
	public Stu getStuByID(String stuID);
	public int insertStu(Stu stu);
	public int deleteStu(String stuID);
	public int updateStu(Stu stu);



}
