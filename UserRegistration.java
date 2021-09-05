package com.JunitAssignment; 
/*
 * UserRegistration is class which contains the user information
 * @author Sanjana Rao
 * @since 5-09-2021
 */
public class UserRegistration 
{
	//Constructor to display welcome message 
	public UserRegistration()
	{
		System.out.println("Welcome to User Registration System.");
	}
	
	/*
	 * Method FirstNameCheck takes parameter firstName from the user
	 * UC 1 - First name starts with Cap and has minimum 3 characters - check 
	 * @returns true or false
	 */
	public boolean FirstNameCheck(String firstName)
	{
		if(!Character.isUpperCase(firstName.charAt(0)))
		{
			
			return false;
		}
		else if(firstName.length() < 3)
		{
			return false;
		}
		else
			return true;
	}
}
