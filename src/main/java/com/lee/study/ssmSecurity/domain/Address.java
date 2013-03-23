package com.lee.study.ssmSecurity.domain;

import java.io.Serializable;
/**
 * 
 * @author Alex Lee
 *
 * @createTiem 2013-3-23 下午9:59:25
 */
public class Address implements Serializable{

	private static final long serialVersionUID = 7840042690060098740L;
	
	private int id;
	private String name;
	private String phone;
	private String postcode;
	/**
	 * 多对一
	 */
	private User user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", name=" + name + ", phone=" + phone
				+ ", postcode=" + postcode + ", user=" + user + "]";
	}
}
