package com.vijay.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimitiveArrayToList {

	public static void main(String[] args) {
		int[] number = {1, 2, 3, 8, 9, 10};
		List<int[]> list = Arrays.asList(number);
		list.forEach(System.out::println);
		
		List<Integer> list2 = Arrays.stream(number).boxed().collect(Collectors.toList());
		list2.forEach(System.out::println);
	}

}
