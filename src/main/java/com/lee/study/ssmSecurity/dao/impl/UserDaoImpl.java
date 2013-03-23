package com.lee.study.ssmSecurity.dao.impl;


import org.springframework.stereotype.Repository;

import com.lee.study.ssmSecurity.basedao.impl.BaseDaoImpl;
import com.lee.study.ssmSecurity.dao.UserDao;
import com.lee.study.ssmSecurity.domain.User;


@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

	

}
