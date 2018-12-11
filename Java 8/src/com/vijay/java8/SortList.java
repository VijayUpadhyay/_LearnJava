package com.vijay.java8;

import java.util.ArrayList;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
List<String> list =new ArrayList<String>();
		
		list.add("first");
		list.add("second");
		list.add("First");
		list.add("apple");
		
		list.sort((x,y) -> x.compareTo(y));
		list.forEach(System.out::println);
	}
}
