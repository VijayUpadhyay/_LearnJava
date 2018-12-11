package com.vijay.core;

public class CloneExample implements Cloneable{

	String str = "vijay";
	public static void main(String[] args) {
		
		//1
		CloneExample obj1 = new CloneExample();
		
		//2
		try {
			CloneExample obj2 = (CloneExample) Class.forName("com.vijay.core.CloneExample").newInstance();
			System.out.println(obj2.str);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3
		try {
			CloneExample obj3 = (CloneExample) obj1.clone();
			System.out.println("clone obj: "+obj3.str);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
