package com.lamda.assignment8;

import java.util.ArrayList;

class thread extends Thread {
	public void run() {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(98);
		numbers.add(68);
		numbers.add(67);
		numbers.add(101);
		numbers.add(54);
		numbers.add(96);
		numbers.add(78);
		numbers.add(93);

		numbers.forEach(s -> System.out.println(s));
	}
}
