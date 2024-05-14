package mathOperations;

public class TestMyMath {

	public static void main(String[] args) {
		// client
		//syntax
		MyMath obj=new MyMath();
		
		obj.add();
		obj.sum(23, 45);
		 obj.sum(100, 34555);
		 obj.sum(283, 45);
		int m1=obj.min(45, 8);
		
		System.out.println("Min="+m1);
		
		int m2=obj.max(344, 900);
		System.out.println("Max="+m2);
		
		int no=obj.getNumber();
		System.out.println("Num="+no);
		
		//obj.impFunction();//The method impFunction() from the type MyMath is not visible

	}

}
