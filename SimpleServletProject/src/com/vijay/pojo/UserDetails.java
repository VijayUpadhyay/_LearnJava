package com.vijay.pojo;

public class UserDetails {
	
	private String userName;
	private String email;
	private int id;
	private String country;
	
	public UserDetails(String nm, String em, String country, int i){
		this.userName=nm;
		this.id=i;
		this.country=country;
		this.email=em;
	}


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "UserDetails [userName=" + userName + ", email=" + email + ", id=" + id + ", country=" + country + "]";
	}
}
