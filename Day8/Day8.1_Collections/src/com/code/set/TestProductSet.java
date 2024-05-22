package com.code.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestProductSet {

	public static void main(String[] args) {

		MyProduct mp1 = new MyProduct(909, "Abc", 345);

		MyProduct mp2 = new MyProduct(109, "Xyz", 85);

		MyProduct mp3 = new MyProduct(939, "Pqr", 225);

		MyProduct mp4 = new MyProduct(49, "hgfh", 3345);

		Set<MyProduct> shop = new HashSet<MyProduct>();

		System.out.println(shop.add(mp1));// T

		System.out.println(shop.add(mp2));// T
		System.out.println(shop.add(mp3));// T
		System.out.println(shop.add(mp4));// T

		for (MyProduct mp : shop)
			System.out.println(mp);

		// Collections.sort(shop);

		System.out.println("\n--------------------");
		SortedSet<MyProduct> treeSet = new TreeSet<MyProduct>(shop);
 
		
		
	 
		
		for (MyProduct mp : treeSet)
			System.out.println(mp);

	}

}
