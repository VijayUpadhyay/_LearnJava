package com.vijay.multipleThreads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class Process1 implements Runnable {
	private int id;
	public Process1(int id) {
		this.id = id;
	}
	
	@Override
	public void run() {
		System.out.println("Starting "+id+" by "+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ending "+id+" by Thread "+Thread.currentThread().getName());
		
	}
	
}

public class ThreadPools {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		ThreadPoolExecutor executor = (ThreadPoolExecutor)Executors.newFixedThreadPool(7);
		System.out.println("ExecutorService called");
		for(int i=0;i<5;i++)
			executor.submit(new Process1(i));
		System.out.println("Executors completed the tasks");
		
		try {
			executor.awaitTermination(20, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 
		
		
		while(executor.isTerminated()){
			System.out.println("Still running");
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken: "+(end-start));// It won't work here as there is no use of join() 
		System.out.println("Tasks got completed");
	}
	
	

}
