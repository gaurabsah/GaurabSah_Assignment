package com.assignment.generics;

import java.util.HashSet;

class Employee {
	int id;
	String name;
	int salary;
	String dept;

	public Employee() {
		super();
	}

	public Employee(int id, String name, int salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "{ID: " + id + " Name: " + name + " Salary: " + salary + " Department: " + dept + "}";
	}

	public void displayDetails() {
		System.out.println("{ID: " + id + " Name: " + name + " Salary: " + salary + " Department: " + dept + "}");
	}

}

public class Set {
	public static void main(String[] args) {
		HashSet<Employee> act = new HashSet();
		Employee a = new Employee(1, "Gaurab", 35000, "Dev");
		Employee b = new Employee(2, "Abhi", 20000, "Q/A");
		Employee c = new Employee(3, "Aditya", 30000, "Dev");
		Employee d = new Employee(4, "Saurav", 50000, "Manager");
		act.add(a);
		act.add(b);
		act.add(c);
		act.add(d);
		// printing all the details of the objects
		System.out.println(act);

	}
}
