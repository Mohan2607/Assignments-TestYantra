package com.tyss.assignment;

public class Member {
	String name;
	int age;
	long phoneNumber;
	String address;
	long salary;
	
	public Member(String name,int age,long phoneNumber,String address,long salary) {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("phone number:"+phoneNumber);
		System.out.println("address:"+address);
		System.out.println("salary:"+salary);
	}
	
	public void printsalary(long salary) {
		System.out.println("salary:"+salary);
	}
}
