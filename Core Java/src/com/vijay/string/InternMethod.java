package com.vijay.string;

public class InternMethod {

	public static void main(String[] args) {
		String s1 = "vijay";
		String s2 = s1.intern();
		System.out.println(s1==s2);
		
		String s3 = new String("ram");
		String s4 = "ram";
		System.out.println(s3==s4);
	}
}
