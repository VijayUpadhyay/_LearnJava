package com.vijay.exceptions;

//Java program to demonstrate how exception is thrown.
public class ThrowsExecp{
	public static void str(){
	    String str = null;
	    
	    System.out.println(str.length());
	}
	public static void main(String args[]){
		
		str();
		
	}
}

//Read the exception from down-to-up

/*Exception in thread "main" java.lang.NullPointerException
at com.vijay.exceptions.ThrowsExecp.str(ThrowsExecp.java:8)
at com.vijay.exceptions.ThrowsExecp.main(ThrowsExecp.java:12)*/