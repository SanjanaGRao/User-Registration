package com.JunitAssignment;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UserRegistrationCheck 
{
	@Test
	public void firstNameWhenInputIsValid() throws UserRegistrationCustomException 
	{
		UserRegistration obj = new UserRegistration();
		boolean result = obj.firstNameCheck("Sanjana");
		assertEquals(true,result);		
	}

	@Test
	public void firstNameWhenInputIsInvalid() throws UserRegistrationCustomException 
	{
		UserRegistration obj = new UserRegistration();
		boolean result = obj.firstNameCheck("sanjana");
		assertEquals(true,result);	
	}

	@Test
	public void LastNameWhenInputIsValid() throws UserRegistrationCustomException
	{
		UserRegistration obj = new UserRegistration();
		boolean result = obj.firstNameCheck("Rao");
		assertEquals(true,result);	
	}

	@Test
	public void LastNameWhenInputIsInvalid() throws UserRegistrationCustomException
	{
		UserRegistration obj = new UserRegistration();
		boolean result = obj.firstNameCheck("rao");
		assertEquals(true,result);	
	}

	@Test
	public void EmailWhenInputIsValid() throws UserRegistrationCustomException
	{
		UserRegistration obj = new UserRegistration();
		boolean result = obj.emailCheck("sanjanagrao99@gmail.com");
		assertEquals(true,result);	
	}

	@Test
	public void EmailWhenInputIsInvalid() throws UserRegistrationCustomException
	{
		UserRegistration obj = new UserRegistration();
		boolean result = obj.emailCheck("sanjana@1.gmail.in.com");
		assertEquals(true,result);	
	}

	@Test
	public void MobileNoWhenInputIsValid() throws UserRegistrationCustomException
	{
		UserRegistration obj = new UserRegistration();
		boolean result = obj.mobileNoCheck("911234567890");
		assertEquals(true,result);	
	}

	@Test
	public void MobileNoWhenInputIsInvalid() throws UserRegistrationCustomException
	{
		UserRegistration obj = new UserRegistration();
		boolean result = obj.mobileNoCheck("123456789X");
		assertEquals(true,result);	
	}

	@Test
	public void PasswordWhenInputIsValid() throws UserRegistrationCustomException
	{
		UserRegistration obj = new UserRegistration();
		boolean result = obj.passwordCheck("Hisanjana3$");
		assertEquals(true,result);	
	}

	@Test
	public void PasswordWhenInputIsInvalid() throws UserRegistrationCustomException
	{
		UserRegistration obj = new UserRegistration();
		boolean result = obj.passwordCheck("itssanjana");
		assertEquals(true,result);	
	}

}
