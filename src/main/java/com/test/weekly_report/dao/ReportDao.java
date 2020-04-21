package com.test.weekly_report.dao;

import com.test.weekly_report.entity.Report;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * 每周报告（整体，包括工作总结、遇到的困难、下周计划）(Report)表数据库访问层
 *
 * @author numsi
 * @since 2020-04-21 19:50:37
 */
  @Mapper
public interface ReportDao {

    /**
     * 通过ID查询单条数据
     *
     * @param reportId 主键
     * @return 实例对象
     */
    Report queryById(Integer reportId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Report> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param report 实例对象
     * @return 对象列表
     */
    List<Report> queryAllByItem(Report report);

      /**
     * @Description 查询全部数据
     * @author numsi
     * @date 2020-04-21 19:50:37
     * 分页使用MyBatis的插件实现
     * @return 对象列表
     */
    List<Report> queryAll();

    /**
     * 新增数据
     *
     * @param report 实例对象
     * @return 影响行数
     */
    int insert(Report report);

    /**
     * 修改数据
     *
     * @param report 实例对象
     * @return 影响行数
     */
    int update(Report report);

    /**
     * 通过主键删除数据
     *
     * @param reportId 主键
     * @return 影响行数
     */
    int deleteById(Integer reportId);

}