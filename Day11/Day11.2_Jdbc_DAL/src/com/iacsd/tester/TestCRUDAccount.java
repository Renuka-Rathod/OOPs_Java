package com.iacsd.tester;

import java.util.List;
import java.util.Scanner;

import com.iacsd.dal.AccountDAL;
import com.iacsd.pojo.Account;

public class TestCRUDAccount {

	public static void main(String[] args) {

		AccountDAL actDal = new AccountDAL();
		List<Account> list;

		Scanner sc = new Scanner(System.in);
		int ch;
		System.out.println("1:show all " + "2:Create Account" + "3:Edit Account " + "4:Remove Account " + "5:Withdraw"
				+ "6:Deposite" + "7:GetByActId");

		do {
			System.out.println("Enter Choice:");
			ch = sc.nextInt();

			switch (ch) {
			case 1:

				list = actDal.getAllAccounts();
				list.forEach(act -> System.out.println(act));

				break;

			case 2:
				System.out.println("ActId Name username password balance ");
				int actid = sc.nextInt();
				String name = sc.next();
				String username = sc.next();
				String password = sc.next();
				double balance = sc.nextDouble();

				Account act = new Account(actid, name, username, password, balance);

				int row = actDal.addAccount(act);

				if (row > 0)
					System.out.println("Inserted....");

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:
				System.out.println("----withdraw-----");

				// validating user :Login
				System.out.println("Enter UserNAme Password for Login");
				Account actObj = actDal.validateAccount(sc.next(), sc.next());
				if (actObj != null) {
					System.out.println("Valid User:" + actObj);
					System.out.println("Welcome User:" + actObj.getName());
					System.out.println("Balance:" + actObj.getBalance());

					System.out.println("Enter Amount to WithDraw");
				} else {
					System.out.println("invalid login  ");
				}

				break;
			case 6:
				break;

			default:
				break;

			}

		} while (ch != 0);

	}

}
