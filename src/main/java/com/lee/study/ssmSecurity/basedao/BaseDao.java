package com.lee.study.ssmSecurity.basedao;

import java.util.Map;

import com.lee.study.ssmSecurity.util.Pager;

public interface BaseDao<T> {
	
	/**
	 * 添加一个实体对象
	 * @param t  实体
	 */
	public void add(T t);
	/**
	 * 更新一个实体对象
	 * @param t 实体
	 */
	public void update(T t);
	/**
	 * 删除一个实体对象
	 * @param id 实体ID
	 */
	public void delete(int id);
	/**
	 * 根据ID返回一个实体对象
	 * @param id 实体ID
	 * @return entity
	 */
	public T load(int id);
	/**
	 * 获取分页数据
	 * @param params  分页+排序+条件等参数
	 * @return        分页的Pager实体
	 */
	public Pager<T> find(Map<String,Object> params);
	
}
