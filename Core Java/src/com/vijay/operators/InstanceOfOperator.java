package com.vijay.operators;

public class InstanceOfOperator {

	public static void main(String[] args) {
		InstanceOperator1 a = new InstanceOperator1();
		InstanceOperator2 b = new InstanceOperator2();
		InstanceOfOperator3 c = new InstanceOfOperator3();
		InstanceOperator2 ab =   new InstanceOperator1();
		
		System.out.println("instanceOf operator");
		System.out.println("a is instance of  InstanceOperator: "+(a instanceof InstanceOperator));
		System.out.println("a is instance of  InstanceOperator1: "+(a instanceof InstanceOperator1));
		System.out.println("a is instance of  InstanceOperator2: "+(a instanceof InstanceOperator2));
		System.out.println("a is instance of  InstanceOperator3: "+(a instanceof InstanceOfOperator3));
		System.out.println("a is instance of  InstanceOperator3: "+(a instanceof InstanceOfOperator_2));
		System.out.println("a is instance of  InstanceOperator3: "+(a instanceof InstanceOfOperator_2));
		//System.out.println("a is instance of  InstanceOperator3: "+(a instanceof InstanceOperator_4));
		System.out.println("b is instance of  InstanceOperator: "+(b instanceof InstanceOperator));
		System.out.println("b is instance of  InstanceOperator1: "+(b instanceof InstanceOperator1));
		System.out.println("b is instance of  InstanceOperator2: "+(b instanceof InstanceOperator2));
		System.out.println("b is instance of  InstanceOfOperator3: "+(b instanceof InstanceOfOperator3));
		System.out.println("c is instance of  InstanceOperator: "+(c instanceof InstanceOperator));
		System.out.println("c is instance of  InstanceOperator1: "+(c instanceof InstanceOperator1));
		System.out.println("c is instance of  InstanceOperator2: "+(c instanceof InstanceOperator2));
		System.out.println("c is instance of  InstanceOfOperator3: "+(c instanceof InstanceOfOperator3));
		System.out.println("ab is instance of  InstanceOperator: "+(ab instanceof InstanceOperator));
		System.out.println("ab is instance of  InstanceOperator1: "+(ab instanceof InstanceOperator1));
		System.out.println("ab is instance of  InstanceOperator2: "+(ab instanceof InstanceOperator2));
		System.out.println("ab is instance of  InstanceOperator2: "+(ab instanceof InstanceOfOperator3));
		
	}
}
