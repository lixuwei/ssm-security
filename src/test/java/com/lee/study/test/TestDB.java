package com.lee.study.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lee.study.ssmSecurity.dao.AddressDao;
import com.lee.study.ssmSecurity.dao.UserDao;
import com.lee.study.ssmSecurity.domain.Address;
import com.lee.study.ssmSecurity.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class TestDB {

	@Resource
	private UserDao userDao;
	
	@Resource
	private AddressDao addressDao;

	

	@Test
	public void testFind() {
		User user = userDao.load(2);
		System.out.println(user);
	}
	@Test
	public void testPage(){
		
	}
	
	@Test
	public void testAdress(){
		Address load = addressDao.load(2);
		System.out.println(load);
	}
	@Test
	public void testAddAdress(){
		User user  = new User();
		user.setId(1);
		Address address = new Address();
		address.setName("kekekekek");
		address.setUser(user);
		addressDao.add(address);
	}

}
