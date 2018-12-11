package com.vijay.executorframework;

import java.util.ArrayList;
import java.util.List;

class Test implements Runnable {
	Object obj = new Object();
	Object obj2 = new Object();
	public int count = 0;// if we define it as static --> it will become class level reference
	public int count2 = 0;
	List<Integer> list = new ArrayList<Integer>();
	List<Integer> list2 = new ArrayList<Integer>();

	@Override
	public void run() {

		for (int i = 0; i < 10000; i++) {
			/*try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			increase();
			increase2();
		}

	}

	public synchronized void increase() {
		/*synchronized (obj) {
			count++;
		}*/
		count++;

	}

	public synchronized void increase2() {
		/*synchronized (obj2) {
			count2++;
		}*/
		count2++;
	}
}

public class ObjectLevelLocking {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Test test1 = new Test();
		//Test test2 = new Test();
		Thread t1 = new Thread(test1);
		Thread t2 = new Thread(test1);

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Control transfered to main thread");

		System.out.println("Main thread completed :  Count: " + test1.count + " Count2 " + test1.count2);
		//System.out.println("Main thread completed :  Count: " + test2.count + " Count2 " + test2.count2);

		long end = System.currentTimeMillis();

		System.out.println("Time taken " + (end - start));

	}
}
