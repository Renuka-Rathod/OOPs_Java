import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.util.DbConnection;

public class TestSelectSql {

	public static void main(String[] args) {

		Connection con = null;
		try {

			con = DbConnection.getDbConnection();
			System.out.println("---connected----");
			// select or Insert update Delete

			// create sql statement

			String sql = "select * from account";

			// associate sql to connection

			// Statement i/f is used for executing SQL on db

			Statement stmt = con.createStatement();
			
			//fire query
			//select:(read) executeQuery()
			
			
			 ResultSet rset=   stmt.executeQuery(sql) ;
			
			 
			while(rset.next())
			{
				System.out.println(rset.getInt(1)+"   "+rset.getString(2)+"    "+rset.getDouble("balance")   );
			}
			
			
			rset.close();
			 
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}

	}

}
