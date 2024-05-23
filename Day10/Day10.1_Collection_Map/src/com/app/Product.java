package com.app;

public class Product  implements Comparable<Product>{

	private String prdId;
	private String name;
	private double price;
	private int qty;
	public String getPrdId() {
		return prdId;
	}
	public void setPrdId(String prdId) {
		this.prdId = prdId;
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
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Product(String prdId, String name, double price, int qty) {
		super();
		this.prdId = prdId;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	@Override
	public String toString() {
		return " prdId=" + prdId + ", name=" + name + ", price=" + price + ", qty=" + qty ;
	}
	
	@Override
	public int compareTo(Product o) {

		 		
		return this.prdId.compareTo(o.prdId);
	}
	
	
}
