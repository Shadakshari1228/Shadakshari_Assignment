package com.cg.assignments;

public class Assignment2 {
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			int n = i;
			int k = n;
			int s = 0;
			while (n != 0) {
				int r = n % 10;
				s = s + (r * r * r);
				n = n / 10;
			}
			if (s == k) {
				System.out.println(k + "is a Armstrong number");
			}
		}
	}
}
