package com.practice.basic;

import java.util.Scanner;

public class Decimal2Hex {

	private static final int hexbase = 16;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		System.out.println(" The input is  :  " + input);
		int dividend = 0;
		StringBuilder result = new StringBuilder();
		boolean isFirstIteration = true;
		if (input != 0) {
			
			do {
				char  ch; int rem;
				
				if(!isFirstIteration)
					dividend = dividend / hexbase;
				
				if(dividend == 0 && isFirstIteration) {
					rem =  input % hexbase;
					ch =  getHexChar(rem);
					dividend = input;
					isFirstIteration = false;
					result.append(ch);
				}else if(dividend != 0){
					rem = dividend % hexbase;
					ch = getHexChar(rem);
					result.append(ch);
				} 
			} while (dividend > 0);
		}
		
		System.out.println(result.reverse());
	}
	
	private static char getHexChar(int idx) {
		char [] hex =  {'0','1','2', '3', '4', '5','6','7','8','9', 'A','B','C','D','E','F'};
 		return hex[idx];
	}
}
