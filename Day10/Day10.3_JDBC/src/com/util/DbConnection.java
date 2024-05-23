package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	
	
	public static  Connection  getDbConnection() throws SQLException
	{
		
	Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root123");
		
	return con;
	}

}
