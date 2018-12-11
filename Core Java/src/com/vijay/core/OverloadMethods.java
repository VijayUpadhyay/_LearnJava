package com.vijay.core;

public class OverloadMethods {
	
	private void pub() {
		System.out.println("Void method");

	}
	
	public char pub(int a){
		return 'Y';
	}
	public static void main(String[] args) {
		OverloadMethods obj = new OverloadMethods();
		obj.pub();

	}

}
