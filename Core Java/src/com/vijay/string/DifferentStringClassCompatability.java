package com.vijay.string;

public class DifferentStringClassCompatability {

	public static void main(String[] args) {
		String str = new String("test");
		String str2 ="test";
		
		if(str == str2)
			System.out.println("equal");
		str2 ="best"+1;
		System.out.println(str2);
		
		//////////////////Immutability
		String s= "vijay";
		s.substring(2);
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("vijay");
		sb.substring(2);
		System.out.println(sb);
	}

}
