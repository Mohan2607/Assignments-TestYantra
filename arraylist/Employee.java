package com.tyss.arraylist;

public class Employee implements Comparable<Employee> {
	int employeeid;
	String name;
	String designation;
	double salary;

	public Employee(int employeeid, String name, String designation, double salary) {
		super();
		this.employeeid = employeeid;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", name=" + name + ", designation=" + designation + ", salary="
				+ salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.employeeid - o.employeeid;
	}
	


}
