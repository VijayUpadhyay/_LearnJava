package com.vijay.methodsReturn;

import java.util.ArrayList;
import java.util.List;

public class CallMethods {
	public static List<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		list.add(11);
		list.add(10);
		list.add(19);
		list.add(10);
		
		list = CalledMethods.updateList(list);
		list.forEach(System.out::println);
	}

}
