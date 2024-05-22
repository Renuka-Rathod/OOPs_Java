package com.code.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.code.util.MyIntValues;

public class TestListMenuDriven {

	public static void main(String[] args) {

		System.out.println("1:show all 2:add number 3:remove num 4:search 5:clear 6:sort ");

		List<Integer> intList = new ArrayList<Integer>();// empty:true

		// get some values in list
		intList = MyIntValues.getAllNumbers();

		Scanner sc = new Scanner(System.in);
		int ch;

		do {
			System.out.println("Enter Choice:");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("---Show All----");
				for (int num : intList)
					System.out.print(num + " ");
				System.out.println();
				break;

			case 2:
				System.out.println("Enter Number");
				intList.add(sc.nextInt());

				break;
			case 3:
				System.out.println("---remove---");
				System.out.println("Enter Number To Remove");
				Integer no = sc.nextInt();

				System.out.println("Removed " + intList.remove(no));

				break;
			case 4:
				System.out.println("---search---");
				System.out.println("Enter Number To search");
				no = sc.nextInt();
				System.out.println("Present At:" + intList.indexOf(no));

				break;
			case 5:
				System.out.println("---clear----");
				intList.clear();
				System.out.println("IsEmpty:" + intList.isEmpty());
			case 6:
				System.out.println("---sort-----");
				// to Sort primitiv types
				// use Collections.sort()
				Collections.sort(intList);
				
				for (int num : intList)
					System.out.print(num + " ");
				   System.out.println();

				
				
				
			default:
				break;

			}

		} while (ch != 0);

	}

}
//Lab:Test Stack class for int and String (hint:use push,pop)
