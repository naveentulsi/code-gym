package com.java.concepts;

public class OuterClass {
	
	private static String msg = "Hello";
	
	public static class StaticNested {
		
		public static void print () {
			System.out.println(msg);
		}
		
		public void printIns() {
			System.out.println("Ins");
		}
	}
	private class InnerClass{
		
		public static final String message = "Inner Message";
		
		public final void print () {
			System.out.println("message");
			System.out.println(msg);
		}
	}

	public static void main(String[] args) {
		StaticNested oc = new OuterClass.StaticNested();
		oc.print();
		OuterClass.StaticNested.print();
		OuterClass ot = new OuterClass();
		OuterClass.InnerClass ic = new OuterClass(). new InnerClass();
		ic.print();
		
		
	}
}