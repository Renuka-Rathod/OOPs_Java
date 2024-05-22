package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.coll.Product;
import com.util.ProductUtil;

public class TestStreamProducts {

	public static void main(String[] args) {

		List<Product> shop = new ArrayList<Product>();// isEmpty:true

		shop = ProductUtil.getAllPrds();// isEmpty:false

		System.out.println("\n----Display All Prds----");

		shop.forEach(p -> System.out.println(p));

		System.out.println("\n----Display   Prds price> 100----");

		Scanner sc = new Scanner(System.in);
		final double price = sc.nextDouble();

		shop.stream().filter(p -> p.getPrice() > price).forEach(p -> System.out.println(p));

		System.out.println("\n----Display   sum of prds ----");

		double sum = shop.stream().mapToDouble(p -> p.getPrice()).sum();
		System.out.println("Sum=  " + sum);

		// Lab :Max,min ,avg price

		System.out.println("Category and Price ");
		String cate = sc.next();
		double price1 = sc.nextDouble();

		// display with category and price >

		shop.stream().filter(p -> p.getPrice() > price1).filter(p -> p.getCategory().toString().equals(cate))
				.forEach(p -> System.out.println(p));

		System.out.println("-------sort------");

		shop.stream().sorted().forEach(a -> System.out.println(a));
		;
		System.out.println("-------sort------");

		// Comparator compare(p1,p2)

		shop.stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).forEach(p -> System.out.println(p));

		System.out.println("-------sort by price------");

		shop.stream().sorted((p1, p2) -> ((Double) p1.getPrice()).compareTo(p2.getPrice()))
				.forEach(p -> System.out.println(p));

		System.out.println("----start with R-----");

		shop.stream().filter(p -> p.getName().startsWith("R")).forEach(p -> System.out.println(p));

		System.out.println("----start with R-----");
		long c = shop.stream().filter(p -> p.getName().startsWith("R")).count();

		System.out.println("count:" + c);

		System.out.println(shop.stream().filter(p -> p.getName().startsWith("Z")).mapToDouble(p -> p.getPrice()).max());

		
		 
		
	}

}
