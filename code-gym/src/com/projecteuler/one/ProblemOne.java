package com.projecteuler.one;

public class ProblemOne {

	private int sum = 0;
	public static void main(String[] args) {
		int input = 1000;
		ProblemOne sum = new ProblemOne();
		System.out.println(sum.sum(input));
	}
	
	public int sum(int input) {
		for(int i = 0; i< input; i++) {
			if(i%3 == 0 || i%5 == 0)
				sum += input;
		}
		return sum;
	}

}
