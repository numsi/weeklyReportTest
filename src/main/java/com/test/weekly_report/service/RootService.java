package com.test.weekly_report.service;

import com.test.weekly_report.entity.Root;
import java.util.List;

/**
 * (Root)表服务接口
 *
 * @author numsi
 * @since 2020-04-21 19:50:43
 */
public interface RootService {

    /**
     * 通过ID查询单条数据
     *
     * @param rootId 主键
     * @return 实例对象
     */
    Root queryById(Integer rootId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Root> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param root 实例对象
     * @return 实例对象
     */
    Root insert(Root root);

    /**
     * 修改数据
     *
     * @param root 实例对象
     * @return 实例对象
     */
    Root update(Root root);

    /**
     * 通过主键删除数据
     *
     * @param rootId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer rootId);
    
       /**
     * @Description 查询全部数据
     * @author numsi
     * @date 2020-04-21 19:50:43
     * 分页使用MyBatis的插件实现
     * @return 对象列表
     */
    List<Root> queryAll();
    
        /**
     * 根据对象查找
     *
     * @param root 实例对象
     * @return 实例对象
     */
    List<Root> queryAllByItem(Root root);

}