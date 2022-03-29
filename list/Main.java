package com.tyss.list;

public class Main {
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList(5);
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(400);
		list.add(400);

		
		list.test();
	}

}
