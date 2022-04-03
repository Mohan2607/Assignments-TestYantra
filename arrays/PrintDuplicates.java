package com.tyss.arrays;

import java.util.Scanner;

public class PrintDuplicates {
	public void printdupl(int n, int[] a) {
		System.out.println("duplicates:");
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
				}

			}
		}
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
		PrintDuplicates printDuplicates = new PrintDuplicates();
		printDuplicates.printdupl(n, a);

	}

}
