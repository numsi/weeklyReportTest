package com.test.weekly_report.service.impl;


import com.test.weekly_report.dao.TeamDao;
import com.test.weekly_report.entity.Team;
import com.test.weekly_report.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("teamService")
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamDao dao;



    public List<Team> selectAll() {
        return this.dao.selectTeam();
    }

    public Team selectOne(String teamid) {
        return this.dao.selectTeamByid(teamid);
    }

    public int inserOne(Team team) {
        return this.dao.insertTeam(team);
    }

    public int deleteOne(String teamid) {
        return this.dao.deleteTeam(teamid);
    }

    public int updateOne(Team team) {
        return this.dao.updateTeam(team);
    }
}
