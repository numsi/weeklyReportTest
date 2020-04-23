package com.test.weekly_report.dao;


import com.test.weekly_report.entity.Tutor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TutorDao {
	public int insertTutor(Tutor tutor);
	public List<Tutor> selectTutor();
	public Tutor selectTutorByid(String tutorid);
	public List<Tutor> selectTutorByTeam(String teamname);
	public int updateTutor(Tutor tutor);
	public int deleteTutor(String tutorid);

}
