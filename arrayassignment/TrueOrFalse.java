package com.tyss.arrayassignment;

import java.awt.Checkbox;
import java.util.Scanner;

public class TrueOrFalse {
	public boolean check(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 3) {
				count++;
			}
			if (a[i] == 3 && a[i + 1] == 3) {
				return false;
			}
		}
		if (count == 3) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter n:");
		int n = scan.nextInt();
		int[] a;
		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		TrueOrFalse tf = new TrueOrFalse();
		System.out.println(tf.check(a));
	}

}
