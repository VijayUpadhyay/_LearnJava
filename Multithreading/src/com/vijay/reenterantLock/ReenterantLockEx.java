package com.vijay.reenterantLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class ReenterantLockEx {
	static int count=0;
	private static Lock lock = new ReentrantLock();
	private static Condition cond = lock.newCondition();
	
	public static void increment(){
		for(int i=0;i<10000;i++)
			count++;
	}
	
	public static void first() throws InterruptedException{/// we can use synchronized block also for the same impl at increment function
		
		lock.lock();
		System.out.println("Waiting....");
		cond.await();
		System.out.println("Woken up");
		try{
			System.out.println("Calling increment from 1st method");
			increment();
			}finally{
			lock.unlock();
		}
		
	}
	
	public static void second() throws InterruptedException{
		//System.out.println("Got the lock");
		Thread.sleep(1000);
		lock.lock();
	//	System.out.println("Using the lock");
		
		try{
			// call unlock after calling signal()
			System.out.println("Calling increment from 2nd method");
			increment();
			cond.signal();
			
			}finally{
			lock.unlock();
		}
		
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					first();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					second();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finished();
	}
	public static void finished(){
		System.out.println("Count is "+ count);
	}

}
