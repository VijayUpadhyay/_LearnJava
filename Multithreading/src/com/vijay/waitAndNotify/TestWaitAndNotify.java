package com.vijay.waitAndNotify;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestWaitAndNotify {
	
	static List<Integer> list = new ArrayList<Integer>();
	
public static void main(String[] args) {
	Processor p = new Processor();
	
	/*Thread t1 = new Thread(new Runnable() {
		public void run() {
			producer();
			
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
	});*/
	
	Thread t1 = new Thread(new Runnable() {
		public void run() {
			try {
				p.produce();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	});
	
	Thread t2 = new Thread(new Runnable() {
		public void run() {
			try {
				p.consume();
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
	
	public static void producer(){
		Random r1 = new Random();
		while(true)
		  list.add(r1.nextInt(100));
		
	}

	public static void consumer() throws InterruptedException{
		Random r2 = new Random();
		while(true){
			Thread.sleep(100);
			if(list.size()==0){}
			if(r2.nextInt(10) == 0)	{
				Integer removedValue = list.remove(0);
				System.out.println("Removed value is: "+removedValue+" List size is:"+list.size());
			}
			   
		}
	}

}
