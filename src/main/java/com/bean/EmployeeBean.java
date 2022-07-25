package com.bean;

import java.awt.peer.DesktopPeer;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class EmployeeBean implements InitializingBean,DisposableBean {

	
	
	Integer employeeid;
	String name;
	public void init() {
		System.out.println("init");
	}
	public Integer getEmployeeid() {
		return employeeid;
	}
	EmployeeBean(){
		System.out.println("constructor");
	}
	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("afeterPropertiesset()");
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy()");
	}
	
}
