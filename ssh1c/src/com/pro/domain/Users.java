package com.pro.domain;

import java.io.Serializable;

public class Users implements Serializable{
	private int userId;
	private String userName;
	private String password;
	
	public Users() {
		super();
	}
	
	public Users(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
