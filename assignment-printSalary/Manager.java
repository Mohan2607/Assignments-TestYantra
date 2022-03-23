package com.tyss.assignment;

public class Manager extends Member{
	String department;
	public Manager(String name,int age,long phoneNumber,String address,long salary,String department) {
		super(name,age,phoneNumber,address,salary);
		System.out.println(department);
}
}
