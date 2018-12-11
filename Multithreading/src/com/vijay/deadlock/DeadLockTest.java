package com.vijay.deadlock;

public class DeadLockTest {

	public static void main(String[] args) {
		Runner runner = new Runner();
		
		Thread t1= new Thread(new Runnable() {
			public void run() {
			runner.first();	
			}
		});
		
		Thread t2= new Thread(new Runnable() {
			public void run() {
			runner.second();	
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		runner.finished();
		
	}

}
