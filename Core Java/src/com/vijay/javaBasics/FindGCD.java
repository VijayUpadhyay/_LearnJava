package com.vijay.javaBasics;

public class FindGCD {

	
	public static void main(String[] args) {
		GCD obj = GCD.getInstance();
		int result = obj.gcd(6,50 );
		System.out.println(result);
	}

}
