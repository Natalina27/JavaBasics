package com.MyStrings;

public class StringMethods
{
	public static void main(String[] args)
	{
		String palindrome = "Madam Im Adam";
		char ch = palindrome.charAt(2);
		System.out.println("Char [2]: " + ch);
		
		int pos = palindrome.indexOf('I');
		System.out.println("Position of I: " + pos);
		
		int length = palindrome.length();
		String palindrome2 = "Madam Im Adam";
		
		if (palindrome.equals(palindrome2))
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are NOT equal");
	}
}
