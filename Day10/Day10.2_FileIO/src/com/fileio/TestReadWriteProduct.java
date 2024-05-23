package com.fileio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestReadWriteProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1:Show all 2:Write File 3:read file ");
		
		Scanner sc=new Scanner(System.in);
		int ch;
		
		List<Product> shop=new ArrayList<Product>();
		shop=ProductUtil.getAllPrds();
		
		String fileName;
		
		try
		{
		do {
			System.out.println("Enter Choice:");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				shop.forEach(p->System.out.println(p));
				
				break;

			case 2:
				//write prds into file
				System.out.println("enter File Name");
				fileName=sc.next();
				
				ProductUtil.saveProduct(fileName, shop);
				
				break;
			case 3:
				
				System.out.println("enter File Name");
				fileName=sc.next();
				
				ProductUtil.readProduct(fileName);
				
			
			default:
				break;

			}

		} while (ch != 0);
		
		
		}
		catch(Exception ex)
		{
			System.err.println(ex.getMessage());
		}

	}

}
