package com.tester;
import com.iacsd.Employee;
import com.iacsd.MyMathClass;

import myapp.code.Product;
public class TestMyMathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		MyMathClass obj=new MyMathClass();
	 
		System.out.println("Add="+obj.add(34,34));
		
		Employee emp=new Employee(34, "Abc", 90000);
	//	System.out.println(emp);
		emp.show();
		emp.calSalary();
		
		
		Product p=new Product();
	 
		
	}

}
