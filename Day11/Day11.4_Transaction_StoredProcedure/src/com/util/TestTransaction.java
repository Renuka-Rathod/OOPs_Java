package com.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestTransaction {

	public static void main(String[] args) {

		Connection con = null;

		try {

			con = DbUtil.getConnection();
			// by default autoCommit=true
			 con.setAutoCommit(false);// IMP

			System.out.println(con.getAutoCommit());

			Statement stmt = con.createStatement();

			int i = stmt.executeUpdate("insert into customer values(113,'Isha','isha@gmail.com','n@123',23)");

			System.out.println("inserted first row.....");//

			i = stmt.executeUpdate("insert into customer values(111,'Manisha','m@gmail.com','n@123',23)");

			System.out.println("inserted second row.....");//
			
			 con.commit();//IMP

		} catch (Exception e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
			
			
		}

	}

}
