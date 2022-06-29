package com.lamda.assignment6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment6 {
	public static void main(String[] args) {
		List<String> join = new ArrayList<>();
		join.add("stay");
		join.add("where");
		join.add("your");
		join.add("heart");
		join.add("smile");
		join.add("be");
		join.add("happy");
		join.replaceAll(new Change());
		join.stream().collect(Collectors.toList()).forEach(System.out::println);

	}
}
