package com.vijay.io;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		 // Declare the object and initialize with
        // predefined standard input object
        Scanner sc = new Scanner(System.in);
 
        // String input
        System.out.println("Name");
        String name = sc.nextLine();
 
        // Character input
        System.out.println("Are u a Male?(Y/N)");
        char gender = sc.next().charAt(0);
 
        // Numerical data input
        // byte, short and float can be read
        // using similar-named functions.
        System.out.println("Age");
        int age = sc.nextInt();
        // Print the values to check if input was correctly obtained.
        System.out.println("Name: "+name);
        System.out.println("Male: "+gender);
        System.out.println("Age: "+age);
	}

}
