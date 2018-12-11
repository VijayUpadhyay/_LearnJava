package com.vijay.string;

public class StringBasics {

	public static void main(String[] args) {
		
		String str = "Ram";
		String str2 = "Ram";

		if (str == str2)
			System.out.println("Pointing to reference");
		
		String st = str.substring(1);
		System.out.println(st.toUpperCase().compareToIgnoreCase(str2.substring(1)));
		
		String s = str2.replace('R', 'S');
		System.out.println(s);
	}

}
