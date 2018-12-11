package com.vijay.association;

import java.util.ArrayList;
import java.util.List;

public class Departments {

	private String name;
	private int id;
	private List<Students> students;
	
	public List<Students> getStudents() {
		return students;
	}

	public void setStudents(List<Students> students) {
		this.students = students;
	}

	public Departments(String name, int id,List<Students> students) {
		this.name = name;
		this.id = id;
		this.students = students;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Departments [name=" + name + ", id=" + id + "]";
	}
	
	public void getNumberOfStudentsInDepartment(Departments department){
		System.out.println("Department name is:"+department.getName());
		List<Students> list = new ArrayList<Students>(department.getStudents());
		list.forEach(System.out::println);
	}
}
