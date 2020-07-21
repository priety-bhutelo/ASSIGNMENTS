package com.montran.pojo;

public class Account {
	private int accountnumber;
	private String name;
	private double balance;
	
	//default constructor
public Account() {
		// TODO Auto-generated constructor stub
	//	System.out.println("Default constructor for account");
	}
	
	public Account(int accountnumber,String name,double balance) {
		// TODO Auto-generated constructor stub
		//System.out.println("Param constructor of Account");
		this.accountnumber = accountnumber;
		this.name = name;
		this.balance = balance;
	}
	
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public boolean deposit(int amount) {
		if (amount > 0) {
			balance = balance + amount;
			
		}
		return true;
		//return false;
	}

	public boolean withdraw(int amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			return true;
		}
		return false;
	}






//@Override
public String toString() {
	return "Account [accountnumber=" + accountnumber + ", name=" + name + ", balance=" + balance
			+"]";
}
}
