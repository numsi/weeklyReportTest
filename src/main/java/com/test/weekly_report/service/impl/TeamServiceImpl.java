package com.test.weekly_report.service.impl;

import com.test.weekly_report.entity.Team;
import com.test.weekly_report.dao.TeamDao;
import com.test.weekly_report.service.TeamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 科研团队信息(Team)表服务实现类
 *
 * @author numsi
 * @since 2020-04-21 19:50:52
 */
@Service("teamService")
public class TeamServiceImpl implements TeamService {
    @Resource
    private TeamDao teamDao;

    /**
     * 通过ID查询单条数据
     *
     * @param teamUid 主键
     * @return 实例对象
     */
    @Override
    public Team queryById(Integer teamUid) {
        return this.teamDao.queryById(teamUid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Team> queryAllByLimit(int offset, int limit) {
        return this.teamDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param team 实例对象
     * @return 实例对象
     */
    @Override
    public Team insert(Team team) {
        this.teamDao.insert(team);
        return team;
    }

    /**
     * 修改数据
     *
     * @param team 实例对象
     * @return 实例对象
     */
    @Override
    public Team update(Team team) {
        this.teamDao.update(team);
        return this.queryById(team.getTeamUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param teamUid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer teamUid) {
        return this.teamDao.deleteById(teamUid) > 0;
    }
    
            /**
     * @Description 查询全部数据
     * @author numsi
     * @date 2020-04-21 19:50:52
     * 分页使用MyBatis的插件实现
     * @return 对象列表
     */
    @Override
    public List<Team> queryAll() {
        return teamDao.queryAll();
    }
    
        /**
     * 根据对象查找
     *
     * @param team 实例对象
     * @return 实例对象
     */
    @Override
    public List<Team> queryAllByItem(Team team) {
        return this.teamDao.queryAllByItem( team);
    }
}