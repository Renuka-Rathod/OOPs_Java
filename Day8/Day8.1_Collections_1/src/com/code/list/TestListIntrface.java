package com.code.list;

import java.util.ArrayList;
import java.util.List;

public class TestListIntrface {

	public static void main(String[] args) {
		int x = 10;
		int[] arr = new int[10];

		// store int values in List

		List<Integer> intList = new ArrayList<Integer>();

		System.out.println("Size:" + intList.size() + "   IsEmpty:" + intList.isEmpty());
		// add int value into intList
		int i1 = 10;
		intList.add(i1);
		System.out.println("Size:" + intList.size() + "   IsEmpty:" + intList.isEmpty());
		intList.add(23);
		intList.add(56);
		intList.add(45);
		intList.add(896);
		intList.add(32);
		System.out.println("Size:" + intList.size() + "   IsEmpty:" + intList.isEmpty());
		// display all int values from intList

		System.out.println("----List----");
		// for each
		for (int no : intList) {
			System.out.print(no+" ");
		}
		intList.add(323);
		intList.add(546);
		intList.add(455);
		intList.add(8696);
		intList.add(372);
		System.out.println("\n----List----");
		// for each
		for (int no : intList) {
			System.out.print(no+" ");
		}
	}

	
	//Lab:create list Of String Type
}
