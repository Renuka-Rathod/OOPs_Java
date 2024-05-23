package com.tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.app.Product;
import com.util.ProductUtil;

public class TestProductMap {

	public static void main(String[] args) {


		
		 Map<String , Product> shop=new HashMap<String, Product>();
		 
		 shop=ProductUtil.getAllPrds();
		 
//		 for(Product p:shop.values())
//		 {
//			 System.out.println(p);
//		 }
		 
		 
		 System.out.println("\n----Show all prds ------");
		 
		 
		 
		 
		 shop.values().stream().forEach(p->System.out.println(p));
		 
		 System.out.println("\n----Show all prds ------");
			
		 shop.values().stream().filter(p->p.getPrice()>100).forEach(p->System.out.println(p));
		 
		 
		 System.out.println("Enter Prd id ");
		 Scanner sc=new Scanner(System.in);
		 String prdId=sc.next();
		 
		 Product pObj=shop.get(prdId);
		 if(pObj!=null)
		System.out.println( pObj);
		 else
			 System.out.println("---not----");
		 
		 
		 
		 System.out.println("---------sort------");
		 
		 
		 
		 
		 shop.values().stream().sorted().forEach(p->System.out.println(p));
		 
		 
		 

		 System.out.println("---------sort-by price-----");
		 
		 
		 shop.values().stream().sorted((p1,p2)->((Double) p1.getPrice()).compareTo(p2.getPrice()))
		 .forEach(p->System.out.println(p));
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
