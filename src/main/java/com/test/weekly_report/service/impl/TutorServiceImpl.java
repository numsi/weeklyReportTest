package com.test.weekly_report.service.impl;


import com.test.weekly_report.dao.TutorDao;
import com.test.weekly_report.entity.Tutor;
import com.test.weekly_report.service.TutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("tutorService")
public class TutorServiceImpl implements TutorService {
    @Autowired
    private TutorDao dao;


    public List<Tutor> selectAll() {

        return this.dao.selectTutor();
    }

    public int insertOne(Tutor tutor) {

        return this.dao.insertTutor(tutor);
    }

    public Tutor selectOneByTutorID(String tutorid) {

        return this.dao.selectTutorByid(tutorid);
    }

    public List<Tutor> selectOneByTeam(String teamname) {

        return this.dao.selectTutorByTeam(teamname);
    }

    public int deleteOne(String tutorid) {

        return this.dao.deleteTutor(tutorid);
    }

    public int updateOne(Tutor tutor) {

        return this.dao.updateTutor(tutor);
    }
}
