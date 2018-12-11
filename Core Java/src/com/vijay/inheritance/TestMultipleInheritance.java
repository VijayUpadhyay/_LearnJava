package com.vijay.inheritance;

public class TestMultipleInheritance implements PI1,PI2 {

	public static void main(String[] args) {
		TestMultipleInheritance obj = new TestMultipleInheritance();
		obj.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		PI1.super.show();
		
		PI2.super.show();
	}

}
