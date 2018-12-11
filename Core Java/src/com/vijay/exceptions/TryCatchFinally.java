package com.vijay.exceptions;

public class TryCatchFinally {

	static int[] arr = new int[4];
	
	public static void test2(){

		try{
			System.out.println(arr[4]);
		}catch(NumberFormatException e){
			System.out.println("Inside 1st catch");
		}
	}
	
	public static void test(){
		try{
			test2();
		}catch(NumberFormatException e){
			System.out.println("Inside 2 catch");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Inside 2 catch");
		}
	}
	
	public static void main(String[] args) {
		try{
			test();
			System.out.println("Inside Try");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Inside 3 catch");
		}finally {
			System.out.println("Inside finally");
		}
	}
}
