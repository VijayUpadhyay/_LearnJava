package com.vijay.multipleThreads;

public class ThreadCreation extends Thread{

	@Override
	public void run() {
		System.out.println("Hello "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadCreation t = new ThreadCreation();
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("completed");
	}

}
