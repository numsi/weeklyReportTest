package com.test.weekly_report.service;

import com.test.weekly_report.entity.Report;
import java.util.List;

/**
 * 每周报告（整体，包括工作总结、遇到的困难、下周计划）(Report)表服务接口
 *
 * @author numsi
 * @since 2020-04-21 19:50:38
 */
public interface ReportService {

    /**
     * 通过ID查询单条数据
     *
     * @param reportId 主键
     * @return 实例对象
     */
    Report queryById(Integer reportId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Report> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param report 实例对象
     * @return 实例对象
     */
    Report insert(Report report);

    /**
     * 修改数据
     *
     * @param report 实例对象
     * @return 实例对象
     */
    Report update(Report report);

    /**
     * 通过主键删除数据
     *
     * @param reportId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer reportId);
    
       /**
     * @Description 查询全部数据
     * @author numsi
     * @date 2020-04-21 19:50:38
     * 分页使用MyBatis的插件实现
     * @return 对象列表
     */
    List<Report> queryAll();
    
        /**
     * 根据对象查找
     *
     * @param report 实例对象
     * @return 实例对象
     */
    List<Report> queryAllByItem(Report report);

}