package com.techlabs.model;

import java.util.regex.Pattern;

public class User {
	private String email, password;
	
	public User()
	{
		email="";
		password="";
	}

	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + "]";
	}

	public boolean emailValidator(String email)
	{
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                "[a-zA-Z0-9_+&*-]+)*@" + 
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$"; 
		Pattern pat = Pattern.compile(emailRegex); 
		if (email == null) 
		return false; 
		return pat.matcher(email).matches(); 
	}
	
	public boolean passwordValidator(String password)
	{
		String passwordRegex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
		Pattern pat = Pattern.compile(passwordRegex); 
		if (password == null) 
		return false; 
		return pat.matcher(password).matches(); 
	}
}
