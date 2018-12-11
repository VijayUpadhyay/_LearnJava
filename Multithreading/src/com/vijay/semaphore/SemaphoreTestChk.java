package com.vijay.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreTestChk {

	public static void main(String[] args) throws InterruptedException {
		Semaphore semaphore = new Semaphore(0);
		semaphore.release();
		semaphore.acquire();
		semaphore.release();
		try{
			semaphore.acquire();
		}finally {
			semaphore.release();
		}
		System.out.println("Outside "+semaphore.availablePermits());
	}

}
