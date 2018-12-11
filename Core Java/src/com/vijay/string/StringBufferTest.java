package com.vijay.string;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		StringBuffer sb1 = new StringBuffer("Vijay");
		System.out.println("sb1 length: "+ sb1.length());
		System.out.println("sb1 capacity: "+ sb1.capacity());
		
		StringBuilder sbBuilder = new StringBuilder(10);
		System.out.println(sbBuilder.capacity());
		sbBuilder.ensureCapacity(20+2);
		System.out.println(sbBuilder.capacity());
	}
}
