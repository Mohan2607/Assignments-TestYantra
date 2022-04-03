package com.tyss.strings;

import java.util.Scanner;

public class CountVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter the string");
		str = sc.nextLine();
		sc.close();
		int n = str.length();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
					|| str.charAt(i) == 'U' || str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
					|| str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				count = count + 1;
			}
		}
		System.out.println("count of vowels:" + count);

	}

}
