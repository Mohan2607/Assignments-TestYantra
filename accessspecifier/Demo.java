package com.tyss.accessspecifier;

public class Demo {
	public int x=10;//access everywhere 
	protected int y=20;//access within the package when extend
	int z=30;
	private int a=40;//only inside the class
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.x);
		System.out.println(demo.y);
		System.out.println(demo.z);
		System.out.println(demo.a);
	}

}
