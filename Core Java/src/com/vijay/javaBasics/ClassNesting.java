package com.vijay.javaBasics;

public class ClassNesting {
	
	class InnerClass{
		public void display(){
			System.out.println("Inside first Inner Class");
		}
	}
	
	class SecondInnerClass{
		public void display(){
			System.out.println("Inside second Inner Class");
		}
	}
	public static void main(String[] args) {
		
	 InnerClass objInnerClass = new ClassNesting().new InnerClass();
	 objInnerClass.display();
	 
	 SecondInnerClass objSecondInnerClass = new ClassNesting().new SecondInnerClass();
	 objSecondInnerClass.display();

	}

}
