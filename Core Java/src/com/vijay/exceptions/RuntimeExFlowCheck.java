package com.vijay.exceptions;

public class RuntimeExFlowCheck {

	public static void doIt(){
		System.out.println("B");
		throw new RuntimeException();
	}
	public static void main(String[] args) {
		
		try{
			System.out.println("A");
			doIt();
		}catch(Exception e){
			System.out.println("C");
		}finally {
			System.out.println("D");
		}
		System.out.println("E");
	}
}
