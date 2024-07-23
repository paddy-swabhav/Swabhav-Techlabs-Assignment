package com.techlabs.model;

import java.util.Scanner;

public class CurrentAccount extends Account{

	private static double over_draft_limit = 5000;
	
	public CurrentAccount(long account_number, String name, double balance) {
		super(account_number, name, balance);
	}
	@Override
	public String toString() {
		return "CurrentAccount \nover_draft_limit=" + over_draft_limit + ", Account_number=" + getAccount_number()
				+ ", Name=" + getName() + ", Balance=" + getBalance()+"\n";
	}

//	public void credit(double amount)
//	{
//		if(super.positive_amount_checker(amount)==false)
//		{
//			System.out.println("AMOUNT CANNOT BE CREDITED !!!!!!");
//			return;
//		}
//		super.setBalance(super.getBalance()+amount);
//		System.out.println("AMOUNT CREDITED SUCCESSFULLY");
//		System.out.println("YOUR CURRENT BALANCE IS: "+super.getBalance());
//	}
	
	public void currentDebit(double amount,Scanner scanner)
	{
		if(super.positive_amount_checker(amount)==false)
		{
			System.out.println("AMOUNT CANNOT BE DEBITED !!!!!!");
			return;
		}
		if(super.debit_balance_checker(amount)==false)
		{
			over_draft_limit_checker(amount,scanner);
			return;
		}
		super.setBalance(super.getBalance()-amount);
		System.out.println("YOUR CURRENT BALANCE IS: "+super.getBalance());
	}
	
	public void over_draft_limit_checker(double amount,Scanner scanner)
	{
		if(amount>=(over_draft_limit+super.getBalance()))
		{
			System.out.println("AMOUNT CANNOT BE DEBITED !!!!!!");
			return;
		}
		System.out.println("YOU DONT HAVE ENOUGH BALANCE, DO YOU WANT TO USE THE OVER DRAFT LIMIT ? (Y/N) ");
		char input=scanner.next().charAt(0);
		if(input=='N' || input=='n')
		{
			System.out.println("AMOUNT CANNOT BE DEBITED!!!!!!!!!");
			return;
		}
		
		over_draft_limit = over_draft_limit-(amount-super.getBalance());
		super.setBalance(0);
		System.out.println("YOUR CURRENT BALANCE IS: "+super.getBalance());
		System.out.println("YOUR REMAINING OVER DRAFT LIMIT IS: "+over_draft_limit);
	}
	
	
}
