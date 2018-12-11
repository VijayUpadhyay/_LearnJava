package com.vijay.java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayJoin {

	public static void main(String[] args) {
		String[] s1 = new String[]{"a", "b", "c"};
        String[] s2 = new String[]{"d", "e", "f"};
    // ArrayUtils is available in   org.apache.commons.lang3.ArrayUtils 
        String[] str = ArrayUtils.addAll(s1, s2);
        System.out.println(Arrays.toString(str));
        
        List<String> list = Arrays.asList(str);
        list.forEach(System.out::print);
        //Java API
        String[] s3 = new String[]{"g", "h", "i"};
        String[] s4 = new String[]{"a", "b", "c"};
        String[] s5 = new String[]{"d", "e", "f"};
        
        String[] result = joinAllStringArrays(s4,s5,s3);
        System.out.println("\nResult value from customized method using Java API:");
        System.out.println(Arrays.toString(result));
        
        // Java 8
        String[] java8 = Stream.of(s4,s5,s3).flatMap(Stream::of).toArray(String[]::new);
        System.out.println("Java 8 Impl");
        System.out.println(Arrays.toString(java8));
        
        int [] int1 = new int[]{1,2,3};
        int[] int2 = new int[]{4,5,6};
        int[] int3 = new int[]{7,8,9};
        System.out.println("Integer Array");
        System.out.println("Result2 for Integer- 2 Array");
      //join 2 primitive type array
        int[] result2 = IntStream.concat(Arrays.stream(int1), Arrays.stream(int2)).toArray();
        System.out.println(Arrays.toString(result2));
        System.out.println("Result2 for Integer- 3 Arrays");
       
		//join 3 primitive type array, any better idea?
        int[] result3 = IntStream.concat(Arrays.stream(int1),
			IntStream.concat(Arrays.stream(int2), Arrays.stream(int3))).toArray();
        System.out.println(Arrays.toString(result3));
 	}
	static <T> T[] joinAllStringArrays(T[]... arrays){
		int length=0;
		for(T[] array: arrays)
			length += array.length;
		final T[] result =(T[]) Array.newInstance(arrays[0].getClass().getComponentType(), length);
		int offset =0;
		for(T[] array : arrays){
			System.arraycopy(array, 0, result, offset, array.length);
			offset += array.length;
		}
		return result;
	}
}
