package com.vijay.operators;

public class IntegerValueCache {

	public static void main(String[] args) {
		Integer x = 400, y = 400;// same if x n y are in b/w -128 to 127
        if (x == y)
           System.out.println("Same");
        else
           System.out.println("Not Same");

        Integer x1 = new Integer(10), y1 = new Integer(10);
        if (x1 == y1)
           System.out.println("Same");
        else
           System.out.println("Not Same");
	}

}
