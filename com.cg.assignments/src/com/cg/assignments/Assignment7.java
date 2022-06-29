package com.cg.assignments;

import java.util.Scanner;

public class Assignment7 {
	public static void main(String[] args) {
		int[] arr = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35,37,7,52,86,47 };
		boolean found = false;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number : ");
		int num = sc.nextInt();

		for (int i : arr) {
			if (i == num) {
				found = true;
				break;
			}
		}

		if (found == true) {
			System.out.println("Your number in array:");
		} else {
			System.out.println("Number not in array");
		}
	}
}
