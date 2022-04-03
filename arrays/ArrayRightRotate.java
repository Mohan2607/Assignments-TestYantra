package com.tyss.arrays;

import java.util.Scanner;

public class ArrayRightRotate {
	public void rightrotate(int n, int n1, int[] a) {
		for (int i = 0; i < n1; i++) {
			int temp = a[n - 1];
			int j;
			for (j = n - 1; j > 0; j--) {
				a[j] = a[j - 1];
			}
			a[0] = temp;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
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
		System.out.println("enter the number of rotation");
		int n1 = sc.nextInt();

		ArrayRightRotate arrayRightRotate = new ArrayRightRotate();
		arrayRightRotate.rightrotate(n, n1, a);
	}

}
