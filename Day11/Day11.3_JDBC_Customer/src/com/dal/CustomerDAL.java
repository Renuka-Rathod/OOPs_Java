package com.dal;

import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.pojos.Customer;
import com.util.DbUtil;

public class CustomerDAL {

	
	private static Connection con;
	static {
		con=DbUtil.getConnection();
	}
	// CRUD:

	public List<Customer> getAllCustomers() {

		try
		{
			
			
				
		
		String str="select * from customer";
		Statement stmt=con.createStatement();
		
		
		ResultSet rset=stmt.executeQuery(str);
		
		List<Customer> allCuts=new ArrayList<Customer>();
		
		while(rset.next())
		{
			
			
			allCuts.add(new Customer(rset.getInt(1),
					rset.getString(2), rset.getString(3)
					,  rset.getString(4),rset.getInt(5)));
		}
		
		rset.close();
		return allCuts;
		
		
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
		
		
		
		
	}

	public void insertCustomer() {

	}

	public void deleteCustomer() {

	}

}
