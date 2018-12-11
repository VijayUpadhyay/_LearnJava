package com.vijay.javaBasics;

import java.math.BigDecimal;

public class OctaOrHexaNumberSystem {

	public static void main(String[] args) {
	
		int a= 0xAFb;
		int b= 10;
		int c= 0666;
		System.out.println("Value in a: "+a+" and Value in b is: "+b+" and Value in c is: "+c);
		
		double p = 1.023e6;
		System.out.println("Value of p is: "+p);
		
		BigDecimal bigDecimal = new BigDecimal(100000000.78887968);
		BigDecimal bigDecimal1 = new BigDecimal(200000000.1234455667777);

		System.out.println("Value of addition of BigDecimal numbers is: "+bigDecimal.add(bigDecimal1));
	}

}
