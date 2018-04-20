package com.practice.basic;

public class ReverseString {

	public static void main(String[] args) {

		String input = "The quick brown fox";
		System.out.println("The actual string : " +input);
		
		System.out.println("************Different ways to reverse a strings************");
		StringBuilder builder = new StringBuilder(input);
		System.out.println("Reverse string using string builer instance"
				+ " : "+builder.reverse());
		/*
		 * String split method returns new array instance always
		 *
		 */
		String [] inputArr = input.split(" ");
		String result = "";
		for(String str : inputArr) {
			int len = str.length();
			char [] charArrOfStr = str.toCharArray();
			char [] reverseofChar = new char[len];
			for (int i = 1; i <= len; i++) {
				char ch = charArrOfStr[len-i];
				reverseofChar[i-1] = ch;
			}
			/*
			 * StringValueOf takes char array and return string.
			 */
			System.out.println("Hashcode of string result before concating char array :		" +result.hashCode() );
			result = String.valueOf(reverseofChar) + " " + result;
			/*
			 * If the char array is same in argument , valueOf return the reference of same object in system. 
			 */
			System.out.println(String.valueOf(reverseofChar).hashCode());
			System.out.println(String.valueOf(reverseofChar).hashCode());
			System.out.println("Hashcode of string result after concating char array  :		" +result.hashCode() );

		}
		System.out.println("Reverse string using character array instance"
				+ " : "+result);
	}

}
