package com.tyss.trycatch;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the first number");
			int num1 = scan.nextInt();
			System.out.println("enter the second number");
			int num2 = scan.nextInt();
			int res = 0;
			res = num1 / num2;
			int[] a;
			a = new int[res];
			a[4] = 20;
			System.out.println(res);
			System.out.println(a[4]);
		} catch (ArithmeticException e) {
			System.out.println("enter denom>0");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("the index your accessing is not present");
		}

		/*
		 * catch(Exception e) { if(e instanceof ArithmeticException ) {
		 * System.out.println("enter denom>0"); }if(e instanceof
		 * ArrayIndexOutOfBoundsException) {
		 * System.out.println("the index your accessing is not present10"); } }
		 */

	}
}
