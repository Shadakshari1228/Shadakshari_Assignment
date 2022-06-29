package com.collection.assignment3;

class Employee {

	public int id;
	public String name;
	public String department;
	public Integer salary;

	public Employee() {
	}

	public Employee(int id, String name, String department, Integer salary) {

		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

}
