package com.practice.basic;

import java.util.Scanner;

public class DivideOperation {

	public static void main(String[] args) {
		DivideOperation devOp = new DivideOperation();
		int [] input = devOp.getInput();
		int result = devOp.divide(input[0], input[1]);
		System.out.println(result);
	}
	
	private int divide(int inputOne, int inputTwo) {
		if(inputOne != 0 && inputTwo != 0)
			return inputOne/inputTwo;
		else
			return -1;
	}
	
	private int [] getInput() {
		int dividend, divisor;
		int [] data = new int[2];
		Scanner sc = new Scanner(System.in);
		System.out.println("		Please enter the dividend : ");
		dividend = sc.nextInt();
		System.out.println("		Please enter the divisor : ");
		divisor = sc.nextInt();
		data[0] = dividend;
		data[1] = divisor;
		sc.close();
		return data;
	}
}
