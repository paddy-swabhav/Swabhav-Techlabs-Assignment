package com.techlabs.exceptions;

public class EmailExceptions extends RuntimeException{
	
	public String getEmailMessage()
	{
		return "EMAIL NOT VALID";
	}
	
}
