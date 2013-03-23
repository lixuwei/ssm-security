package com.lee.study.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lee.study.ssmSecurity.dao.AddressDao;
import com.lee.study.ssmSecurity.dao.UserDao;
import com.lee.study.ssmSecurity.domain.Address;
import com.lee.study.ssmSecurity.domain.User;
import com.lee.study.ssmSecurity.util.Pager;

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
		Map<String,Object> params = new HashMap<String, Object>();
		params.put("name", "%"+"xuwei"+"%");
		params.put("pageSize", 2);
		params.put("pageOffset", 0);
		params.put("sort", "id");
		params.put("order", "DESC");
		Pager<User> datas =userDao.find(params);
		System.out.println(datas.getDatas().size());
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
