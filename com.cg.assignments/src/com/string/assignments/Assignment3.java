package com.string.assignments;

public class Assignment3 {
	public static void main(String[] args) {
		String sentence = "Java String pool refers to collection of Strings which are stored in heap memory";
		System.out.println("Lowercase :" + sentence.toLowerCase());
		System.out.println("Uppercare :" + sentence.toUpperCase());
		System.out.println("Replacing :" + sentence.replace('a', '$'));
		System.out.println("Containing :" + sentence.contains("collection"));
		String sentence1 = "java string pool refers to collection of strings which are stored in heap memory";
		System.out.println("Equal :" + sentence.equals(sentence1));
		System.out.println("Not Equal :" + sentence.equalsIgnoreCase(sentence1));
	}
}
