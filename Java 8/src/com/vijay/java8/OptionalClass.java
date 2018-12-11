package com.vijay.java8;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		
		Optional<String> optional = Optional.of("Ram");
		String ans1 = "vj";
		String ans2 = null;
		System.out.println(Optional.ofNullable(optional));
		System.out.println("To get value of Optional class object: "+optional.get());
		System.out.println(Optional.ofNullable(ans1));
		System.out.println("Empty function: "+Optional.empty());
		System.out.println("Optional value for string object having null:"+Optional.ofNullable(ans2));

		//optiona.map and optional.flatMap
		
		Optional<String> ans3 = Optional.empty();
		
		Optional<Optional<String>> mapFlatMap = Optional.of(Optional.of("Ram"));
		Optional<Optional<String>> ans4 = Optional.of(Optional.empty());
		
		System.out.println("for Optional.empty()"+ans3);
		
		System.out.println("optional.map is: " + mapFlatMap.map(mapper -> mapper.map(String::toUpperCase)));
		System.out.println("optional.flatMap is(without get()): " + mapFlatMap.flatMap(mapper -> mapper.map(String::toUpperCase)));
		System.out.println("optional.flatMap is(with get()): " + mapFlatMap.flatMap(mapper -> mapper.map(String::toUpperCase)).get());
		System.out.println("optional.flatMap is: " + mapFlatMap.flatMap(mapper -> mapper.map(String::toUpperCase)).orElse("Nothing Available"));
		System.out.println("optional.flatMap is: ans4 :" + ans4.flatMap(mapper -> mapper.map(String::toUpperCase)).orElse("Nothing Available"));
		
		// Filter Optional:
		System.out.println("filter: "+optional.filter(predicate -> predicate.equalsIgnoreCase("ram")));
		System.out.println("filter: "+optional.filter(predicate -> predicate.equals("ram")));
		
		//isPresent/ ifPresent
		if(ans3.isPresent())
			System.out.println("ans3 is non-empty");
		
	ans3.ifPresent(consumer-> System.out.println("ans3 is non-empty"));
		
		if(optional.isPresent())
			System.out.println("optional is non-empty");
		optional.ifPresent(consumer-> System.out.println("optional is non-empty"));
		
		System.out.println(optional.orElse("Null"));
		System.out.println(ans3.orElse("ans3 is null"));
		
		
		
	}

}
