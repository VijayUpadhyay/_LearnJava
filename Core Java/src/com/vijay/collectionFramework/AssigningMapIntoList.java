package com.vijay.collectionFramework;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class AssigningMapIntoList implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 5379004257228213009L;
	Map<String, Long> m = new HashMap<String, Long>();
	
	public Map<String, Long> addValueToMap(){
		m.put("user1", new Long(1234));
		m.put("user2", new Long(1235));
		m.put("user3", new Long(1236));
		m.put("user4", new Long(1237));
		
		return m;
	}
	
	public static void main(String[] args) {
		
		AssigningMapIntoList objAssigningMapIntoList = new AssigningMapIntoList();
		
		objAssigningMapIntoList.addValueToMap();
	}

}
