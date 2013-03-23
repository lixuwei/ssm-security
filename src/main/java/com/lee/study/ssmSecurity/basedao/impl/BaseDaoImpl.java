package com.lee.study.ssmSecurity.basedao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.lee.study.ssmSecurity.basedao.BaseDao;

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
	
	@Transactional(readOnly=true)
	@Override
	public T find(Long id) {
		
		return sqlSession.selectOne(clazz.getName()+".find",id);
	}

	@Override
	public void save(T t) {
		sqlSession.insert(clazz.getName()+".save",t);
	}

}
