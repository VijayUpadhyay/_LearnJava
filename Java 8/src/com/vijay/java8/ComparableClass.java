package com.vijay.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ComparableClass implements Comparable<ComparableClass>{
	
	private Integer empID;
	public Integer getEmpID() {
		return empID;
	}



	public void setEmpID(Integer empID) {
		this.empID = empID;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	private String empName;
	private int salary;
	
	ComparableClass(String empName,Integer empID, int salary){
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
		
	}

	

	public static void main(String[] args) {
		ComparableClass[] comparableImplObj = new ComparableClass[3];
		comparableImplObj[0] = new ComparableClass("Vijay",978804,11978804);
		comparableImplObj[1] = new ComparableClass("Rakesh",978808,28);
		comparableImplObj[2] = new ComparableClass("Moti",978888,20);
		
		Collections.sort((List<ComparableClass>) Arrays.asList(comparableImplObj));
		
		
		comparableImplObj[0].sortUsingLambda(comparableImplObj);
		
		BiFunction<ComparableClass,ComparableClass,Integer> xvbF=(x,y)->{return Integer.compare(x.empID, y.empID);};
		
		System.out.println(xvbF);
		
		List<ComparableClass> list = new ArrayList<ComparableClass>(Arrays.asList(comparableImplObj));
		Arrays.asList(comparableImplObj).sort((x,y)-> Integer.compare(x.empID, y.empID));
		
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(100);
		integerList.add(700);
		integerList.add(20);
		integerList.add(500);
		integerList.add(900);
		Collections.sort(integerList);
		
		integerList.sort((o1,o2) -> o1-o2);
		
		System.out.println(integerList);
		
		
		
		Predicate<ComparableClass> ppp= (e)->e.empID/2==0;
		Consumer<ComparableClass>  xcc= e-> {System.out.println("EmpName: "+e.empName+" Emp ID: "+e.getEmpID()+" Salary: "+e.getSalary());}; 
		//Supplier<t> xcv= e-> {ComparableClass::getEmpId; };
		list.forEach(xcc);
	    List<ComparableClass> p=   list.stream()
	   .filter(ppp)
	   .collect(Collectors.toList());
		System.out.println(p);
	    
		/*Function
		 * Predicate
		 * Consumer
		 * Supplier
		 * e-> e.empid/2
		 */
	}
	
	public void sortUsingLambda(ComparableClass[] comparableImplObj){
		
		
		
	}



	@Override
	public int compareTo(ComparableClass o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
