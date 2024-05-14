package pkg1;

import mathOperations.MyMath;

public class TestAccessSpecifier {

	public static void main(String[] args) {
		
		
		MyMath mObj=new MyMath();
		//private
		//error//mObj.impFunction();
		
		//default:outside  package not visible
		//mObj.defaultMethod();//error
		
		//public
		mObj.add();
	}
}
