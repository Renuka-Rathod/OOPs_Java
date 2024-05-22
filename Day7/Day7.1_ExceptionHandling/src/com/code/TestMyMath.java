package com.code;

import java.util.Scanner;

public class TestMyMath {
	public static void main(String[] args) {
		
		
		//How to access static Method
		//try with resources (sc.close())
		try(Scanner sc=new Scanner(System.in))
		{
		
		System.out.println("enter no1 No2");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		int a=MyMath.add(no1	, no2);
		System.out.println("---Add==="+a);
		int d=MyMath.division(no1, no2);
		System.out.println("Div="+d);
		}
		catch(Exception ex)
		{
			System.err.println(ex.getMessage());
		ex.printStackTrace();
		
		}
		finally
		{
			System.out.println("---finally---");
		}
		
	}

}
