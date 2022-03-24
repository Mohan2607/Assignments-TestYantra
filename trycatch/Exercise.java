package com.tyss.trycatch;

public class Exercise {
	public static void main(String[] args) {
		int []a;
		a=new int[4];
		try {
			System.out.println(a[5]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("the index your accessing is not present");
		}
		System.out.println("program ends");
	}

}
