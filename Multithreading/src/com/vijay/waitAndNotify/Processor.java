package com.vijay.waitAndNotify;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Processor {
	final Integer MAX_STACK_SIZE =10;
	 static List<Integer> l = new ArrayList<Integer>();
	 public void produce() throws InterruptedException{
		 Random r1 = new Random();
		 
			 while(true){
				 synchronized (this) {
				 if(l.size() == MAX_STACK_SIZE){
						// System.out.println("Going to wait. "+Thread.currentThread().getName());
						wait();
						//System.out.println("Resumed " +Thread.currentThread().getName() );
				 }
				 l.add(r1.nextInt(100));
				 notify();
				 Thread.sleep(100);
			 }
		}
		
	 }
	 
	 public void consume() throws InterruptedException{
		 Random r2 = new Random();
			 while(true){
				 synchronized (this) {
				 
				 if(l.size() == 0){
					 wait();
				 }
					 if(r2.nextInt(10) == 0 && l.size()>0){
						 Integer value = l.remove(0);
						 System.out.println("Removed value is: "+value+" List size is: "+l.size());//+"  "+Thread.currentThread().getName()
						 Thread.sleep(100);
						 notify();
						 //System.out.println("calling notify() "+Thread.currentThread().getName());
					 }
					 
				 
			 }
			 /*if(l.size() == 0){
				 System.out.println("List is empty.Going to sleep for a sec");
				 notify();
			 }*/
			 
		}
		
		 
	 }
}
