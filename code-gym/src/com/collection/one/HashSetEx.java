package com.collection.one;

import java.util.HashSet;
import java.util.Iterator;

/*
 * Create a HashSet - Store values in it and iterate over it.
 */
public class HashSetEx {

	public HashSetEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		long startTime;
		
		HashSet<String> hs = new HashSet<>();
		hs.add("India");
		hs.add("America");
		hs.add("Aus");
		hs.add("New Zealand");
		hs.add("Aus");
		System.out.println( "**************** || HashSet Iteration Time Comparison || **************");
		System.out.println("===============================================================");
		System.out.println( "System : Time || HashSet Iterator Starts ");
		startTime = System.nanoTime();
		HashSetEx.iterateUsingIterator(hs);
		System.out.println("Total Time : Iterator  =  " + (System.nanoTime() - startTime));
		System.out.println("===============================================================");
		System.out.println( "System : Time ||  HashSet Modern for loop Starts ");
		startTime = System.nanoTime();
		HashSetEx.iterateusingfor(hs);
		System.out.println("Total Time : for loop =  " + (System.nanoTime() - startTime));
		System.out.println("===============================================================");
		System.out.println( "System : Time || HashSet for Each Loop Starts ");
		startTime = System.nanoTime();
		hs.forEach(System.out::println);
		System.out.println("Total Time : for Each =  " + (System.nanoTime() - startTime));
		System.out.println("===============================================================");
		System.out.println( "System : Time || HashSet for Each Loop using Streans Starts ");
		startTime = System.nanoTime();
		HashSetEx.iterateusingStreamforEach(hs);
		System.out.println("Total Time : for Each =  " + (System.nanoTime() - startTime));
		System.out.println("===============================================================");
	}
	
	/*
	 * Different ways of iterating over HashSet.
	 */
	/*
	 * using Iterator
	 */
	private static void iterateUsingIterator(HashSet<String> hs) {
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	/*
	 * using modern for loop
	 */
	private static void iterateusingfor(HashSet<String> hs) {
		for(String str : hs)
			System.out.println(str);	
	}
	
	/*
	 * using streams forEach
	 */
	private static void iterateusingStreamforEach(HashSet<String> hs) {
		hs.stream().forEach(System.out::println);
	}
	
	

}
