package com.tyss.arraylist;

import java.util.Comparator;

public class sortBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1,Employee o2) {
		return (int)(o1.salary-o2.salary);
	}
	
}
