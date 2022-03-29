package com.tyss.exerciseonset;

public class Student {
	int studentid;
	String name;
	String department;
	int mark;

	public Student(int studentid, String name, String department, int mark) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.department = department;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", name=" + name + ", department=" + department + ", mark=" + mark
				+ "]";
	}
	
	@Override
	public int hashCode() {
		return studentid;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student std=(Student) obj;
		return this.studentid==std.studentid;
	}

}
