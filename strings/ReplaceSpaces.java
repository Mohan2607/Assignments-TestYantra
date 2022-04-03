package com.tyss.strings;

import java.util.Scanner;

public class ReplaceSpaces {
	public static void main(String[] args) {
		String str;
		String Character;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String :");
		str = scanner.nextLine();
		System.out.print("Enter Character :");
		Character = scanner.next();
		scanner.close();
		char[] String1 = str.toCharArray();
		for (int i = 0; i < String1.length; i++) {
			if (String1[i] == ' ') {
				String1[i] = Character.charAt(0);
			}
		}
		System.out.println(String1);
	}

}
