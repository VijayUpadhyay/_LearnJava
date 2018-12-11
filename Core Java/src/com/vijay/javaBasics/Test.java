package com.vijay.javaBasics;

import java.util.Arrays;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		Integer[] array  = {2,145,23,56};
		
		String[] str  = {"2","145","23","56"};
		
		Collections.sort(Arrays.asList(array));
		
		Collections.sort(Arrays.asList(str));
		
		System.out.println("Sorted array of Integer type"); 
		
		for(Integer arr : array)
			System.out.println(arr);
		
		System.out.println("Sorted string ---> Lexographical sorting");
		for(String arr : str)
			System.out.println(arr);
		/*145
		2
		23
		56*/
 
	}

}
