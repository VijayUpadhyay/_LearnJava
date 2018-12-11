package com.vijay.innerClass;

public class InnerClassTest {

	public static void main(String[] args) {
		InnerClass inner = new InnerClass();
		inner.display();
		InnerClass.C a= new InnerClass.C();
		InnerClass.C ab=  new com.vijay.innerClass.InnerClass.C();
		//InnerClass.A b= new i.A();
		ab.display();
		a.display();
	}
}
