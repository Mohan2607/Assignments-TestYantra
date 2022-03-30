package com.tyss.assignmentonlinkedhashset;

public class Student {
	int studentid;
	String name;
	String department;
	long mobileno;
	public Student(int studentid, String name, String department, long mobileno) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.department = department;
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", name=" + name + ", department=" + department + ", mobileno="
				+ mobileno + "]";
	}
	

}
