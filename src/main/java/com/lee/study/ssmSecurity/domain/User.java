package com.lee.study.ssmSecurity.domain;

import java.io.Serializable;
import java.util.List;
/**
 * 
 * @author Alex Lee
 *
 * @createTiem 2013-3-23 下午9:58:02
 */
public class User implements Serializable{

	private static final long serialVersionUID = -6699525372800311146L;
	
	private int id;
	private String username;
	private String password;
	private String nickname;
	private int type;
	/**
	 * 一对多
	 */
	private List<Address> addresses;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", nickname=" + nickname + ", type=" + type
				+ ", addresses=" + addresses + "]";
	}
	
	
}
