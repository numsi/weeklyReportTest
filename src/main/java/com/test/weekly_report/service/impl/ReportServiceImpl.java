package com.test.weekly_report.service.impl;

import com.test.weekly_report.entity.Report;
import com.test.weekly_report.dao.ReportDao;
import com.test.weekly_report.service.ReportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 每周报告（整体，包括工作总结、遇到的困难、下周计划）(Report)表服务实现类
 *
 * @author numsi
 * @since 2020-04-21 19:50:38
 */
@Service("reportService")
public class ReportServiceImpl implements ReportService {
    @Resource
    private ReportDao reportDao;

    /**
     * 通过ID查询单条数据
     *
     * @param reportId 主键
     * @return 实例对象
     */
    @Override
    public Report queryById(Integer reportId) {
        return this.reportDao.queryById(reportId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Report> queryAllByLimit(int offset, int limit) {
        return this.reportDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param report 实例对象
     * @return 实例对象
     */
    @Override
    public Report insert(Report report) {
        this.reportDao.insert(report);
        return report;
    }

    /**
     * 修改数据
     *
     * @param report 实例对象
     * @return 实例对象
     */
    @Override
    public Report update(Report report) {
        this.reportDao.update(report);
        return this.queryById(report.getReportId());
    }

    /**
     * 通过主键删除数据
     *
     * @param reportId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer reportId) {
        return this.reportDao.deleteById(reportId) > 0;
    }
    
            /**
     * @Description 查询全部数据
     * @author numsi
     * @date 2020-04-21 19:50:38
     * 分页使用MyBatis的插件实现
     * @return 对象列表
     */
    @Override
    public List<Report> queryAll() {
        return reportDao.queryAll();
    }
    
        /**
     * 根据对象查找
     *
     * @param report 实例对象
     * @return 实例对象
     */
    @Override
    public List<Report> queryAllByItem(Report report) {
        return this.reportDao.queryAllByItem( report);
    }
}