package com.practice.basic;

public class AreaOfaHexagon {

	public static void main(String[] args) {
		double side = 6;
		System.out.println("Area of hexagon");
		System.out.println((6*(side*side)) / (4 * Math.tan( Math.PI/6)));
	}

}
