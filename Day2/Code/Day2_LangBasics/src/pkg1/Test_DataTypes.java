package pkg1;
import java.util.Scanner;
public class Test_DataTypes {

	public static void main(String[] args) {

		System.out.println("Testing Data Type.....");// write
		// age
		byte b1 = 34;
		System.out.println(b1);// 34
		int a;
		a = b1;// byte data type get assigned to int data type
		// implicit casting of primitive type:widning

		System.out.println("a=" + a);// 34

		b1 = 100;
		System.out.println(b1);// 100
		System.out.println("a=" + a);// 34

		byte s1;
		// byte =int
		s1 = (byte) a;// Type mismatch: cannot convert from int to byte
		// bigger size get assigned to smaller size:narrowing

		// char type
		char c1 = 'A';
		System.out.println(c1 + "    " + (int) c1);

		int c2 = c1;// implicit casting
		
		//Scanner is class: non primitive(UDT)
		//non primitive are ref type
		Scanner sc;
		sc=new Scanner(System.in);
		
		
		
		
		

	}

}
