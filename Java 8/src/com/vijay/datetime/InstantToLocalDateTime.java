package com.vijay.datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneOffset;

public class InstantToLocalDateTime {

	public static void main(String[] args) {
		Instant instant = Instant.now();
		System.out.println(instant);
		LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);
		System.out.println(localDateTime);
		
		LocalDateTime localDateTime2 = LocalDateTime.of(2012, Month.AUGUST, 10, 11, 50,55);
		System.out.println(localDateTime2);
		Instant instant2 = localDateTime2.toInstant(ZoneOffset.UTC);
		System.out.println(instant2);
	}
}
