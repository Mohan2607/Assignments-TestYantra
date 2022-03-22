package com.tyss.exercise2;

public class User {
	String name;
	long number;

	public User(String name, long number) {
		this.name = name;
		this.number = number;
	}

	public User() {
		System.out.println("from user");
	}

	public void chat() {
		System.out.println(name + "is chatting");
	}

	public void videocall() {
		System.out.println(name + "is videocall");
	}

	public void share() {
		System.out.println(name + "is sharing");
	}

}
