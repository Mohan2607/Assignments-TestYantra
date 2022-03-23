package com.tyss.assignment;

public class Employee extends Member{
	String specialization;
	public Employee(String name,int age,long phoneNumber,String address,long salary,String specialization) {
		super(name,age,phoneNumber,address,salary);
		System.out.println(specialization);
	}

}
