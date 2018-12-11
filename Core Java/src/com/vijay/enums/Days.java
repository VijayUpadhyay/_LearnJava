package com.vijay.enums;

public enum Days {
	
	MONDAY(1),TUESDAY(2),WEDNESDAY(3);
	private int a;
	Days(int a){
		this.setA(a);
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
}
