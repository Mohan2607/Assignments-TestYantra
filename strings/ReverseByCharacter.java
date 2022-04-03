package com.tyss.strings;

import java.util.Scanner;

public class ReverseByCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter the string");
		str = sc.nextLine();
		sc.close();
		int n = str.length();
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}

	}

}
