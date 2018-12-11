package com.vijay.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SemaphoreTest {

	public static void main(String[] args) {
		
		
		ExecutorService executor = Executors.newCachedThreadPool();
		for(int i=0;i<200;i++){
			executor.submit(new Runnable() {
				public void run() {
					Connections.getInstance().doAcquire();
				}
			});
		}
		
		executor.shutdown();
		try {
			executor.awaitTermination(4, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
