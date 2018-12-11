package com.vijay.string;

public class StringEquality {

	public static void main(String[] args) {
		String s1 = "ram";
		String s2 = "ram";
		System.out.println(s1==s2);
		
		String s3 =new String("ram");
		String s4 = new String("ram");
		System.out.println(s1==s3);
		System.out.println(s3==s4);
	}
	
	public static void display(){
		//static int a;
	}
	
}
