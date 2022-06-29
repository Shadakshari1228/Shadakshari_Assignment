package com.collection.assignment2;

import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		Product p1 = new Product("MRF");
		Product p2 = new Product("CEAT");
		Product p3 = new Product("YOKO");
		Product p4 = new Product("BDJ");
		HashSet<Product> add = new HashSet<Product>();
		add.add(p1);
		add.add(p2);
		add.add(p3);
		add.add(p4);
		
		add.add(p2);
		System.out.println(add);

	}
}
