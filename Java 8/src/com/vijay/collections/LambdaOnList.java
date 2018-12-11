package com.vijay.collections;

import java.util.ArrayList;
import java.util.List;

public class LambdaOnList {

	static List<String> list = new ArrayList<String>( );
	public static void main(String[] args) {
		list.add("ram");
		list.add("rahim");
		list.add("rakesh");
		list.add("moti");
		list.add("raja");
		
		System.out.println("Asc order sorting:");
		list.sort((x,y) -> x.compareTo(y) );
		list.forEach(e -> System.out.println(e));
		
		
		list.sort((x,y) -> y.compareTo(x) );
		// Comparator<List<String>> comparatorObj = ( (x,y) -> x.compareTo(y) ) ;
		
		System.out.println("Desc order sorting:");
		list.forEach(e -> System.out.println(e));

	}

}
