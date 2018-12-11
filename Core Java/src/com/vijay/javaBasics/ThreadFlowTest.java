package com.vijay.javaBasics;

public class ThreadFlowTest extends Thread{

	static ThreadFlowTest t1,t2;
	   
			public void run(){  
				System.out.println("Inside run before try block "+Thread.currentThread().getName()); 
			try{  
				System.out.println("Inside run after try block but before sleep method "+Thread.currentThread().getName());
			Thread.sleep(1000);  
			System.out.println("After sleep method "+Thread.currentThread().getName());  
			}catch(InterruptedException e){  
			throw new RuntimeException("Thread interrupted..."+e);  
			}  
			  
			}  
			  
			public static void main(String args[]){  
			 t1=new ThreadFlowTest();
			 t2=new ThreadFlowTest();
			t1.start(); 
			t2.start();
			try{  
			t1.interrupt();  
			}catch(Exception e){System.out.println("Exception handled "+e);}  
			  
			}  
			 

	}


