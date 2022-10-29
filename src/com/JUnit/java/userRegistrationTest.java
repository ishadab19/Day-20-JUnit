package com.JUnit.java;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import junit.framework.Assert;

public class userRegistrationTest {
	userRegistration userRegistration = new userRegistration();

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.firstName("Shadab");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_whenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.firstName("shadab");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_whenProper_ShouldReturnTrue() {
		boolean result = userRegistration.lastName("Hussain");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.lastName("hussain");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.email("shadab@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.email("shadab&.com");
		Assert.assertEquals(false, result);
	}
	
	 @Test
	    public void givenPhoneNumber_WhenProper_shouldReturnTrue() {
		 boolean result = userRegistration.mobileNumber("917879219494");
		 Assert.assertEquals(true, result);
	 }
	 @Test
	    public void givenPhoneNumber_WhenNotProper_shouldReturnFalse() {
		 boolean result = userRegistration.mobileNumber("5647891233");
		 Assert.assertEquals(false, result);
	 }
	 @Test
	    public void givenPassword_WhenProper_ShouldReturnTrue(){
		 boolean result = userRegistration.password("Qwertyuiop");
		 Assert.assertEquals(true, result);
	 }
	 @Test
	    public void givenPassword_WhenNotProper_ShouldReturnFalse(){
		 boolean result = userRegistration.password("qwertyyuuiop");
		 Assert.assertEquals(false, result);
	 }
	 @Test
	    public void givenPasswordRule2_WhenProper_ShouldReturnTrue(){
		 boolean result = userRegistration.password2("Qwertyu19");
		 Assert.assertEquals(true, result);
	 }
	 @Test
	    public void givenPasswordRule2_WhenNotProper_ShouldReturnFalse(){
		 boolean result = userRegistration.password2("qwerrty");
		 Assert.assertEquals(false, result);
	 }
	 @Test
	    public void givenPasswordRule3_WhenProper_ShouldReturnTrue(){
		 boolean result = userRegistration.password3("qwertyuio");
		 Assert.assertEquals(true, result);
	 }
	 @Test
	    public void givenPasswordRule3_WhenNotProper_ShouldReturnFalse(){
		 boolean result = userRegistration.password3("qwertyuioggggp");
		 Assert.assertEquals(false, result);
	 }
}
