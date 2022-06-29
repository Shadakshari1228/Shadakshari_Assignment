package com.stringbuilder.assignments;

public class Assignment1 {
	public static void main(String[] args) {

		String string1 = "StringBuffer";
		String string2 = "is a peer class of String";
		String string3 = "that provides much of";
		String string4 = "the functionality of strings";

		StringBuilder newstring = new StringBuilder();
		newstring.append(string1);
		newstring.append(" " + string2);
		newstring.append(" " + string3);
		newstring.append(" " + string4);
		System.out.println(newstring);

		StringBuilder s1 = new StringBuilder("It is used to at the specified index");
		s1.insert(14, "insert text ");
		System.out.println(s1);

		StringBuilder s2 = new StringBuilder("This method returns the reversed object on which it was called");
		System.out.println(s2.reverse());

	}
}
