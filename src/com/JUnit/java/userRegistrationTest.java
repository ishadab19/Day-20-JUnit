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
	
}

