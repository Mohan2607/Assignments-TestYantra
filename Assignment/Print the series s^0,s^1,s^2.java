package operator;

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of A");
		int a = sc.nextInt();
		System.out.println("enter the value of B");
		int b = sc.nextInt();
		System.out.println("enter n");
		int n = sc.nextInt();
		int sum = 0, i, j;
		for (i = 0; i < n; i++) {
			sum = 0;
			for (j = 0; j <= i; j++) {
				sum = sum + ((int) Math.pow(2, j) * b);
			}
			System.out.println(a + sum);
		}
	}

}
