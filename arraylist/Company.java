package com.tyss.arraylist;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Company {

	public static void main(String[] args) {
		Employee mohan = new Employee(1, "mohan", "trainee", 10300);
		Employee harish = new Employee(2, "harish", "trainee", 450);
		Employee niyaz = new Employee(3, "niyaz", "trainee", 350);
		Employee naveen = new Employee(4, "naveen", "trainee", 33000);
		Employee sukumar = new Employee(5, "sukumar", "trainee", 3000);
		Employee dhilip = new Employee(6, "dhilip", "trainee", 2500);

		ArrayList<Employee> listofemployees = new ArrayList<>();
		listofemployees.add(mohan);
		listofemployees.add(niyaz);
		listofemployees.add(harish);
		listofemployees.add(naveen);
		listofemployees.add(sukumar);
		listofemployees.add(dhilip);

//		//mohan.compareTo(harish);
//		//sortById sortbyid= new sortById();
//		//sortByName sortbyname = new sortByName();
//		sortBySalary sortbysalary = new sortBySalary();
//
//		Collections.sort(listofemployees,sortbysalary);
//
//		Iterator<Employee> iterator = listofemployees.iterator();
//
//		for (int i = 0; i < listofemployees.size(); i++) {
//			System.out.println(listofemployees.get(i));
//		}
//		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type of sorting");
		String s = sc.next();
		switch (s) {

		case "id":
			sortById o1 = new sortById();
			Collections.sort(listofemployees, o1);
			for (int i = 0; i < listofemployees.size(); i++) {
				System.out.println(listofemployees.get(i));
			}
			break;

		case "name":
			sortByName o2 = new sortByName();
			Collections.sort(listofemployees, o2);
			for (int i = 0; i < listofemployees.size(); i++) {
				System.out.println(listofemployees.get(i));
			}
			break;

		case "salary":
			sortBySalary o3 = new sortBySalary();
			Collections.sort(listofemployees, o3);
			for (int i = 0; i < listofemployees.size(); i++) {
				System.out.println(listofemployees.get(i));
			}

			break;

		default:
			System.out.println("invalid input");
		}

		
//		Iterator<Employee> iterator=listofemployees.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
	}

}
