package com.lee.study.ssmSecurity.basedao;

import java.util.Map;

import com.lee.study.ssmSecurity.util.Pager;

public interface BaseDao<T> {
	
	/**
	 * ���һ��ʵ�����
	 * @param t  ʵ��
	 */
	public void add(T t);
	/**
	 * ����һ��ʵ�����
	 * @param t ʵ��
	 */
	public void update(T t);
	/**
	 * ɾ��һ��ʵ�����
	 * @param id ʵ��ID
	 */
	public void delete(int id);
	/**
	 * ����ID����һ��ʵ�����
	 * @param id ʵ��ID
	 * @return entity
	 */
	public T load(int id);
	/**
	 * ��ȡ��ҳ����
	 * @param params  ��ҳ+����+�����Ȳ���
	 * @return        ��ҳ��Pagerʵ��
	 */
	public Pager<T> find(Map<String,Object> params);
	
}
