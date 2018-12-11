package com.vijay.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByAndCount {

	public static void main(String[] args) {

		List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

		Map<String,Long> map =  items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
		// Sort Map
		
		// Keep this map into another map as sorted map
		//Map<String,Long> m = new LinkedHashMap<String,Long>();
		Map<String,Long> m = map.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry:: getKey, Map.Entry::getValue,(o1,o2) -> o1,LinkedHashMap::new));
	
		//map.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).forEachOrdered(e -> m.put(e.getKey(),e.getValue()));
		System.out.println("After sorting, in Descending order");
		System.out.println(m);
	}

}
