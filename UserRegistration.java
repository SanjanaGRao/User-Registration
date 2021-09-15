package com.JunitAssignment;

import java.util.regex.Pattern;

/*
 * UserRegistration is class which contains the user information
 * @param firstNamePattern is a regex pattern used to validate first name
 * @author Sanjana Rao
 * @since 6-09-2021
 */
public class UserRegistration 
{
	//Constructor to display welcome message 
	public UserRegistration()
	{
		System.out.println("Welcome to User Registration System.");
	}
	
	/*
	 * Method firstNameCheck takes parameter firstName from the user
	 * UC 1 - First name starts with Cap and has minimum 3 characters - check 
	 * First name starts with Cap and have minimum 3 characters.
	 * UC 2 - Last name starts with Cap and has minimum 3 characters - check 
	 * Last name starts with Cap and have minimum 3 characters.
	 * @returns true or false
	 */
	public boolean firstNameCheck(String firstName) throws UserRegistrationCustomException
	{
		Pattern newPattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		boolean ans = newPattern.matcher(firstName).matches();
		if(ans==true)
			return true;
		else
			throw new UserRegistrationCustomException("Please enter a Valid name with first letter in Caps and having min 3 alphabets.");
	}
	/*
	 * Method emailCheck takes parameter email from the user
	 * UC 3 - enter a valid email - E.g. abc.xyz@bl.co.in 
	 * Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
	 * @returns true or false
	 */
	public boolean emailCheck(String email) throws UserRegistrationCustomException
	{
		Pattern newPattern = Pattern.compile("[a-z0-9_+]*(.[a-z0-9_])*?@[a-z]*.(co|com|edu)(.[a-z])?$");
		boolean ans = newPattern.matcher(email).matches();
		if(ans==true)
			return true;
		else
			throw new UserRegistrationCustomException("Please enter a valid Email ID.");		
	}
	/*
	 * Method MobileNoCheck takes parameter mobileNo from the user
	 * UC 4 - Mobile Format - E.g. 91 9919819801 
	 * Country code follow by space and 10 digit number 
	 * @returns true or false
	 */
	public boolean mobileNoCheck(String mobileNo) throws UserRegistrationCustomException
	{
		Pattern newPattern = Pattern.compile("^[0-9]{2}\s?[0-9]{10}$");
		boolean ans = newPattern.matcher(mobileNo).matches();
		if(ans==true)
			return true;
		else
			throw new UserRegistrationCustomException("Please enter a Valid mobile number with country code at the beginning.");
	}
	/*
	 * Method passwordCheck takes parameter passwordNo from the user
	 * UC 5 - follow pre-defined Password rules. 
	 * Rule 1 – minimum 8 Characters
	 * Rule 2 - Should have at least 1 Upper Case (UC 6)
	 * Rule 3 – Should have at least 1 numeric number in the password (UC 7)
	 * Rule 4 – Has exactly 1 Special Character
	 * @returns true or false
	 */
	public boolean passwordCheck(String password) throws UserRegistrationCustomException
	{
		Pattern newPattern = Pattern.compile("^(?=.*[~!@#$%^&*-+=()])(?=.*[0-9])(?=.*[A-Z]).{8,}");
		boolean ans = newPattern.matcher(password).matches();
		if(ans==true)
			return true;
		else
			throw new UserRegistrationCustomException("Please enter a Valid password. (Follow the password rules).");
	}	
	
	/*
	 * Method emailTest is used to validate the emails already provided
	 * UC 9 - All sample emails must be passed.
	 */
	public void emailTest(String email) throws UserRegistrationCustomException
	{
		System.out.println("Sample Email Given to Test: ");
		System.out.print("Sample Email " + email + " is: ");
		if (emailCheck(email)) 
		{
			System.out.printf("Valid Email.\n");
		} 
		else 
		{
			throw new UserRegistrationCustomException("Invalid Email. \n");
		}
	}
}
