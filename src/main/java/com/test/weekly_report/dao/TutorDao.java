package com.test.weekly_report.dao;

import com.test.weekly_report.entity.Tutor;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * 导师信息(Tutor)表数据库访问层
 *
 * @author numsi
 * @since 2020-04-21 19:50:56
 */
  @Mapper
public interface TutorDao {

    /**
     * 通过ID查询单条数据
     *
     * @param tutorUid 主键
     * @return 实例对象
     */
    Tutor queryById(Integer tutorUid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Tutor> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tutor 实例对象
     * @return 对象列表
     */
    List<Tutor> queryAllByItem(Tutor tutor);

      /**
     * @Description 查询全部数据
     * @author numsi
     * @date 2020-04-21 19:50:56
     * 分页使用MyBatis的插件实现
     * @return 对象列表
     */
    List<Tutor> queryAll();

    /**
     * 新增数据
     *
     * @param tutor 实例对象
     * @return 影响行数
     */
    int insert(Tutor tutor);

    /**
     * 修改数据
     *
     * @param tutor 实例对象
     * @return 影响行数
     */
    int update(Tutor tutor);

    /**
     * 通过主键删除数据
     *
     * @param tutorUid 主键
     * @return 影响行数
     */
    int deleteById(Integer tutorUid);

}