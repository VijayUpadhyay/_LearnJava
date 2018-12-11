package com.vijay.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomRadix {

	public static void main(String[] args) {

		int b = 255;
		String s = Integer.toOctalString(b);
		System.out.println(s);
		
		s = Integer.toString(b,7);
		System.out.println(s);
		
		Integer g=Integer.parseInt("geeks", 29);
		System.out.println("G is: "+g);
		
		//split
		System.out.println("split");
		String str = "geekss@for@geekss";
        String [] arrOfStr = str.split("@",3);
 
        for (String a : arrOfStr)
            System.out.println(a);
        
        String a="Ram" ;
    	String b1="Sita";
    	a = a+b1;
    	
    	b1 = a.substring(0, a.length()-b1.length());
    	a = a.substring(b1.length());
    	System.out.println(a+": A  B1: "+b1);
    	
    	String input = "Geeks For Geeks";
        char[] hello = input.toCharArray();
        List<char[]> list = Arrays.asList(hello);
        Collections.reverse(list);
       
        
        for(char[] y: list)
        	System.out.println(y);
        
        //
        System.out.println("Reversed list: "+list);
        List<Character> list1 = new ArrayList<>();
        for(char p : hello)
        	list1.add(p);
        
        Collections.reverse(list1);
        list1.forEach(System.out::print);
    	
	}
	
	
	

}
