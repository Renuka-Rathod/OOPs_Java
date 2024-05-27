package com.code.set1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class testSetForEmployee {

	public static void main(String[] args) {
		
		
		Employee emp1=new Employee("101", "Anil", 56000);
		
		Employee emp2=new Employee("201", "Sunil", 36000);
		
		Employee emp3=new Employee("101", "Anil", 56000);
		
		
		
		Set<Employee>  emps=new HashSet<Employee>();
		
		System.out.println(emps.add(emp1));//true
		
		
		System.out.println(emps.add(emp2));//true
		
		System.out.println(emps.add(emp3));// 
		
		for(Employee e:emps)
			System.out.println(e);
		
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Remove Emp----");
		System.out.println("Enter empid");
		String empid=sc.next();
		
		//using foreach loop we can not modify collection
		//ReadOnly
		
//		for(Employee e:emps)
//		{
//			if(e.getEmpid().equals(empid))
//			{
//				Employee emp4=new Employee(empid);
//				
//				System.out.println("emp is Present");
//				emps.remove(emp4);
//			}
//		}
		
		//use Iterator to modify collection
		
		Iterator<Employee> itr=emps.iterator();
		
		
		while(itr.hasNext())
		{
		Employee emp=itr.next();
		if(emp.getEmpid().equals(empid))
			{itr.remove();
			System.out.println("emp Removed");
			}
		}
		
		
		System.out.println("-------------");
		
		for(Employee e:emps)
 			{
			System.out.println(e);
 			}
		
		
		
		
		
		
		
		
		
	}
}
