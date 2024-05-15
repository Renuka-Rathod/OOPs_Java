package tester;
import bank.Account;
public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Account act1=new Account(201, "Nitesh", 30000, "nitesh@gmail.com")	;
	act1.showDetails();
	double b=act1.getBalance()	;
	System.out.println("Balance="+b);
	act1.deposite(20000);
	
	b=act1.getBalance()	;
	System.out.println("Balance="+b);
		
	act1.withdraw(45000);
		
	b=act1.getBalance()	;
	System.out.println("Balance="+b);
	act1.showDetails();
	
	
	
	///act1.balance=10;
	
	
   //Account act3=new 
	
	
	}

}
