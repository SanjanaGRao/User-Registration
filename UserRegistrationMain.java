package com.JunitAssignment;

import java.util.Scanner;

/*
 * The main function asks the user to enter his/her information and calls the necessary method.
 * An object is created of class UserRegistration.
 * @param firstName asks the user to enter First Name and calls the function to validate user input.
 * @param lastName asks the user to input his Last Name and calls the function to validate user input.
 * @param email asks the user to enter email ID and calls the function to validate user input.
 * @param mobileNo asks the user to enter mobile number with country code and calls the function to validate user input.
 * @param password asks the user to enter password and calls the function to validate user input.
 * @author Sanjana Rao
 * @since 12-09-2021
 */
public class UserRegistrationMain
{
	public static void main(String[] args) throws UserRegistrationCustomException 
	{
		Scanner sc = new Scanner(System.in);
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
		sc.close();
	}
}
