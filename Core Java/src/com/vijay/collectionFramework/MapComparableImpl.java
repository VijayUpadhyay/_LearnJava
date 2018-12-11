package com.vijay.collectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapComparableImpl implements Comparable<MapComparableImpl>{

	int age;
	static List<String> list ;
	public static void main(String[] args) {
		
		list = new ArrayList<>();
		
		HashMap<String, String> map = new HashMap<String,String>();
		
		//Map<String, String> map = new TreeMap<String,String>();
		map.put("first", "ram");
		map.put("second", "ramayan");
		map.put("third", "vj");
		map.put("fourth", "ramanujam");
		map.put("fifth", "rakesh");
		
		//list.addAll(map.to);
		Set<java.util.Map.Entry<String, String>> entry = map.entrySet();
		Iterator<java.util.Map.Entry<String, String>> itr = entry.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		if(map.containsValue("rakesh"))
			System.out.println(map);

	}


	@Override
	public int compareTo(MapComparableImpl o) {
		// TODO Auto-generated method stub
		return this.age - o.age;
	}

}
