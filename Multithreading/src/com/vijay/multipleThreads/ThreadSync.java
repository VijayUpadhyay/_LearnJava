package com.vijay.multipleThreads;

import java.util.Scanner;

class ThreadTest extends Thread{

	private volatile boolean running = true;
	public void run() {
		while(running){
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown(){
		running = false;
	}
}

public class ThreadSync {

	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		
		t.start();
		
		System.out.println("Press to stop");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		System.out.println(t.getState());
		t.shutdown();

	}

}
