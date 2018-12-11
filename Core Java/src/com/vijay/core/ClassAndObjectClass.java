package com.vijay.core;

public class ClassAndObjectClass {
	int a=0;

	{
		a=100;
		System.out.println("Common block for all constructors");
	}
	public ClassAndObjectClass() {
		System.out.println("Default Constructor");
	}
	public ClassAndObjectClass(int a) {
	 	System.out.println("Constructor with args");
	}
	public static void main(String[] args) {
		
		ClassAndObjectClass obj = new ClassAndObjectClass();
		System.out.println(obj.getClass());
		
		System.out.println(obj.getClass().getSimpleName());
		System.out.println("obj "+obj.a);
		ClassAndObjectClass obj1 = new ClassAndObjectClass(1);
		System.out.println("obj1 "+obj1.a);

	}
}
