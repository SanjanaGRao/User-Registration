package com.JunitAssignment;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UserRegistrationCheck 
{
	@Test
	public void firstNameWhenInputIsValid() 
	{
		UserRegistration obj = new UserRegistration();
		boolean result = obj.firstNameCheck("Sanjana");
		assertEquals(true,result);		
	}

	@Test
	public void firstNameWhenInputIsInvalid() 
	{
		UserRegistration obj = new UserRegistration();
		boolean result = obj.firstNameCheck("sanjana");
		assertEquals(true,result);	
	}

	@Test
	public void LastNameWhenInputIsValid() 
	{
		UserRegistration obj = new UserRegistration();
		boolean result = obj.firstNameCheck("Rao");
		assertEquals(true,result);	
	}

	@Test
	public void LastNameWhenInputIsInvalid() 
	{
		UserRegistration obj = new UserRegistration();
		boolean result = obj.firstNameCheck("rao");
		assertEquals(true,result);	
	}

	@Test
	public void EmailWhenInputIsValid() {
		UserRegistration obj = new UserRegistration();
		boolean result = obj.emailCheck("sanjanagrao99@gmail.com");
		assertEquals(true,result);	
	}

	@Test
	public void EmailWhenInputIsInvalid() 
	{
		UserRegistration obj = new UserRegistration();
		boolean result = obj.emailCheck("sanjana@1.gmail.in.com");
		assertEquals(true,result);	
	}

	@Test
	public void MobileNoWhenInputIsValid() 
	{
		UserRegistration obj = new UserRegistration();
		boolean result = obj.mobileNoCheck("911234567890");
		assertEquals(true,result);	
	}

	@Test
	public void MobileNoWhenInputIsInvalid() 
	{
		UserRegistration obj = new UserRegistration();
		boolean result = obj.mobileNoCheck("123456789X");
		assertEquals(true,result);	
	}

	@Test
	public void PasswordWhenInputIsValid() 
	{
		UserRegistration obj = new UserRegistration();
		boolean result = obj.passwordCheck("Hisanjana3$");
		assertEquals(true,result);	
	}

	@Test
	public void PasswordWhenInputIsInvalid() 
	{
		UserRegistration obj = new UserRegistration();
		boolean result = obj.passwordCheck("itssanjana");
		assertEquals(true,result);	
	}

}
