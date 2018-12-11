package com.vijay.string;

import java.util.HashMap;
import java.util.Map;

public final class ImmutableClass_ShallowCopy {

	private int a;
	private String name;
	private HashMap<String,String> map ;
	
	public int getA() {
		return a;
	}

	public String getName() {
		return name;
	}

	public Map<String,String> getMap() {
		return map;
	}

	public ImmutableClass_ShallowCopy(int a,String name,HashMap<String,String> map) {
		this.a=a;
		this.name = name;
		this.map = map;
	}
	
	public static void main(String[] args) {
		
	}
}
