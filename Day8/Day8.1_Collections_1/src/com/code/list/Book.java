package com.code.list;
//POJO:Plain Old Java object

//to give default sorting for User def Class,class  must implements   Comparable<T>
// Comparable<T> contains SAM compareTo(T obj)
//Books class will override abstract method and gives comparison 
//by default sorting by bookId

public class Book implements Comparable<Book> {
	private int bookid;
	private String bookName, author;
	private double price;

	public Book(int bookid, String bookName, String author, double price) {
		super();
		this.bookid = bookid;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return " bookid=" + bookid + ", bookName=" + bookName + ", author=" + author + ", price=" + price;
	}

	@Override
	public int compareTo(Book o) {

		//System.out.println("---compare to----");
		//by def sorting done by bookid
		if (this.bookid < o.bookid)
			return -1;
		else if (this.bookid > o.bookid)
			return 1;
		else
			return 0;
	}

}
