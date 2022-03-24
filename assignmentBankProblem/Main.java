package com.tyss.assignmentBankProblem;

public class Main {
	public static void main(String[] args) {
		BankA bankA = new BankA();
		BankB bankB = new BankB();
		BankC bankC = new BankC();
		bankA.deposit(200);
		bankB.deposit(400);
		bankC.deposit(600);
		System.out.println(bankA.getBalance());
		System.out.println(bankB.getBalance());
		System.out.println(bankC.getBalance());

	}
}
