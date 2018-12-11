package com.vijay.functionalinterface;

public class UseFunctionalInterface implements FunctionalInterfaces {

	static int f = FunctionalInterfaces.returnInt(5);
	
	public static void main(String[] args) {
		System.out.println(f);
		UseFunctionalInterface obj = new UseFunctionalInterface();
		obj.display(7);
		obj.returnInt(77);
		//System.out.println(FunctionalInterfaces.super.p());
	}

	@Override
	public void display(int a) {
		System.out.println("Inside display " + a);
		FunctionalInterfaces.super.p();
		
	}
	public int returnInt(int b){
		System.out.println("B is "+b);
		return b;
	}

}
