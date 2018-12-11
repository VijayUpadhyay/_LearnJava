package com.vijay.datetime;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

public class StringToDate {

	public static void main(String[] args) throws ParseException {
		String dateInString1 = "Fri, June 7 2013";
		SimpleDateFormat sdf1 = new SimpleDateFormat("E, MMM dd yyyy");
		Date date = sdf1.parse(dateInString1);
		System.out.println("Date with day: " + sdf1.format(date));

		String dateInString2 = "Friday, Jun 7, 2013 12:10:56 PM";
		SimpleDateFormat sdf2 = new SimpleDateFormat("E, MMM dd, yyyy HH:mm:ss a");
		Date date2 = sdf2.parse(dateInString2);
		System.out.println("Date2: " + sdf2.format(date2));

		String dateInString3 = "Friday, Jun 7, 2013 12:10:56 PM";
		SimpleDateFormat sdf3 = new SimpleDateFormat("EEEE, MMM dd, yyyy HH:mm:ss a");
		Date date3 = sdf3.parse(dateInString3);
		System.out.println("Date3 is: " + date3);
		System.out.println("Date3 is: " + sdf3.format(date3));
		System.out.println();

		//////////////////////////// Java 8
		long timestamp = System.currentTimeMillis();
		Timestamp ts = new Timestamp(timestamp);
		String s = ts + "";
		System.out.println(s);
		String dateInString = "2014-10-05T15:23:01Z";
		//for java 7
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
		Date date4 = sdf4.parse(dateInString.replaceAll("Z$", "+0000"));
		System.out.println("Java 7 Date4: "+sdf4.format(date4));
		Instant instant = Instant.parse(dateInString);
		LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
		LocalDateTime ldt2 = LocalDateTime.ofInstant(instant, ZoneId.of(ZoneOffset.UTC.getId()));
		System.out.println("ldt: " + ldt);
		System.out.println("ldt2: " + ldt2);
		ZonedDateTime zdt = instant.atZone(ZoneId.of("Africa/Tripoli"));
		ZonedDateTime zdt2 = instant.atZone(ZoneId.of("Europe/Athens"));

		System.out.println("zdt: " + zdt);
		System.out.println("zdt2: " + zdt2);
	}

}
