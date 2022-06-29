package com.stringbuffer.assignments;

public class Assignment1 {
	public static void main(String[] args) {

		String string1 = "StringBuffer";
		String string2 = "is a peer class of String";
		String string3 = "that provides much of";
		String string4 = "the functionality of strings";
		StringBuffer newstring = new StringBuffer();
		newstring.append(string1);
		newstring.append(" " + string2);
		newstring.append(" " + string3);
		newstring.append(" " + string4);
		System.out.println(newstring);

		StringBuffer rev = new StringBuffer("This method returns the reversed object on which it was called");
		System.out.println(rev.reverse());

	}
}
