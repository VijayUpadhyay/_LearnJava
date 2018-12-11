package com.vijay.executorframework;

class TestClassLevelLocking1 implements Runnable{

	
	public static void increase(){
		
	}
	@Override
	public void run() {
		
		for(int i=0;i<1000;i++){
			
		}
			
		
	}
}

class TestClassLevelLocking2 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<1000;i++){
			
		}
		
		
	}
	
}
public class ClassLevelLocking {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new TestClassLevelLocking1());
		Thread t2 = new Thread(new TestClassLevelLocking2());
		
		t1.start();
		t2.start();
		
		t1.join();
		
	}
	

}
