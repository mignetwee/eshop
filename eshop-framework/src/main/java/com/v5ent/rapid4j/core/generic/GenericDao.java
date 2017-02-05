package com.v5ent.rapid4j.core.generic;

import java.util.List;

/**
 * 所有自定义Dao的顶级接口, 封装常用的增删查改操作,
 * 也可以手动编码,然后继承GenericDao 即可.
 * <p/>
 * Model : 代表数据库中的表 映射的Java对象类型
 * PK :代表对象的主键类型
 *
 * @author Mignet
 * @since 2014年6月9日 下午6:14:06
 */
public interface GenericDao<Model, PK> {

    /**
     * 插入对象
     *
     * @param model 对象
     */
    int insertSelective(Model model);

    /**
     * 更新对象
     *
     * @param model 对象
     */
    int updateByPrimaryKeySelective(Model model);

    /**
     * 通过主键, 删除对象
     *
     * @param id 主键
     */
    int deleteByPrimaryKey(PK id);

    /**
     * 通过主键, 查询对象
     *
     * @param id 主键
     * @return
     */
    Model selectByPrimaryKey(PK id);

    /**
	 * 条件查询
	 * @param Model
	 * @return
	 */
	public Model selectOneByCondition(Model t);
	
	/**
	 * 条件查询
	 * @param Model
	 * @return
	 */
	public List<Model> selectByCondition(Model t);

}
