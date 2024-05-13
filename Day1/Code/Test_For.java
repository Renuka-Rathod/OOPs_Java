import java.util.Scanner;

public class Test_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");

		}
		System.out.println("\n----even-------");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				System.out.print(i + " ");
		}
		System.out.println("\n----Odd-------");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0)
				System.out.print(i + " ");
		}

		System.out.println("\n----prime-------");
		int no1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		no1 = sc.nextInt();// 7
		boolean status = false;

		for (int i = 2; i < no1; i++) {

			if (no1 % i == 0)// 2 3 4 5 6
			{
				status = false;
				// System.out.println("Not prime");
				break;
			} else {
				status = true;
				// System.out.println("Prime");
			}
		}
		if (status == true)
			System.out.println("prime");
		else
			System.out.println("not prime");
		// lab:display all prime numbers from 1 to 100

	}

}
