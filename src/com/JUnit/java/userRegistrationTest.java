package com.JUnit.java;

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
	public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.firstName("shadab");
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
}
