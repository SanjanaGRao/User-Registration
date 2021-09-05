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
	 * Method userNameCheck takes parameter firstName as well as last name from the user
	 * UC 1 - First name starts with Cap and has minimum 3 characters - check 
	 * UC 2 - As a User need to enter a valid Last Name.
	 * Last name and First name start with Cap and have minimum 3 characters.
	 * @returns true or false
	 */
	public boolean userNameCheck(String userName)
	{
		if(!Character.isUpperCase(userName.charAt(0)))
		{
			
			return false;
		}
		else if(userName.length() <= 3)
		{
			return false;
		}
		else
			return true;
	}
}
