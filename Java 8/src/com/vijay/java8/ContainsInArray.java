package com.vijay.java8;

import java.util.stream.IntStream;

public class ContainsInArray {
static int[] arr ={1,2,3,4,56,7,8,9};
	public static void main(String[] args) {
		/*IntStream str = IntStream.of(arr);
		IntStream intstream =str;
		str.forEach(System.out::println);*/
		
		boolean flag = IntStream.of(arr).anyMatch(predicate -> predicate == 8);
		System.out.println(flag);
	}

}
