import java.util.Scanner;
public class Test3 {

	public static void main(String[] args) {
		 
		//dynamic code
		int no1,no2;//local to main
		
		
		
		
	//	System.out.println("No1="+no1);//The local variable no1 may not have been initialized
		
		//accept no1 from user
		
		
		//accept int value from 
		//to accept input from user using keyboard
		// use Scanner class
		//where: package java.util
		//how  to use Scanner:import java.util.Scanner
		//Scanner is  a data type (UDT i.e Type class)
		Scanner sc;
		sc=new Scanner(System.in);
		
		System.out.println("enter Num1 ");
		no1=sc.nextInt();
		
		System.out.println("Enter Num2 ");
		no2=sc.nextInt();
		System.out.println("Add="+(no1+no2));
		
		

		//System.out.println("no1="+no1);
		
		//add ,sub,div,multi
		
		//menu  1:add 2: sub 3:div 4:multi 
		
		//
		double d1;
		System.out.println("Double Value ");
		d1=sc.nextDouble();
		System.out.println("d1="+d1);
		
		//Lab:try to accept short,byte,long,float,boolean,char
		
		 
		
		System.out.println(" Do You Want to Continue (Y/N)");
		char c1;
		c1=sc.next().charAt(0);//to read first char from string
		
		System.out.println("ch="+c1);
		if(c1=='Y')
			System.out.println("Continue.......");
		else
			System.out.println("exit.....");
		
		
		System.out.println("First Name:");
		String name;//String is class given by Java,use String class as like primitive data type
		//name="Ram";
		int a=10;
		name=sc.next();
		
		System.out.println("Name:"+name);
		
		System.out.println(" accept true/false");
		boolean status=sc.nextBoolean();
		System.out.println("Status:"+status);
		
		
		
	}

}
