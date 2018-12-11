package com.vijay.java8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClassToClassObjectMapping {

	public static void main(String[] args) {
		List<Staff> staff = Arrays.asList(
                new Staff("vijay", 30, new BigDecimal(10000)),
                new Staff("jack", 27, new BigDecimal(20000)),
                new Staff("lawrence", 33, new BigDecimal(30000))
        );

		// convert inside the map() method directly.
        List<StaffPublic> result = staff.stream().map(temp -> {
            StaffPublic obj = new StaffPublic();
            obj.setName(temp.getName());
            obj.setAge(temp.getAge());
            if ("vijay".equals(temp.getName())) {
                obj.setExtra("this field is for vijay only!");
            }
            return obj;
        }).collect(Collectors.toList());

        System.out.println(result);

    }

	}


