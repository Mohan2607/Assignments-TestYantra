package com.tyss.arrays;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();
		int sum = 0, rem;
		int temp = n;
		while (n != 0) {
			rem = n % 10;
			sum = sum + (rem * rem * rem);
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong Number");
		}
	}
}
