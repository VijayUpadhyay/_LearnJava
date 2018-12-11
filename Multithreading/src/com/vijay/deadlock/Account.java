package com.vijay.deadlock;

public class Account {
	private int balance = 10000;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public static void transfer(Account acc1,Account acc2,int amount){
		acc1.balance = acc1.getBalance()-amount;
		acc2.balance = acc2.getBalance()+amount;
	}
	
	public static void withdraw(Account acc, int amount){
		acc.balance = acc.balance - amount;
	}
	public static void deposit(Account acc, int amount){
		acc.balance = acc.balance + amount;
	}
}
