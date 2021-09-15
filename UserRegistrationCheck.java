package com.JunitAssignment;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationCheck 
{
	@Test
	public void firstNameWhenInputIsValid() throws UserRegistrationCustomException 
	{
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.firstNameCheck("Sanjana");
			Assert.assertEquals(true,result);	
		}
		catch(UserRegistrationCustomException e)
		{
			System.out.println(e.getMessage());
		}	
	}

	@Test
	public void firstNameWhenInputIsInvalid() throws UserRegistrationCustomException 
	{
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.firstNameCheck("sanjana");
			Assert.assertEquals(false,result);	
		}
		catch(UserRegistrationCustomException e)
		{
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void lastNameWhenInputIsValid() throws UserRegistrationCustomException
	{
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.firstNameCheck("Rao");
			Assert.assertEquals(true,result);
		}
		catch(UserRegistrationCustomException e)
		{
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void lastNameWhenInputIsInvalid() throws UserRegistrationCustomException
	{
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.firstNameCheck("rao");
			Assert.assertEquals(false,result);	
		}
		catch(UserRegistrationCustomException e)
		{
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void emailWhenInputIsValid() throws UserRegistrationCustomException
	{
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.emailCheck("sanjanagrao99@gmail.com");
			Assert.assertEquals(true,result);
		}	
		catch(UserRegistrationCustomException e)
		{
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void emailWhenInputIsInvalid() throws UserRegistrationCustomException
	{
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.emailCheck("sanjana@1.gmail.in.com");
			Assert.assertEquals(false,result);
		}
		catch(UserRegistrationCustomException e)
		{
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void mobileNoWhenInputIsValid() throws UserRegistrationCustomException
	{
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.mobileNoCheck("911234567890");
			Assert.assertEquals(true,result);	
		}
		catch(UserRegistrationCustomException e)
		{
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void mobileNoWhenInputIsInvalid() throws UserRegistrationCustomException
	{
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.mobileNoCheck("123456789X");
			Assert.assertEquals(false,result);
		}	
		catch(UserRegistrationCustomException e)
		{
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void passwordWhenInputIsValid() throws UserRegistrationCustomException
	{
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.passwordCheck("Hisanjana3$");
			Assert.assertEquals(true,result);
		}	
		catch(UserRegistrationCustomException e)
		{
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void passwordWhenInputIsInvalid() throws UserRegistrationCustomException
	{
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.passwordCheck("itssanjana");
			Assert.assertEquals(false,result);	
		}		
		catch(UserRegistrationCustomException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
