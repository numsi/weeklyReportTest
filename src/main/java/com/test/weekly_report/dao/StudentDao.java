package com.test.weekly_report.dao;

import com.test.weekly_report.entity.Student;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学生信息(Student)表数据库访问层
 *
 * @author numsi
 * @since 2020-04-21 19:50:47
 */
  @Mapper
public interface StudentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param studentUid 主键
     * @return 实例对象
     */
    Student queryById(Integer studentUid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Student> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param student 实例对象
     * @return 对象列表
     */
    List<Student> queryAllByItem(Student student);

      /**
     * @Description 查询全部数据
     * @author numsi
     * @date 2020-04-21 19:50:47
     * 分页使用MyBatis的插件实现
     * @return 对象列表
     */
    List<Student> queryAll();

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 影响行数
     */
    int insert(Student student);

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 影响行数
     */
    int update(Student student);

    /**
     * 通过主键删除数据
     *
     * @param studentUid 主键
     * @return 影响行数
     */
    int deleteById(Integer studentUid);

}