package com.tyss.exercise2;

public class Admin extends User {
	public Admin(String name, long number) {
		super(name, number);
		System.out.println("from the admin");
	}

	public void AddUser(String username) {
		System.out.println(username + " added");
	}

	public void RemoveUser(String username) {
		System.out.println(username + " removed");
	}
}
