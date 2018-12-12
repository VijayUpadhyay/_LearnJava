package com.vijay.core;

public class OverloadMain {
	
	public static void main() {
		System.out.println("inside main without args");
	}

	public static void main(String[] args) {
		
		System.out.println("inside main args");
		
		@SuppressWarnings("unused")
		OverloadMain obj= new OverloadMain();
		OverloadMain.main();
		//obj.main();
		String arr[] = {"vj","ram"};
		 OverloadMain.main(arr);//  -------> infinite loop for main method.
	}

}
