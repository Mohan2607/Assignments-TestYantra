package com.tyss.matrix;

import java.util.Scanner;

public class MultiplicationOfMatrix {
	public static void main(String[] args) {
		int[][] array1;
		int[][] array2;
		int[][] sum;
		int number, row1, row2, column1, column2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Matrix 1");
		System.out.print("enter the row size :");
		row1 = sc.nextInt();
		System.out.print("enter the column size :");
		column1 = sc.nextInt();
		array1 = new int[row1][column1];

		System.out.println("Matrix 2");
		System.out.print("enter the row size :");
		row2 = sc.nextInt();
		System.out.print("enter the column size :");
		column2 = sc.nextInt();
		array2 = new int[row2][column2];

		System.out.println("Enter Matrix 1 Values :");
		for (int i = 0; i < row1; i++) {
			System.out.println("Enter row " + (i + 1));
			for (int j = 0; j < column1; j++) {
				number = sc.nextInt();
				array1[i][j] = number;
			}
		}
		System.out.println("Enter Matrix 2 Values :");
		for (int i = 0; i < row2; i++) {
			System.out.println("Enter row " + (i + 1));
			for (int j = 0; j < column2; j++) {
				number = sc.nextInt();
				array2[i][j] = number;
			}
		}
		if (row2 != column1) {
			System.out.println("Matrix Multipliccation is not possibe");
		} else {
			sum = new int[row1][column2];
			System.out.println("Matrix Multiplication");

			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < column2; j++) {
					for (int k = 0; k < row2; k++) {
						sum[i][j] = sum[i][j] + array1[i][k] * array2[k][j];
					}
					System.out.print(sum[i][j] + " ");
				}
				System.out.println();
			}
		}
		sc.close();

	}
}
