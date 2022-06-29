package com.generics.assignment;

public class Client {
	public static void main(String[] args) {
		Pair<String, String> object = new Pair<String, String>("1", "Hello");
		System.out.println("{" + object.getObj1() + "=" + object.getObj2() + "}");

	}
}
