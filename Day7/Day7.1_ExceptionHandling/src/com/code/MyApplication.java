package com.code;

import java.io.FileInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyApplication {

	public static void main(String[] args) {
		 
		
		
		
		@SuppressWarnings("unused")
		int a;
		Scanner sc=null;
		//make div of 2 numbers
		
		 FileInputStream fin=null;
		try {
			
			
		fin=new FileInputStream("d:\\NoName.txt");
		//file get open
		
		System.out.println("------Main Starts ------");
		sc=new Scanner(System.in);
		System.out.println("Enter no1 no2");
		
		int no1,no2;
		
		no1=sc.nextInt();
		
		no2=sc.nextInt();
		
		int no3=no1/no2;
		
		
		System.out.println("Div="+no3);
		//store div value into file
		//close file
		//fin.close();
	
		int[] arr=new int[2];
		
		//arr[3]=90;
		
		System.out.println("------Main Ends ------");
		
		}
		catch(InputMismatchException iEx)
		{
			System.out.println("-----InputMismatch-------");
			System.err.println("error:"+iEx.getMessage());
			iEx.printStackTrace();
		}
		catch(ArithmeticException ax)
		{
			System.out.println("-----ArithmeticException-------");
			System.err.println("Error:"+ax.getMessage());
			ax.printStackTrace();
		}
		catch(Exception ex)
		{
			System.out.println("----Exception-----");
			System.err.println("error:"+ex.getMessage());
			ex.printStackTrace();
		
		}
		finally
		{
			System.out.println("---finally----");
			System.out.println("---file get close---");
			//fin.close();
			 sc.close();
		}

	}

}
