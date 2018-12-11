package com.vijay.executorframework;

class Counting implements Runnable{
	public volatile int count=0;
	@Override
	public void run() {
		for(int i=0;i<1000;i++)
			try {
				increase();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void increase() throws InterruptedException{
		Thread.sleep(1);
		synchronized(this){
			count++;
		}
		
	}
	
}
public class SynchronizedCount {
	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		Counting c1 = new Counting();
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c1);
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		long end = System.currentTimeMillis();
		System.out.println(c1.count+" in time "+(end-start));
	}

}
