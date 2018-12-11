package com.vijay.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NotNullList {

	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("java", "python", "node", null, "ruby", null, "php");
		
		List<String> list = stream.filter(Objects :: nonNull).collect(Collectors.toList());
		
		System.out.println(list);
		int[] array = {1,2,3};
		IntStream intStream = Arrays.stream(array);
		
		System.out.println("First stream");
		intStream.forEach(System.out::println);
		
		Stream<int[]> streamArray = Stream.of(array);
		System.out.println("Stream Array");
		
		IntStream intStreaming = streamArray.flatMapToInt(x -> Arrays.stream(x));
		intStreaming.forEach(System.out::println);
		
	}

}
