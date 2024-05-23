package com.persist;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.fileio.Product;

public class TestDeserialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		try {
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("MyProduct.txt"));

			Product p = (Product) input.readObject();

			System.out.println(p);
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
	}

}//Lab:persist List<Product> into file and Retrive it from File
