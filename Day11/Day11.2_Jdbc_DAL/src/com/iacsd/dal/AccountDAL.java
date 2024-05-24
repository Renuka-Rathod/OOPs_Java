package com.iacsd.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.iacsd.pojo.Account;
import com.iacsd.util.DbUtil;

public class AccountDAL {

	// CRUD for Account done here
	// select * from Account

	private static Connection con;

	static {
		con = DbUtil.getConnection();

	}

	public AccountDAL() {
		System.out.println("----AccountDAL created-----");
	}

	// get all account from db

	public List<Account> getAllAccounts() {
		try {
			String sql = "select * from account";

			Statement stmt = con.createStatement();

			ResultSet rset = stmt.executeQuery(sql);

			List<Account> allActs = new ArrayList<Account>();

			while (rset.next()) {
				allActs.add(new Account(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4),
						rset.getDouble(5)));

			}
			rset.close();
			return allActs;

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;

	}

	public int addAccount(Account actObj) {
		try {
			System.out.println("----inside addAccount------" + actObj);

			// query
			String insert = "insert into account values(?,?,?,?,?)";

			//
			PreparedStatement pstmt = con.prepareStatement(insert);

			pstmt.setInt(1, actObj.getActid());

			pstmt.setString(2, actObj.getName());
			pstmt.setString(3, actObj.getUsername());
			pstmt.setString(4, actObj.getPassword());
			pstmt.setDouble(5, actObj.getBalance());

			int i = pstmt.executeUpdate();
			return i;

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return 0;

	}

	// update Account set password=? where actid=?

	// delete
	// delete from account where actid=?

	public Account validateAccount(String username, String pwd) {
		try {
			System.out.println("----inside validating Account----");
			String sql = "select * from account where username=? and  password=?";

			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setString(1, username);
			pstmt.setString(2, pwd);
			ResultSet rset = pstmt.executeQuery();

			if (rset.next()) {
				System.out.println("---  user----");
				return new Account(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4),
						rset.getDouble(5));
			} else {
				System.out.println("---invalid user----");
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public int withdraw(Account act, double amount) {

		
		//Lab
		
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
