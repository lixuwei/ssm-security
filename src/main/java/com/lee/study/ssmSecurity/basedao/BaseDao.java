package com.lee.study.ssmSecurity.basedao;

public interface BaseDao<T> {
	
	/**
	 * ����ID��ѯʵ��
	 * @param id
	 * @return
	 */
	T find(Long id);
	/**
	 * ����ʵ��
	 * @param t
	 */
	void save(T t);
	
}
