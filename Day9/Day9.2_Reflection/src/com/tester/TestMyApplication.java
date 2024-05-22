package com.tester;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Scanner;

import com.iacsd.Employee;
import com.iacsd.MyMath;

public class TestMyApplication {

	public static void main(String[] args) {

		// MyMath mobj=new MyMath(); //MetaData

		// mobj.add(23, 34);
		// Employee empObj=new Employee();//MetaData empid name city salary,(),(,,,) ,

		// runtime get metadata of Type:Reflection

		// load classes dynamically

		try {
			String name = "java.util.Scanner";
			
			
			//Class type=String.class;
			//or
			 Class type = Class.forName("com.iacsd.MyMath");

			System.out.println("-----Class get loaded dynamically----");

			// get metadata from class

			// display name
			System.out.println("Name:" + type.getName() + "    " + type.getModifiers());

			// display data members
			Field[] fields = type.getDeclaredFields();
			System.out.println("\n----data members-----");
			for (Field f : fields) {
				System.out.println(f.getName() + "     " + f.getType());
			}

			System.out.println("\n----get Methods------");

			Method[] methods = type.getDeclaredMethods();

			for (Method m : methods) {
				Parameter[] parameters = m.getParameters();
				System.out.println(m.getName() + "     " + m.getParameterCount() + "   " + m.getReturnType());

				// Lab:Display Name Of Parameter and Type Of Parameter
			}
			
			
			//Lab:display constructors
			System.out.println("\n----constructor-----");
			
			
			System.out.println("Enter Name Of method to invoke ");
			//search method present or not
			Scanner sc=new Scanner(System.in);
			String mName=sc.next();
			for (Method m : methods) {
				
				if(m.getName().equals(mName))
				{
					System.out.println("---Present---");
					//get list of parameter,count,data type
					//mObj.add(23,45)
				Object obj=	type.newInstance();// new myMath();
				System.out.println("Result:"+	m.invoke(obj, 24,3));//obj.add(12,20)
				}
			}
			 
			
			
			
			
			
			
			

		} catch (Exception cx) {
			System.err.println(cx.getMessage());
			cx.printStackTrace();
		}

	}

}
