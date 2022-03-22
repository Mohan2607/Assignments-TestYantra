package com.tyss.thisandsuper;

public class Child extends Parent {
	int z, a, b, c, d;

	public Child(int x, int y, int z) {
		super(x, y);
		this.z = z;
		System.out.println("from child---->parameter 3");
	}

	public Child(int x, int y, int z, int a, int b) {
		this(x, y, z);
		this.a = a;
		this.b = b;
		System.out.println("5 parameters");
	}

	public Child(int x, int y, int z, int a, int b, int c, int d) {
		this(x, y, z, a, b);
		this.c = c;
		this.d = d;
		System.out.println("7 parameters");
	}

}
