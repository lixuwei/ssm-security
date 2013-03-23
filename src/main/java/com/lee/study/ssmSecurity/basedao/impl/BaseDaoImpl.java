package com.lee.study.ssmSecurity.basedao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.lee.study.ssmSecurity.basedao.BaseDao;
import com.lee.study.ssmSecurity.util.Pager;

@Transactional
public class BaseDaoImpl<T> implements BaseDao<T>{

	@Resource
	protected SqlSessionTemplate sqlSession;
	
	private Class<T> clazz = null;
	
	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		Type type  = this.getClass().getGenericSuperclass();
		if (type instanceof ParameterizedType) {
			ParameterizedType pType = (ParameterizedType) type;
			clazz = (Class<T>) pType.getActualTypeArguments()[0];
		}
	}
	
	/**
	 * ���һ��ʵ�����
	 * @param t  ʵ��
	 */
	public void add(T t){
			sqlSession.insert(clazz.getName()+".add",t);
	}
	/**
	 * ����һ��ʵ�����
	 * @param t ʵ��
	 */
	public void update(T t){
		sqlSession.update(clazz.getName()+".update",t);	
	}
	/**
	 * ɾ��һ��ʵ�����
	 * @param id ʵ��ID
	 */
	public void delete(int id){

		
			sqlSession.delete(clazz.getName()+".delete",id);
	}

	/**
	 * ����ID����һ��ʵ�����
	 * @param id ʵ��ID
	 * @return entity
	 */
	@Transactional(readOnly=true)
	public T load(int id){
		
			T t = sqlSession.selectOne(clazz.getName()+".load",id);
			return t;
			
	}
	/**
	 * ��ȡ��ҳ����
	 * @param params  ��ҳ+����+�����Ȳ���
	 * @return        ��ҳ��Pagerʵ��
	 */
	@Transactional(readOnly=true)
	public Pager<T> find(Map<String,Object> params){
		
			Pager<T> pagers = new Pager<T>();
			if(params != null){
				List<T> datas = sqlSession.selectList(clazz.getName()+".find", params);
				pagers.setDatas(datas);
				int totalRecord = sqlSession.selectOne(clazz.getName()+".find_count",params);
				pagers.setTotalRecord(totalRecord);
			}
		return pagers;
	}

}
