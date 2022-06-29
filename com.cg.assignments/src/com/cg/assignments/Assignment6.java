package com.cg.assignments;

import java.util.Scanner;

public class Assignment6 {
	static void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Username :");
		String userName = sc.next();
		System.out.println("Enter the Password :");
		String passWord = sc.next();
		if (userName.equals("Akshari") && passWord.equals("appu123")) {
			System.out.println("Welcome " + userName);
		} else {
			int count = 0;
			for (int i = 1; i < 4; i++) {
				System.out.println("Enter correct Username :");
				userName = sc.next();
				System.out.println("Enetr correct Password :");
				passWord = sc.next();
				if (userName.equals("Akshari") && passWord.equals("appu123")) {
					System.out.println("Welcome " + userName);
					break;
				} 
				count++;
			}
			if(count==3) {
				System.out.println("Contact Admin");
			}
		}
	}
	public static void main(String[] args) {
		login();
	}
}
