package operator;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		//int x ;
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		switch (x) {
		case 1:
			System.out.println("lets go to kerala");
			break;
		case 2:
			System.out.println("lets go to goa");
			break;
		case 3:
			System.out.println("lets go to delhi");
			break;
		case 4:
			System.out.println("lets go to mumbai");
			break;
		default:
			System.out.println("lets go home");
		}
	}

}
