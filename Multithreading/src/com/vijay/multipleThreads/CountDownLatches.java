package com.vijay.multipleThreads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Process2 implements Runnable{
	CountDownLatch latch;
	public Process2(CountDownLatch latch) {
		this.latch = latch;
	}
	public void run() {
		System.out.println("Inside run: "+Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		latch.countDown();
		System.out.println("Latch count decreased by: "+Thread.currentThread().getName());
	}
	
}
public class CountDownLatches {

	public static void main(String[] args) {
		
		CountDownLatch latch = new CountDownLatch(3);
		ExecutorService executors = Executors.newFixedThreadPool(3);
		for(int i =0;i<3;i++)
			executors.submit(new Process2(latch));
		
		System.out.println("Submitted executor");
		try {
			System.out.println("Going to wait for latch");
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Completed.");
		
	}

}
