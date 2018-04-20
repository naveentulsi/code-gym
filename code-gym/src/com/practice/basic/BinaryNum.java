package com.practice.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryNum {

	public static void main(String[] args) {
		System.out.println("Input first binary number			:");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			long bin1 = Integer.valueOf(br.readLine());
			System.out.println("Input secod binary number 	: ");
			long bin2 = Integer.valueOf(br.readLine());
			System.out.println(bin1 + "  " + bin2);
		} catch (IOException io) {
			System.out.println(" ERROR || IO Exception ");
		}
	}

	public static void addBinary(long bin1, long bin2) {
		

	}

}
