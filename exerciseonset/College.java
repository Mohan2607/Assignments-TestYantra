package com.tyss.exerciseonset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class College {
	public static void main(String[] args) {
		Student mohan = new Student(12, "Mohan", "IT", 1000);
		Student sasi = new Student(10, "SasiDharan", "EI", 950);
		Student gokul = new Student(35, "Gokul", "ECE", 800);
		Student harish = new Student(24, "Harish", "IT", 569);
		Student naveen = new Student(55, "Naveen", "EEE", 975);
		Student navee = new Student(6, "Naveen", "EEE", 975);
		
		HashSet<Student> students=new HashSet<Student>();
		students.add(navee);
		students.add(naveen);
		students.add(harish);
		students.add(gokul);
		students.add(sasi);
		students.add(mohan);
		
		SortById byId = new SortById();
		
		ArrayList<Student> arrayList = new ArrayList<Student>(students);
		Collections.sort(arrayList,byId);
		
		for (Student stud : students) {
			System.out.println(stud);
		}
	}

}
