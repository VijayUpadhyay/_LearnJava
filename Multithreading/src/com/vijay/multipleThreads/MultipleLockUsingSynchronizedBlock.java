package com.vijay.multipleThreads;

import java.util.ArrayList;
import java.util.List;

public class MultipleLockUsingSynchronizedBlock {

	public static void main(String[] args) {
		new Worker().main();

		//Test Example to check working of equals and == for list object.
		List<String> a = new ArrayList<String>();
		List<String> b = new ArrayList<String>();
		
		a.add("A");
		b.add("A");
		
		if(a==b){
			System.out.println("a & b are pointing to same memory reference");
		}else if(a.equals(b)){
			System.out.println("a & b are equals");
		}
		else{
			System.out.println("a & b are pointing to different memory reference");
		}
		
	}

}
