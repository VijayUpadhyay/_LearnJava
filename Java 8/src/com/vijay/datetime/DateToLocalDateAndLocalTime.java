package com.vijay.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateToLocalDateAndLocalTime {

	public static final ZoneId zoneId = ZoneId.systemDefault();

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("Date: " + date);
		Instant instant = date.toInstant();
		System.out.println("instant: " + instant);
		LocalDate localDate = instant.atZone(zoneId).toLocalDate();
		System.out.println("localDate: " + localDate);
		LocalTime localTime = instant.atZone(zoneId).toLocalTime();
		System.out.println("localTime: " + localTime);
		ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
		System.out.println("zonedDateTime: "+zonedDateTime);
	}
}
