package com.code.newInJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestListInterface {

	
	public static void main(String[] args) {
		
		
		List<Integer> list=new  ArrayList<Integer>();
		
	    list=Arrays.asList(45,67,34,21,23,44,55,66,78,23);
		System.out.println(list);
		
		//Lab: show even numbers,odd ,show numbers>50,msx,min,count,multiply by 2
		
		
		
		//java 8 new feature
		//forEach()
		
		//display 
		
		for(int i:list)
			System.out.print (i+" ");
		
		
		System.out.println("\n-----------------");
		
	 //accept(T no)
		
		Consumer<Integer> conObj=no->System.out.println(no);
		
		conObj.accept(100);
		

		System.out.println("\n-----------------");
		
		list.forEach(no->System.out.println(no));
		
	}
	
	
	
	
}
