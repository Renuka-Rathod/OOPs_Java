package com.coll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.util.ProductUtil;

public class TestProductList {

	public static void main(String[] args) {


		
		
		List<Product> shop=new ArrayList<Product>();//isEmpty:
		
		shop=ProductUtil.getAllPrds();
		
		System.out.println(shop.isEmpty());
		
		
		for(Product p:shop)
			System.out.println(p);
		
		
		System.out.println("\n---enter Price to get Prds----");
		
		Scanner sc=new Scanner(System.in);
		
		double price=sc.nextDouble();
		//display prds price>150
		System.out.println();
		for(Product p:shop)
		{
			if(p.getPrice()>price)
				System.out.println(p);
		}
		
		
		System.out.println("\n---enter Category to get Prds----");
		
		String cate=sc.next();
		
		System.out.println();
		
		for(Product p:shop)
		{
			if(p.getCategory().toString().equals(cate))
				System.out.println(p);
			 
		}
		
		
		System.out.println("---Enter Cate and price");
		
		price=sc.nextDouble();
		cate=sc.next();
		
		for(Product p:shop)
		{
			if(p.getCategory().toString().equals(cate) && p.getPrice()>=price)
				System.out.println(p);
			 
		}

	}

}
