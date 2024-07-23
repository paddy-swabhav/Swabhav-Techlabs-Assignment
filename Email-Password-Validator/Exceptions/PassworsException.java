package com.techlabs.exceptions;

public class PassworsException extends RuntimeException{
	
	public String getPasswordMessage()
	{
		return "PASSWORD NOT VALID";
	}
}
