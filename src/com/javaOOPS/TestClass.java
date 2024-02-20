package com.javaOOPS;

public class TestClass {

	public static void main(String[] args) {
		
		
		A1 a1 = new A1();
		a1.setName("Kiran");
		
		System.out.println(a1.getMyName());
		
		System.out.println("==============================");
		
		B1 b1 = new B1();
		b1.setName("Dinesh");
		b1.setAddress("Vizag");
		
		System.out.println(b1.getMyDetails());

	}

}
