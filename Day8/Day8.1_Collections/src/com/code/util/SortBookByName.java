package com.code.util;

import java.util.Comparator;

import com.code.list.Book;

public class SortBookByName implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		 
	return	o1.getBookName().compareTo(o2.getBookName());
	}

}
