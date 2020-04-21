package com.test.weekly_report.dao;

import com.test.weekly_report.entity.Root;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Root)表数据库访问层
 *
 * @author numsi
 * @since 2020-04-21 19:50:43
 */
  @Mapper
public interface RootDao {

    /**
     * 通过ID查询单条数据
     *
     * @param rootId 主键
     * @return 实例对象
     */
    Root queryById(Integer rootId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Root> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param root 实例对象
     * @return 对象列表
     */
    List<Root> queryAllByItem(Root root);

      /**
     * @Description 查询全部数据
     * @author numsi
     * @date 2020-04-21 19:50:43
     * 分页使用MyBatis的插件实现
     * @return 对象列表
     */
    List<Root> queryAll();

    /**
     * 新增数据
     *
     * @param root 实例对象
     * @return 影响行数
     */
    int insert(Root root);

    /**
     * 修改数据
     *
     * @param root 实例对象
     * @return 影响行数
     */
    int update(Root root);

    /**
     * 通过主键删除数据
     *
     * @param rootId 主键
     * @return 影响行数
     */
    int deleteById(Integer rootId);

}