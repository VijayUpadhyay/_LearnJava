package com.vijay.collections;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByAndSumOnList {

	public static void main(String[] args) {
		
		List<Item> items = Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orang", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99"))
        );
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map = items.stream().collect(Collectors.groupingBy(Item:: getName,Collectors.summingInt(Item:: getQty)));
 
		Map<Object, Integer> i = new HashMap<Object, Integer>();
		//Function.identity() --> returns object type
		i = items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.summingInt(Item:: getQty)));
		
		System.out.println("Quantity Sum"+map);
		
		Map<String, Long> m = new HashMap<String, Long>();
		m = items.stream().collect(Collectors.groupingBy(Item:: getName, Collectors.counting()));
		System.out.println("Item Count"+m);
		
		// Group by price
		System.out.println("Group by price list");
		Map<BigDecimal, List<Item>> groupByPrice = items.stream().collect(Collectors.groupingBy(Item:: getPrice));
		System.out.println(groupByPrice);
		
		//// group by price, uses 'mapping' to convert List<Item> to Set<String>
		System.out.println("// group by price, uses 'mapping' to convert List<Item> to Set<String>");
		
		Map<BigDecimal, Set<String>> itemSet = items.stream().collect(Collectors.groupingBy(Item::getPrice,Collectors.mapping(Item::getName, Collectors.toSet())));
		//Map<BigDecimal, List<String>> itemSet = items.stream().collect(Collectors.groupingBy(Item::getPrice,Collectors.mapping(Item::getName, Collectors.toList))); --> causes repetition
		System.out.println(itemSet);
	}

}
