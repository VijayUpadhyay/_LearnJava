package com.vijay.string;

import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String str = "How are you ?";
		StringTokenizer st = new StringTokenizer(str, " ");
		while(st.hasMoreTokens())
		System.out.println(st.nextToken());
		
		System.out.println("Elements");
		while(st.hasMoreElements())
			System.out.println(st.nextElement());
		
		concating(str);
		System.out.println("str in main: "+str);
		
		StringBuilder sb = new StringBuilder("string builder");
		concat2(sb);
		System.out.println("String builder inside main " +sb);
		
		StringBuffer sbf = new StringBuffer("string buffer");
		concat3(sbf);
		System.out.println("SBF in main "+sbf);

		int p =1211232423;
		DecimalFormat df = new DecimalFormat("#,###");
		String ps = df.format(p);
		System.out.println("PS: "+ps);
	}
	
	public static void concating(String a){
		System.out.println("Inside method");
		String str = a + "done";
		System.out.println(str);
	}
	
	public static void concat2(StringBuilder s2)
    {
        s2.append("forgeeks");
    }
 
    // Concatenates to StringBuffer
    public static void concat3(StringBuffer s3)
    {
        s3.append("forgeeks");
    }

}
