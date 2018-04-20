package com.practice.basic;

public class Decimal2Octal {

	public static void main(String[] args) {
		int input = 775;
		String result = "";
		while(input > 0) {
			result = input % 8 + result;
			input = input / 8;
		}
		System.out.println(result);
	}

}
