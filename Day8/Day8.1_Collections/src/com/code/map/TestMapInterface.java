package com.code.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TestMapInterface {

	public static void main(String[] args) {

		//Lab: Map<Integer,Product> shop;
		
//int personName
		Map<Integer, String> hm = new HashMap<Integer, String>();// Empty:True

		// Key:Integer
		// Value:String

		System.out.println(hm.put(101, "Anil"));// null

		System.out.println(hm.put(102, "Sunil"));// null

		System.out.println(hm.put(103, "Nita"));// null

		System.out.println(hm);
		System.out.println(hm.put(101, "Manoj"));

		System.out.println(hm);

		System.out.println("Enter Key and Value");
		Scanner sc = new Scanner(System.in);

		System.out.println(hm.putIfAbsent(sc.nextInt(), sc.next()));

		System.out.println(hm);

		// show all keys

		Set<Integer> keys = hm.keySet();
		System.out.println("---all keys----");
		System.out.println(keys);
		
		
		
	Collection<String> names=	  hm.values();
		
		System.out.println(names);
		
		//lab:enter key and display value
		
		
		System.out.println(hm.get(102));
		
		

	}

}
