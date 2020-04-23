package com.test.weekly_report.service;



import com.test.weekly_report.entity.Team;

import java.util.List;

public interface TeamService {
    public List<Team> selectAll();
    public Team selectOne(String teamid);
    public int inserOne(Team team);
    public int deleteOne(String teamid);
    public int updateOne(Team team);
}
