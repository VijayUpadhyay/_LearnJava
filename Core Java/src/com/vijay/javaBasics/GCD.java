package com.vijay.javaBasics;

public class GCD {

	private GCD(){}
	public static void main(String[] args) {
		getInstance();

	}
	public static GCD getInstance(){
		return new GCD();
	}
	
	public int gcd(int d, int n){
		if(n==0)
			return d;
		else
			return gcd(n , n%d);
	}

}
