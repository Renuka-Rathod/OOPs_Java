package com.jdbc.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TestSelect {

	public static void main(String[] args) {

		// make connection
		try (Connection con = DbUtil.getConnection()) {

			// query

			String str = "select * from customer";

			// for static sql use Statement i/f

			Statement stmt = con.createStatement();

			// execute sql query on db

			// if sql is reading data from db:use Statement executeQuery(String sql)

			// for Select query use executeSql method

			ResultSet rset = stmt.executeQuery(str);

			// ResultSet stores data return by DB
			// Single Object stores data from db
			// ResultSet is fwdOnly and ReadOnly byDefault

			// retrive data from ResultSet

			while (rset.next()) {
				System.out.println("custid:" + rset.getInt(1));
				System.out.println("name:" + rset.getString("custname"));
				System.out.println("email:" + rset.getString(3));
				System.out.println("password:" + rset.getString("password"));
				System.out.println("age:" + rset.getInt(5));
				System.out.println("\n-----------------------------\n");
			}

			rset.close();

			System.out.println("Enter CustId:");
			Scanner sc = new Scanner(System.in);
			int id = sc.nextInt();

			str = "select * from customer where custid=" + id;
			System.out.println(str);

			//

			rset = stmt.executeQuery(str);

			if (rset.next())
				System.out.println(rset.getInt(1) + "   " + rset.getString(2) + "   " + rset.getString(3) + "   "
						+ rset.getString(4) + "   " + rset.getString(5));

			else
				System.out.println("no record");
			
			
			
			System.out.println("Enter Name:");
			
			String name=sc.next();
			
			
			str="select custname,email,age  from  customer where custname='"+name+"'";
			
			System.out.println(str);
			rset=stmt.executeQuery(str);
			
			if(rset.next())
				System.out.println(rset.getString(1)
						+"   "+rset.getString(2)
						+"   "+rset.getInt(3));
			
			
			else
				System.out.println("---no record-----");
			
			
			
			
			

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

}
