package com.tyss.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static boolean anagram(String str1, String str2) {
		int n1 = str1.length();
		int n2 = str2.length();
		char[] S1 = str1.toCharArray();
		char[] S2 = str2.toCharArray();
		if (n1 != n2) {
			return false;
		}
		Arrays.sort(S1);
		Arrays.sort(S2);

		for (int i = 0; i < n1; i++) {
			if (S1[i] != S2[i]) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		String str1, str2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string1");
		str1 = sc.nextLine();
		System.out.println("Enter the string2");
		str2 = sc.nextLine();
		if (anagram(str1, str2)) {
			System.out.println("anagram");
		} else {
			System.out.println("Not anagram");
		}
	}
}
