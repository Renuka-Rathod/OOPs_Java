package com.code;

import java.util.Scanner;

public class TestMyCar {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("id name fuel type color(white,black,red)");
		
		
		int id=sc.nextInt();
		String name=sc.next();
		String fuel=sc.next();
		String color=sc.next();
		
		MyCar mCar=new MyCar(id, name, fuel, color);
		System.out.println(mCar);
		
		

	}

}
