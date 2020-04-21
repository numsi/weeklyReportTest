package com.test.weekly_report.service.impl;

import com.test.weekly_report.entity.Tutor;
import com.test.weekly_report.dao.TutorDao;
import com.test.weekly_report.service.TutorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 导师信息(Tutor)表服务实现类
 *
 * @author numsi
 * @since 2020-04-21 19:50:56
 */
@Service("tutorService")
public class TutorServiceImpl implements TutorService {
    @Resource
    private TutorDao tutorDao;

    /**
     * 通过ID查询单条数据
     *
     * @param tutorUid 主键
     * @return 实例对象
     */
    @Override
    public Tutor queryById(Integer tutorUid) {
        return this.tutorDao.queryById(tutorUid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Tutor> queryAllByLimit(int offset, int limit) {
        return this.tutorDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tutor 实例对象
     * @return 实例对象
     */
    @Override
    public Tutor insert(Tutor tutor) {
        this.tutorDao.insert(tutor);
        return tutor;
    }

    /**
     * 修改数据
     *
     * @param tutor 实例对象
     * @return 实例对象
     */
    @Override
    public Tutor update(Tutor tutor) {
        this.tutorDao.update(tutor);
        return this.queryById(tutor.getTutorUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param tutorUid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer tutorUid) {
        return this.tutorDao.deleteById(tutorUid) > 0;
    }
    
            /**
     * @Description 查询全部数据
     * @author numsi
     * @date 2020-04-21 19:50:56
     * 分页使用MyBatis的插件实现
     * @return 对象列表
     */
    @Override
    public List<Tutor> queryAll() {
        return tutorDao.queryAll();
    }
    
        /**
     * 根据对象查找
     *
     * @param tutor 实例对象
     * @return 实例对象
     */
    @Override
    public List<Tutor> queryAllByItem(Tutor tutor) {
        return this.tutorDao.queryAllByItem( tutor);
    }
}