package com.example.demo;

public class PalindromeChecker {

	public boolean isAPalindrome(String string) {
		
		return string.equalsIgnoreCase(getReverseString(string));
	}

	private String getReverseString(String string) {
		StringBuffer reverseStringBuffer = new StringBuffer(string);
		reverseStringBuffer.reverse();
		return reverseStringBuffer.toString();
	}

}
