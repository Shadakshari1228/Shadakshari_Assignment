package com.lamda.assignment5;

import java.util.ArrayList;
import java.util.List;

public class Assignment5 {
	public static void main(String[] args) {
		StringBuilder build = new StringBuilder();
		List<String> join = new ArrayList<>();

		join.add("stay");
		join.add("where");
		join.add("your");
		join.add("heart");
		join.add("smile");
		join.add("be");
		join.add("happy");

		join.forEach(t -> build.append(t.charAt(0)));
		System.out.println("The resultant string using string builder");
		System.out.println(build);
	}
}
