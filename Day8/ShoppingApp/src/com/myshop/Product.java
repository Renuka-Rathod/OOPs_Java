package com.myshop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {

	
	private int prdId;
	private String name;
	private Category  category;
	private double price;
	
	private Date manfDate;//java.util.Date
	private static  SimpleDateFormat  sdf;//specify format  dd/mm/yyyy or dd-mm-yyyy
	
	static {
		sdf=new SimpleDateFormat("dd-mm-yyyy");
		
	}
	
	
	public Product(int prdId, String name, String category,double price,String manfDate) throws ParseException   {
		super();
		this.prdId = prdId;
		this.name = name;
		this.category =Category.valueOf(category);
		//   12/7/2012
		//convert string "12-7-2019"  into Date type
		this.manfDate= sdf.parse(manfDate);
		
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Date getManfDate() {
		return manfDate;
	}


	public void setManfDate(Date manfDate) {
		this.manfDate = manfDate;
	}


	public int getPrdId() {
		return prdId;
	}


	@Override
	public String toString() {
		//sdf.format accept Date type and convert into String type
		return "prdId=" + prdId + ", name=" + name + ", category=" + category + ", price=" + price
				+ ", manfDate=" + sdf.format(manfDate) ;
	}
	
	
	
	
	
}
