package com.vijay.core;

public class FinalOverloading {

	public static String foo(){
		System.out.println("Inside parent class");
		return "FinalOverloading";
	}

	public final int getData1(String temp)
    {
       System.out.println(temp);
		return 0;
    }
    public final int  getData1(String temp,int a)
    {
    	System.out.println(temp+" "+a);
        return 1;
    }
    public int getData1(String temp,float f,String s){
		System.out.println(temp+" "+f+" "+s);
		return 1;
	}

    public static void main(String[] args)
    {
    	FinalOverloading obj = new FinalOverloading();
        System.out.println(obj.getData1("GFG"+ obj.getClass()));  
        System.out.println(obj.getData1("dfv",3));
    }


}
