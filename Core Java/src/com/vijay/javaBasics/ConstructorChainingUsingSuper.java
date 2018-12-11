package com.vijay.javaBasics;

public class ConstructorChainingUsingSuper extends ConstructorSuper{

	int i,j;
	ConstructorChainingUsingSuper(int i) {
		super(i);
		this.i = i;
		System.out.println(i);
	}
	
	ConstructorChainingUsingSuper(int i,int j) {
		super(j);
		this.j = j;
		System.out.println(i+"  "+j);
	}
	
	public ConstructorChainingUsingSuper() {
		this(5);
	}
	public static void main(String[] args) {
		ConstructorChainingUsingSuper obj = new ConstructorChainingUsingSuper();
		ConstructorChainingUsingSuper obj1 = new ConstructorChainingUsingSuper(5);
		ConstructorChainingUsingSuper obj2 = new ConstructorChainingUsingSuper(5,6);

	}

}
