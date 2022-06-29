package com.collection.assignment2;

public class Product {
	private String pname;

	public Product(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Product name: " + pname;
	}
}
