package com.vijay.io;

import java.util.Scanner;

public class ConsoleInputs {
	
	public static void main(String[] args) {
		String[] str = new String[10];
		System.out.println("Please enter values: ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for(int i =0;i<3;i++)
			str[i] =scanner.nextLine();
		
		display(str);
	}
	
	public static void display(String[] str){
		for(int i=0;i<str.length;i++)
			System.out.println(str[i]);
	}

}
