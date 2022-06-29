package com.oops.assignment1;

public class Singleton {
	String name;

	private static Singleton s;

	private Singleton() {

		name = "hello";

	}

	static Singleton getInstance() {

		if (s == null)

			s = new Singleton();

		return s;

	}
}
