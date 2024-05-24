package com.iacsd.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {

	public static Connection getConnection() {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("---class get loaded----");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root123");

			System.out.println("---connected with db------");
			return con;
		} catch (Exception ex) {

			System.out.println(ex.getMessage());
		}
		return null;

	}

}
