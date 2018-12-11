package com.vijay.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		
		List<String> list =new ArrayList<String>();
		
		list.add("first");
		list.add("second");
		list.add("First");
		list.add("apple");
		
		ComparatorExample obj = new ComparatorExample();
		obj.sortUsingComparator(list);
		
		// Keeps capital letters first
		System.out.println(list);
		
	}

	private void sortUsingComparator(List<String> list) {
		
		Collections.sort(list, (s1,s2) -> s1.compareTo(s2));
		

	}
}
