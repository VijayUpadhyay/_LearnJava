package com.vijay.deadlock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {
	private Lock lock1 = new ReentrantLock();
	private Lock lock2 = new ReentrantLock();
	
	private Account acc1 = new Account();
	private Account acc2 = new Account();
	
	private void acquireLock(Lock lock1,Lock lock2){
		while(true){
			//Acquire lock
			boolean isLock1 = false;
			boolean isLock2 = false;
			try{
			isLock1 = lock1.tryLock();
			isLock2 = lock2.tryLock();
			}finally{
				if(isLock1&isLock2){
					return;
				}
				if(isLock1)
					lock1.unlock();
				if(isLock2)
					lock2.unlock();
				
			}
			
		////Not acquired
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void first(){
		Random r1 = new Random();
		Account.deposit(acc1, 5000);
		for(int i=0;i<1000;i++){
			/*lock1.lock();
			lock2.lock();*/
			acquireLock(lock1, lock2);
			try{
				Account.transfer(acc1, acc2, r1.nextInt(100));
			}finally{
				lock1.unlock();
				lock2.unlock();
			}
		}
	}
	
	public void second(){
		Random r2 = new Random();
		Account.deposit(acc2, 5000);
		for(int i=0;i<1000;i++){
			/*lock2.lock();
			lock1.lock();*/
			acquireLock(lock2, lock1);
			try{
				Account.transfer(acc2, acc1, r2.nextInt(100));
			}finally{
				lock1.unlock();
				lock2.unlock();
			}
		}
			
	}
	
	public void finished(){
		System.out.println("Acc1 balance is :"+acc1.getBalance()+" Acc2 Balance: "+acc2.getBalance());
		System.out.println("Total bal: "+(acc1.getBalance()+acc2.getBalance()));
	}
}
