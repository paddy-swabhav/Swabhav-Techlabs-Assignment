package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.exceptions.EmailExceptions;
import com.techlabs.exceptions.PassworsException;
import com.techlabs.model.User;

public class UserTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		User user= new User();
		try
		{
		System.out.println("ENTER YOUR EMAIL : ");
		String email=scanner.next();
		emailReader(email,user);
		System.out.println("ENTER PASSWORD");
		String password=scanner.next();
		passwordReader(password,user);
		
		System.out.println(user);
		
		}
		catch(EmailExceptions exception)
		{
			System.out.println(exception.getEmailMessage());
		}
		catch(PassworsException exception)
		{
			System.out.println(exception.getPasswordMessage());
		}
		

	}
	
	private static void emailReader(String email, User user)
	{
		if(user.emailValidator(email)!=true)
		throw new EmailExceptions();
		
		user.setEmail(email);	
	}
	
	private static void passwordReader(String password, User user)
	{
		if(user.passwordValidator(password)!=true)
			throw new PassworsException();
			
			user.setPassword(password);
	}
}
