package com.coll;
//for sorting class must implement Comparable i/f
public class Product implements  Comparable<Product>
{

	private int prdid;
	private String name;
	private double price;
	private Category category;
	public Product(int prdid, String name, double price, String category) {
		super();
		this.prdid = prdid;
		this.name = name;
		this.price = price;
		this.category =Category.valueOf(category);
	}
	public int getPrdid() {
		return prdid;
	}
	public void setPrdid(int prdid) {
		this.prdid = prdid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return " prdid=" + prdid + ", name=" + name + ", price=" + price + ", category=" + category  ;
	}
	
	
	
	@Override
	public int compareTo(Product p2) {
		
		//by prdid
		
		if(this.prdid<p2.prdid)
			return -1;
		else if(this.prdid>p2.prdid)
			return 1;
		else
			return 0;
		
		
		
	}
	
	
}
