package com.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

 

public class ProductUtil {
	public static void    readProduct(String fileName) throws FileNotFoundException
	{
		
		BufferedReader reader=new BufferedReader(new FileReader(fileName));
		
		
		reader.lines().forEach(str->System.out.println(str));
		
		//read
	}
	
	public static  void saveProduct(String fileName,List<Product> prdList) throws IOException
	{
		
		//file write operation
		
		BufferedWriter writer=new BufferedWriter(new FileWriter(fileName));
		
		
//		for(Product p:prdList)
//		{
//			
//			writer.write(p.toString());
//		}
		
		
//		
		
		try
		{
		prdList.forEach(p->{
			try {
				writer.write(p.toString());
				writer.write("\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		}
		catch(Exception ex)
		{
			
		}
		System.out.println("----done----");
		
		writer.close();
	}
	
	
	
 	public static List<Product> getAllPrds()
	{
		//db:select * from Product
		List<Product> shop = new ArrayList<Product>();

		shop.add(new Product(102, "RiceBran oil", 200, "oils"));

		shop.add(new Product(12, "Sunflower Oil", 100, "oils"));

		shop.add(new Product(13, "Rice ", 24, "grains"));
		shop.add(new Product(1, "oil", 280, "oils"));
		shop.add(new Product(99, "Xyz", 400, "others"));
		shop.add(new Product(67, "Palm Oil", 80, "oils"));
		return shop;
	}

}
