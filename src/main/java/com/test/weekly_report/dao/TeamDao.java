package com.test.weekly_report.dao;

import com.test.weekly_report.entity.Team;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * 科研团队信息(Team)表数据库访问层
 *
 * @author numsi
 * @since 2020-04-21 19:50:52
 */
  @Mapper
public interface TeamDao {

    /**
     * 通过ID查询单条数据
     *
     * @param teamUid 主键
     * @return 实例对象
     */
    Team queryById(Integer teamUid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Team> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param team 实例对象
     * @return 对象列表
     */
    List<Team> queryAllByItem(Team team);

      /**
     * @Description 查询全部数据
     * @author numsi
     * @date 2020-04-21 19:50:52
     * 分页使用MyBatis的插件实现
     * @return 对象列表
     */
    List<Team> queryAll();

    /**
     * 新增数据
     *
     * @param team 实例对象
     * @return 影响行数
     */
    int insert(Team team);

    /**
     * 修改数据
     *
     * @param team 实例对象
     * @return 影响行数
     */
    int update(Team team);

    /**
     * 通过主键删除数据
     *
     * @param teamUid 主键
     * @return 影响行数
     */
    int deleteById(Integer teamUid);

}