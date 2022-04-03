package com.tyss.strings;

import java.util.Scanner;

public class ReverseByWord {
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		str = sc.nextLine();
		sc.close();
		String[] splitString = str.split(" ");
		for (int i = splitString.length - 1; i >= 0; i--){
			System.out.print(splitString[i] + " ");
		}

	}

}
