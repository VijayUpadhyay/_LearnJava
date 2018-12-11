package com.vijay.innerClass;

abstract class Person{  
	  abstract void eat();  
	}  

public class AnnonymousInnerClass {
	
		 public static void main(String args[]){  
		  Person p=new Person(){  
		  void eat(){System.out.println("nice fruits");}  
		  };  
		  p.eat();  
		 }  
		}  
