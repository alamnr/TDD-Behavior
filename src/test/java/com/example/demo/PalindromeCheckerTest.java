package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class PalindromeCheckerTest extends TestCase {
	
	PalindromeChecker testObject;
	
	public void setUp() {
		testObject = new PalindromeChecker();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testCreatePalindromeTestObject() throws Exception{
		assertNotNull(testObject);
	}
	
	@Test
	public void testSimplePalindromeMethod_YesPalindrome() throws Exception{
		assertTrue(testObject.isAPalindrome("MOM"));
	}
	
	@Test
	public void testSimplePalindromeMethod_NotAPalindrome() throws Exception{
		assertFalse(testObject.isAPalindrome("Blah"));
	}
	
	@Test
	public void testSimplePalindromeMethod_NotAPalindrome2() throws  Exception{
		assertFalse(testObject.isAPalindrome("kjasdhjasdjhSolutionShop"));
	}
	
	@Test
	public void testComplexPalindromeOnMethod() throws Exception{
		assertTrue(testObject.isAPalindrome("kinnikinnik"));
	}
}
