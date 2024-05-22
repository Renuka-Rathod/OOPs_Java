package com.coll;

import java.util.Comparator;

public class SortByPrdName implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		 //by name
		
		return p1.getName().compareTo(p2.getName());
	}

}
