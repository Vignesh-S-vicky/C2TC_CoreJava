package com.tnsif.Day_5.hierarchicalinheritance;

public class HierarchicalInhDemo {

	public static void main(String[] args) {
		// Case 1: Plain Person object
		Person p1 = new Person();
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p1);

		// Case 2: Person object created with parameterized constructor
		Person p;
		p = new Person("Dhruv", "Mumbai");
		if (p instanceof Person)
			System.out.println("Person Details " + p);

		// Case 3: Employee object but referenced as Person
		p = new Employee("Nikhil", "Mumbai", 101, 67000, "Sales");
		if (p instanceof Employee)
			System.out.println("Employee Details " + p);

		// Case 4: Student object but referenced as Person
		p = new Student("Pankaj", "Pune", "FE", 88);
		if (p instanceof Student)
			System.out.println("Student Details " + p);
	}
}
