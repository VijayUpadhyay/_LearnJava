package com.vijay.innerClass;

public class InnerClass {

	public class A {

		public void display() {
			System.out.println("Inside display() of A");
		}
	}

	public class B {

		public void display() {
			System.out.println("Inside display() of B");
		}
	}

	static class C {

		public void display() {
			System.out.println("Inside display() of C");
		}
	}

	public void display() {
		A i = new A();
		B j = new B();
		System.out.println("Outside inner class");
		i.display();
		j.display();
	}
}
