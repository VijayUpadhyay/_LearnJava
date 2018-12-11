package com.vijay.multipleThreads;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
	private static BlockingQueue<Integer> bq = new ArrayBlockingQueue<Integer>(10);
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
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
	}
	
	private static void producer() throws InterruptedException{
		Random random = new Random();
		while(true){
			bq.put(random.nextInt(100));
		}
		
	}
	
	private static void consumer() throws InterruptedException{
		Random r = new Random();
		
		while(true){
			Thread.sleep(100);
			if(r.nextInt(10) == 0){
				Integer value = bq.take();
				System.out.println("Taken Value is: "+value+" Queue size is: "+bq.size());
			}
				
		}
	}

}
