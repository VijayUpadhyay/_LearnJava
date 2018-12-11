package com.vijay.interruptedExceptions;

public class InterruptThread {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			public void run() {
				System.out.println("Inside run()");
				
				if(Thread.currentThread().isInterrupted()){
					System.out.println("Interrupted");
				}
				
				
				/*try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					System.out.println("Interrupted");
				}*/
			}
		});
		t.start();
		System.out.println("Going to interrupt");
		t.interrupt();

	}

}
