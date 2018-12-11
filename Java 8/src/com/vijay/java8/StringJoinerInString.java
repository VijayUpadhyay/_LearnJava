package com.vijay.java8;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringJoinerInString {

	public static void main(String[] args) {
		StringJoiner str = new StringJoiner(",");
		str.add("1213");
		str.add("ert");
		str.add("sdgs");
		
		System.out.println("String Joiner: "+str);
		String arr = new String();
		arr = str.toString();
		
		System.out.println("String: "+arr);
		
		StringJoiner ex = new StringJoiner("/", "Vijay-", "-Rakesh");
		ex.add("01");
		ex.add("12");
		ex.add("20170");
		System.out.println("StringJoiner with prefix and suffix: "+ex);
		
		String str2 = String.join("-", "sdfd","sdgdf","asdas","sdfsfs","hhhhh","NA",null);
		System.out.println("Str2: "+str2);
		
		List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");
		String result = String.join("/ ", list);
		System.out.println(result);

		///
		String[] s1 = new String[]{"a", "b", "c"};
        String[] s2 = new String[]{"d", "e", "f"};
        String[] s3 = new String[]{"g", "h", "i"};
       // StringJoiner str3 = String.join("/", s1,s2,s3);
        String[] result2 = Stream.of(s1,s2,s3).flatMap(Stream::of).toArray(String[]::new);
		for(String string : result2){
			System.out.println(string);
		}
		
		//
		
		
		
		int [] int1 = new int[]{1,2,3};
        int[] int2 = new int[]{4,5,6};
        int[] int3 = new int[]{7,8,9};
        
        int[] intStream = IntStream.concat(Arrays.stream(int1), IntStream.concat(Arrays.stream(int2), Arrays.stream(int3))).toArray();
		System.out.println("Int sstream");
		for(int a : intStream)
			System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
