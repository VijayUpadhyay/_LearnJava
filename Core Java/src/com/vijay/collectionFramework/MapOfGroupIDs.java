package com.vijay.collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class MapOfGroupIDs {
	
	
	
	static ListofGroupIDs objListofGroupIDs = new ListofGroupIDs();
	static Map<String, Long> m1=null;
	
	static List list = new ArrayList();
	
	public void fetchData(){
		
		AssigningMapIntoList objAssigningMapIntoList = new AssigningMapIntoList();
		
		m1=objAssigningMapIntoList.addValueToMap();

		Set entrySet= m1.entrySet();
		System.out.println(entrySet);
		Iterator i = entrySet.iterator();
	     
	      // Display elements 
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	       //  System.out.println(me);
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	         list.add(me.getValue());
	      }
	      
	      for(Map.Entry<String, Long> entryset: m1.entrySet())
	    	  System.out.println(entryset);

		//Fetch the list
		ListIterator itr = list.listIterator();
		while(itr.hasNext()){
			System.out.println((long)itr.next());
			} 

		
	}

	public static void main(String[] args) {
		MapOfGroupIDs objMapOfGroupIDs = new MapOfGroupIDs();
		objMapOfGroupIDs.fetchData();
	}

}
