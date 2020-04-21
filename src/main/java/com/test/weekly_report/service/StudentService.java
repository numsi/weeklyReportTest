package com.test.weekly_report.service;

import com.test.weekly_report.entity.Student;
import java.util.List;

/**
 * 学生信息(Student)表服务接口
 *
 * @author numsi
 * @since 2020-04-21 19:50:47
 */
public interface StudentService {

    /**
     * 通过ID查询单条数据
     *
     * @param studentUid 主键
     * @return 实例对象
     */
    Student queryById(Integer studentUid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Student> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    Student insert(Student student);

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    Student update(Student student);

    /**
     * 通过主键删除数据
     *
     * @param studentUid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer studentUid);
    
       /**
     * @Description 查询全部数据
     * @author numsi
     * @date 2020-04-21 19:50:47
     * 分页使用MyBatis的插件实现
     * @return 对象列表
     */
    List<Student> queryAll();
    
        /**
     * 根据对象查找
     *
     * @param student 实例对象
     * @return 实例对象
     */
    List<Student> queryAllByItem(Student student);

}