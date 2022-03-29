package com.tyss.arraylist;

import java.util.Comparator;

public class sortById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.employeeid - o2.employeeid;
	}

}
