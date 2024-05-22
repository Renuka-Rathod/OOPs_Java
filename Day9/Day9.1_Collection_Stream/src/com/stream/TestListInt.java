package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestListInt {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(12, 32, 12, 44, 56, 90, 87, 56, 45, 33, 23, 500);

		System.out.println(myList);

		for (int i : myList) {
			System.out.print(i + "  ");
		}
		System.out.println();
		// Lab:sum of all elements
		// Lab:even i%2==0
		// odd
		// num>50
		// avg
		// max min
		// Predicate<T> boolean test(T no)

		// Predicate<Integer> boolean test( Integer no)

		Predicate<Integer> myPred = (no) -> {
//			if (no % 2 == 0)
//				return true;
//			else
//				return false;
			return no%2==0;
		};
         System.out.println();
		System.out.println("Even:"+myPred.test(56));
		
		System.out.println("Even:"+myPred.test(47));
		

		
		Predicate<Integer> myPred2=(no)->{
//			if(no>150)
//				return true;
//			else
//				return false;
			return no>150;
			
		};
		
	System.out.println(myPred2.test(90));
		
		
	
	
	
	
		
		
	}

}
