package com.vijay.semaphore;

import java.util.concurrent.Semaphore;

public class Connections {
	
	private static Connections connect = new Connections();
	private Semaphore semaphore = new Semaphore(10,true);
	private Connections(){}
	
	public static int connections = 0;
	
	public static Connections getInstance(){
		return connect;
	}
	
	public void doAcquire(){
		try {
			semaphore.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try{
			acquire();
		}finally {
			semaphore.release();
		}
		
	}
	public void acquire(){
		
		synchronized (this) {
			connections++;
			System.out.println("Connection number: "+connections);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (this) {
			connections--;
			System.out.println("Connection number after decreasing: "+connections);
		}
		
	}

}
