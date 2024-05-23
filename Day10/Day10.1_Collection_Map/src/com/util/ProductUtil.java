package com.util;

import java.util.HashMap;
import java.util.Map;

import com.app.Product;

public class ProductUtil {

	public static Map<String, Product> getAllPrds() {

		Map<String, Product> hashMap = new HashMap<String, Product>();

		hashMap.put("103", new Product("103", "Book", 45, 10));
		hashMap.put("11", new Product("11", "ColorBox", 200, 10));

		hashMap.put("133", new Product("133", "Pen", 65, 13));

		hashMap.put("10", new Product("10", "Bag", 75, 33));

		hashMap.put("43", new Product("43", "Bottle", 5, 40));

		hashMap.put("23", new Product("23", "Craft Papers", 5, 150));

		hashMap.put("343", new Product("343", "Xyz", 45, 13));

		return hashMap;

	}

}
