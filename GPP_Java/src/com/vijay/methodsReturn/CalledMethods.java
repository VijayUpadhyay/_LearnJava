package com.vijay.methodsReturn;

import java.util.List;
import java.util.stream.Collectors;

public class CalledMethods {
	
	public static List<Integer> updateList(List<Integer> oldList){
		
		List<Integer> updatedList = oldList.stream().filter(p -> p!= 10 ).collect(Collectors.toList());
		return updatedList;
		
	}

}
