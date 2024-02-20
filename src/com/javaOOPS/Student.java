package com.javaOOPS;


//template/blueprint
public class Student 
{
	//fields/variables
	int rollNo;
	String name;
	double marks;
	
	//constructor: we use this special method to initialize an object(variables).
	public Student()//default constructor
	{
		rollNo = 7890;
		name="Ganesh";
		marks= 89.50;
	}	

	//Parameterized constructor
	public Student(int rollNo, String name, double marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	//behavior/methods(functions)
	public void getStudentDetails()
	{
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(marks);
	}
}
