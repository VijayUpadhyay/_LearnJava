package com.vijay.collectionFramework;

import java.util.Comparator;

public class ComparatorOnSalary implements Comparator<ComparatorImpl> {

	@Override
	public int compare(ComparatorImpl obj1, ComparatorImpl obj2) {
		if(obj1.getSalary() > obj2.getSalary())
			return -1;
		else if(obj1.getSalary() < obj2.getSalary())
			return 1;
		
		else
			return 0;
	}

	
}
