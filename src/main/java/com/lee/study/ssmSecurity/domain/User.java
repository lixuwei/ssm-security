package com.lee.study.ssmSecurity.domain;

import java.io.Serializable;

public class User implements Serializable{

	private static final long serialVersionUID = -6699525372800311146L;
	
	private Long id;
	private String name;
	private String address;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
