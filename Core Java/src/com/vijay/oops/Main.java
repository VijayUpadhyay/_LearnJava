package com.vijay.oops;

//file name: Main.java
class Base {
	@SuppressWarnings("unused")
	private final void foo() {
		System.out.println("Base Class");
	}
}

class Derived extends Base {
	public void foo1() {} 
}

public class Main {
	public static void main(String args[]) {
		/*Base b = new Derived();
		b.foo1();*/
		Derived b = new Derived();
		b.foo1();
	}
}

