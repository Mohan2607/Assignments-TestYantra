package com.tyss.arrays;

import java.util.Scanner;

public class Pallindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int rev = 0;
		int rem;
		int orgnum = n;
		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}

		if (orgnum == rev) {
			System.out.println("The given number is pallindrome");
		} else {
			System.out.println("The given number is not pallindrome");
		}
	}

}
