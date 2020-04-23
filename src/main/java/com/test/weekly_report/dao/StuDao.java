package com.test.weekly_report.dao;


import com.test.weekly_report.entity.Stu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StuDao {
	public List<Stu> selectAll();
	public Stu selectStuByid(String id);
	public List<Stu> selectStuByTutorid(String id);
	public int insertStu(Stu stu);
	public int updateStu(Stu stu);
	public int deleteStu(String id);


}
