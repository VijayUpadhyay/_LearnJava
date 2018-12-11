package com.vijay.functionalinterface;

public class CheckFunctionalInterface {

	public static void main(String[] args) {
		FunctionalInterfaceTest obj = (int a) -> a*a;
		int result = obj.test(5);
		System.out.println(result);
	}

}
