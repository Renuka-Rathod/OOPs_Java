package com.pkg2;
import com.pkg1.Parent;
public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Parent parObj=new  Parent();
		//default:not accessible outside package
		//parObj.defaultMethod();
		
		
		//protected are accessible only in child class
		//parObj.protectedMethod();
		 
		
		parObj.publicMethod();
		
		
		
	}

}
