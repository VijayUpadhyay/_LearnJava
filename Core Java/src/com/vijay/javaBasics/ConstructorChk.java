package com.vijay.javaBasics;

public class ConstructorChk {
	final static int p=10;
	@Override
	public String toString() {
		return "ConstructorChk [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public ConstructorChk(int i) {
		System.out.println("inside constructor "+i);
	}
	public static void main(String[] args) {
		int j=10;
		ConstructorChk obj = new ConstructorChk(j);
		System.out.println("Object is: "+obj);
	}

}
