package com.tyss.arrayassignment;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);

	}

}
