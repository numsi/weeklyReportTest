package com.test.weekly_report.service.impl;

import com.test.weekly_report.entity.Student;
import com.test.weekly_report.dao.StudentDao;
import com.test.weekly_report.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 学生信息(Student)表服务实现类
 *
 * @author numsi
 * @since 2020-04-21 19:50:48
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param studentUid 主键
     * @return 实例对象
     */
    @Override
    public Student queryById(Integer studentUid) {
        return this.studentDao.queryById(studentUid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Student> queryAllByLimit(int offset, int limit) {
        return this.studentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student insert(Student student) {
        this.studentDao.insert(student);
        return student;
    }

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student update(Student student) {
        this.studentDao.update(student);
        return this.queryById(student.getStudentUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param studentUid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer studentUid) {
        return this.studentDao.deleteById(studentUid) > 0;
    }
    
            /**
     * @Description 查询全部数据
     * @author numsi
     * @date 2020-04-21 19:50:48
     * 分页使用MyBatis的插件实现
     * @return 对象列表
     */
    @Override
    public List<Student> queryAll() {
        return studentDao.queryAll();
    }
    
        /**
     * 根据对象查找
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public List<Student> queryAllByItem(Student student) {
        return this.studentDao.queryAllByItem( student);
    }
}