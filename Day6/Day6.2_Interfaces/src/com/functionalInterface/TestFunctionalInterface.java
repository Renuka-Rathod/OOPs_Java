package com.functionalInterface;

public class TestFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyProviderClass1 obj = new MyProviderClass1();

		obj.display();

		// Use LambdaExpression

		// void display(); SAM

		MyFunctionalInterface1 myFun1 = () -> {
			System.out.println("***********");
		};

		myFun1.display();

		MyFunctionalInterface1 mfun2 = () -> System.out.println("-------Show IACSD Details");

		mfun2.display();

		MyFunctionalInterface1 obj3 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
			}
		};
		obj3.display();

		// lambda expression for method accepting 1 arg

		// void show(String name);

		MyFunctionalInterface2 mObj2 = (str) -> {
			System.out.println("welcome " + str);
		};

		mObj2.show("Vaishali");

		MyFunctionalInterface2 mObj3 = (arg1) -> System.out.println(arg1 + "   Welcome To IACSD");

		mObj3.show("Manoj");

//Lambda Expression for method accepting more than 1 args		
		// void printEvenNumbers(int start,int end);

		MyFunctionalInterface3 mObj4 = (x, y) -> {

			for (int i = x; i <= y; i++) {
				if (i % 2 == 0)
					System.out.print(i + " ");
			}

		};

		mObj4.printEvenNumbers(20, 40);

		// Lambda for accepting and returning
		// String changeCase(String name);

		MyFunctionalInterface4 mObj5 = (name) -> {

			System.out.println("------Change Case to Lower----");
			return name.toLowerCase();
		};
		System.out.println();
		System.out.println(mObj5.changeCase("VAISHALI"));

		//UpperCase

	}

}
