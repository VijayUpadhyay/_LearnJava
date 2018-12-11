package com.vijay.association;

public class Students {
	
	private String nameOfStudent;
	private int rollNo;
	
	public Students(String name, int no) {
		this.nameOfStudent = name;
		this.rollNo = no;
	}
	@Override
	public String toString() {
		return "Students [nameOfStudent=" + nameOfStudent + ", rollNo=" + rollNo + "]";
	}
	public String getNameOfStudent() {
		return nameOfStudent;
	}
	public void setNameOfStudent(String nameOfStudent) {
		this.nameOfStudent = nameOfStudent;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	

}
