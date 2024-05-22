package com.code.util;

import java.util.Comparator;

import com.code.list.Book;

public class SortBookByPrice implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		 //price
		
		if(o1.getPrice()<o2.getPrice())
			return -1;
		else if(o1.getPrice()>o2.getPrice())
			return 1;
		else
			return 0;
	}

	
	
}
