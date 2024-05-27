
public class MyMath {

	public void chkPrime(int no) {
		boolean status = false;
		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				status = false;
				break;
			} else {
				status = true;
			}

		}
		if (status)
			System.out.println("Prime");
		else
			System.out.println("not prime");

	}
}
