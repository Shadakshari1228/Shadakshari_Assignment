package com.oops.assignment3;

public class Main {
	public static void main(String[] args) {

		SavingsAccount s1 = new SavingsAccount(101, "somu", 50000);
		SavingsAccount s2 = new SavingsAccount(102, "som1", 70000);
		CurrentAccount c1 = new CurrentAccount(201, "roopa", 40000);
		CurrentAccount c2 = new CurrentAccount(202, "roopesh", 60000);

		System.out.println("Account Holder:" + s1.getAccountHolder() + "----" + "Balance:" + s1.getBalance());
		System.out.println("Account Holder:" + s2.getAccountHolder() + "----" + "Balance:" + s2.getBalance());
		System.out.println("Account Holder:" + c1.getAccountHolder() + "----" + "Balance:" + c1.getBalance());
		System.out.println("Account Holder:" + c2.getAccountHolder() + "----" + "Balance:" + c2.getBalance());

	}

}
