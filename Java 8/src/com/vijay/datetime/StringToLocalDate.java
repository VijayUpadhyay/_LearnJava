package com.vijay.datetime;

import java.text.DateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class StringToLocalDate {

	public static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	public static final DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d-MMM-yyyy");
	public static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm:ss a");
	public static void main(String[] args) {
		String date = "2017-10-11";
		LocalDate ld = LocalDate.parse(date, dtf);
		System.out.println(ld);
		Date date2 = new Date();
		String df = DateFormat.getDateInstance().format(date2);
		System.out.println("df: "+df);
		//Java 8 - LocalDate
		String date1 = "16-Aug-2016";
		LocalDate ld1 = LocalDate.parse(date1,dtf2);
		System.out.println("ld1: "+ld1+"......formatted: "+dtf2.format(ld1)+"....formatted again: "+dtf.format(ld1));
		// When HH:mm:ss comes into string
		String date3 = "Tuesday, Aug 16, 2016 12:10:56 PM";
		LocalDateTime ldt = LocalDateTime.parse(date3, formatter);
		System.out.println("LDT: "+ldt);
		System.out.println("formatted LDT "+formatter.format(ldt));
		
		//When String = 2016-08-16T15:23:01Z
		//The ‘Z’ suffix means UTC, you can convert into a java.time.instant directly, then display it with a time zone.
		
		String dateInString = "2016-08-16T15:23:01Z";
		Instant instant = Instant.parse(dateInString);
		LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.of(ZoneOffset.UTC.getId()));
		System.out.println("localDateTime: "+localDateTime);
		System.out.println("LocalDate: "+localDateTime.toLocalDate());
		System.out.println("LocalTime: "+localDateTime.toLocalTime());
		
		ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Asia/Tokyo"));
		System.out.println(zonedDateTime);
		ZonedDateTime zonedDateTime2 = ZonedDateTime.parse(zonedDateTime.toString(),DateTimeFormatter.ISO_ZONED_DATE_TIME);
		System.out.println(zonedDateTime2);
		System.out.println("Timezone: "+zonedDateTime2.getZone());
		LocalDate localDate = zonedDateTime.toLocalDate();
		System.out.println("Local Date from ZonedDateTime: "+localDate);
		
		//
		String date5 = "2016-08-16T10:15:30+08:00";
		ZonedDateTime zonedDateTime3 = ZonedDateTime.parse(date5,DateTimeFormatter.ISO_ZONED_DATE_TIME);
		System.out.println("zonedDateTime3: "+zonedDateTime3);
		System.out.println("Timezone: "+zonedDateTime3.getZone());
		System.out.println("Local Date from ZonedDateTime: "+zonedDateTime3.toLocalDate()+" localTime: "+zonedDateTime3.toLocalTime()+" zonedDateTime3.toLocalDateTime(): "+zonedDateTime3.toLocalDateTime());
		

		
	}
}
