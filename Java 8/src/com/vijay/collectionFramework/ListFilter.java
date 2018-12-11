package com.vijay.collectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListFilter {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("ae");
		list.add("ad");
		list.add("af");
		list.add("ag");
		list.add("a");
		
		list = list.stream().filter(predicate -> predicate != "a").collect(Collectors.toList());
		list.stream().forEach(System.out::println);
	}
}
