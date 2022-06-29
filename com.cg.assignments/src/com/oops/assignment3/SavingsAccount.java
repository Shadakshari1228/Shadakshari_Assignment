package com.oops.assignment3;

public class SavingsAccount extends Account {

	public static final double fixedDeposit = 10000;

	public SavingsAccount(int accountNumber, String accountHolder, double balance) {
		super(accountNumber, accountHolder, balance);
	}

	public double getBalance() {
		return balance + fixedDeposit;
	}

}
