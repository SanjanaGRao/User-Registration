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
	public final String emailPattern = "[a-z0-9_+]*(.[a-z0-9_])*?@[a-z]*.(co|com|edu)(.[a-z])?$";
	public final String mobileNoPattern = "^[0-9]{2}[0-9]{3,12}$";
	public final String passwordPattern = "^(?=.*[~!@#$%^&*-+=()])(?=.*[0-9])(?=.*[A-Z]).{8,}";
	
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
	public boolean firstNameCheck(String firstName)
	{
		Pattern newPattern = Pattern.compile(firstNamePattern);
		boolean s = newPattern.matcher(firstName).matches();
		return s;
	}
	/*
	 * Method emailCheck takes parameter email from the user
	 * UC 3 - enter a valid email - E.g. abc.xyz@bl.co.in 
	 * Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
	 * @returns true or false
	 */
	public boolean emailCheck(String email)
	{
		Pattern newPattern = Pattern.compile(emailPattern);
		return newPattern.matcher(email).matches();
	}
	/*
	 * Method MobileNoCheck takes parameter mobileNo from the user
	 * UC 4 - Mobile Format - E.g. 91 9919819801 
	 * Country code follow by space and 10 digit number 
	 * @returns true or false
	 */
	public boolean mobileNoCheck(String mobileNo) 
	{
		Pattern newPattern = Pattern.compile(mobileNoPattern);
		return newPattern.matcher(mobileNo).matches();
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
	public boolean passwordCheck(String password)
	{
		Pattern newPattern = Pattern.compile(passwordPattern);
		return newPattern.matcher(password).matches();
	}	
	
	//Method for printing validate email output;
	public void emailTest(String email) 
	{
		System.out.println("Sample Email Given to Test: ");
		System.out.print("Sample Email " + email + " is: ");
		if (emailCheck(email)) 
		{
			System.out.printf("Valid \n");
		} 
		else 
		{
			System.out.printf("Invalid \n");
		}
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
		if(user.firstNameCheck(lastName)) 
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
		
		System.out.println("Enter your Mobile Number with the Country code: ");
		String mobileNo = sc.next();
		if(user.mobileNoCheck(mobileNo)) 
		{
			System.out.println("The Mobile number entered is Valid.");
		} 
		else 
		{
			System.out.println("The Mobile number entered is Invalid.");
		}
		
		System.out.println("Enter Password (min 8 characters, at least one 1 Upper Case, at least 1 number and 1 special character): ");
		String password = sc.next();
		if(user.passwordCheck(password)) 
		{
			System.out.println("The password entered is Valid.");
		} 
		else 
		{
			System.out.println("The password entered is Invalid.");
		}
		
		user.emailTest("abc@yahoo.com");
		user.emailTest("abc123@gmail.a");
		user.emailTest("abc.100@yahoo.com");
		user.emailTest("abc@%*.com");
		user.emailTest("abc+100@gmail.com");
		user.emailTest("abc()*@gmail.com");
	}

}
