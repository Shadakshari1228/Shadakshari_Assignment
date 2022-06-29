package com.generics.assignment;

public class Employee {
	int id, salary;
	String name, dept;

	public Employee(int id, String name, int salary, String dept){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.dept=dept;
    }

	@Override
	public String toString() {
		return "{ID: " + id + " Name: " + name + " Salary: " + salary + " Department: " + dept + "}";
	}

	@Deprecated
	public void displayDetails() {
		System.out.println("{ID: " + id + " Name: " + name + " Salary: " + salary + " Department: " + dept + "}");
}
}