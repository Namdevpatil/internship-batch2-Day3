package com.javaOOPS;

//reuse: inheritance
public class B1 extends A1
{
	String address;
	
	
	public void setAddress(String address) {
		this.address = address;
	}

	public String getMyDetails()
	{
		return name+" | "+address;
	}
}
