package com.vijay.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormatLocalDateTime {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println(localDateTime);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH:mm:ss");
		System.out.println(localDateTime.format(dateTimeFormatter));
		
		String now = "2016-11-09 10:30";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime formatDateTime = LocalDateTime.parse(now, formatter);
        System.out.println("formatDateTime "+formatDateTime);
        System.out.println("Formated: "+formatDateTime.format(formatter));

	}
}
