package com.effectivejava.singleton;

public class NonInstantiability {
	public static void main(String[] args) {
		A.getInstance();
	}
}

class A {
	/*
	 * If Constructor is called by chance by any static member of this call, it will throw an error, thus enforcing noninstantiability
	 */
	private A() {
		throw new AssertionError();
	}
	private A(String msg) {
		
	}
	public static A getInstance () {
		return new A();
	}
}

/*
 * 
 *Class B cannot extent class A since constructor is not visible - no subclass instance can be done.
class B extends A {
	
}
*/