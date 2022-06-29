package com.exception.assignments;

public class Assignment3 {
	public static void main(String[] args) {
		Savings_ac cust1 = new Savings_ac(101, 20000);
		System.out.println("Your account created succesfully with your ID " + cust1.getID()
				+ " and your current balance is " + cust1.getBalance());
		cust1.Deposite(5000);
		System.out.println(cust1.getBalance());
		try {
			cust1.withdraw(-50);
		} catch (InsufficientBalanceException e) {
			System.out.println("Insufficient Funds: Unfortunately, You Don't have Sufficient Balance in your account");
		} catch (IlleagalBankTransactionException f) {
			System.out.println(
					" Illegal Entry: This is technically an illegal amount, You cannot withdraw in negative numbers");
		}
	}
}
