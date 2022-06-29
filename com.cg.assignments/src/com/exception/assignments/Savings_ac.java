package com.exception.assignments;

class Savings_ac {

	long id;
	double balance;

	public Savings_ac(long id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public void Deposite(double deposite) {
		balance = balance + deposite;
	}

	public long getID() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(int Withdrawl_amount) throws InsufficientBalanceException, IlleagalBankTransactionException {
		if (Withdrawl_amount > balance || balance == 0) {
			throw new InsufficientBalanceException("Exception");
		} else if (Withdrawl_amount < 0) {
			throw new IlleagalBankTransactionException("Exception");
		}
		balance = balance - Withdrawl_amount;
		System.out.println("You've received " + (int) (Withdrawl_amount) + " in cash:");
	}

}