package com.Static.pack;

public class Employee_Data {
	
	int id;
	double salary;
	String mobileNumber;
	String name;
	
	
	
	public String getName() {
		
		return name;
	}
	
	public int getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setName(String name) {
		this.name = name;
	}

 	
	
	public void setId(int id) {
		this.id = id;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
/*
	public Employee_Data(String name, int id, int salary, String mobileNumber) {
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.mobileNumber=mobileNumber;
	}

*/	
}
