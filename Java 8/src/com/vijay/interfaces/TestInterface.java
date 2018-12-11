package com.vijay.interfaces;

public interface TestInterface {

	default void show(){
		System.out.println("Inside default method of interface");
	}
}
