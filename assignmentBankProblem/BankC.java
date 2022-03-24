package com.tyss.assignmentBankProblem;

public class BankC extends Bank {
	private int balance;

	void deposit(int money) {
		balance = balance + money;
	}

	@Override
	int getBalance() {
		return balance;
	}
}
