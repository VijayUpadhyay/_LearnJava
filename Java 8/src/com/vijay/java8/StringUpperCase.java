package com.vijay.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUpperCase {

	public static void main(String[] args) {
		
		List<String> alpha = Arrays.asList("a", "b", "c", "d","a");
		
		// Predicate is applied after all the functions have completed their functions on list. 
//List<String> upperCased = alpha.stream().map(String::toUpperCase).filter(predicate -> predicate.contains("a")).collect(Collectors.toList()); -->null
		//because "a" would have become "A" after map() method.
		List<String> upperCased = alpha.stream().map(String::toUpperCase).filter(predicate -> predicate.contains("A")).collect(Collectors.toList());

		upperCased.forEach(System.out::println);
		
		System.out.println("To get each integer multilied by 2");
		
		List<Integer> list = Arrays.asList(2,4,1,6,3,5,7);
		list = list.stream().map(mapper -> mapper*2).collect(Collectors.toList());
		list.forEach(System.out::println);
	}

}
