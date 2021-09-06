package com.JunitAssignment;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * UserRegistration is class which contains the user information
 * @param firstNamePattern is a regex pattern used to validate first name
 * @author Sanjana Rao
 * @since 5-09-2021
 */
public class UserRegistration 
{
	public static Scanner sc = new Scanner(System.in);
	public final String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";
	public final String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
	public final String emailPattern = "[a-z0-9_]*[.a-z0-9_]*?@[a-z]*.(co|com)(.[a-z])?$";
	
	//Constructor to display welcome message 
	public UserRegistration()
	{
		System.out.println("Welcome to User Registration System.");
	}
	
	/*
	 * Method firstNameCheck takes parameter firstName from the user
	 * UC 1 - First name starts with Cap and has minimum 3 characters - check 
	 * First name starts with Cap and have minimum 3 characters.
	 * @returns true or false
	 */
	public boolean firstNameCheck(String firstName)
	{
		Pattern newPattern = Pattern.compile(firstNamePattern);
		boolean s = newPattern.matcher(firstName).matches();
		return s;
	}
	/*
	 * Method lastNameCheck takes parameter lastName from the user
	 * UC 2 - Last name starts with Cap and has minimum 3 characters - check 
	 * Last name starts with Cap and have minimum 3 characters.
	 * @returns true or false
	 */
	public boolean lastNameCheck(String lastName)
	{
		Pattern newPattern = Pattern.compile(lastNamePattern);
		return newPattern.matcher(lastName).matches();
	}
	/*
	 * Method emailCheck takes parameter email from the user
	 * UC 2 - enter a valid email - E.g. abc.xyz@bl.co.in 
	 * Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
	 * @returns true or false
	 */
	public boolean emailCheck(String email)
	{
		Pattern newPattern = Pattern.compile(emailPattern);
		return newPattern.matcher(email).matches();
	}

	// This is the main function
	public static void main(String[] args)
	{
		UserRegistration user = new UserRegistration();
		System.out.println("Enter your First Name: ");
		String firstName = sc.next();
		System.out.println("Enter your Last Name: ");
		String lastName = sc.next();
		if(user.firstNameCheck(firstName)) 
		{
			System.out.println("The First Name entered is Valid.");
		} 
		else 
		{
			System.out.println("The First Name entered is Invalid.");
		}
		if(user.lastNameCheck(lastName)) 
		{
			System.out.println("The Last Name entered is Valid.");
		} 
		else 
		{
			System.out.println("The Last Name entered is Invalid.");
		}
		System.out.println("Enter your Email ID: ");
		String email = sc.next();
		if(user.emailCheck(email)) 
		{
			System.out.println("The EMail ID entered is Valid.");
		} 
		else 
		{
			System.out.println("The EMail ID entered is Invalid.");
		}
	}	
}
