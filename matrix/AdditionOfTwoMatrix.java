package com.tyss.matrix;

import java.util.Scanner;

public class AdditionOfTwoMatrix {
	public static void main(String[] args) {
		int r,c,i,j,input;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of row");
		r=sc.nextInt();
		System.out.println("Enter the size of column");
		c=sc.nextInt();
		int mat1[][];
		mat1=new int[r][c];
		int mat2[][];
		mat2=new int[r][c];	
		int result[][];
		result=new int[r][c];
		if(r!=c) {
			System.out.println("addition is not possible");
		}
		System.out.println("Enter the elements of matrix1:");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				input=sc.nextInt();
				mat1[i][j]=input;
			}
		}
		System.out.println("Enter the elements of matrix2:");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				input=sc.nextInt();
				mat2[i][j]=input;
			}
		}
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				result[i][j]=mat1[i][j]+mat2[i][j];
			
			}
		}
		for(i=0;i<r;i++) {
			System.out.println("\n");
			for(j=0;j<c;j++) {
				System.out.println(result[i][j]);
			}
		}
	}

}
