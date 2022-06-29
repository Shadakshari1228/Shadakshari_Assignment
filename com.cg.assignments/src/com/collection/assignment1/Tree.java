package com.collection.assignment1;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Tree {
	public static void main(String[] args) {
		Long a1 = Long.valueOf("8796574563");
		Long b1 = Long.valueOf("9087678965");
		Long c1 = Long.valueOf("6434267098");
		Long d1 = Long.valueOf("7865469867");
		Contact s1 = new Contact(a1, "Sadu", "sadu@gmail.com", Gender.male);
		Contact s2 = new Contact(b1, "Ram", "ram@gmail.com", Gender.female);
		Contact s3 = new Contact(c1, "Vinu", "vinu@gmail.com", Gender.female);
		Contact s4 = new Contact(d1, "Kona", "kona@gmail.com", Gender.male);

		TreeMap<Long, Contact> add = new TreeMap<Long, Contact>(Collections.reverseOrder());
		add.put(a1, s1);
		add.put(b1, s2);
		add.put(c1, s3);
		add.put(d1, s4);

		System.out.println("All the Keys: ");
		for (Map.Entry<Long, Contact> entry : add.entrySet()) {
			System.out.println(entry.getKey());
		}
		System.out.println("All the Values: ");
		for (Map.Entry<Long, Contact> entry : add.entrySet()) {
			System.out.println(entry.getValue());
		}
		System.out.println("All the key-Value pairs: ");
		for (Map.Entry<Long, Contact> entry : add.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}
