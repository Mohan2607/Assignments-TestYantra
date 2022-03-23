package com.tyss.encapsulation;

public class Company {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setName("mohan");
		System.out.println(emp.getName());
		emp.setAge(25);
		System.out.println(emp.getAge());
		emp.setSalary(300000);
		System.out.println(emp.getSalary());
		emp.setDesignation("trainee" );
		System.out.println(emp.getDesignation());
	}

}
