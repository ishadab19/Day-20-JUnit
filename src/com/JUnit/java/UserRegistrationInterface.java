package com.JUnit.java;

@FunctionalInterface
public interface UserRegistrationInterface {
	public abstract boolean userEntries(String value) throws InvalidUserInputException;
}
