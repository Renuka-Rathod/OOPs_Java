package com.coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestList {

	public static void main(String[] args) {

		List<Product> shop = new ArrayList<Product>();

		shop.add(new Product(102, "RiceBran oil", 200, "oils"));

		shop.add(new Product(12, "Sunflower Oil", 100, "oils"));

		shop.add(new Product(13, "Rice ", 24, "grains"));
		shop.add(new Product(1, "oil", 200, "oils"));
		shop.add(new Product(99, "Xyz", 200, "others"));
		shop.add(new Product(67, "Palm Oil", 80, "oils"));

		System.out.println("\n-----display all prds------");

		// for each loop ot iterator

		for (Product prd : shop)
			System.out.println(prd);

		System.out.println("\n-----display all prd price------");

		for (Product prd : shop)
			System.out.println(prd.getPrice());

		System.out.println("\n-----sorted prds------");
		Collections.sort(shop);

		for (Product prd : shop)
			System.out.println(prd);

		System.out.println("\n-----sorted prd name------");

		Collections.sort(shop, new SortByPrdName());// by def

		for (Product prd : shop)
			System.out.println(prd);

		System.out.println("\n-----sorted prd price------");

		Collections.sort(shop, new SortByPrdPrice());// by def

		for (Product prd : shop)
			System.out.println(prd);
		
		
		
		System.out.println("-----------------Functional Programming--------");
		
		// int compare(Product p1, Product p2)
		
		Comparator<Product> fp1=(  p1,  p2)->{
			
			String cate1=p1.getCategory().toString();
			String cate2=p2.getCategory().toString();
		
			return cate1.compareTo(cate2);
			
			
		//return (p1.getCategory().toString().compareTo(p2.getCategory().toString()));
		};
		
		Collections.sort(shop,fp1);
		
		for(Product p:shop)
			System.out.println(p);
		
		
		//For User define classes it is must to implement Comparable i/f for sorting
		

		
		
		
	}

}
