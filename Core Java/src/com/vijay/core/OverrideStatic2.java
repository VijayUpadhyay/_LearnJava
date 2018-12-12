package com.vijay.core;

public class OverrideStatic2 extends OverrideStatic1{

	public static void foo(){
		System.out.println("Inside 2nd class");
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		OverrideStatic1 o1 = new OverrideStatic1();
		OverrideStatic1 o2 = new OverrideStatic2();
		o1.foo();
		o2.foo();

	}

}
