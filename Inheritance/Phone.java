package com.tyss.project;

public class Phone {
	int price;
	int ram;

	public Phone(int p, int r) {
		price = p;
		ram = r;

	}

	public void call() {
		System.out.println("calling dinesh");
	}

	public void radio() {
		System.out.println("playing song");

	}

	public void msg(String msg) {
		System.out.println("hiii");

	}
}
