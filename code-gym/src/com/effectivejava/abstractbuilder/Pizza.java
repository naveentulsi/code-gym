package com.effectivejava.abstractbuilder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

abstract class Pizza {

	public enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE }
	
	final Set<Topping> toppings; 
	
	abstract static class Builder <T extends Builder<T>>{
		EnumSet <Topping> toppings = EnumSet.noneOf(Topping.class);
		
		public T addTopping (Topping topping) {
			toppings.add(Objects.requireNonNull(topping));
			return self();
		}
		
		abstract Pizza build();
		
		// subclass must ovverride this method to return "this"
		protected abstract T self();
	}
	
	public Pizza(Builder <?> builder) {
		toppings = builder.toppings.clone();
	}
}
