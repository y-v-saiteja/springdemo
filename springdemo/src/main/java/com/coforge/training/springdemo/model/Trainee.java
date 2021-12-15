package com.coforge.training.springdemo.model;

import java.util.List;
//constructor based DI of collections & setter based DI of properties
/*Spring framework provides the facility to inject collection values via 
 * constructor or setter method*/
public class Trainee {
	
	private String name;
	private String rollNo;
	private String className;

	private List<Address> address;



	public Trainee(List<Address> address) {
	super();
	this.address = address;
	}



	public String getName() {
	return name;
	}



	public void setName(String name) {
	this.name = name;
	}



	public String getRollNo() {
	return rollNo;
	}



	public void setRollNo(String rollNo) {
	this.rollNo = rollNo;
	}



	public String getClassName() {
	return className;
	}



	public void setClassName(String className) {
	this.className = className;
	}



	public List<Address> getAddress() {
	return address;
	}



	public void setAddress(List<Address> address) {
	this.address = address;
	}




}
