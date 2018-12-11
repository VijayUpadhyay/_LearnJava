package com.vijay.io;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerClassTest {

	private static List<String> inputDates = new ArrayList<String>(10);
	private static Scanner scanner;
	public static void main(String[] args) {
		
		System.out.println("Please enter date and month:");
		scanner = new Scanner(System.in);

		for(int i=0;i<3;i++)
			inputDates.add(scanner.nextLine());
		
		inputDates.forEach(System.out::println);
	}
	
}
