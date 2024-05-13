import java.util.Scanner;

public class Test_If {

	public static void main(String[] args) {

		int no1, no2;

		// to accept number
		// use Scanner
		// import java.util.Scanner

//		Scanner sc;
//		sc=new Scanner(System.in);
		// or
		Scanner sc = new Scanner(System.in);

		// if
		System.out.println("Enter No1 No2");
		no1 = sc.nextInt();
		no2 = sc.nextInt();
		// if(condition)//true
		if (no1 > no2)
			System.out.println("Max=" + no1);

		System.out.println("---if--else----");

		if (no1 > no2)
			System.out.println("Max=" + no1);
		else
			System.out.println("Max=" + no2);

		System.out.println("---if--else----");

		if (no1 > no2)
			System.out.println("Max=" + no1);
		else if (no2 > no1)
			System.out.println("Max=" + no2);
		else
			System.out.println("no1==no2");
		//Lab:accept number from user and display name of Month
        //12 else if
		
		System.out.println("-----Main ends Here------");

	}

}
