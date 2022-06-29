package com.exception.assignments;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.printf("Enter the numerator and denominator: ");
			int n = s.nextInt();
			int d = s.nextInt();
			double r = divide(n, d);
			System.out.println("The quotient is " + r);

		} catch (ArithmeticException e) {
			System.out.printf("Can't divide by zero");
		}
		s.close();
	}

	public static double divide(int n, int d) {
		return n / d;
	}
}