package com.lee.study.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lee.study.ssmSecurity.dao.UserDao;
import com.lee.study.ssmSecurity.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class TestDB {

	@Resource
	private UserDao userDao;

	@Test
	public void testFind() {
		User user = userDao.find(1L);
		System.out.println(user.getName());
	}
	@Test
	public void testSave() {
		User user = new User();
		user.setName("xuwei");
		user.setAddress("kexinglu");
		userDao.save(user);
	}

}
