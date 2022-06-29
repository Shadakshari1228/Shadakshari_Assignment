package com.lamda.assignment7;

import java.util.HashMap;

public class Assignment7 {
	public static void main(String[] args) {
		StringBuilder mix = new StringBuilder();
		HashMap<Integer, String> fun = new HashMap<>();
		fun.put(1, "stay");
		fun.put(2, "happy");
		fun.put(3, "heart");
		fun.put(4, "smile");

		fun.entrySet().forEach(t -> mix.append(t));
		System.out.println(mix);
	}
}
