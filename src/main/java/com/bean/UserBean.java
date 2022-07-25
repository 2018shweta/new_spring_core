package com.bean;

public class UserBean {

	 private int userid;
	private String name;
	private String email;
	private String password;
	public void init() {
		System.out.println("init() method");
		name="jay";
		email="jay@gmail.com";
	}
	public void remove() {
		name=null;
		email=null;
		System.out.println("remove() method");
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
