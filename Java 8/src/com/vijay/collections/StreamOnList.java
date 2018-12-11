package com.vijay.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOnList {

	public static void main(String[] args) {


		List<String> items = new ArrayList<String>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");
		items.add("B");
		items.add("C");
		
		List<String> itr = new ArrayList<String>();
		itr.add("B");
		itr.add("f");
		itr.add("g");
		itr.add("B");
		itr.add("o");
		
		List<String> collect = itr.stream().filter(e -> e.contains("B")).collect(Collectors.toList());
		collect.forEach(item -> System.out.println(item));
		collect.forEach(System.out::println);
		
		items.stream().filter(predicate -> predicate.contains("D")).forEach(System.out::println);

	}

}
