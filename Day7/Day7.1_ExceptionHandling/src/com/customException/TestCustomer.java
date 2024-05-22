package com.customException;

import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CustomerValidation cust=new CustomerValidation();
		// cust.validateCustomer(0, null, null, 0);

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter Id Name Email Age");

			int custid = sc.nextInt();
			String name = sc.next();
			String email = sc.next();
			int age = sc.nextInt();

			Customer cust = CustomerValidation.validateCustomer(custid, name, email, age);
			// if all i/p are valid then create customer
			// store customer into file/DB
			System.out.println("---save data into file or db-----");

			// if not

		} catch (Exception e) {

			System.err.println(e.getMessage());
		}

	}

}
