package com.vijay.jvm;

public class StaticInitializerBlocksParent {
	
	static{
		System.out.println("Inside Parent Static block");
	}
	
	public StaticInitializerBlocksParent() {
		System.out.println("Inside parent constructor");
	}
	
	public StaticInitializerBlocksParent(int a) {
		System.out.println("Inside parent constructor with args");
	}
	

}
