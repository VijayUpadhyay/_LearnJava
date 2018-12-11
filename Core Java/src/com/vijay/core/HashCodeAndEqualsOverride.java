package com.vijay.core;

public class HashCodeAndEqualsOverride {
	
	
	public static void main(String[] args) {
		
		HashCodeAndEquals obj = new HashCodeAndEquals();
		obj.setNo(100);
		HashCodeAndEquals obj2 = new HashCodeAndEquals();
		//HashCodeAndEquals obj2 = obj;
		obj2.setNo(100);
		
		System.out.println(obj.equals(obj2));
	}

}
