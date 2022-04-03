package com.tyss.matrix;

import java.util.Scanner;

public class TransposeOfMatrix {
	public static void main(String[] args) {
		int r, c, i, j, input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of row");
		r = sc.nextInt();
		System.out.println("Enter the size of column");
		c = sc.nextInt();
		int mat1[][];
		mat1 = new int[r][c];
		int result[][];
		result = new int[r][c];
		System.out.println("Enter the elements of matrix1:");
		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				input = sc.nextInt();
				mat1[i][j] = input;
			}
		}

		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				result[i][j] = mat1[j][i];

			}
		}
		for (i = 0; i < r; i++) {
			System.out.println("\n");
			for (j = 0; j < c; j++) {
				System.out.println(result[i][j]);
			}
		}
	}

}
