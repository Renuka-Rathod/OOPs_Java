package com.tester;

import com.iacsd.Employee;
import com.iacsd.Manager;
import com.iacsd.SalesPerson;

public class TestInheritance {

	public static void main(String[] args) {


		Employee emp=new  Employee();//id name salary
		emp.calSalary();//Employee class method
		emp.show();//Employee Class
		
		
		System.out.println("\n----   Manager--------\n");
		Manager mgr=new Manager();//id name salary+allounces deptName
		
		//Can manager class obje calls method of Employee
		mgr.calSalary();//Employee Class
		
		//Manager Methods
		mgr.managerTask();//Manager class
		mgr.show();
		
		
		
		System.out.println("\n----   Manager--------\n");
		
		Manager mg1=new Manager(606, "Rakesh", 60000, 20000, "IT");
		
		mg1.show();//606 Rakesh 60000
		
		mg1.calSalary();//
		
		//
			
		System.out.println("\n----   salesPerson--------\n");
			
		SalesPerson sp=new SalesPerson(456, "Nitesh", 50000, 1000, 2000, 2000);
		sp.calSalary();
		sp.show();
		
		
		
		
	}

}
