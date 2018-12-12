package com.vijay.collectionFramework;

import java.math.BigInteger;

public class TestList {
public static void main(String[] args) {
	findProduct(100);
	BigInteger a = new BigInteger("280");
	System.out.println(a.mod(new BigInteger("10")));
	
	System.out.println(a.remainder(new BigInteger("10")));
	
}
public static BigInteger findProduct(Integer number){
	BigInteger product=new BigInteger("1");
	for(int i=1;i<=number;i++)
		{
		product=product.multiply(new BigInteger(""+i));
		System.out.println("For i : "+i +" and value : "+product);
		}
	
	return product;
}

@SuppressWarnings("unused")
private static int[] operations(int product){
	int[] arr = new int[2];// To store count and sum of digits
	int count=0,sum=0;
	//BigInteger[] a = new BigInteger("")[2];
	while(product>0){
		int x = product % 10;
		//To count number of zeroes
		if(x==0)
			count++;
		// To find sum at the same time
		sum+=x;
		product = product/10;
	}
	arr[0]=count;
	arr[1]=sum;
	return arr;
}

}
