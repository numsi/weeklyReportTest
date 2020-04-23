package com.test.weekly_report.dao;


import com.test.weekly_report.entity.Team;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeamDao {
	public List<Team> selectTeam();
	public Team selectTeamByid(String teamid);
	public int updateTeam(Team team);
	public int deleteTeam(String teamid);
	public int insertTeam(Team team);

}
