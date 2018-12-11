package com.vijay.jvm;

public class StaticInitializerBlocks extends StaticInitializerBlocksParent{
	
	public StaticInitializerBlocks() {
		System.out.println("Inside child constructor");
	}
	
	static{
		System.out.println("Inside child static block");
	}
	
	public static void main(String[] args) {
		StaticInitializerBlocks obj = new StaticInitializerBlocks();
		System.out.println("End "+obj);
	}

}
