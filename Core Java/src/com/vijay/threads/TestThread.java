package com.vijay.threads;

public class TestThread implements Runnable{

	public static void main(String[] args) {
		TestThread obj = new TestThread();
		Thread t = new Thread(obj);
		
		Thread t1  = new Thread(obj);
		t.setName("FirstThread");
		t.start();
		
		t1.setName("SecondThread");
		t1.start();
	}

	@Override
	public void run() {
		System.out.println("Inside run()");
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId());
		
	}

}
