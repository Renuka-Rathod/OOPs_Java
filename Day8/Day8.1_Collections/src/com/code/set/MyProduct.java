package com.code.set;

//default sorting class must implements Comparable<T>
public class MyProduct  implements Comparable<MyProduct> 
{

	private int prdId;
	private String name;
	private double price;
	public MyProduct(int prdId, String name, double price) {
		super();
		this.prdId = prdId;
		this.name = name;
		this.price = price;
	}
	
	
	
	
	
	
	
	public int getPrdId() {
		return prdId;
	}
	public void setPrdId(int prdId) {
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
	@Override
	public String toString() {
		return "MyProduct [prdId=" + prdId + ", name=" + name + ", price=" + price + "]";
	}







	 
	public int compareTo(MyProduct o) {


		//sort by prdid
		if(this.prdId<o.prdId)
			return -1;
		else if(this.prdId>o.prdId)
			return 1;
		else
			return 0;
		
		//return this.name.compareTo(o.name);
		
	}
	
	
	
}
