package com.vijay.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PersonImpl {

	public static void main(String[] args) {


		List<Person> persons = Arrays.asList(
                new Person("vijay", 20),
                new Person("jack", 20),
                new Person("rakesh", 30),
                new Person("rakesh", 10),
                new Person("rakesh", 20)
        );
		
		// For a particular object we use findAny/orElse
		Person p = persons.stream().filter(persn -> "jack".equals(persn.getName()) && persn.getAge() == 20).findAny().orElse(null);
		System.out.println(p);
		// to get a list of filtered objects, we use collect
		System.out.println("List of person object");
		List<Person> list = persons.stream().filter(predicate -> predicate.getName().contains("rakesh")).collect(Collectors.toList());
		list.forEach(System.out::println);
		
		// To get list of names of each Person Object use map
		System.out.println("To get list of names of each Person Object use map");
		List<String> listOfNames = persons.stream().map(Person:: getName).filter(predicate -> predicate.contains("rakesh")).collect(Collectors.toList());
		listOfNames.forEach(System.out::println);
		
		// Use equals() method while comparing for strings instead of contains
		System.out.println("To get list of age of each Person Object use map");
		List<Integer> listOfAge = persons.stream().map(Person:: getAge).filter(predicate -> predicate.equals(20)).collect(Collectors.toList());
		listOfAge.forEach(System.out::println);
		
		System.out.println("To get list of age of each Person Object use map");
		Set<Integer> setOfAge = persons.stream().map(Person:: getAge).filter(predicate -> predicate.equals(20)).collect(Collectors.toSet());
		setOfAge.forEach(System.out::println);
		
		
	}

}
