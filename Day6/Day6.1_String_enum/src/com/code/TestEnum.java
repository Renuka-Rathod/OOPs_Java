package com.code;

import java.util.Scanner;

public class TestEnum {
	
	public static void main(String[] args) {
		
		int a;
	//	a="Ten";
		//ENUM user def type
		
		FuelType fuel;
		
		//fuel="PETROL";
		
		fuel=FuelType.PETROL;
		
		System.out.println("----Please enter FuelType  ------ ");
		
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();//petrol
		
		fuel= FuelType.valueOf(str.toUpperCase())    ;
		
		System.out.println(fuel);
		
		
	}

}
