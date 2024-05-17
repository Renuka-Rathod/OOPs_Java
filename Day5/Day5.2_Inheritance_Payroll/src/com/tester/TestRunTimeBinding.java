package com.tester;

import com.iacsd.Employee;
import com.iacsd.Manager;

public class TestRunTimeBinding {

	public static void main(String[] args) {
		 
		final int amount=1000;//const 
		//amount=9000;
		
		//Lab:can we declare static variable as final?
		
		
		//Base Class Object can hold ref of Derived class object
		
		//Type Casting In Inheritance
		//UpCasting:assigning child class object to parent class
		//DownCasting:assigning parent object to child class
		
		//Parent Class Employee
		
		Employee obj;
		
		//child Class
		Manager  mgr=new Manager(456, "Anil", 45000, 9000, "Account");

		obj=mgr;
		
		obj.show();
		obj.calSalary();
		
		//Employee obj=new Manager();//or obj=mgr
		//Compile Time Type of obj:Employee
		//Runtime Type of obj:Manager
		
		
	}

}
