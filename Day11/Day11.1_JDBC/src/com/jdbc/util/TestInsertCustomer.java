package com.jdbc.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class TestInsertCustomer {
	public static void main(String[] args) {

		try (Connection con = DbUtil.getConnection()) {

			Scanner sc = new Scanner(System.in);

			System.out.println("CustID Name email pwd age ");

			int custid = sc.nextInt();// 110
			String name = sc.next();

			String email = sc.next();
			String pwd = sc.next();

			int age = sc.nextInt();

			String strInsert = "insert into customer values(?,?,?,?,?)";

			// dynamic query use PreparedStatement

			PreparedStatement pStmt = con.prepareStatement(strInsert);

			// assign value to parameters

			pStmt.setInt(1, custid);// values(110,?,?,?,?)

			pStmt.setString(2, name);// values(110,"xyz",?,?,?)

			pStmt.setString(3, email);
			pStmt.setString(4, pwd);
			pStmt.setInt(5, age);

			// execute Query
			// for DML like Insert,Update,Delete (write operation)
			// use method executeUpdate method of Statement Interface

			int i = pStmt.executeUpdate();
			
			
			System.out.println(i +"   Row Added ");

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
