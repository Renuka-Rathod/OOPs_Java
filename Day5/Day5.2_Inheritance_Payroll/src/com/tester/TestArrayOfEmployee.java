package com.tester;

import com.iacsd.*;
 

public class TestArrayOfEmployee {

	public static void main(String[] args) {
		 
		
		Employee emp1=new  Employee(103, "Rima", 20000);
				
		Manager mgr1=new Manager(202, "Nitesh", 56000, 10000, "IT");
		
		SalesPerson sp1=new SalesPerson(303, "Suresh", 30000, 1000, 1000, 1000);
			
		//careate collection of emp types
		
		Employee[] iacsd=new Employee[3];
		
		//add first emp in array
		iacsd[0]=emp1;
		
		//add second emp mgr in array
		iacsd[1]=mgr1;//UpCasting
		
		iacsd[2]=sp1;//UpCasting
		
		
		//show all emp
		for(int i=0;i<iacsd.length;i++)
		{
			iacsd[i].show();//runtime binding
			System.out.println();
		}
		
		
		//why downcasting needed
		//to access manager specific methods
		//convert employee class object to Manager
		
		//Manager mgrObj=(Manager) iacsd[1];//error:Type mismatch: cannot convert from Employee to Manager
	    //  mgrObj.managerTask();
		System.out.println("------------downCasting---");
		//((Manager) iacsd[1]).managerTask();
		
		
		
		for(int i=0;i<iacsd.length;i++)
		{
			//can we check run time data type of iacsd[i]
			//RTTI:RunTime Type Identification
			
			//Why RTTI:to avoid run time exception ClassCastException
			
			if(iacsd[i] instanceof Manager )
			{
				 
				System.out.println("------------Manager Functions---");
			((Manager) iacsd[i]).managerTask();
			}
			else if(iacsd[i] instanceof SalesPerson)
			{
				//Employee obje get downcast to SalesPerson
				
//			 SalesPerson sp=(SalesPerson) iacsd[i];
//			 sp.show();
				
			   ((SalesPerson)iacsd[i]).show();
			}
			
			
		}

	}

}
