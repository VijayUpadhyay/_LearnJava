package com.vijay.threads;

public class YieldFunctionTest implements Runnable{

	public void method1(){
		System.out.println("Inside method 1: "+Thread.currentThread().getName());
	}
	public void method2(){
		System.out.println("Inside method 2"+Thread.currentThread().getName());
	}
	public void method3(){
		System.out.println("Inside method 3 "+Thread.currentThread().getName());
	}
	public void method4(){
		System.out.println("Inside method 4 "+Thread.currentThread().getName());
	}
	public void method5(){
		System.out.println("Inside method 5 "+Thread.currentThread().getName());
		Thread.yield();
	}
	public void method6(int i) throws InterruptedException{
		System.out.println("Inside method 6 "+Thread.currentThread().getName());
		
		if(i==6){
			this.method1();
			this.wait(100);
			System.out.println("Inside wait");
		}
	}
	public static void main(String[] args) throws InterruptedException {
		
		YieldFunctionTest obj = new YieldFunctionTest();
		
		Thread t1 = new Thread(obj,"Thread1");
		t1.start();
		Thread t2 = new Thread(obj,"Thread2");
		t2.start();
		Thread t3 = new Thread(obj,"Thread3");
		t3.start();
		Thread t4 = new Thread(obj,"Thread4");
		t4.start();
		Thread t5 = new Thread(obj,"Thread5");
		t5.start();
		Thread t6 = new Thread(obj,"Thread6");
		t6.start();
		
		//Calling Methods
		obj.method6(6);
		//Thread.yield();
		t1.join();
		obj.method5();
		
		

		Runnable r = ()->{System.out.println("Thread name is: "+Thread.currentThread().getName());};
		Thread runable = new Thread(r);
		runable.start();
		runable.setName("RunnableTestThread");
	}
	@Override
	public void run() {
		System.out.println("Inside Run method for thread: "+Thread.currentThread().getName());
		
	}
	
	// Java 8
	
	
	

}
