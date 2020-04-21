package com.test.weekly_report.service;

import com.test.weekly_report.entity.Tutor;
import java.util.List;

/**
 * 导师信息(Tutor)表服务接口
 *
 * @author numsi
 * @since 2020-04-21 19:50:56
 */
public interface TutorService {

    /**
     * 通过ID查询单条数据
     *
     * @param tutorUid 主键
     * @return 实例对象
     */
    Tutor queryById(Integer tutorUid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Tutor> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tutor 实例对象
     * @return 实例对象
     */
    Tutor insert(Tutor tutor);

    /**
     * 修改数据
     *
     * @param tutor 实例对象
     * @return 实例对象
     */
    Tutor update(Tutor tutor);

    /**
     * 通过主键删除数据
     *
     * @param tutorUid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer tutorUid);
    
       /**
     * @Description 查询全部数据
     * @author numsi
     * @date 2020-04-21 19:50:56
     * 分页使用MyBatis的插件实现
     * @return 对象列表
     */
    List<Tutor> queryAll();
    
        /**
     * 根据对象查找
     *
     * @param tutor 实例对象
     * @return 实例对象
     */
    List<Tutor> queryAllByItem(Tutor tutor);

}