package com.collection.assignment3;

import java.util.TreeSet;

public class Assignment3 {
	public static void main(String[] args) {

		System.out.println("Sorting on the basis of name ascending order");

		TreeSet<Employee> details = new TreeSet<>((Employee e1, Employee e2) -> (e1.name).compareTo(e2.name));

		details.add(new Employee(1, "Raj", "TE", 21000));
		details.add(new Employee(2, "Sanu", "QA", 25000));
		details.add(new Employee(3, "Guru", "HR", 23000));
		details.add(new Employee(4, "vRam", "BU", 27000));

		for (Employee employee : details) {
			System.out.println(employee);
		}

		System.out.println("Sorting on the basis of name decending order");

		TreeSet<Employee> details2 = new TreeSet<>((Employee e1, Employee e2) -> (e2.name).compareTo(e1.name));

		details2.add(new Employee(1, "Raj", "TE", 21000));
		details2.add(new Employee(2, "Sanu", "QA", 25000));
		details2.add(new Employee(3, "Guru", "HR", 23000));
		details2.add(new Employee(4, "Ram", "BU", 27000));

		for (Employee employee : details2) {
			System.out.println(employee);
		}
	}
}
