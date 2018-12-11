package com.vijay.javaBasics;

public class IsStringAnagram {

	public static void main(String[] args) {
		
		String s1 ="triangle";
		String s2="integral";
		 boolean flag = isAnagram(s1, s2);
		 
		 System.out.println(flag);
		
	}

	
	public static boolean isAnagram(String word, String anagram){
		if(word.length() != anagram.length()){
			return false; } char[] chars = word.toCharArray();
			for(char c : chars){ int index = anagram.indexOf(c); 
			if(index != -1){ anagram = anagram.substring(0,index) + anagram.substring(index +1, anagram.length()); }
else{
	return false; 
	}
			}
			return anagram.isEmpty();
			}
}
