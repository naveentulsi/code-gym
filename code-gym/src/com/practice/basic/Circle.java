package com.practice.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {
	
	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println("*****************************************");
		System.out.print("Please enter the radius of circle  :  ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int radius = 0;
		try {
			radius = br.read();
			if(radius != -1) {
				c.getCircleArea(radius);
				c.getCircleCircumference(radius);
			}else {
				System.out.println("Unexpected input");
			}
		}catch(IOException io) {
			System.out.println("ERROR || IO EXCEPTION");
		}

	}
	public void getCircleArea(int radius) {
		System.out.println("Area				: " + 2*Math.pow(radius, 2)*3.14);
	}
	
	public void getCircleCircumference(int radius) {
		System.out.println("Circumference 		: " +2*3.14*radius);
	}

}
