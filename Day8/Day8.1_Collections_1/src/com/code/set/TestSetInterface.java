package com.code.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestSetInterface {

	public static void main(String[] args) {

		System.out.println("1:show all 2:add number 3:remove num 4:remove  5:clear 6:sort ");

		Scanner sc = new Scanner(System.in);
		int ch;

		Set<String> names = new HashSet<String>();// empty:true

		System.out.println(names.add("Ram"));// true
		System.out.println(names.add("Sham"));// true
		System.out.println(names.add("Usha"));// t
		System.out.println(names.add("Ram"));// false
		System.out.println(names.add("Seeta"));// true

		do {
			System.out.println("Enter Choice:");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				for (String s : names)
					System.out.print(s + " ");

				System.out.println();
				break;

			case 2:
				System.out.println("Enter Name");
				System.out.println(names.add(sc.next()));
				break;
			case 3:
				System.out.println("Name :");
				System.out.println(names.remove(sc.next()));

				break;
			case 4:
				System.out.println("Name to Remove");
				
				 
				names.remove(sc.next());
				 
				break;
			case 5:
				break;
			case 6:// sort
					// use TreeSet for sorting Set
				TreeSet<String> sortedName = new TreeSet<String>(names);// isEmpty:false

				for (String str : sortedName)
					System.out.println(str + "  ");

				break;

			default:
				break;

			}

		} while (ch != 0);

	}

}
