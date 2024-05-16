package com.iacsd.tester;

import com.iacsd.payroll.Employee;

public class TestStaticCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Employee emp1=new Employee();
	
	emp1.show();
	Employee emp2=new Employee(303, "Xyz",45);
	emp2.show();
		
	for(int i=1;i<=5;i++)
	{
		new Employee();
	}
	
	//call static methods using class name
	Employee.showCount();
	
		
	}

}
