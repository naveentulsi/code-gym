package com.algorithms.one;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeSort {

	public static void main(String[] args) {
		
		int [] arr =  {7,3,5,9,1,8,0,4,6,2};
		int len = arr.length;
		int [] arr1 = new int[len/2];
		int [] arr2 = new int[len/2];
		
		for (int i = 0; i < len/2; i++) {
			arr1[i] = arr[i];
			arr2[i] = arr[len/2 + i];
		}
		arr1 = sort(arr1);
		arr2 = sort(arr2);
		for(int i = 0; i < len/2; i++) {
			arr[i] = arr1[i];
			arr[len/2+i] = arr2[i];
		}
		arr = sort(arr);
		System.out.println("******** Merge sort result ********");
		//below line prints the address of int array ? why ?
		Arrays.asList(arr).stream().forEach(x -> System.out.print(x));
		IntStream intstrm = Arrays.stream(arr);
		System.out.println();
		//below line also prints the address of int array ? why ?
		intstrm.forEach(x -> System.out.print(x));
		Stream<int []> arrStrm = Stream.of(arr);
		IntStream intstrm2 = arrStrm.flatMapToInt(x -> Arrays.stream(x));
		//intstrm2.forEach(x -> System.out.print(x));
		
	}
	
	private static int[] sort(int [] arr) {
		int i = 0, k = 0, temp = 0;
		while(i < arr.length) {
			k = i + 1;
			while(k < arr.length) {
				if(arr[k] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[k];
					arr[k] = temp;
				}
				k++;
			}
			i++;
		}
		return arr;
	}

}
