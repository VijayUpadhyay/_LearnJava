package com.vijay.callableAndFuture;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFuture {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		Future<String> s = executor.submit(() -> {
			Random r = new Random();
			int num = r.nextInt(1000);
			if(num>500){
				throw new IOException("Waiting for too long");
			}
			Thread.sleep(num);
			return "Completed Waiting Successfully for "+num+" milliseconds";
			
		});
		try {
			System.out.println("Callable Result is: "+s.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
