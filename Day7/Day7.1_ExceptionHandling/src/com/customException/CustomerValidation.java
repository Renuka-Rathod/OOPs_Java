package com.customException;

public class CustomerValidation {
//used for validation

	
	
	
	public static  Customer validateCustomer(int custid, String name, String email, int age) throws CustomerException {
		// validation rules
		// custid>0
		// name >1
		// email: @ .
		// age :min 18 and max :60

		if (custid > 0 && name.length() > 0 && email.contains("@") && email.contains(".") && (age > 18 && age < 60)) {
			// all i/p are valid
			// create Customer and return
			Customer custObj = new Customer(custid, name, email, age);
		System.out.println("---customer get created----");
			return custObj;
		}
		else
		{
			System.out.println("---invalid i/p----");
			 throw new CustomerException("Invalid Inputs");
		}
		
		
		

	}
}
