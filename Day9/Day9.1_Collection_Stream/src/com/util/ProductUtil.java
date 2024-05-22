package com.util;

import java.util.ArrayList;
import java.util.List;

import com.coll.Product;

public class ProductUtil {
	
	public static List<Product> getAllPrds()
	{
		//db:select * from Product
		List<Product> shop = new ArrayList<Product>();

		shop.add(new Product(102, "RiceBran oil", 200, "oils"));

		shop.add(new Product(12, "Sunflower Oil", 100, "oils"));

		shop.add(new Product(13, "Rice ", 24, "grains"));
		shop.add(new Product(1, "oil", 280, "oils"));
		shop.add(new Product(99, "Xyz", 400, "others"));
		shop.add(new Product(67, "Palm Oil", 80, "oils"));
		return shop;
	}

}
