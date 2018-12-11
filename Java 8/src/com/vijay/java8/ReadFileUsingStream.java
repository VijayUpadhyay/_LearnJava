package com.vijay.java8;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFileUsingStream {

	public static void main(String[] args) {
		String filePath = "H:/Test.txt";
		
		try(Stream<String> streamData = Files.lines(Paths.get(filePath))){
			streamData.forEach(System.out::println);
			
		}catch(IOException e){
			e.printStackTrace();
		}

		List<String> list = new ArrayList<>();
		
		try(Stream<String> stream = Files.lines(Paths.get(filePath))){
			list = stream.filter(predicate -> !predicate.contains("line3")).map(String::toUpperCase).collect(Collectors.toList());
		}catch(IOException e){
			e.printStackTrace();
		}
		
		list.forEach(System.out::println);
		
		try(BufferedReader br = Files.newBufferedReader(Paths.get(filePath))){
			
			list = br.lines().collect(Collectors.toList());
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("LIST USING BUFFEREDREADER");
		list.forEach(System.out::println);
		
		System.out.println("Using Scanner Class");
		try(Scanner sc = new Scanner(new File(filePath))){
			while(sc.hasNext())
				System.out.println(sc.nextLine());
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
