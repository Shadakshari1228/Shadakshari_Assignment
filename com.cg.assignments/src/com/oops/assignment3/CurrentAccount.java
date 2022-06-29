package com.oops.assignment3;

public class CurrentAccount extends Account {

	public static final double cashCredit = 5000;

	public CurrentAccount(int accountNumber, String accountHolder, double balance) {
		super(accountNumber, accountHolder, balance);

	}

	public double getBalance() {
		return balance + cashCredit;
	}

}
