package com.code.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import com.code.list.Book;
import com.code.util.SortBookByName;
import com.code.util.SortBookByPrice;

import static com.code.util.BookCollection.getAllBooks;;

public class TestListBooks {

	public static void main(String[] args) {

		System.out.println(
				"1:show all 2:add book 3:show names   4:search book by id/author  5:show books price >400 6:sort ");

		Scanner sc = new Scanner(System.in);
		int ch;

		// store Books
		List<Book> library = new ArrayList<Book>();// isEmpty:true

		// get some books from BookCollection class
		// static methods get called by className.method

		// library=BookCollection.getAllBooks();

		// use static import:imprting static behaviour so that no need to use class name
		// to invoke method

		library = getAllBooks();

		System.out.println(library.isEmpty());

		do {
			System.out.println("Enter Choice:");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("----All Books----");
				for (Book bk : library) {
					System.out.println(bk);
				}

				break;

			case 2:
				System.out.println("bookid name author price");
				Book newBookObj = new Book(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
				library.add(newBookObj);
				System.out.println("Book added......");
				break;
			case 3:
//ReadOnly
				for (Book bk : library) {
					System.out.println(bk.getBookName());
				}

				break;
			case 4:
//remove
				System.out.println("enter BookId To Remove");
				// library.re
				break;
			case 5:
				break;
			case 6:// sorting
					// for default sorting class must implements Comparable<T> interface
				Collections.sort(library);

				for (Book bk : library) {
					System.out.println(bk);
				}
				break;

			case 7:// to sort Book by price or by name or by author
					// sort by price:create a new class SortBookByPrice implements Comparator<T>
					// override method compare(T obj1,T obj2)
				System.out.println("---sort by price-----");
				Collections.sort(library, new SortBookByPrice());

				for (Book bk : library) {
					System.out.println(bk);
				}

				break;
			case 8:
				System.out.println("----By Name----");
				Collections.sort(library, new SortBookByName());
				for (Book bk : library) {
					System.out.println(bk);
				}

			default:

				break;

			}

		} while (ch != 0);

	}

}
