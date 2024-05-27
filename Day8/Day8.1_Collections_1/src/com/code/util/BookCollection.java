package com.code.util;

import java.util.ArrayList;
import java.util.List;

import com.code.list.Book;

public class BookCollection {

	public static List<Book> getAllBooks() {
		List<Book> books = new ArrayList<Book>();

		Book bk1 = new Book(909, "Java", "Jems", 600);
		books.add(bk1);

		books.add(new Book(230, "Abc", "Zen", 560));
		books.add(new Book(330, "Pqr", "Zen", 260));
		books.add(new Book(130, "DotNet", "Uma", 550));
		books.add(new Book(30, "Aabc", "Nita", 577));
		books.add(new Book(280, "Xyz", "Anil", 860));
		return books;

	}
}
