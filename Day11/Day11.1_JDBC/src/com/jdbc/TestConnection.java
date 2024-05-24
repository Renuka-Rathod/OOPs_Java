package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

	public static void main(String[] args) {

		// add jar files
		// load Driver.class
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("-----class loaded-----");
			//Driver class makes Socket connection with Db machine
			
			//Driver class use connection url
			//use DriverManager
			
			Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/test123", "root", "root123");
			
			//Driver Class will establish Connection with db and 
			//Coonection will be retun from getConnection 
			
			System.out.println("---connected to DB-------");
			
			

		}
		catch(ClassNotFoundException cx)
		{
			System.out.println("---please add Database Specific jar Files");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
