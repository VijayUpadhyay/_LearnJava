package com.vijay.datetime;

import java.time.Instant;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ElapsedTimeCalculation {
	public static void main(String[] args) {
		long start1 = System.nanoTime();
		long start2 = System.currentTimeMillis();
		long start3 = Instant.now().toEpochMilli();
		long start4 = new Date().getTime();
		long start5 = start2/start1;
		//Sleep 2 seconds
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(start1+" "+start2+" "+start3+" "+start4+" "+start5);
	}

}
