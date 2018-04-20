package com.practice.basic;

public class GetSystemProperties {

	public static void main(String[] args) {

		System.out.println("Property Name" + System.getenv("name"));
		System.out.println("Java Versions" + System.getProperty("java.version"));
		System.out.println("Java Home " + System.getProperty("java.home"));
		System.out.println("Java Vendor " + System.getProperty("java.vendor"));
		System.out.println("Java Vendor URL " + System.getProperty("java.vendor.url"));
		System.out.println("Java Class path " + System.getProperty("java.class.path") +"\n");
		
	}

}
