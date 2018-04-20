package com.effectivejava.builder;

public class BuilderPattern {
	
	public static void main(String[] args) {
		NutritionFacts cocaCola = new NutritionFacts.Builder(12, 2)
				.calories(34).sodium(2).fat(3).build();
		System.out.println("NutritionFacts |||  " + cocaCola.toString());
	}
}
