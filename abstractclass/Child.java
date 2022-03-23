package com.tyss.abstractclass;

public class Child extends Testing{
	public Child(int x) {
		super(x);
	}
	@Override
	void m1() {
		System.out.println("this is an implementation");
	}
}
