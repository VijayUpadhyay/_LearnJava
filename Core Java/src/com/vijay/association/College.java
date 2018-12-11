package com.vijay.association;

import java.util.ArrayList;
import java.util.List;

public class College {
	
	private String collegeName;
	private List<Departments> depatments; 
	
	public College(String name, List<Departments> depatments) {
		this.collegeName = name;
		this.depatments = depatments;
		
	}
	
	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", depatments=" + depatments + "]";
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public List<Departments> getDepatments() {
		return depatments;
	}
	public void setDepatments(List<Departments> depatments) {
		this.depatments = depatments;
	}
	
	
	public static void fetchAllDepartmentsWithStudengtDetails(String name,List<Departments> depatments){
		System.out.println("College name is:"+name);
		
		for(Departments department : depatments){
			System.out.println("Department name is: "+department.getName());
			List<Students> listOfStudent = department.getStudents();
			listOfStudent.forEach(System.out::println);
			}
		
	}


}
