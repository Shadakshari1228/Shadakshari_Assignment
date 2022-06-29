package com.lamda.assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Assignment4 {
	public static void main(String[] args) {
		List<String> word = new ArrayList<>();

		word.add("stay");
		word.add("where");
		word.add("your");
		word.add("heart");
		word.add("smile");
		word.add("and");
		word.add("happy");
		Predicate<String> length = (c) -> {
			if (c.length() % 2 == 0) {
				return true;
			} else
				return false;
		};
		word.stream().filter(length).collect(Collectors.toList()).forEach(System.out::println);
	}
}
