package com.algorithms.one;

/*
 * Knuth-Morris-Pratt (KMP) Pattern Matching Algorithm
 * 
 */
public class StringSearch {

	public static void main(String[] args) {


		String pattern = "abcdabcy";
		String text = "abcxabcdabcdabcy";
		StringSearch ss = new StringSearch();
		int [] intPattern = ss.patternintArray(pattern.toCharArray());
		ss.KMP(text.toCharArray(), pattern.toCharArray(), intPattern);

	}

	private int[] patternintArray(char[] pattern) {
		int[] intPattern = new int[pattern.length];
		int i;
		int j;
		int tmp;
		i = j = 0;

		while (j < pattern.length) {

			if (i == 0 && j == 0)
				intPattern[j] = i;
			else if (pattern[j] == pattern[i]) {
				i++;
				intPattern[j] = i;
			} else {
				i = (i == 0) ? 0 : i-1;
				tmp = intPattern[i];
				intPattern[j] = i = tmp;
			}
			j++;
		}
		return intPattern;
	}
	
	private boolean KMP(char [] text,  char [] pattern, int [] intPattern) {
		
		int j = 0;
		int i = 0;
		int len = pattern.length;
		
		while(i < len) {
			if(text[j] == pattern[i]) {
				i++;
				j++;
			}
			else {
				i = (i == 0) ? 0 : i - 1;
				if(i!= 0)
					i = intPattern[i];
				else
					j++;
			}
			if(i == len) {
				System.out.println("Text 		: " + String.valueOf(text));
				System.out.println("Pattern 	: " + String.valueOf(pattern));
				System.out.println("Pattern found at index : " + (text.length - i));
				return true;
			}
		}
		
		return false;
	}
	

}
