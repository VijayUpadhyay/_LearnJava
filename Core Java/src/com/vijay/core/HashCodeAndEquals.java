package com.vijay.core;

public class HashCodeAndEquals {

	
	private String name;
	private  int no;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "HashCodeAndEquals [name=" + name + ", no=" + no + "]";
	}
	
	/*@Override
	public int hashCode() {
		
		return this.no;
	}*/
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		HashCodeAndEquals obj1 = (HashCodeAndEquals) obj;
		if(this.no == obj1.no)
			return true;
		else
			return false;
	}
	
}
