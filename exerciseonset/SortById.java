package com.tyss.exerciseonset;

import java.util.Comparator;

public class SortById implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.studentid-o2.studentid;
	}
	

}
