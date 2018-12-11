package com.vijay.innerClass;

public class InnerClassAccessbility 
{
    private static int data = 10;
    private static int LocalClass()
    {
        class Inner
        {
        	// Local inner classes cannot contain static instance variables because
        	//for that they will have to make local class as static which cannot be done
        	// And static nested class is not written under method blocks.
            private int data = 20;
            private int getData()
            {
                return data;
            }
        };
        Inner inner = new Inner();
        return inner.getData();
    }
     
    public static void main(String[] args)
    {
        System.out.println(data * LocalClass());
    }
}