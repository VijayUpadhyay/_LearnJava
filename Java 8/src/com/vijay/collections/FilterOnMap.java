package com.vijay.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterOnMap {

	public static void main(String[] args) {
		Map<Integer, String> HOSTING = new HashMap<>();
        HOSTING.put(1, "linode.com");
        HOSTING.put(2, "heroku.com");
        HOSTING.put(3, "digitalocean.com");
        HOSTING.put(4, "aws.amazon.com");
        HOSTING.put(5, "aws.amazon.com");
        Long result = null;
        result = HOSTING.entrySet().stream().filter(predicate -> predicate.getValue().equals("aws.amazon.com")).map(map -> map.getValue()).collect(Collectors.counting());
        
        String concatedResult = null;
        concatedResult = HOSTING.entrySet().stream().filter(predicate -> predicate.getValue().equals("aws.amazon.com")).map(map -> map.getValue()).collect(Collectors.joining("/"));
        
        System.out.println(result);
        System.out.println(concatedResult);
//aws.amazon.comaws.amazon.com --> o/p --> if 2 values are same it will concatenate them.
        
      //Map -> Stream -> Filter -> Map
        Map<Integer, String> collect = HOSTING.entrySet().stream()
                .filter(map -> map.getKey() == 2)
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

        System.out.println("2nd method:"+collect);
	}

}
