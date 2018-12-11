package com.vijay.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorMain {

	public static void main(String[] args) {
		
		ArrayList<ComparatorImpl> list = new ArrayList<ComparatorImpl>();
		list.add(new ComparatorImpl(928804,"vj",40000));
		list.add(new ComparatorImpl(972804,"rj",10000));
		list.add(new ComparatorImpl(971804,"kj",42000));
		list.add(new ComparatorImpl(975804,"mj",40100));
		
		
		// Sorting by salary
		System.out.println("Sorting by salary in descending order");
		
		// 1st way
		/*ComparatorOnSalary onSalary = new ComparatorOnSalary();
		Collections.sort(list,onSalary);*/
		
		
		// 2nd way
		Collections.sort(list,new ComparatorOnSalary());
		
		// 3rd way
		
		/*Collections.sort(list, new Comparator<ComparatorImpl>() {

			@Override
			public int compare(ComparatorImpl obj1, ComparatorImpl obj2) {
				
				return obj1.getSalary().compareTo(obj2.getSalary()));
			}
		});*/
		
		for(ComparatorImpl comparatorObj : list){
			System.out.println("[ "+ comparatorObj.getEmpID()+" "+comparatorObj.getEmpName()+" "+comparatorObj.getSalary()+" ]");
		}

	}

}
