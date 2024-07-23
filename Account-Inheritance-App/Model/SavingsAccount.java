package com.techlabs.model;

public class SavingsAccount extends Account {

	private static int min_balance=1000;
	public SavingsAccount(long account_number, String name, double balance) {
		super(account_number, name, balance);
	}
	
	public static int getMinBalance()
	{
		return min_balance;
	}
	
	@Override
	public String toString() {
		return "SavingsAccount \n Account_number=" + getAccount_number()
				+ ", Name=" + getName() + ", Balance=" + getBalance()+"\n";
	}

//	public void credit(double amount)
//	{
//		if(super.positive_amount_checker(amount)==false)
//		{
//			System.out.println("AMOUNT CANNOT BE CREDITED !!!!!!!!!");
//			return;
//		}
//		super.setBalance(super.getBalance()+amount);
//		System.out.println("AMOUNT CREDITED SUCCESSFULLY");
//		System.out.println("YOUR CURRENT BALANCE IS: "+super.getBalance());
//	}
	
	public void savingsDebit(double amount)
	{
		if(super.positive_amount_checker(amount)==false)
		{
			System.out.println("AMOUNT CANNOT BE DEBITED !!!!!!");
			return;
		}
		if(super.debit_balance_checker(amount)==false)
		{
			System.out.println("AMOUNT CANNOT BE DEBITED !!!!!!!!!!!");
			return;
		}
		double amount_after_debit=(super.getBalance()-amount);
		if(amount_after_debit<min_balance)
		{	
			System.out.println("AMOUNT CANNOT BE DEBITED !!!!!!!!!!!");
			return;
		}
		super.setBalance(amount_after_debit);
		System.out.println("YOUR CURRENT BALANCE IS: "+super.getBalance());
	}
	
	
}
