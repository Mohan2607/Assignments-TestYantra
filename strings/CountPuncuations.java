package com.tyss.strings;

import java.util.Scanner;

public class CountPuncuations {
	public static void main(String[] args) {
		String str, Punctuations;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String :");
		str = scanner.nextLine();
		scanner.close();
		Punctuations = "[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < Punctuations.length(); j++) {
				if (str.charAt(i) == Punctuations.charAt(j)) {
					count++;
				}
			}
		}
		System.out.println("Total Number Of Punctuations in a String :" + count);
	}

}
