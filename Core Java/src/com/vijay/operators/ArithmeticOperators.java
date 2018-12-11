package com.vijay.operators;

public class ArithmeticOperators {
	
	static int a=5,b=10,c=110;
	
	public static void main(String[] args) {
		int k = a+++b;
		int j = a+++b++;
		int l = a++ + ++b;
		int p = (b++)+(++a);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		System.out.println(p);
	}

}
