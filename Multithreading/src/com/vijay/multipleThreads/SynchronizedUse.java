package com.vijay.multipleThreads;

public class SynchronizedUse {

	private int  count=0;
	public static void main(String[] args) throws InterruptedException {
		SynchronizedUse sync = new SynchronizedUse();
		sync.incrementCount();
	}

	public synchronized void increase(){
		System.out.println("Inside increase");
		count++;
		System.out.println(count);
	}
	public  void incrementCount() throws InterruptedException{
		System.out.println("Inside incrementCount");
		Thread t = new Thread(new Runnable() {
			public void run() {
				
				for(int p=0;p<5;p++){
					System.out.println("Through t");
					increase();
					
				}
				/*try {
					Thread.currentThread().join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}*/
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for(int p=0;p<5;p++){
					System.out.println("Through t2");
					increase();
				}
					
			}
		});
		
		t.start();
		t.join();
		t2.start();
		
		/*try {
			//t.join();
			System.out.println("Outside t");
			//t2.join();
			System.out.println("Outside t2");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		System.out.println(count);
		
	}
}
