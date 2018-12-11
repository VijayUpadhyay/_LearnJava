package com.vijay.innerClass;

class AccessibilityOfInnerClass {
	
	private static int a =10;
	
	void display(){
		System.out.println("Inside outer class display method");
	}
	
	static class InnerClass{
		private int b =20+a;
		void show(){
			System.out.println("Inside InnerClass: "+b+" Outer class: "+a);
		}
	}

	public static void main(String[] args) {
		AccessibilityOfInnerClass obj = new AccessibilityOfInnerClass();
		System.out.println("main: "+AccessibilityOfInnerClass.a);
		obj.display();
		
		AccessibilityOfInnerClass.InnerClass obj2 = new AccessibilityOfInnerClass.InnerClass();
		System.out.println("inner class obj: "+obj2.b);
		
		/*InnerClass inner = new InnerClass();
		System.out.println(inner.a);*/
		
	}

}
