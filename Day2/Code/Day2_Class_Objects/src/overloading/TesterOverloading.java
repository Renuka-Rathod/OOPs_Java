package overloading;

public class TesterOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MyClass obj=new MyClass();
		
		obj.add(23,45);		
		obj.add(5678, 45660);
		
		obj.add2(34, 67, 88);
		
		obj.add3(45.78, 100);
		
		
		System.out.println("----with overloading----");
		obj.addition(12, 34);
		obj.addition(12,3,5);
		obj.addition(23.56, 45.66);
		obj.addition(56.66, 90);
		obj.addition(90, 34.66);
		
		
		//obj.addition(45,6,7,8,9,90);
		//obj.addition();
		
		//obj.addition(45,6,7,8,9,904,5,6,7,8,9,03);
		System.out.println("-----using varargs----");
		
		obj.sum();//0 args
		int x=10;
		obj.sum(x);//
		obj.sum(x,20,30,40,10);
		obj.sum(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1);
		
	}

}
