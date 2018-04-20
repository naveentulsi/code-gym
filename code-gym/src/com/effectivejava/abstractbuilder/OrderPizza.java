package com.effectivejava.abstractbuilder;

import com.effectivejava.abstractbuilder.NyPizza.Size;
import com.effectivejava.abstractbuilder.Pizza.Topping;

public class OrderPizza {

	public static void main(String[] args) {
		
		NyPizza myPizza = new NyPizza.Builder(Size.SMALL).
				addTopping(Topping.SAUSAGE).
				addTopping(Topping.ONION).build();	
		System.out.println(myPizza);
		
		
		
	}

}
