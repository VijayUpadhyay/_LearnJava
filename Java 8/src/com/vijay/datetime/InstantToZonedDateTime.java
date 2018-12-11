package com.vijay.datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantToZonedDateTime {

	public static void main(String[] args) {
		Instant instant = Instant.now();
		ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Asia/Tokyo"));
		System.out.println(zonedDateTime);
		System.out.println("Offset: "+zonedDateTime.getOffset());
		
	//	Convert the Japan ZonedDateTime UTC+9 back to a Instant UTC+0/Z, review the result, the offset is taken care automatically.	
		LocalDateTime localDateTime = LocalDateTime.of(2012, Month.AUGUST, 10, 10, 10,10);
		System.out.println(localDateTime);
		ZonedDateTime zonedDateTime2 = localDateTime.atZone(ZoneId.of("Asia/Tokyo"));
		System.out.println(zonedDateTime2);
		Instant instant2 = zonedDateTime2.toInstant();
		System.out.println(instant2);
	}
}
