package com.montran.pojo;

public class Current extends Account {
	private double overdraftBalance;
    double limit,temp,new_overdraft;
	public Current() {
	}

	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		limit= overdraftBalance;
	}

	
	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

	@Override
	public boolean withdraw(int amount) {
		if (amount > 0 && amount < getBalance()) {
			
			setBalance(getBalance() - amount);
			return true;
		}
		
		if(amount >0 && amount > getBalance())
		{
			temp=amount-getBalance();
			//setBalance(amount-getBalance());
			setBalance(getBalance()-(amount-temp));
			overdraftBalance=overdraftBalance-temp;
			return true;
		}
		return false;
	}
	
	@Override
	public boolean deposit(int amount) {
		temp=getOverdraftBalance();
		 new_overdraft=temp+amount;
		if (amount > 0 && new_overdraft< limit) {
			setOverdraftBalance(new_overdraft);
			overdraftBalance=new_overdraft;
		return true;
		}
		if (amount>0 && new_overdraft>limit)
		{
			 temp=new_overdraft-limit;
			setOverdraftBalance(limit);
			setBalance(getBalance()+temp);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Current [overdraftBalance=" + overdraftBalance + ", getAccountNumber()=" + getAccountnumber()
				+ ", getName()=" + getName() + ", getBalance()=" + getBalance() + "]";
	}

}
