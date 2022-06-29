package com.generics.assignment;

import java.util.Date;

public class Client1 {
	public static void main(String[] args) {
		Date objc = new Date();
		Pair1<String, java.util.Date> object = new Pair1<String, java.util.Date>("1", objc);
		System.out.println("{" + object.getObj1() + "=" + object.getObj2() + "}");
	}
}
