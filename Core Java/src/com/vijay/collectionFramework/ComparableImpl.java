package com.vijay.collectionFramework;

import java.util.Arrays;
import java.util.Collections;

public class ComparableImpl implements Comparable<ComparableImpl>{

	private String name,id;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ComparableImpl [name=" + name + ", id=" + id + ", age=" + age + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	ComparableImpl(String name,String id, int age){
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	public static void main(String[] args) {
		
		ComparableImpl[] comparableImplObj = new ComparableImpl[3];
		comparableImplObj[0] = new ComparableImpl("Vijay","978804",11978804);
		comparableImplObj[1] = new ComparableImpl("Rakesh","978808",28);
		comparableImplObj[2] = new ComparableImpl("Moti","978888",20);
		
		Arrays.sort(comparableImplObj);
		
		System.out.println(Arrays.toString(comparableImplObj));
	}

	@Override
	public int compareTo(ComparableImpl obj) {
		
		return this.age - obj.age;
	}

}
