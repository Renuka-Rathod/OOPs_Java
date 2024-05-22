package com.stream;

import java.util.Arrays;
import java.util.List;

public class TestStreamAPICollection {
	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(3, 4, 2, 33, 4, 56, 77, 1, 99, 100);

		System.out.println(intList);

		System.out.println();
		for (int i : intList)
			System.out.print(i + " ");

		System.out.println("\n------------------");
		// FP
		intList.forEach(i -> System.out.print(i + " "));

		System.out.println("\n---------even---------");

		// convert collection into Stream//filter
		intList.stream().filter(no -> no % 2 == 0).forEach(no -> System.out.print(no + " "));// Collect

		System.out.println("\n---------even no >40---------");

		intList.stream().filter(no -> no > 40).filter(no -> no % 2 == 0).forEach(no -> System.out.print(no + " "));

		System.out.println("\n---------sum of all even---------");

		int sum = intList.stream().filter(no -> no % 2 == 0).mapToInt(no -> no*1).sum();

		System.out.println("Sum=" + sum);
		
		

		
		
		
		
	}
}
