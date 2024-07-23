package com.techlabs.model;

import java.util.Scanner;

public class Account {
	private long account_number;
	private String name;
	private double balance;
	public Account(long account_number, String name, double balance) {
		super();
		this.account_number = account_number;
		this.name = name;
		this.balance = balance;
	}
	public long getAccount_number() {
		return account_number;
	}
	public void setAccount_number(long account_number) {
		this.account_number = account_number;
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
	
	
	public boolean positive_amount_checker(double amount)
	{
		if(amount<=0)
			return false;
		return true;
	}
	
	public boolean debit_balance_checker(double amount)
	{
		if(amount>balance)
			return false;
		return true;
	}

	public void credit(double amount)
	{
		if(positive_amount_checker(amount)==false)
		{
			System.out.println("AMOUNT CANNOT BE CREDITED !!!!!!!!!");
			return;
		}
		setBalance(getBalance()+amount);
		System.out.println("AMOUNT CREDITED SUCCESSFULLY");
		System.out.println("YOUR CURRENT BALANCE IS: "+getBalance());
	}
	
	public void savingsDebit(double amount)
	{	
	}
	
	public void currentDebit(double amount,Scanner scanner)
	{
	}
	
	public void over_draft_limit_checker(double amount,Scanner scanner)
	{
	}
	
	
}
