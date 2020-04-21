package com.test.weekly_report.service;

import com.test.weekly_report.entity.Team;
import java.util.List;

/**
 * 科研团队信息(Team)表服务接口
 *
 * @author numsi
 * @since 2020-04-21 19:50:52
 */
public interface TeamService {

    /**
     * 通过ID查询单条数据
     *
     * @param teamUid 主键
     * @return 实例对象
     */
    Team queryById(Integer teamUid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Team> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param team 实例对象
     * @return 实例对象
     */
    Team insert(Team team);

    /**
     * 修改数据
     *
     * @param team 实例对象
     * @return 实例对象
     */
    Team update(Team team);

    /**
     * 通过主键删除数据
     *
     * @param teamUid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer teamUid);
    
       /**
     * @Description 查询全部数据
     * @author numsi
     * @date 2020-04-21 19:50:52
     * 分页使用MyBatis的插件实现
     * @return 对象列表
     */
    List<Team> queryAll();
    
        /**
     * 根据对象查找
     *
     * @param team 实例对象
     * @return 实例对象
     */
    List<Team> queryAllByItem(Team team);

}