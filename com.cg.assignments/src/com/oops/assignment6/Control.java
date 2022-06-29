package com.oops.assignment6;

public class Control {
	public static void main(String[] args) {
		Persistence obj = new Persistence() {
			@Override
			void persist() {
				System.out.println("calling it");
			}
		};
		obj.persist();
	}
}
