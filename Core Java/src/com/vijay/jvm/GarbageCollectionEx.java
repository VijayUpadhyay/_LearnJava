package com.vijay.jvm;

public class GarbageCollectionEx {
	
	public static int p;
	//public static GarbageCollectionEx test;
	
	public static void main(String[] args) {
		String s1 = "ram";
		String s2 = "sita";
		String s3 = null;
		String s4 = s3;
		s1=s2;
		System.out.println(p+" :p");
		/*while(p<10000000){
			p++;
			System.out.println(p);
		}*/
			s1 = null;
			//s2 = null;
		System.out.println("s1: "+s1+" s2: "+s2+" s3: "+s3+" s4: "+s4);
		show();
		System.gc();
		
	}
	@SuppressWarnings("unused")
	public static void show(){
		GarbageCollectionEx test = new GarbageCollectionEx();
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Inside finalize()");
	}

}
