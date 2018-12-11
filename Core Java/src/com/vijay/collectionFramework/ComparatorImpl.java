package com.vijay.collectionFramework;

import java.util.Comparator;

public class ComparatorImpl implements Comparable<ComparatorImpl>{

	private int empID;
	private String empName;
	private int salary;
	
	
	ComparatorImpl(int empID,String empName, int salary){
		this.empID = empID;
		this.setEmpName(empName);
		this.salary = salary;
		
	}
	
	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		

	}

	@Override
	public int compareTo(ComparatorImpl comparable) {
		
		return this.empID - comparable.empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
