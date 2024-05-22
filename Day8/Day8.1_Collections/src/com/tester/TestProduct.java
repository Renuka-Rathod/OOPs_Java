package com.tester;
import java.util.Scanner;

import com.myshop.Product;
public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner sc=new Scanner(System.in))
		{
		
		Product prdObj;
		
		System.out.println("PrdId name Category(oils/grains/other) MafDate(dd-mm-yyyy) price");
		
		int prdid=sc.nextInt();
		String name=sc.next();
		String cate=sc.next();
		String  mDate=sc.next();
		double price=sc.nextDouble();
		
		prdObj=new  Product(prdid, name, cate, price, mDate);
		
		if(prdObj!=null)
			System.out.println("----Product Created----\n");
		System.out.println(prdObj);
		
		
		 
		}
		catch(Exception ex)
		{
			System.err.println(ex.getMessage());
		}
		
		

	}

}
