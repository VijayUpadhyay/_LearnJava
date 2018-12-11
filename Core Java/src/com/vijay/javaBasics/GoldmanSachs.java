package com.vijay.javaBasics;

import java.util.ArrayList;
import java.util.Collections;

public class GoldmanSachs {

	
	 static String findQualifiedNumbers(int[] numberArray) {
		    ArrayList<Integer> al = new ArrayList<Integer>();
		    String output="";
		        for(Integer n: numberArray){
		            String s = String.valueOf(n);
		            if(s.contains("1") && s.contains("2") && s.contains("3"))
		            	al.add(Integer.parseInt(s));		            
		        }
		        Collections.sort(al);
		        if(al !=null && al.size()>0) {
		        output =String.valueOf(al.get(0));
		        for(int i=1; i<al.size(); i++)
		        	output = output+"," +String.valueOf(al.get(i));
		        } 
		        if(output.isEmpty())
		        	output="-1";
		        return output;
		    }
	 
	 
	 static int findPossibleSmallestNumberMatchingPattern(String pattern) {
		 int output=-1;
          if(pattern !=null && !pattern.isEmpty() && pattern.length()<=8)
          {
       	  char [] patternC= pattern.toCharArray();
       	  for(Character c: patternC) {
       	  if(c.equals('M'))
       	  {
       		  output= getValue(output,c);
       	  }       		  
       	  }
       	   
          }
          else
          {
       	   return output;
          }
		 
		 return output;
	    }
	
	static int getValue(int output, char type)
	 {
		int ox=0;
		if(output==-1 && type=='M')
			return 21;
		else if(output==-1 && type=='N')
			return 12;
		else
		{
			if(type=='M')
				ox=getValueM(output);
			else if(type=='N')
				ox=getValueN(output);
		    	   
		}
		 return ox;
	 }
	  static int getValueN(int ox)
	  {
		  String s=String.valueOf(ox);
			int lastDigit=getLastDigit(ox);
			lastDigit++;
		       if(s.contains(String.valueOf(lastDigit)))     
		       {
		    	 String sl=s.substring(0, s.length()-2);
		    	 ox= getValueN(Integer.parseInt(sl));
		    	return  getValueN(ox);
		    	  
		       }
		       else {
		    	   s=s+String.valueOf(lastDigit);
		    	   return Integer.parseInt(s);
		       }
		  
	  }
	  
	  static int getValueM(int ox)
	  {
		  String s=String.valueOf(ox);
			int lastDigit= getLastDigit(ox);
			lastDigit--;
		       if(lastDigit==0  ||s.contains(String.valueOf(lastDigit)) )     
		       {
		    	  String sl=s.substring(0, s.length()-2);
		    	 ox= getValueN(Integer.parseInt(sl));
		    	return  getValueM(ox);
		    	  
		       }
		       else {
		    	   s=s+String.valueOf(lastDigit);
		    	   return Integer.parseInt(s);
		       }
		  
	  }
	  
	 static  int getLastDigit(int ox){
		   
		   return ox%10;
	   }
	 
	public static void main(String[] args) {
		int []numberArray={};
		System.out.println(findQualifiedNumbers(numberArray));
	}


}
