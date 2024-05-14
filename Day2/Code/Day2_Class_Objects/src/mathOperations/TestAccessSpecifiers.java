package mathOperations;

public class TestAccessSpecifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyMath mObj=new MyMath();
		//private
		//error//mObj.impFunction();
		
		//default:inside package
		mObj.defaultMethod();
		
		//public
		mObj.add();
		
		
	}

}
