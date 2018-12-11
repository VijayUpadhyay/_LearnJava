package com.vijay.jvm;

class Student{
	int a;
	
	public void display(){
		System.out.println("Inside display");
	}
}
public class ClassObjects {

	public static void main(String[] args) {
		Student s1 = new Student();
		Class<? extends Student> c1 = s1.getClass();
		
		Student s2 = new Student();
		Class<? extends Student> c2 = s2.getClass();
		System.out.println(c1==c2);
	}
	
}
