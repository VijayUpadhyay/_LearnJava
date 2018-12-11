package com.vijay.string;

public class StringBufferClass {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Ram");
		System.out.println(sb);

		StringBuffer sb2 = new StringBuffer("Ram");
		if (sb == sb2)
			System.out.println("Equal");

		String str = "sb" + 1 + "ds";
		System.out.println(str);
		StringBuffer sbTest = new StringBuffer(str);
		System.out.println(sbTest.replace(2, 3, str));
		System.out.println(sbTest.length() + "  :Length         Capacity:  " + sbTest.capacity());
		System.out.println(sbTest.reverse());
		
		String s2 = sb2.toString();
		System.out.println(s2+" --> s2");
        StringBuffer sb4 = sb2.replace(0, 2, "Vijaya");
        System.out.println(sb4);
	}

}
