package com.vijay.functionalinterface;

@FunctionalInterface
public interface FunctionalInterfaces {

	void display(int a);
	static int returnInt(int a){
		int area = a*a;
		return area;
	}
	
	default int p(){
		System.out.println("Inside Interface default method");
		return 5;
	}
	
}
