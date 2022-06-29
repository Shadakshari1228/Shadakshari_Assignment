package com.cg.assignments;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int no = sc.nextInt();
		int copy = no;
		int sum = 0;
		while (no != 0) {
			int rem = no % 10;
			sum = sum + (rem * rem * rem);
			no = no / 10;
		}
		if (copy == sum) {
			System.out.println("It is a Armstrong number");
		} else {
			System.out.println("It is not an Armstrong number");
		}
	}

}
