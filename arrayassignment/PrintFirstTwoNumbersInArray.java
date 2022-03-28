package com.tyss.arrayassignment;

import java.util.Scanner;

public class PrintFirstTwoNumbersInArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter n:");
		int n = scan.nextInt();
		int[] a;
		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		for (int i = 0; i < 2; i++) {
			System.out.println(a[i]);
		}

	}
}
