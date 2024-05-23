import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		// imp: add ref of Driver.jar

		// load Driver class
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("----Driver Get loaded-----");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root123");

			System.out.println(" connected to db......");
			
			
			// select or Insert update Delete
			
			
			
			
			
			
			
			
			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			con.close();
		}

	}

}
