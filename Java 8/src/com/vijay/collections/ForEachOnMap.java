package com.vijay.collections;

import java.util.HashMap;
import java.util.Map;

public class ForEachOnMap {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("first", 10440);
		map.put("second", 4100);
		map.put("second", 41001); // Overwriting the previous value of Key: second
		map.put("f", 1040);
		map.put("fst", 1003);
		map.put("frst", 1200);
		map.put("firt", 1100);

		//for complete iteration
		map.forEach((k,v) -> System.out.println("Key:"+k+" Value: "+v));
		
		//for conditional iteration
		System.out.println("for conditional iteration");
		map.forEach((k,v) -> {
			if("f".equals(k))
			System.out.println("Key:"+k+" Value: "+v);});
	

	}

}
