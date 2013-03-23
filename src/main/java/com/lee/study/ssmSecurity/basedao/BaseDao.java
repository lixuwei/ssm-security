package com.lee.study.ssmSecurity.basedao;

public interface BaseDao<T> {
	
	/**
	 * 根据ID查询实体
	 * @param id
	 * @return
	 */
	T find(Long id);
	/**
	 * 保存实体
	 * @param t
	 */
	void save(T t);
	
}
