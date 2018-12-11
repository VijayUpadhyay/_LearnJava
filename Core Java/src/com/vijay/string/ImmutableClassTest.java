package com.vijay.string;

import java.util.HashMap;

public class ImmutableClassTest {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
		System.out.println("-----------------Deep copy test-------------------------");
		ImmutableClass imClassObj1 = new ImmutableClass(10, "vijay", map);
		ImmutableClass imClassObj2 = new ImmutableClass(10, "vijay", map);
		System.out.println(imClassObj1.getTestMap() == imClassObj2.getTestMap());
		System.out.println("-----------------Shallow copy test-------------------------");
		ImmutableClass_ShallowCopy class_ShallowCopy1 = new ImmutableClass_ShallowCopy(10, "vijay", map);
		ImmutableClass_ShallowCopy class_ShallowCopy2 = new ImmutableClass_ShallowCopy(10, "vijay", map);
		System.out.println(class_ShallowCopy1.getMap() == class_ShallowCopy2.getMap());
	}
}
