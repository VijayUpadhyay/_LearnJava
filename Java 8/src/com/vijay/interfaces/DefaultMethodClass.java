package com.vijay.interfaces;

public class DefaultMethodClass implements TestInterface{

	public static void main(String[] args) {
		DefaultMethodClass obj = new DefaultMethodClass();
		obj.show();
		obj.callDefaultMethod();
	}
	
	public void show(){
		System.out.println("Inside class method");
	}
	public void callDefaultMethod(){
		TestInterface.super.show();
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println(Runtime.getRuntime().freeMemory());
	}

}
