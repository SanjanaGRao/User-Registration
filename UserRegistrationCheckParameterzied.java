package com.JunitAssignment;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class UserRegistrationCheckParameterzied
{
	String input;
	boolean result;
	UserRegistration obj;
	
	//Constructor
	public UserRegistrationCheckParameterzied(String input, boolean result) 
	{
		this.input = input;
		this.result = result;
	}
	@Before
	public void initialize() 
	{
		obj = new UserRegistration();
	}
	@Parameterized.Parameters	
	public static Collection<Object[]> input() 
	{
		return Arrays.asList(new Object[][] 
				{ 
			{"abc@yahoo.com",true }, 
			{ "abc",true }, 
			{ "abc@abc@gmail.com",true },
			{"abc@.com.my",true}, 
			{"abc123@gmail.a",true},
			{"abc111@abc.com,",true},
			{"abc111@abc.com,",false},
			});
	}
	@Test
	public void emailTest() {
		assertEquals(result, obj.emailCheck(input));
	}
}
