package com.vijay.enums;

public class EnumTest {
	
	public enum Days {SUNDAY,MONDAY,TUESDAY}
	
	public static void main(String[] args) {
		for(Days s : Days.values()){
			System.out.println(s);
		}
	}

}
