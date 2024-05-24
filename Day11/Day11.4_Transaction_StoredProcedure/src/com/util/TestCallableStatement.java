package com.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class TestCallableStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for StoredProcedure use CallableStatement
		
		try
		{
		
			Connection con=DbUtil.getConnection();
			
			
			CallableStatement cstmt=con.prepareCall("{call  getAllCusts()}");
			
			  
			ResultSet rset=cstmt.executeQuery();
			
			
			while(rset.next())
			{
				System.out.println(rset.getInt(1));
				System.out.println(rset.getString(2));
				System.out.println(rset.getString(3));
				System.out.println(rset.getString(4));
				System.out.println(rset.getInt(5));
				System.out.println("--------------------------------\n");
			}
			
			rset.close();
			
		}
		catch (Exception e) {
			
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}

}
