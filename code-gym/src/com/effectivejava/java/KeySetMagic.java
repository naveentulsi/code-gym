package com.effectivejava.java;

import java.util.HashMap;
import java.util.Set;

public class KeySetMagic {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		System.out.println("********************************* KeySet ****************************");
		Set<Integer> keySet = map.keySet();
		Set<Integer> newKeySetClone = keySet;
		System.out.println("********************************* HashCode ****************************");
		System.out.println(keySet.hashCode());
		System.out.println(newKeySetClone.hashCode());
		System.out.println("************************************************************************");
		keySet.forEach((key) -> System.out.println(key));
		System.out.println("********************************* KeySet  Alter ****************************");
		map.remove(1);
		keySet.forEach((key) -> System.out.println(key));
		System.out.println("********************************* NewKeySet ****************************");
		newKeySetClone.forEach((key) -> System.out.println(key));
		System.out.println("********************************* HashCode ****************************");
		System.out.println(keySet.hashCode());
		System.out.println(newKeySetClone.hashCode());
	}

}
