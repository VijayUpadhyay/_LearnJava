package com.vijay.core;

public class OverloadMain {
	
	public static void main() {
		System.out.println("inside main  without args");
	}

	public static void main(String[] args) {
		
		System.out.println("inside main args");
		
		OverloadMain obj= new OverloadMain();
		obj.main();
		String arr[] = {"vj","ram"};
		 obj.main(arr);//  -------> infinite loop for main method.
	}

}
