package com.tyss.strings;

import java.util.Scanner;

public class Pallindrome {
	public static void main(String[] args) {
		String str;
		boolean result = true;
		int length;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String :");
		str = scanner.nextLine();
		scanner.close();
		length = str.length();
		int half = length / 2;
		int j = length - 1;
		for (int i = 0; i < half; i++) {
			if (str.charAt(i) == str.charAt(j)) {
				j--;
			} else {
				result = false;
			}
		}
		if (result) {
			System.out.println("Given String is Palindrome");
		} else {
			System.out.println("Given String is not a Palindrome");
		}
	}
}
