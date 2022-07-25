package com.bean;

public class PatientBean {

	private Integer patientid;
	private String name;
	private String contactnumber;
	AddressBean addressBean;
	public AddressBean getAddressBean() {
		return addressBean;
	}
	public PatientBean() {
		// TODO Auto-generated constructor stub
		System.out.println("PatientBean() constructor");
	}
	public void setAddressBean(AddressBean addressBean) {
		this.addressBean = addressBean;
	}
	public Integer getPatientid() {
		return patientid;
	}
	public void setPatientid(Integer patientid) {
		this.patientid = patientid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	
	
	
	
}
