package com.javaOOPS;

public class TestClass2 {

	public static void main(String[] args) {


		Student student1 = new Student(101, "A1", 89.00);
		student1.getStudentDetails();

		System.out.println("--------------------------------");

		Student student2 = new Student(100, "A7", 45.00);
		student2.getStudentDetails();

		System.out.println("--------------------------------");

		Student student3 = new Student(106, "D1", 99.00);
		student3.getStudentDetails();

	}

}
