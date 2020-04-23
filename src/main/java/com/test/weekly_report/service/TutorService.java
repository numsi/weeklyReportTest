package com.test.weekly_report.service;



import com.test.weekly_report.entity.Tutor;

import java.util.List;

public interface TutorService {
    public List<Tutor> selectAll();
    public int insertOne(Tutor tutor);
    public Tutor selectOneByTutorID(String tutorid);
    public List<Tutor> selectOneByTeam(String teamname);
    public int deleteOne(String tutorid);
    public int updateOne(Tutor tutor);

}
