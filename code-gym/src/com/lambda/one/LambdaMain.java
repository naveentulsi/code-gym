package com.lambda.one;

public interface LambdaMain {
	public static void main(String[] args) {
		/*
		 * Implementing a thread using the lambda function
		 * This can be done only to interface having only one method - Like Runnable
		 */
		new Thread(() -> System.out.println("Printing from Runnable")).start();
		
		Employee ravi = new Employee("Ravi", 21);
		Employee main = new Employee("Mani", 25);
		Employee naveen = new Employee("Naveen", 27);
	}
}

class Employee{
	private String name;
	private int age;
	
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
