package com.tyss.threads;

public class Husband extends Thread {
	Account account;

	public Husband(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			account.deposit(100);
		}
	}

}
