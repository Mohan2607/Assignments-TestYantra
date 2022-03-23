package com.tyss.abstractclass;

public abstract class Testing {
	int x;
	static int y;
	
	public Testing(int x) {
		this.x=x;
	}
	
	abstract void m1();
	void m2() {
		System.out.println("this is the method" +x);
	}

}
