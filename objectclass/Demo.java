package com.tyss.objectclass;

import java.util.LinkedList;

public class Demo {
	@Override
	public String toString() {
		return "O";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof LinkedList<?>) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	protected void finalize() throws Throwable{
		System.out.println("this is from finalise");
	}
	
	public static void main(String[] args) {
		Demo a = new Demo();
		System.out.println(a);
		
		Demo demo2 = new Demo();
		System.out.println("this is object 2 of demo"+ demo2);
		
		a=null;
		Demo demo3= new Demo();
		int hashCode=demo3.hashCode();
		System.out.println(hashCode);
		demo2=null;
		demo3=null;
		System.gc();
	}
}
