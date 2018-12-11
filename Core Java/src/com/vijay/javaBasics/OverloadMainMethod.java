package com.vijay.javaBasics;

public class OverloadMainMethod {

	public static void main(int a){
		System.out.println("Inside main(int) "+ a);
	}
	
	public static void main(String a) {
		System.out.println("Inside main(String) "+ a);
	}
	
	public static void main(String[] args) {
		//OverloadMainMethod objOverloadMainMethod = new OverloadMainMethod();
		OverloadMainMethod.main(2);
		OverloadMainMethod.main("6");

	}// It is good practice to call static methods using their class name.

}
