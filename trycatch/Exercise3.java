package com.tyss.trycatch;

public class Exercise3 {
	public static void main(String[] args) {
		System.out.println("Program started");
		try {
			throw new ArithmeticException();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("program ends");
	}

}
