package com.vijay.javaBasics;

public class LocalInnerClassFinalVariableTest {

	public static void main(String[] args) {
			
		int a=10;
		System.out.println("Initially value of a is:"+a);//+" and for A: "+A);----> Value of A cannot be used in upper class even though it is declared as final
		
			class LocalInnerClass{// Local Inner class can only be abstract or final.
			static final int  A=15;
			void msg(){
			System.out.println("Now Value of A is:"+A);}
		
		}

		LocalInnerClass objLocalInnerClass =new LocalInnerClass();
		objLocalInnerClass.msg();
	}

	//objLocalInnerClass.msg(); -----Local Inner class objects cannot be invoked outside the method.
}
