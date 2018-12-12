package com.vijay.core;

public class FinalOverride extends FinalOverloading{
	
	public int getData1(String temp,float f,String s){
		System.out.println("Inside FinalOverride");
		System.out.println(temp+" "+f+" "+s);
		return 1;
	}

	public  static String foo(){
		System.out.println("Method hiding");
		return "FinalOverride";
	}
	public static void main(String[] args) {
		FinalOverloading obj = new FinalOverride();
		FinalOverride obj1 = new FinalOverride();
		obj.getData1("df");
		obj.getData1("zvx", 34, "af");
		obj1.getData1("sdvd", 3, "dsv");
		
		System.out.println("For foo()");
		System.out.println(FinalOverloading.foo());
		System.out.println(FinalOverride.foo());

	}

}
