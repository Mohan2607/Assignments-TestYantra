package com.tyss.arrays;

import java.util.Scanner;

public class FindMaxInArray {

	void findmax(int n, int[] a) {
		int max = a[0];
		for (int i = 0; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Maximum :" +max);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n = sc.nextInt();
		int[] a;
		a = new int[n];
		System.out.println("Enter the elements");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		FindMaxInArray m = new FindMaxInArray();
		m.findmax(n, a);
	}

}
