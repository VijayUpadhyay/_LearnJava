package com.vijay.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortedMapFromList {

	static	List<String> list = new ArrayList<String>();
	public static void main(String[] args) {
	
		list.add("ram");
		list.add("rahim");
		list.add("rakesh");
		list.add("moti");
		list.add("raja");
		list.add("raja");
		Map<String,Long> m = new LinkedHashMap<String,Long>();
	    m = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	    System.out.println(m);
	    
	    Map<String,Long> sorted = m.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(x,y)->x,LinkedHashMap::new));
	    sorted.forEach((k,v)->System.out.println("key "+k+" value "+v));
	    
	}

}
