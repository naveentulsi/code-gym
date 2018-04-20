package com.effectivejava.singleton;

public class SinglestonSamples {

	public SinglestonSamples() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Elvis el = Elvis.getInstance();
		Elvis el2 = Elvis.getInstance();
		System.out.println(el.hashCode());
		System.out.println(el2.hashCode());
		System.out.println(el.equals(el2));
		System.out.println(el);
		System.out.println(el2);
		System.out.println(el.getClass() == el2.getClass());

	}

}

class Elvis{
	private static final Elvis INSTANCE = new Elvis();	
	private Elvis() {}
	public static Elvis getInstance () {
		return INSTANCE;
	}
}