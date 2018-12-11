package com.vijay.inheritance;

public class TestFinal extends GrandParent2{

	public final void test(){
		System.out.println("Child class method made final");
	}
	public static void main(String[] args) {
		
		GrandParent2 obj = new TestFinal();
		obj.test();
	}

}
