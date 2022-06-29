package com.generics.assignment;

import java.util.HashSet;

public class Assignment1 {
	public static void main(String[] args) {

		HashSet<Employee> vb = new HashSet();

		Employee e1 = new Employee(1, "Rana", 30000, "Dev");
		Employee e2 = new Employee(2, "Santu", 20000, "Te");
		Employee e3 = new Employee(3, "Atiya", 30000, "QA");
		Employee e4 = new Employee(4, "Anju", 50000, "Manager");

		vb.add(e1);
		vb.add(e2);
		vb.add(e3);
		vb.add(e4);
		for (Employee e : vb) {
			System.out.println(e.id + " " + e.name + " " + e.dept + " " + e.salary);
		}

	}
}
