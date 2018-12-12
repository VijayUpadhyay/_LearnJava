package com.vijay.javaBasics;

import java.util.Arrays;

public class ArrayInObject {

	public static void main(String[] args) {
		
	Object[] obj = {"2","3","4","1","20","10"};
	
	/*List list = new ArrayList(Arrays.sort(obj));	
	String[] str = (String[]) obj;*/
	
	Arrays.sort(obj);
	
	System.out.println(obj); //[1, 10, 2, 20, 3, 4]
	
	for(Object str : obj){
		System.out.println(str);
	}

	}

}
