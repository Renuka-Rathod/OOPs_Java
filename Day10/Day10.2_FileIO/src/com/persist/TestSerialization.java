package com.persist;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.fileio.Product;

public class TestSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// to persisit state of an object serialization is used
		// object is stored in byte format (stream)
		//
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("MyProduct.txt"));
			// create an object
			Product p = new Product(101, "MyPrd", 90, "others");

			// store object into file
			
			out.writeObject(p);
			
			System.out.println("---prd is get stored----");
			
			out.close();
			
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
