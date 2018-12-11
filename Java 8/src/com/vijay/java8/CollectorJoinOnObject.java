package com.vijay.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorJoinOnObject {

	public static void main(String[] args) {
		List<Game> list = Arrays.asList(
                new Game("Dragon Blaze", 5),
                new Game("Angry Bird", 5),
                new Game("Candy Crush", 5)
        );

        //{Dragon Blaze, Angry Bird, Candy Crush}
        String result = list.stream().map(x -> x.getName())
		.collect(Collectors.joining(", ", "prefix{", "}suffix"));

        System.out.println(result);
	}

}
