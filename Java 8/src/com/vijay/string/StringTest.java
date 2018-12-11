package com.vijay.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringTest {

	public static void main(String[] args) {
		String[] st = {"ab","ad"};
		String[] test = new String[3];
		List<String> s = Arrays.asList(st);
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("abcd", 2);
		map.put("acd", 2);
		map.put("ad", 2);
		map.put("a", 2);
		int i=0;
		for(Map.Entry<String, Integer> entry : map.entrySet()){
			for(String str : s ){
				if(str.contains(entry.getKey())){
					test[i] = str;
					i++;
				}
			}
		}
		
		for(String s1:test)
			System.out.println(s1);
	}
}
