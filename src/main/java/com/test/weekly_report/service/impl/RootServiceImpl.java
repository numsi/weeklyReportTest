package com.test.weekly_report.service.impl;

import com.test.weekly_report.entity.Root;
import com.test.weekly_report.dao.RootDao;
import com.test.weekly_report.service.RootService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Root)表服务实现类
 *
 * @author numsi
 * @since 2020-04-21 19:50:43
 */
@Service("rootService")
public class RootServiceImpl implements RootService {
    @Resource
    private RootDao rootDao;

    /**
     * 通过ID查询单条数据
     *
     * @param rootId 主键
     * @return 实例对象
     */
    @Override
    public Root queryById(Integer rootId) {
        return this.rootDao.queryById(rootId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Root> queryAllByLimit(int offset, int limit) {
        return this.rootDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param root 实例对象
     * @return 实例对象
     */
    @Override
    public Root insert(Root root) {
        this.rootDao.insert(root);
        return root;
    }

    /**
     * 修改数据
     *
     * @param root 实例对象
     * @return 实例对象
     */
    @Override
    public Root update(Root root) {
        this.rootDao.update(root);
        return this.queryById(root.getRootId());
    }

    /**
     * 通过主键删除数据
     *
     * @param rootId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer rootId) {
        return this.rootDao.deleteById(rootId) > 0;
    }
    
            /**
     * @Description 查询全部数据
     * @author numsi
     * @date 2020-04-21 19:50:43
     * 分页使用MyBatis的插件实现
     * @return 对象列表
     */
    @Override
    public List<Root> queryAll() {
        return rootDao.queryAll();
    }
    
        /**
     * 根据对象查找
     *
     * @param root 实例对象
     * @return 实例对象
     */
    @Override
    public List<Root> queryAllByItem(Root root) {
        return this.rootDao.queryAllByItem( root);
    }
}