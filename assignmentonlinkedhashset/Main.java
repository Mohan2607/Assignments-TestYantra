package com.tyss.assignmentonlinkedhashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Mohan", "It", 9944041020l);
		Student s2 = new Student(2, "Harish", "EI", 876543020l);
		Student s3 = new Student(3, "Mukilan", "CS", 765646523425l);
		Student s4 = new Student(4, "Naveen", "EEE", 452566646534l);
		Student s5 = new Student(5, "Gokul", "MECH", 65563386786l);

		LinkedHashSet<Student> l = new LinkedHashSet<Student>();
		l.add(s2);
		l.add(s3);
		l.add(s1);
		l.add(s5);
		l.add(s4);

		ArrayList<Student> arraylist = new ArrayList<>(l);

		int choice = 0;
		System.out.println("1.sort by id\n 2.sort by name");
		System.out.println("enter the choice");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();

		switch (choice) {
		case 1:
			SortById sortById = new SortById();
			Collections.sort(arraylist, sortById);
			break;

		case 2:
			SortByName sortByName = new SortByName();
			Collections.sort(arraylist, sortByName);
			break;

		default:
			System.out.println("invalid output");
		}
		
		Iterator<Student> iterator = arraylist.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("==================");
		
		for (Student student : arraylist) {
			System.out.println(student);
			
		}

	}

}
